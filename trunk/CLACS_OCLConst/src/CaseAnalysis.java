import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ocl.query.QueryFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import GCLACS.Arg;
import GCLACS.Binding;
import GCLACS.BodyType;
import GCLACS.ComponentInstance;
import GCLACS.ComponentKind;
import GCLACS.Document_Root;
import GCLACS.GCLACSFactory;
import GCLACS.GCLACSPackage;
import GCLACS.Interface;
import GCLACS.Port;
import GCLACS.ServiceKind;
import GCLACS.Services;
import GCLACS.Visibility;


public class CaseAnalysis {

	ParsingComponentInstance pc = new ParsingComponentInstance(); 
	ParsingInterface pi = new ParsingInterface();
	ParsingPort pp = new ParsingPort();
	ParsingService ps = new ParsingService();
	ParsingBinding pb = new ParsingBinding();
	ParsingBodyType pbt = new ParsingBodyType();
	ParsingArg pa = new ParsingArg();
	ConstraintInterpretor ci = new ConstraintInterpretor();
	
	static boolean cstFound = false;
	
	Document_Root DR;
	FenetreGUI FG;
	
	public CaseAnalysis(String[] argFiles, FenetreGUI FG){
		this.FG = FG;
		DR = GCLACSFactory.eINSTANCE.createDocument_Root();
		DocumentBuilderFactory dbf = null;
	    DocumentBuilder db = null;
	    Document doc = null;
		
	    /********* on verifie qu'il y ait au moins 1 argument *********/
		if (!verifArgFiles(argFiles)){
			System.out.println("Pas d'argument !");
			return;
		}
		/**************************************************************/
		
	    /****** Premier fichier analysé, sert à construire le Document_Root ******/
	    try{
		    dbf = DocumentBuilderFactory.newInstance();	
			db = dbf.newDocumentBuilder();
			doc = db.parse(argFiles[0]);		
			doc.getDocumentElement().normalize();
		    
		    
		    NodeList NoeudRacine = doc.getElementsByTagName("cl:Component_Instance");
		    Node NoeudComponentInstanceGeneral = NoeudRacine.item(0);
		    ComponentInstance ComponentInstanceGeneral = pc.analyse(NoeudComponentInstanceGeneral);
		    DR.setComponentInstance(ComponentInstanceGeneral);
		    
		    //on parcours tous les autres fichiers pour completer le fichier de base
		    for(int fi = 0; fi < argFiles.length; fi++){
		    	String nomFile = argFiles[fi];
		    	
		    	try{
				    dbf = DocumentBuilderFactory.newInstance();	
					db = dbf.newDocumentBuilder();
					doc = db.parse(nomFile);		
					doc.getDocumentElement().normalize();
					
					NodeList childRacine = NoeudRacine.item(0).getChildNodes();
					//on analyse les noeuds, et on traite chaque cas
					for(int i = 0; i < childRacine.getLength(); i++){
					
						//on ajoute le component instance
						NoeudRacine = doc.getElementsByTagName("cl:Component_Instance");
						Node NoeudComponentInstance = NoeudRacine.item(0);
						
						
						
						ComponentInstance CI1= null;
						String nameComp = pc.getComponentInstanceName(NoeudComponentInstance);
						
						if(getCompInstMM(nameComp, DR) == null){
							CI1 = pc.analyse(NoeudComponentInstance);
							DR.getComponentInstance().getComponentInstance().add(CI1);
						} else {
							CI1 = getCompInstMM(nameComp, DR);
						}
						childRacine = NoeudRacine.item(0).getChildNodes();
						
						//si le noeud est une interface					
						if(childRacine.item(i).getNodeName() == "cl:Interface"){
							Node NodeInterface = childRacine.item(i);
							
							Interface I = null;
							String nameInterf = pi.getInterfaceName(NodeInterface);
							if(getInterfaceMM(nameInterf, DR) == null){
								I = pi.analyse(NodeInterface);
							} else {
								I = getInterfaceMM(nameInterf, DR);
							}
							CI1.getInterface().add(I);
							
							//on parcours les fils d'interface
							NodeList listServ = NodeInterface.getChildNodes();
							for(int l = 0; l < listServ.getLength(); l++){
								if(listServ.item(l).getNodeName() == "cl:Service"){
									Node NodeService = listServ.item(l);
									
									Services s = null;
									String nameService = ps.getServiceName(NodeService);
									if(getServicesMM(nameService, DR) == null){
										s = ps.analyse(NodeService);
									} else {
										s = getServicesMM(nameService, DR);
									}
									//on parcours les fils de service
									NodeList listServChild = listServ.item(l).getChildNodes();
																	
									for(int m = 0; m < listServChild.getLength(); m++){
										if(listServChild.item(m).getNodeName() == "cl:Body"){
											Node NodeBody = listServChild.item(m);
											
											BodyType Body1 = pbt.analyse(NodeBody);
											s.setBody(Body1);
											Interface Is = getInterfaceMM(NodeService.getParentNode().getAttributes().getNamedItem("name").getNodeValue(), DR);
											Is.getService().add(s);							
											CI1.getInterface().add(Is);
										} else if(listServChild.item(m).getNodeName() == "cl:Arg"){
											Node NodeArg = listServChild.item(m);
											Arg Arg1 = pa.analyse(NodeArg);
											s.getArg().add(Arg1);
										}
									}
								}
							}
						}
						if(childRacine.item(i).getNodeName().equals("cl:Port")){
							Node NodePort = childRacine.item(i);
							
							Port P1 = null;
							String namePort = pp.getPortName(NodePort);
							if(getPortMM(namePort, DR) == null){
								P1 = pp.analyse(NodePort);
							} else {
								P1 = getPortMM(namePort, DR);
							}
							CI1.getPort().add(P1);
						}
					}
		    	}catch (Exception e) {
					e.printStackTrace();
				}
		    }
	    
		    //on reparcours les fichiers pour les bindings
		    for(int fi = 0; fi < argFiles.length; fi++){
		    	String nomFile = argFiles[fi];
			    try{
				    dbf = DocumentBuilderFactory.newInstance();	
					db = dbf.newDocumentBuilder();
					doc = db.parse(nomFile);		
					doc.getDocumentElement().normalize();
		    
					/********************* Traitement des binding*********************/
					/******* en dernier car tous les ports doivent etre inseres ******/
					NodeList ListBind = doc.getElementsByTagName("cl:Binding");
					for(int i = 0; i < ListBind.getLength(); i++){
						Node NodeBinding = ListBind.item(i);
						Binding B1 = pb.analyse(NodeBinding, DR);
						DR.getComponentInstance().getBinding().add(B1);
					}
			    }catch(Exception ex){
					ex.printStackTrace();	
			 	}
		    }
		    
		    
			/** Analyse des services et recuperation des contraintes + args **/
			//System.out.println("nb d'interfaces dans le modele DR : " + DR.getComponentInstance().get.getInterface().size() + DR.getComponentInstance().getInterface());
			//on analyse les contraintes de l'instance principale
		    //System.out.println("avant lancement cstAnalyser");
		    ComponentInstance mainComp = DR.getComponentInstance();
		    constraintAnalyser(mainComp, DR, FG);
		    //System.out.println("apress lancement cstAnalyser");
		    //puis les contraintes pour les sous instances
		    for(int i = 0; i < mainComp.getComponentInstance().size(); i++){
		    	constraintAnalyser(mainComp.getComponentInstance().get(i), DR, FG);
		    }
		    if(cstFound == false){
		    	FG.contentArg.setVisible(false);
		    	FG.contentRes.setVisible(false);
		    	FG.content.setVisible(false);
		    	
		    	System.out.println("aucune contrainte a analyser !!!");
		    	JLabel JError = new JLabel("Aucune contrainte à analyser");
				JError.setForeground(Color.red);
				FG.contentError.add(JError);
				return;
		    }
		    FG.repaint();
		    FG.setVisible(true);
		
			String path = "./globalComp.xmi";
			SerializerXMI sXMI = new SerializerXMI(path, DR); 
		    
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	public boolean verifArgFiles(String[] ArgFiles){
		if(ArgFiles.length == 0)
			return false;
		return true;
	}
	
	/* retourne l'interface du Document_Root ayant pour nom 'nomInterface' */
	public static Interface getInterfaceMM(String nomInterface, Document_Root DR){
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
	
	
	/* fonction retournant le composant contrainte contenant la contrainte b*/
	public static ComponentInstance getComponentInstanceWithConstraint(BodyType b, Document_Root DR){
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
	
	//adapte le nom du port : si il contient une hierarchie, on la coupe 
	public static String adaptPort(String nomPort){
		
		if(nomPort.contains(".")){
			int indexDuDernierPoint = nomPort.lastIndexOf(".") + 1;
			nomPort = nomPort.substring(indexDuDernierPoint, nomPort.length());
		} 
			return nomPort;
	}
	
	
	/* fonction retournant tous les composants liés au composant c1 
	 * par un binding avec c1 en port fournis externe (on suppose que le 
	 * composant contrainte c1 va fournir sa contrainte) 
	 * */
	public static ComponentInstance getListComponentInstanceLinkWithComp(ComponentInstance c1, Document_Root DR){
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
			CompI = getListComponentInstanceLinkWithComp(CompI, DR);
		}
		
		return CompI;
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
	
	/* retourne la liste des parametres correspondant au service s*/
	public static String getListParamWithService(Services s, Document_Root DR){
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
	
	/* transforme le tokenizer st en array list */
	public static ArrayList<String> transformST(StringTokenizer st){
		ArrayList<String> listST = new ArrayList<String>();
		while(st.hasMoreTokens()){
			listST.add(st.nextToken());
		}
		return listST;
	}
	
	
	
	/* retourne le port du Document_Root ayant le nom 'nomPort' */
	public static Port getPortMM(String nomPort ,Document_Root DR){
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
	public static ComponentInstance getCompInstMM(String nomCI, Document_Root DR){
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
	public static Services getServicesMM(String nomServ, Document_Root DR){
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
	
	
	
	//prend la liste des arguments et leurs valeurs et retourne les objets correspondants
	public static String getListArgQ(List<Arg> listArg, ArrayList<String> list, String requete, Document_Root DR, FenetreGUI FG){
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
					ArgQ = (ComponentInstance)getCompInstMM(list.get(a), DR);
				} else if(TypeArgQ.equals("Interface")){
					ArgQ = (Interface)getInterfaceMM(list.get(a), DR);				
				}else if(TypeArgQ.equals("Port")){
					ArgQ = (Port)getPortMM(list.get(a), DR);									
				} else if(TypeArgQ.equals("Services")){ 
					ArgQ = (Services)getServicesMM(list.get(a), DR);
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
	
	
	/**** fonction analysant les contraintes du composant c ****/
	public static void constraintAnalyser(ComponentInstance c, Document_Root DR, FenetreGUI FG){
	    for(int n = 0; n < c.getInterface().size(); n++){
			List<Services> ls = c.getInterface().get(n).getService();
			//System.out.println("nb de services dans cette interface : " + ls.size());
			for(int s = 0; s < ls.size(); s++){
				if(ls.get(s).getKind() == ServiceKind.CONSTRAINT_CHECK){
					
					//contrainte
					BodyType constraintB = ls.get(s).getBody();
					
					//determination du contexte
					ComponentInstance compBody = getComponentInstanceWithConstraint(constraintB, DR);
					if(compBody.equals("null")){
						JLabel JError = new JLabel("Le corps de la contrainte est vide !");
						JError.setForeground(Color.red);
						FG.contentError.add(JError);
						return;
					}
					ComponentInstance CompDest = getListComponentInstanceLinkWithComp(compBody, DR);
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
						listParam = getListParamWithService(ls.get(s), DR);
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
						
						String requeteResultante = getListArgQ(listArg, listP, requeteOriginale, DR, FG);
						
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
							System.out.println("Les arguments du modèle ne correspondent pas à ceux de la contrainte !");
						}
						
					}
					
				}
			}
		}
	}
	
	
}
