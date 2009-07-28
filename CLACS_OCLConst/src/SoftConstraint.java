import groovy.swing.factory.BoxFactory.GlueFactory;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ocl.query.QueryFactory;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorWithFlyOutPalette;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
//import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.Resource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

import GCLACS.Arg;
import GCLACS.Binding;
import GCLACS.BindingKind;
import GCLACS.BodyType;
import GCLACS.ComponentInstance;
import GCLACS.ComponentKind;
import GCLACS.DefineByInterface;
import GCLACS.Document_Root;
import GCLACS.GCLACSFactory;
import GCLACS.GCLACSPackage;
import GCLACS.Interface;
import GCLACS.Port;
import GCLACS.ProvidedPort;
import GCLACS.RequiredPort;
import GCLACS.ServiceKind;
import GCLACS.Services;
import GCLACS.UsedService;
import GCLACS.Visibility;
import GCLACS.diagram.part.GclacsDiagramEditorPlugin;

public class SoftConstraint{

	   static FenetreGUI FG;
	   static boolean cstFound;
	   
	static Document_Root DR;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		cstFound = false;
		FG = new FenetreGUI("TestFG");
		
		FG.contentW.add(FG.content);
		FG.contentW.add(Box.createHorizontalStrut(15));
		FG.contentW.add(FG.contentArg);
		FG.contentW.add(Box.createHorizontalStrut(15));
		FG.contentW.add(FG.contentRes);
		FG.contentW.add(Box.createVerticalStrut(70));
		FG.contentW.add(FG.contentError);
		FG.content.add(new JLabel("Contrainte"));
		FG.contentArg.add(new JLabel("Arguments/Valeurs"));
		FG.contentRes.add(new JLabel("Résultat"));
				
		String nomFile = args[0];
		FG.setSize(1000, 200);
		FG.setLocation(200,200);
	 
	    //content.setBackground(Color.white);
		FlowLayout fl = new FlowLayout();
		FG.contentW.setLayout(fl);
	    //content.add(new JLabel(" Fichier analysé : " + nomFile));
	    DR = GCLACSFactory.eINSTANCE.createDocument_Root();
	    DocumentBuilderFactory dbf = null;
	    DocumentBuilder db = null;
	    Document doc = null;
	    
	    
	    /****** Premier fichier analysé, sert à construire le Document_Root ******/
	    try{
	    dbf = DocumentBuilderFactory.newInstance();	
		db = dbf.newDocumentBuilder();
		doc = db.parse(nomFile);		
		doc.getDocumentElement().normalize();
	    }catch(Exception ex){
			ex.printStackTrace();	
	 	}
	    NodeList NoeudRacine = doc.getElementsByTagName("cl:Component_Instance");
	    Node NoeudComponentInstanceGeneral = NoeudRacine.item(0);
	    
	    ComponentInstance cRoot = GCLACSFactory.eINSTANCE.createComponentInstance();
		String defineByDesc = "";
		String nameComp = "";
		
		//defineByDesc
		defineByDesc = NoeudRacine.item(0).getChildNodes().item(1).getTextContent();
		cRoot.setDefineByDescriptor(defineByDesc);
		
		//Kind
		ComponentKind CK = null;
		if(NoeudRacine.item(0).getAttributes().getNamedItem("kind").getNodeValue().toString().equals("contract")){
			CK = ComponentKind.CONTRACT;
		} else if(NoeudRacine.item(0).getAttributes().getNamedItem("kind").getNodeValue().toString().equals("constraint")){
			CK = ComponentKind.CONSTRAINT;
    	} else {
    		CK = ComponentKind.BUSINESS;
    	}
		cRoot.setKind(CK);
		
		//nom Comp
		nameComp = NoeudRacine.item(0).getAttributes().getNamedItem("name").getNodeValue().toString();
		cRoot.setName(nameComp);
		
		DR.setComponentInstance(cRoot);
	    
		/***** Analyse des autres fichiers, complétant le Document_Root *****/
		
	    for(int fi = 0; fi < args.length; fi++){
	    	nomFile = args[fi];
	    try{
		    dbf = DocumentBuilderFactory.newInstance();	
			db = dbf.newDocumentBuilder();
			doc = db.parse(nomFile);		
			doc.getDocumentElement().normalize();
			
			//content.add(new JLabel(cRoot.toString()));
			NodeList childRacine = NoeudRacine.item(0).getChildNodes();
			ComponentInstance CI = GCLACSFactory.eINSTANCE.createComponentInstance();
						
			//on analyse les noeuds, et on traite chaque cas
			for(int i = 0; i < childRacine.getLength(); i++){
				
				NoeudRacine = doc.getElementsByTagName("cl:Component_Instance");
				//System.out.println("item 0 du noeud racine : " + NoeudRacine.item(0).getAttributes().getNamedItem("name").getNodeValue());
				//System.out.println("item 1 du noeud racine : " + NoeudRacine.item(0).getChildNodes().item(1).getTextContent());
				/*********** Traitement des Instances ************/

					
					//defByDesc
					String compDesc = null;
					
					compDesc = NoeudRacine.item(0).getChildNodes().item(1).getTextContent().toString();
					//si le descriptor est deja présent, on utilise le nom de l'instance existante
					if(getCompByDesc(compDesc) != null){
						CI = getCompByDesc(compDesc);
					} else {
						CI.setDefineByDescriptor(compDesc);
						
						//nomInstance
						String nomInst = null;
						
						nomInst = NoeudRacine.item(0).getAttributes().getNamedItem("name").getNodeValue().toString();
						
						CI.setName(nomInst);
						
						DR.getComponentInstance().getComponentInstance().add(CI);
						//Kind
						ComponentKind CK2 = ComponentKind.BUSINESS;
						if(NoeudRacine.item(0).getAttributes().getNamedItem("kind").getNodeValue().toString().equals("contract")){
							CK2 = ComponentKind.CONTRACT;
						} else if(NoeudRacine.item(0).getAttributes().getNamedItem("kind").getNodeValue().toString().equals("constraint")){
							CK2 = ComponentKind.CONSTRAINT;
				    	}
						CI.setKind(CK2);
					}
					
					//content.add(new JLabel(CI.toString()));
				/***************************************************/
				
				childRacine = NoeudRacine.item(0).getChildNodes();
				
				/*********** Traitement des interfaces ************/
				if(childRacine.item(i).getNodeName() == "cl:Interface"){
					
					Interface I = GCLACSFactory.eINSTANCE.createInterface();
					
					//nomInterface
					String nomInterface = childRacine.item(i).getAttributes().getNamedItem("name").getNodeValue().toString();
					I.setName(nomInterface);
					CI.getInterface().add(I);					
					
					NodeList listServ = childRacine.item(i).getChildNodes();
					for(int l = 0; l < listServ.getLength(); l++){
						if(listServ.item(l).getNodeName() == "cl:Service"){
							Services s1 = GCLACSFactory.eINSTANCE.createServices();
							
							//nom service
							String nomServ = listServ.item(l).getAttributes().getNamedItem("name").getNodeValue().toString();
							s1.setName(nomServ);
							
							//returnedType
							String retType = "boolean";
							if(listServ.item(l).getAttributes().getNamedItem("returnedType") != null)
								retType = listServ.item(l).getAttributes().getNamedItem("returnedType").getNodeValue().toString();
							s1.setReturnedType(retType);
							
							//kind
							String typekind = listServ.item(l).getAttributes().getNamedItem("kind").getNodeValue().toString();
							ServiceKind sk1 = ServiceKind.BUSINESS;
							if(typekind.equals("constraintCheck")){
							sk1 = ServiceKind.CONSTRAINT_CHECK;
							} else if (typekind.equals("contractCheck")){
								sk1 = ServiceKind.CONTRACT_CHECK;
							}
							s1.setKind(sk1);
							
							NodeList listServChild = listServ.item(l).getChildNodes();
							
							BodyType Body1 = GCLACSFactory.eINSTANCE.createBodyType();
							String langB = "";
							String valueB = "";
							for(int m = 0; m < listServChild.getLength(); m++){
								if(listServChild.item(m).getNodeName() == "cl:Body"){
									//langage body
									
									if(listServChild.item(m).getAttributes().getNamedItem("language").getNodeValue() != null){
										langB = listServChild.item(m).getAttributes().getNamedItem("language").getNodeValue().toString();
									}
									Body1.setLanguage(langB);
									
									//value body
									
									if(listServChild.item(m).getTextContent() != null){
										valueB = listServChild.item(m).getTextContent();
									}
								}
								else if(listServChild.item(m).getNodeName() == "cl:Arg"){
									Arg Arg1 = GCLACSFactory.eINSTANCE.createArg();
									
									NodeList listArgChild = listServChild.item(m).getChildNodes();
									
									for(int arg = 0; arg < listArgChild.getLength(); arg ++){
										if(listArgChild.item(arg).getNodeName() == "cl:Name"){
											//nom Arg
											String nomArg = listArgChild.item(arg).getTextContent();
											Arg1.setName(nomArg);
										}
										if(listArgChild.item(arg).getNodeName() == "cl:Type"){
											//type arg
											String typeArg = listArgChild.item(arg).getTextContent();
											System.out.println("typearg : " + typeArg);
											Arg1.setType(typeArg);
										}
									}
									s1.getArg().add(Arg1);
								}
							}
							Body1.setValue(valueB);
							s1.setBody(Body1);
							Interface Is = getInterfaceMM(listServ.item(l).getParentNode().getAttributes().getNamedItem("name").getNodeValue());
							Is.getService().add(s1);							
							CI.getInterface().add(Is);
						}
					}
					
				}
				/***************************************************/
				

								
				/*************** Traitement des ports **************/
				if(childRacine.item(i).getNodeName().equals("cl:Port")){
					
					Port P1 = GCLACSFactory.eINSTANCE.createPort();
					
					//nom port
					String nomPort = childRacine.item(i).getAttributes().getNamedItem("name").getNodeValue().toString();

					NodeList childPort = childRacine.item(i).getChildNodes();
					Visibility vPort = null;
					DefineByInterface def = null;
					
					for(int p = 0; p < childPort.getLength(); p++){
						
						if(childPort.item(p).getNodeName().equals("cl:Visibility")){
							//visibilite port
							String visibilityPort = childPort.item(p).getTextContent();
							vPort = Visibility.INTERNAL;
							if(visibilityPort.equals("external")){
								vPort = Visibility.EXTERNAL;
							}
						}
												
						if(childPort.item(p).getNodeName().equals("cl:Direction")){
							//direction port
							String directionPort = childPort.item(p).getTextContent();
							if(directionPort.equals("provided")){
								P1 = GCLACSFactory.eINSTANCE.createProvidedPort();
							} else {
								P1 = GCLACSFactory.eINSTANCE.createRequiredPort();
							}
						}
						
						if(childPort.item(p).getNodeName().equals("cl:DefinedByInterface")){
							//defineByInterface
							String defByI = childPort.item(p).getTextContent();
							def = GCLACSFactory.eINSTANCE.createDefineByInterface();
							if(getInterfaceMM(defByI) == null){
								Interface I1 = GCLACSFactory.eINSTANCE.createInterface();
								I1.setName(defByI);
								def.setInterface(I1);
								CI.getInterface().add(I1);
							} else {
								def.setInterface(getInterfaceMM(defByI));
							}
						}
					}
					P1.setName(nomPort);
					P1.setVisibility(vPort);
					P1.setDefineByInterface(def);
					def.setPort(P1);
					CI.getPort().add(P1);
					
					
				}
				/****************************************************/
			}

	    }
		catch(Exception ex){
			ex.printStackTrace();	
	 	}
		
		
	  }
	    
	   //on a fini l'analyse des fichiers, on les réanalyse pour leurs bindings
	    
	    
	    for(int fi = 0; fi < args.length; fi++){
	    	nomFile = args[fi];
	    try{
		    dbf = DocumentBuilderFactory.newInstance();	
			db = dbf.newDocumentBuilder();
			doc = db.parse(nomFile);		
			doc.getDocumentElement().normalize();
				
				/********************* Traitement des binding*********************/
				/******* en dernier car tous les ports doivent etre inseres ******/
				NodeList ListBind = doc.getElementsByTagName("cl:Binding");
				
				for(int i = 0; i < ListBind.getLength(); i++){
					Binding B1 = GCLACSFactory.eINSTANCE.createBinding();
					
					//name
					String name = "";
					if (ListBind.item(i).getAttributes().getNamedItem("name")!= null){
						name = ListBind.item(i).getAttributes().getNamedItem("name").getNodeValue();
					}
					B1.setName(name);
					
					
					//glue
					boolean glueValue = false;
					if (ListBind.item(i).getAttributes().getNamedItem("glue").equals("true")){
						glueValue = true;
					}
					B1.setGlue(glueValue);
					
					//kind
					BindingKind BK1 = BindingKind.SIMPLE;
					if(ListBind.item(i).getAttributes().getNamedItem("kind") != null){
						if(ListBind.item(i).getAttributes().getNamedItem("kind").getNodeValue().equals("delegation")){
							BK1 = BindingKind.DELEGATION;
						} else if (ListBind.item(i).getAttributes().getNamedItem("kind").equals("constraint")){
							BK1 = BindingKind.CONSTRAINT_CONNECTION;
						} else if (ListBind.item(i).getAttributes().getNamedItem("kind").equals("contract")){
							BK1 = BindingKind.CONTRACT_CONNECTION;
						}
					}
					B1.setKind(BK1);
					
					NodeList ListBindChild = ListBind.item(i).getChildNodes();
					
					for(int j = 0; j < ListBindChild.getLength(); j++){
						
						if(ListBindChild.item(j).getNodeName().equals("cl:Source")){
							//source
							String nomPortSrc = ListBindChild.item(j).getTextContent();
							nomPortSrc = adaptPort(nomPortSrc);
							if(getPortMM(nomPortSrc) == null){
								Port Ps = GCLACSFactory.eINSTANCE.createPort();
								Ps.setName(nomPortSrc);
								B1.setSource(Ps);
							} else {
								Port PSrc = getPortMM(nomPortSrc);
								B1.setSource(PSrc);
							}
							
						} else if(ListBindChild.item(j).getNodeName().equals("cl:Target")){
							//target
							String nomPortTg = ListBindChild.item(j).getTextContent();
							nomPortTg = adaptPort(nomPortTg);			
							if(getPortMM(nomPortTg) == null){
								Port Pt = GCLACSFactory.eINSTANCE.createPort();
								Pt.setName(nomPortTg);
								B1.setTarget(Pt);
							} else {
								Port PTg = getPortMM(nomPortTg);
								B1.setTarget(PTg);
							}
						} else if(ListBindChild.item(j).getNodeName().equals("cl:UsedService")){
							String arg = "";
							NodeList childBinding = ListBindChild.item(j).getChildNodes();
							for(int c = 0; c < childBinding.getLength(); c++){
								if(childBinding.item(c).getNodeName().equals("cl:Arg")){
									//System.out.println("argument : /" + childBinding.item(c).getTextContent() + "/");
									arg += childBinding.item(c).getTextContent() + " ";
								}
							}
							//System.out.println("ServiceArg : " + arg);
							if(ListBindChild.item(j).getAttributes() != null)
									B1.setUsedServiceName(ListBindChild.item(j).getAttributes().getNamedItem("name").getNodeValue());
							B1.setUsedServiceArgs(arg);
						}
					}					
					DR.getComponentInstance().getBinding().add(B1);			
				}
				/*****************************************************/
			    
	    }
		catch(Exception ex){
			ex.printStackTrace();	
	    }
	}
		
		/** Analyse des services et recuperation des contraintes + args **/
		//System.out.println("nb d'interfaces dans le modele DR : " + DR.getComponentInstance().get.getInterface().size() + DR.getComponentInstance().getInterface());
		//on analyse les contraintes de l'instance principale
	    //System.out.println("avant lancement cstAnalyser");
	    ComponentInstance mainComp = DR.getComponentInstance();
	    constraintAnalyser(mainComp);
	    //System.out.println("apress lancement cstAnalyser");
	    //puis les contraintes pour les sous instances
	    for(int i = 0; i < mainComp.getComponentInstance().size(); i++){
	    	constraintAnalyser(mainComp.getComponentInstance().get(i));
	    }
	    if(cstFound == false){
	    	FG.contentArg.setVisible(false);
	    	FG.contentRes.setVisible(false);
	    	FG.content.setVisible(false);
	    	
	    	System.out.println("aucune contrainte a analyser !!!");
	    	JLabel JError = new JLabel("Aucune contrainte à analyser");
			JError.setForeground(Color.red);
			FG.contentError.add(JError);
			//return;
	    }
	    FG.repaint();
	    FG.setVisible(true);
	
		String path = "./globalComp.xmi";
		DR.eResource();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GCLACSPackage.eNS_URI,GCLACSPackage.eINSTANCE);
		URI uri = URI.createFileURI(new File(path).getAbsolutePath());
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(DR);
		try {
			resource.save(null);
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	/**** fonction analysant les contraintes du composant c ****/
	public static void constraintAnalyser(ComponentInstance c){
	    for(int n = 0; n < c.getInterface().size(); n++){
			List<Services> ls = c.getInterface().get(n).getService();
			//System.out.println("nb de services dans cette interface : " + ls.size());
			for(int s = 0; s < ls.size(); s++){
				if(ls.get(s).getKind() == ServiceKind.CONSTRAINT_CHECK){
					EClassifier Eclass1 = GCLACSPackage.eINSTANCE.getDocument_Root();
					
					//contrainte
					BodyType constraintB = ls.get(s).getBody();
					
					//determination du contexte
					ComponentInstance compBody = getComponentInstanceWithConstraint(constraintB);
					if(compBody.equals("null")){
						JLabel JError = new JLabel("Le corps de la contrainte est vide !");
						JError.setForeground(Color.red);
						FG.contentError.add(JError);
						return;
					}
					ComponentInstance CompDest = getListComponentInstanceLinkWithComp(compBody);
					System.out.println("composant destination : " + CompDest);
					
					//contexte de la contrainte
					ComponentInstance CompContext = CompDest;
					//FG.content.add(new JLabel("Contexte de la contrainte : " + CompContext.getName().toString()));
					//traitement des contraintes sans argument
					if(ls.get(s).getArg() == null || ls.get(s).getArg().size() == 0){
						cstFound = true;
						System.out.println("contrainte sans argument");
						System.out.println("requete : " + constraintB.getValue());
						Object resultat = null;
						try{
							org.eclipse.emf.ocl.query.Query qocl = QueryFactory.eINSTANCE.createQuery(constraintB.getValue(), CompContext.eClass());
							resultat = qocl.evaluate(CompContext);
						}catch(java.lang.IllegalArgumentException e){
							JLabel JError = new JLabel("Erreur : " + e.getMessage() + " pour le service '" + ls.get(s).getName() + "' du composant '" + c.getName() + "'" );
							JError.setForeground(Color.red);
							FG.contentError.add(JError);
							return;
						}
						FG.content.add(new JLabel("''" + constraintB.getValue() + "''"));
						FG.contentArg.add(new JLabel("aucun"));
						JLabel JRes = new JLabel(resultat.toString());
						if(resultat.toString().equals("true")){
							JRes.setForeground(Color.green);
						} else if (resultat.toString().equals("false")){
							JRes.setForeground(Color.red);
						}
						FG.contentRes.add(JRes);
						FG.contentW.add(Box.createVerticalStrut(20));
						System.out.println("resultat : " + resultat);
					} else {
						cstFound = true;
					//traitement des contraintes avec arguments	
						
						//liste des arguments 
						List<Arg> listArg = ls.get(s).getArg();
						
						if(allArgumentsPresents(constraintB.getValue(), listArg)){
						
						String listParam = null;
						listParam = getListParamWithService(ls.get(s));
						if(listParam.equals("") || listParam.equals("null")){
							JLabel JError = new JLabel("La liste des valeurs pour les parametres est vide !");
							JError.setForeground(Color.red);
							FG.contentError.add(JError);
							return;
						}
						/*if(listParam != null){
							System.out.println("les arguments :" + listArg + " ont pour valeurs : " + listParam);
						}*/
						
						//valeurs des arguments
						StringTokenizer listParamST = new StringTokenizer(listParam, " ");
						ArrayList<String> listP = new ArrayList<String>();
						listP = transformST(listParamST);
						
						//requete
						String requeteOriginale = constraintB.getValue();
						
						//on dispose maintenant de la liste des arguments resolus dans l'ordre
						
						if(listP.size() != listArg.size()){
							//System.out.println("Arg !=");
							JLabel JError = new JLabel("Le nombre d'arguments et de valeurs d'argument est différent!");
							JError.setForeground(Color.red);
							FG.contentError.add(JError);
							return ;
						}
						
						String requeteResultante = getListArgQ(listArg, listP, requeteOriginale);
						
						String correspondanceAV = correspondanceArgValue(listArg,listP);
											
						System.out.println("requete modif : " + requeteResultante);
						//requeteModif = "ComponentInstance.allInstances()";
						//System.out.println("listArgQ : " + listArgQ);
						
											
						
						//System.out.println("eclassifier : " + listArgQ.get(0).getClass().toString());
						
						System.out.println("contexte : " + CompContext);
						org.eclipse.emf.ocl.query.Query qocl = null;
						Object resultat = null;
						try{
							qocl = QueryFactory.eINSTANCE.createQuery(requeteResultante, CompContext.eClass());
							resultat = qocl.evaluate(CompContext);
						}catch(java.lang.IllegalArgumentException e){
							JLabel JError = new JLabel("Erreur : " + e.getMessage() + " pour le service '" + ls.get(s).getName() + "' du composant '" + c.getName() + "'");
							JError.setForeground(Color.red);
							FG.contentError.add(JError);
							return;
						}/*catch(java.lang.IllegalArgumentException e){
							
						}*/
						
						FG.content.add(new JLabel("''" + constraintB.getValue() + "''"));
						FG.contentArg.add(new JLabel("[" + correspondanceAV + "]"));
						JLabel JRes = new JLabel(resultat.toString());
						if(resultat.toString().equals("true")){
							JRes.setForeground(Color.green);
						} else if (resultat.toString().equals("false")){
							JRes.setForeground(Color.red);
						} else {
							JRes = new JLabel("Non booleen");
							JRes.setForeground(Color.red);
						}
						FG.contentRes.add(JRes);
						FG.contentW.add(Box.createVerticalStrut(20));
							System.out.println("resultat : " + resultat);
						
						}else{
							FG.content.add(new JLabel("Les arguments du modèle ne correspondent pas à ceux de la contrainte !"));
							//System.out.println("Les arguments du modèle ne correspondent pas à ceux de la contrainte !");
						}
						
					}
					
				}
			}
		}
	}
	
	/* transforme le tokenizer st en array list */
	public static ArrayList<String> transformST(StringTokenizer st){
		ArrayList<String> listST = new ArrayList<String>();
		while(st.hasMoreTokens()){
			listST.add(st.nextToken());
		}
		return listST;
	}
	
	/* créé une string faisant la correspondance entre les arguments et leur valeur
	 * de la forme nomArg1(typeArg1) = valeur1 nomArg2(typeArg2) = valeur2 etc...
	 *  */
	public static String correspondanceArgValue(List<Arg> listArg, ArrayList<String> list){
		String correspondance = "";
		
		for(int i = 0; i < listArg.size(); i++){
			correspondance += listArg.get(i).getName() + "(" + listArg.get(i).getType() + ") = " + list.get(i) + " ";
		}
		
		return correspondance;
	}
	
	
	//prend la liste des arguments et leurs valeurs et retourne les objets correspondants
	public static String getListArgQ(List<Arg> listArg, ArrayList<String> list, String requete){
		Object ArgQ = null;
		String TypeArgQ =""; //string representant le type de l'argument
		ArrayList<Object> listArgQ = new ArrayList<Object>(); //liste qui va stocker l'ensemble des objets arguments
		
		if(listArg.size() != list.size()){
			FG.content.add(new JLabel("Erreur ! Le nombre d'argument et de valeurs associées différe !"));
		} else {
			for(int a = 0; a < listArg.size(); a++){
				
				ArgQ = null;
				//on parcours tous les arguments
				//on determine leur type
				//on recherche leur instance avec leur nom et type
				//on ajoute l'instance a la liste des arguments pour la requete
				
				//System.out.println("tokenValue : " + list.get(a));
				//System.out.println("arg : " + listArg.get(a).getName());
				TypeArgQ = listArg.get(a).getType();
				
				if(TypeArgQ.equals("Component_Instance")){
					ArgQ = (ComponentInstance)getCompInstMM(list.get(a));
				} else if(TypeArgQ.equals("Interface")){
					ArgQ = (Interface)getInterfaceMM(list.get(a));				
				}else if(TypeArgQ.equals("Port")){
					ArgQ = (Port)getPortMM(list.get(a));									
				} else if(TypeArgQ.equals("Services")){ 
					ArgQ = (Services)getServicesMM(list.get(a));
				}
				
				if(ArgQ != null){
					listArgQ.add(ArgQ);
				}
				
				String typeArg = listArg.get(a).getType();
				String nomArg = listArg.get(a).getName();
				
				requete = generateNewConstraint(typeArg, nomArg,list.get(a), requete);
				
			}
		}
		//on parse les arguments, fait la resolution avec les valeurs, et modifie la contrainte en conséquence		
		return requete;
	}
	
	/* va générer une contrainte paramétrés en fonction de la contraint, de l'argument et de la valeur de cet argument */
	public static String generateNewConstraint(String typeArg, String nomArg, String token, String constraint){
		String ajoutRequete = "";
		
		if(typeArg.equals("Component_Instance")){
			ajoutRequete = " let " + (nomArg + " : ComponentInstance = componentInstance->select(c | c.name = '" + token + "')->asSequence()->at(1) in ");
		}
		if(typeArg.equals("Port")){
			ajoutRequete = " let " + (nomArg + " : Port = port->select(p | p.name = '" + token + "')->asSequence()->at(1) in ");
		}
		if(typeArg.equals("Interface")){
			ajoutRequete = " let " + (nomArg + " : Interface = interface->select(i | i.name = '" + token + "')->asSequence()->at(1) in ");
		}
		if(typeArg.equals("Binding")){
			ajoutRequete = " let " + (nomArg + " : Binding = binding->select(b | b.name = '" + token + "')->asSequence()->at(1) in ");
		}
		if(typeArg.equals("Services")){
			ajoutRequete = " let " + (nomArg + " : Services = Services->select(s | s.name = '" + token + "')->asSequence()->at(1) in ");
		}
		constraint = ajoutRequete + constraint;
		return constraint;
	}
	
	/* retourne la liste des parametres correspondant au service s*/
	public static String getListParamWithService(Services s){
		String listParam = "";
		//on récuppere le nom du service
		String nomService = s.getName();
		
		List<ComponentInstance> ListCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < ListCI.size(); i++){
			for(int j = 0; j < ListCI.get(i).getBinding().size(); j++){
				if(ListCI.get(i).getBinding().get(j).getUsedServiceName() != null){
					if(ListCI.get(i).getBinding().get(j).getUsedServiceName().equals(nomService)){
						listParam += ListCI.get(i).getBinding().get(j).getUsedServiceArgs();
					}
				}
			}
		}
		for(int i = 0; i < DR.getComponentInstance().getBinding().size(); i++){
			if(DR.getComponentInstance().getBinding().get(i).getUsedServiceName() != null){
				if(DR.getComponentInstance().getBinding().get(i).getUsedServiceName().equals(nomService)){
					listParam += DR.getComponentInstance().getBinding().get(i).getUsedServiceArgs();
				}
			}
		}
		return listParam;
	}
		
	//adapte le nom du port : si il contient une hierarchie, on la coupe 
	public static String adaptPort(String nomPort){
		
		if(nomPort.contains(".")){
			int indexDuDernierPoint = nomPort.lastIndexOf(".") + 1;
			nomPort = nomPort.substring(indexDuDernierPoint, nomPort.length());
		} 
			return nomPort;
	}
	
	/* retourne true si tous les arguments du services sont présents dans la contrainte, faux sinon*/
	public static boolean allArgumentsPresents(String constraint, List<Arg> listArg){
		for(int i = 0; i < listArg.size(); i++){
			if(!constraint.contains(listArg.get(i).getName())){
				return false;
			}
		}
		return true;
	}
	
	/* retourne l'interface du Document_Root ayant pour nom 'nomInterface' */
	public static Interface getInterfaceMM(String nomInterface){
		List<ComponentInstance> ListCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < ListCI.size(); i++){
			for(int j = 0; j < ListCI.get(i).getInterface().size(); j++){
				if(ListCI.get(i).getInterface().get(j).getName().equals(nomInterface)){
					return ListCI.get(i).getInterface().get(j);
				}
			}
		}
		for(int i = 0; i < DR.getComponentInstance().getInterface().size(); i++){
			if(DR.getComponentInstance().getInterface().get(i).getName().equals(nomInterface)){
				return DR.getComponentInstance().getInterface().get(i);
			}
		}
		return null;
	}
	
	
	/* retourne le port du Document_Root ayant le nom 'nomPort' */
	public static Port getPortMM(String nomPort){
		List<ComponentInstance> listCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < listCI.size(); i++){
			for(int j = 0; j < listCI.get(i).getPort().size(); j++){
				if(listCI.get(i).getPort().get(j).getName().equals(nomPort)){
					return listCI.get(i).getPort().get(j);
				}
			}
		}
		
		List<Port> listPort = DR.getComponentInstance().getPort();
		//System.out.println("port recherché : " + nomPort);
		for(int i = 0; i < listPort.size(); i++){
			//System.out.println("port analysé : " + listPort.get(i).getName());
			if(listPort.get(i).getName().equals(nomPort)){
				return listPort.get(i);
			}
		}
		
		return null;
	}
	
	/* retourne l'instance de composant du Document_Root ayant le nom 'nomCI' */
	public static ComponentInstance getCompInstMM(String nomCI){
		//System.out.println("nom CI : " + nomCI);
		List<ComponentInstance> listCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < listCI.size(); i++){
			if(listCI.get(i).getName().equals(nomCI)){
				//System.out.println("nom CI trouveee");
				return listCI.get(i);
			}
		}
		
		if(DR.getComponentInstance().getName().equals(nomCI)){
			return DR.getComponentInstance();
		}
		
		return null;
	}
	
	/* retourne le service du Document_Root ayant le nom 'nomServ' */
	public static Services getServicesMM(String nomServ){
		List<Interface> listInterf = DR.getComponentInstance().getInterface();
		for(int i = 0; i < listInterf.size(); i++){
			for(int j = 0; j < listInterf.get(i).getService().size(); j++){
				if(listInterf.get(i).getService().get(j).getName().equals(nomServ)){
					return listInterf.get(i).getService().get(j);
				}
			}
		}
		List<ComponentInstance> listCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < listCI.size(); i++){
			for(int j = 0; j < listCI.get(i).getInterface().size(); j++){
				for(int k = 0; k < listCI.get(i).getInterface().get(j).getService().size(); k++){
					if(listCI.get(i).getInterface().get(j).getService().get(k).getName().equals(nomServ)){
						return listInterf.get(i).getService().get(j);
					}
				}
			}
		}
		
		return null;
	}
	
	/* fonction retournant le composant contrainte contenant la contrainte b*/
	public static ComponentInstance getComponentInstanceWithConstraint(BodyType b){
		ComponentInstance CI;
		Interface I = GCLACSFactory.eINSTANCE.createInterface();
		Services S = GCLACSFactory.eINSTANCE.createServices();
		//on parcours tous les composants
		for(int i = 0; i < DR.getComponentInstance().getComponentInstance().size(); i++){
			
			CI = DR.getComponentInstance().getComponentInstance().get(i);
			System.out.println("CI courant : " + CI);
			//on parcours les interfaces de ces composants
			for(int j = 0; j < CI.getInterface().size(); j++){
				I = CI.getInterface().get(j);
				//on parcours les services de ces interfaces
				for(int k = 0; k < I.getService().size(); k++){
					S = I.getService().get(k);
					if(S.getBody() == b){
						return CI;
					}
				}
			}
		}
		return null;
	}
	
	/* fonction retournant tous les composants liés au composant c1 
	 * par un binding avec c1 en port fournis externe (on suppose que le 
	 * composant contrainte c1 va fournir sa contrainte) 
	 * */
	public static ComponentInstance getListComponentInstanceLinkWithComp(ComponentInstance c1){
		ComponentInstance CompI = GCLACSFactory.eINSTANCE.createComponentInstance();
		ArrayList<Port> listPort = new ArrayList<Port>();
		ArrayList<Port> listPortCompoDest = new ArrayList<Port>();

		//on parcours tous les ports
		for(int i = 0; i < c1.getPort().size(); i++){
			//on ne regarde que les port externes
			if(c1.getPort().get(i).getVisibility() == Visibility.EXTERNAL){
				listPort.add(c1.getPort().get(i));
			}
		}
		
		//pour chaque port de la liste
		for(int j = 0; j < listPort.size(); j++){
			//on va parser tout les binding et trouver ceux ou les ports de listPort sont présents
			for(int i =0; i < DR.getComponentInstance().getBinding().size(); i++){
				Binding bCurrent = DR.getComponentInstance().getBinding().get(i);
				if(adaptPort(bCurrent.getSource().getName()).equals(adaptPort(listPort.get(j).getName()))){
					listPortCompoDest.add(bCurrent.getTarget());
				} else if (adaptPort(bCurrent.getTarget().getName()).equals(adaptPort(listPort.get(j).getName()))){
					listPortCompoDest.add(bCurrent.getSource());
				}
			}
		}
				
		for(int p = 0; p < listPortCompoDest.size(); p++){
			//on a les ports de destination, on va determiner les composants associes
			for(int i = 0; i < DR.getComponentInstance().getComponentInstance().size(); i++){
				for(int j = 0; j < DR.getComponentInstance().getComponentInstance().get(i).getPort().size(); j++){
					if(adaptPort(DR.getComponentInstance().getComponentInstance().get(i).getPort().get(j).getName()).equals(adaptPort(listPortCompoDest.get(p).getName()))){
						CompI = DR.getComponentInstance().getComponentInstance().get(i);
					}
				}
			}
			
			for(int i = 0; i < DR.getComponentInstance().getPort().size(); i++){
				if(adaptPort(DR.getComponentInstance().getPort().get(i).getName()).equals(adaptPort(listPortCompoDest.get(p).getName()))){
					CompI = DR.getComponentInstance();
				}
			}
		}
		
		//pour chaque composant ajouté, on regarde si le composant est un composant contrainte
		//si c'est le cas, on le supprime et on relance la fonction
		if(CompI.getKind().equals(ComponentKind.CONSTRAINT)){
			CompI = getListComponentInstanceLinkWithComp(CompI);
		}
		
		return CompI;
	}
	
	
	
	/* retourne l'instance de composant du Document_Root ayant pour descripteur de composant 'compDesc' */
	public static ComponentInstance getCompByDesc(String compDesc){
		ComponentInstance CI;
		for(int i = 0; i < DR.getComponentInstance().getComponentInstance().size(); i++){
			CI = DR.getComponentInstance().getComponentInstance().get(i);
			if(CI.getDefineByDescriptor().equals(compDesc)){
				return CI;
			}
		}
		if(DR.getComponentInstance().getDefineByDescriptor().equals(compDesc)){
			return DR.getComponentInstance();
		}
		return null;
	}
}
