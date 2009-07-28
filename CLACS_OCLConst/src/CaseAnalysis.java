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
	AccessorModel am = new AccessorModel();	
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
						
						if(am.getCompInstMM(nameComp, DR) == null){
							CI1 = pc.analyse(NoeudComponentInstance);
							DR.getComponentInstance().getComponentInstance().add(CI1);
						} else {
							CI1 = am.getCompInstMM(nameComp, DR);
						}
						childRacine = NoeudRacine.item(0).getChildNodes();
						
						//si le noeud est une interface					
						if(childRacine.item(i).getNodeName() == "cl:Interface"){
							Node NodeInterface = childRacine.item(i);
							
							Interface I = null;
							String nameInterf = pi.getInterfaceName(NodeInterface);
							if(am.getInterfaceMM(nameInterf, DR) == null){
								I = pi.analyse(NodeInterface);
							} else {
								I = am.getInterfaceMM(nameInterf, DR);
							}
							CI1.getInterface().add(I);
							
							//on parcours les fils d'interface
							NodeList listServ = NodeInterface.getChildNodes();
							for(int l = 0; l < listServ.getLength(); l++){
								if(listServ.item(l).getNodeName() == "cl:Service"){
									Node NodeService = listServ.item(l);
									
									Services s = null;
									String nameService = ps.getServiceName(NodeService);
									if(am.getServicesMM(nameService, DR) == null){
										s = ps.analyse(NodeService);
									} else {
										s = am.getServicesMM(nameService, DR);
									}
									//on parcours les fils de service
									NodeList listServChild = listServ.item(l).getChildNodes();
																	
									for(int m = 0; m < listServChild.getLength(); m++){
										if(listServChild.item(m).getNodeName() == "cl:Body"){
											Node NodeBody = listServChild.item(m);
											
											BodyType Body1 = pbt.analyse(NodeBody);
											s.setBody(Body1);
											Interface Is = am.getInterfaceMM(NodeService.getParentNode().getAttributes().getNamedItem("name").getNodeValue(), DR);
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
							if(am.getPortMM(namePort, DR) == null){
								P1 = pp.analyse(NodePort);
							} else {
								P1 = am.getPortMM(namePort, DR);
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
		    ComponentInstance mainComp = DR.getComponentInstance();
		    //on analyse les contraintes de l'instance principale
		    
		    ConstraintInterpretor CstInt = new ConstraintInterpretor();
		    CstInt.constraintAnalyzer(mainComp, DR, FG);

		    //puis les contraintes pour les sous instances
		    for(int i = 0; i < mainComp.getComponentInstance().size(); i++){
		    	CstInt.constraintAnalyzer(mainComp.getComponentInstance().get(i), DR, FG);
		    }
		    if(CstInt.getCstFound() == false){
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
	
}
