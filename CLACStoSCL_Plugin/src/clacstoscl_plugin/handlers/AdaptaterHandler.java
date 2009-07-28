package clacstoscl_plugin.handlers;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AdaptaterHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	
	Document doc = null;
	String nomDescriptor = "";
	
	public AdaptaterHandler() {
		nextPortProv = 0;
		nextPortReq = 0;
		nextComp = 0;
		nextCompInst = 0;
		nextInterf = 0;
		nextService = 0;
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */ 
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);	
		
			File f = RecuperationFichierCourant();
			if(f != null);
				VerificationArchi(f, window);
			return null; 
	}

	
	public File RecuperationFichierCourant(){
		IWorkbench iworkbench = PlatformUI.getWorkbench();
		if (iworkbench == null) {
		return null;
		}
		IWorkbenchWindow iworkbenchwindow = iworkbench.getActiveWorkbenchWindow();
		if (iworkbenchwindow == null) {
		return null;
		}
		IWorkbenchPage iworkbenchpage = iworkbenchwindow.getActivePage();
		if (iworkbenchpage == null) {
		return null;
		}
		IEditorPart ieditorpart = iworkbenchpage.getActiveEditor();
		
		IEditorInput input = ieditorpart.getEditorInput();
		if (input == null)
		return null;
		return ((IPathEditorInput) input).getPath().toFile();		
	}
	
	PrintWriter pw;
	/*indices des noms generees automatiquement*/
	int nextPortProv;
	int nextPortReq;
	int nextComp;
	int nextCompInst;
	int nextInterf;
	int nextService;
	
	ArrayList<String> listInstance_PortDescr; 
	
	ArrayList<String> listInstance_PortRef; 
	ArrayList<String> listInstance_PortNom; 
	
	ArrayList<String> listInterfaceRef; 
	ArrayList<String> listInterfaceNom; 
	
	ArrayList<Node> listBinding = new ArrayList<Node>(); 
	void VerificationArchi(File file, IWorkbenchWindow window){
			String dossier = null;
		   String[] extension = file.getName().split("\\.");
		   if(extension.length < 2){
			   MessageDialog.openInformation(
						window.getShell(),
						"CLACS to SCL",
						"Ce n'est pas un fichier GCLACS !!");
			   
			   return;
		   }
		   else if(!extension[1].equals("gclacs") && !extension[1].equals("gclacs_diagram")){
			   MessageDialog.openInformation(
						window.getShell(),
						"CLACS",
						"Ce n'est pas un fichier GCLACS !!");
			   return;
		   }
		    
		   else{//Verification des references aux Interfaces et aux Descripteurs
			  
			   if(extension[1].equals("gclacs_diagram")){
				   dossier = file.getParent();
				   //System.out.println("extention [0] : " + extension[0]);
				   file = new File(dossier + "/" + extension[0] + ".gclacs");
			   }
			   
			  
			   
				   /*if(file.canRead() && file.canWrite()){
					   System.out.println("Fichier " + file.getName() + " lisible et inscriptible");
				   } else {
					  
					   System.out.println("Fichier " + file.getName() + " illisible et/ou inscriptible");
				   }*/
			  
			   try{
                /////////////////////////////
			    //Initialisation des listes
			 	/////////////////////////////
			    listInstance_PortDescr = new ArrayList<String>(); 
				listInstance_PortRef = new ArrayList<String>(); 
				listInstance_PortNom = new ArrayList<String>(); 
				listInterfaceRef = new ArrayList<String>(); 
				listInterfaceNom = new ArrayList<String>(); 
				listBinding = new ArrayList<Node>();   
	           /////////////////////////////
		       //Ouverture du fichier XML
		 	   /////////////////////////////
			   DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();	
		 	   DocumentBuilder db = dbf.newDocumentBuilder();
		 	   
		 	   file = new File(dossier + "/" + extension[0] + ".gclacs");   
		 	   doc = db.parse(file);		
			   doc.getDocumentElement().normalize();
		 	   
		       NodeList ListInstance = doc.getElementsByTagName("componentInstance");	
		       String kindInstance = "";
		       
		       //System.out.println("nom comp desc : " + ListDescriptor.item(0).getAttributes().getNamedItem("name").toString());
		       
		       String nomInstance = null;
				if (ListInstance.item(0).getAttributes().getNamedItem("name") == null || ListInstance.item(0).getAttributes().getNamedItem("name").getNodeValue().equals("")){
					//System.out.println("nom null !!");
					nomInstance = "UnnamedComponentInstance" /*+ nextComp*/;
					nextComp ++;
				} else {
					nomInstance = ListInstance.item(0).getAttributes().getNamedItem("name").getNodeValue();
				}
				
				if (ListInstance.item(0).getAttributes().getNamedItem("defineByDescriptor") == null || ListInstance.item(0).getAttributes().getNamedItem("defineByDescriptor").getNodeValue().equals("")){
					System.out.println("nom null !!");
					nomDescriptor = "UnnamedDescriptor" /*+ nextComp*/;
					   MessageDialog.openInformation(
								window.getShell(),
								"CLACS to SCL",
								"L'instance principale n'a pas de descripteur lui correspondant !!");
					   
					   return;
				} else {
					nomDescriptor = ListInstance.item(0).getAttributes().getNamedItem("defineByDescriptor").getNodeValue();
				}
		   
		       try{kindInstance = ListInstance.item(0).getAttributes().getNamedItem("kind").getNodeValue();}
	           catch(Exception e){kindInstance = "business";}
			 
	 		   ////////////////////////
	 		   //Creation du Fichier
	 		   ///////////////////////
	 		   String nomFichier = file.getParent() + "/" + nomDescriptor + ".cl";
	 		   File newFile = new File(nomFichier);
		 	   pw = new PrintWriter(new FileWriter(newFile));
		 	   
		 	   String textEntete = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<cl:Component_Instance xmlns:cl=\"Metamodele/clacsCL\" kind=\""+kindInstance+"\" name=\""+nomInstance+"\">\n";
		 	   pw.print(textEntete);	  	 
		 	   
		 	   System.out.println("nom descriptor : " + ListInstance.item(0));
		 	  pw.print("<cl:DefinedByDescriptor>" + nomDescriptor + "</cl:DefinedByDescriptor>\n");
		 	   RemplirDescriptor(ListInstance.item(0));
		 	   
		 	   pw.print("</cl:Component_Instance>");
		 	   pw.close();
		 	   
 
		   
			   MessageDialog.openInformation(window.getShell(), "CLACS", "L'architecture CLACS a ete generee !!");

			  //Ouverture du fichier
			  if (newFile.exists() && newFile.isFile()) {
			      IFileStore fileStore = EFS.getLocalFileSystem().getStore(newFile.toURI());
			      IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			 	    
			      //On rafraichit le projet
			 	    IFile f = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(Path.fromOSString(file.getAbsolutePath()));
			 	    f.getProject().refreshLocal(IResource.DEPTH_INFINITE,null);
			 	    
			 	    try {
			 	    	IDE.openEditorOnFileStore( page, fileStore ); 	
			 	    } catch ( PartInitException e ) {
			 	    	e.printStackTrace();
			 	    }
			 	 }
		    }
		   catch(Exception ex){
	 	  	 ex.printStackTrace();
	 	  	MessageDialog.openInformation(window.getShell(), "CLACS", "Problemes lors de la creation de l'architecture CLACS !!");
	 	   }
		 }
	}
		
	void RemplirDescriptor(Node noeudInstance){
		int numInterface =0;
		int numPortExt =0;
		int numInstance = 0;
				
		String nomInstance = "//@componentInstance";
		NodeList ListChildDescr = noeudInstance.getChildNodes();
			for(int c=0; c<ListChildDescr.getLength();c++){
			
				System.out.println("noeud : " + ListChildDescr.item(c).getNodeName());
				
				/////////////////Interfaces///////////////////////
				if(ListChildDescr.item(c).getNodeName() == "interface")
				 {
					String nom = null;
					if (ListChildDescr.item(c).getAttributes().getNamedItem("name") == null){
						//System.out.println("nom null !!");
						nom = "UnnamedInterface" /*+ nextInterf*/;
						nextInterf ++;
					} else {
						nom = ListChildDescr.item(c).getAttributes().getNamedItem("name").getNodeValue();
					}
			
					 pw.print("<cl:Interface name=\"" + nom + "\">\n");
					 
					 /////////////////Services///////////////
					 NodeList ListChildServ = ListChildDescr.item(c).getChildNodes();
					 for(int s=0; s<ListChildServ.getLength(); s++)
					 {
						 String nomServ = null;
						 String kindServ="";
						 System.out.println("nom des noeuds :" + ListChildServ.item(s).getNodeName());
						 if(ListChildServ.item(s).getNodeName() == "service"){
							 
									if (ListChildServ.item(s).getAttributes().getNamedItem("name") == null){
										//System.out.println("nom null !!");
										nomServ = "UnnamedService" /*+ nextService*/;
										nextService ++;
									} else {
										nomServ = ListChildServ.item(s).getAttributes().getNamedItem("name").getNodeValue();
									}
								 
								 
							     try{kindServ =ListChildServ.item(s).getAttributes().getNamedItem("kind").getNodeValue();}
						         catch(Exception e){kindServ = "business";}
						     if(ListChildServ.item(s).getChildNodes().getLength() == 0){    
						         pw.print("<cl:Service name=\"" + nomServ + "\" kind=\"" + kindServ + "\"/>\n");
							 } else {
								 String returnedType = "";
								 if(ListChildServ.item(s).getAttributes().getNamedItem("returnedType") != null){
									 returnedType = ListChildServ.item(s).getAttributes().getNamedItem("returnedType").getNodeValue();
								 }
								 pw.print("<cl:Service name=\"" + nomServ + "\" kind=\"" + kindServ + "\" returnedType=\"" + returnedType + "\">\n");
								 NodeList ListChildArgBody = ListChildServ.item(s).getChildNodes();
								 for(int a=0; a < ListChildArgBody.getLength(); a++)
								 {
									 //System.out.println("nom des noeuds :" + ListChildArgBody.item(s).getNodeName());
									 if(ListChildArgBody.item(a).getNodeName() == "arg"){
										 String nomArg = "";
										 String typeArg = "";
										 if(ListChildArgBody.item(a).getAttributes().getNamedItem("type") != null){
											 typeArg = ListChildArgBody.item(a).getAttributes().getNamedItem("type").getNodeValue();
										 }
										 if(ListChildArgBody.item(a).getAttributes().getNamedItem("name") != null){
											 nomArg = ListChildArgBody.item(a).getAttributes().getNamedItem("name").getNodeValue();
										 }
										 pw.print("<cl:Arg>\n<cl:Name>" + nomArg + "</cl:Name>\n" + "<cl:Type>" + typeArg + "</cl:Type>\n</cl:Arg>\n");
									 }
									 
									 if(ListChildArgBody.item(a).getNodeName().equals("body")){
										 String lgBody = "";
										 String inBody = "";
										 if(ListChildArgBody.item(a).getAttributes().getNamedItem("language") != null){
											 lgBody = ListChildArgBody.item(a).getAttributes().getNamedItem("language").getNodeValue();
										 }
										 if(ListChildArgBody.item(a).getAttributes().getNamedItem("value") != null){
											 inBody = ListChildArgBody.item(a).getAttributes().getNamedItem("value").getNodeValue();
										 }
										 pw.print("<cl:Body language=\"" + lgBody + "\">" + inBody + "</cl:Body>\n");
									 }
									 
								 }
								 pw.print("</cl:Service>\n");
							 }
						 }
					 }
					 
					 
					 pw.print("</cl:Interface>\n");
					 
					 listInterfaceRef.add(nomInstance + "/@interface." + numInterface);
					 numInterface++;
					 listInterfaceNom.add(nom);
					 System.out.println("ajout interface  : " + nom);
					 System.out.println("ajout interface num : " + nomInstance + "/@interface." + numInterface);
				 }
				
				///////////////Ports///////////////////////
				else if(ListChildDescr.item(c).getNodeName() == "port")
				 {
					String nom = null;
					
					if (ListChildDescr.item(c).getAttributes().getNamedItem("name") == null){
						//System.out.println("nom null !!");
						if(ListChildDescr.item(c).getAttributes().getNamedItem("xsi:type").getNodeValue().equals("gcl:ProvidedPort")){
							nom = "UnnamedProvidedPort" /*+ nextPortProv*/;
							nextPortProv ++;
						} else {
							nom = "UnnamedRequiredPort" /*+ nextPortReq*/;
							nextPortReq ++;
						}						
						//Element port1 = doc.createElement("node");
						//port1.setAttribute(name, value)
						//port1.setAttribute("name", nom);
						//System.out.println("Port1 : " + ((Node)port1).getAttributes().getNamedItem("name") );
						
						//OldNode = noeudDescriptor.replaceChild(port1, ListChildDescr.item(c));
						/*ListChildDescr.item(c).getAttributes().setNamedItem(port1);*/
					} else {
						nom = ListChildDescr.item(c).getAttributes().getNamedItem("name").getNodeValue();
					}
					 
					 //System.out.println("nom du port /" + nom + "/");
					 String direction = "required";
					 if(ListChildDescr.item(c).getAttributes().getNamedItem("xsi:type").getNodeValue().equals("gcl:ProvidedPort"))
						 direction = "provided";
					 String visibility="";
				     try{visibility = ListChildDescr.item(c).getAttributes().getNamedItem("visibility").getNodeValue();}
			         catch(Exception e){visibility = "internal";}
					
			         String defineByI ="";
					 String defineByIRef ="";
					 NodeList ListChildDef = ListChildDescr.item(c).getChildNodes();
					 
					 if(ListChildDef.getLength() > 0){
												 
						 defineByIRef = ListChildDef.item(1).getAttributes().getNamedItem("Interface").getNodeValue();
						 System.out.println("definedByIRef : " + defineByIRef);
						 if(listInterfaceRef.contains(defineByIRef)){
							 defineByI = listInterfaceNom.get(listInterfaceRef.indexOf(defineByIRef));
							 System.out.println("definedByInterface : " + defineByI);
						 }
					 }
					 
					 pw.print("<cl:Port name=\"" + nom + "\">\n");
					 pw.print("<cl:Direction>" + direction + "</cl:Direction>\n");
					 pw.print("<cl:Visibility>" + visibility + "</cl:Visibility>\n");
					 pw.print("<cl:DefinedByInterface>" + defineByI + "</cl:DefinedByInterface>\n");
					 pw.print("</cl:Port>\n");
					 
					 listInstance_PortDescr.add(nomInstance  + "/@port." + numPortExt);
					 listInstance_PortRef.add(nomInstance + "/@port." + numPortExt);
					 numPortExt++;
					 listInstance_PortNom.add(nom);
					 System.out.println("ajout port ext : " + nom);
					 System.out.println("ajout port ext num: " + nomInstance  + "/@port." + numPortExt);
				 }
				else if(ListChildDescr.item(c).getNodeName() == "binding")
				 {
					System.out.println("ajout binding port ext !");
					listBinding.add(ListChildDescr.item(c));
				 }
				
				
				/////////////////Instances///////////////////////
				else if(ListChildDescr.item(c).getNodeName() == "componentInstance")
				 {
					int numPortInt = 0;
					int numInterfaceInt = 0;
					//listBinding = new ArrayList<Node>();
					 String nomInst = null;
						if (ListChildDescr.item(c).getAttributes().getNamedItem("name") == null){
							//System.out.println("nom null !!");
							nomInst = "UnnamedComponentInstance" /*+ nextCompInst*/;
							nextCompInst ++;
						} else {
							nomInst = ListChildDescr.item(c).getAttributes().getNamedItem("name").getNodeValue();
						}
					
			         String defineByD ="";
					 NodeList ListChildDef = ListChildDescr.item(c).getChildNodes();
					 
					 pw.print("<cl:Component_Instance name=\"" + nomInst + "\">\n");
					 
					 if(ListChildDef.getLength() > 0){
						 System.out.println("ListChildDef :" + ListChildDef.toString());
						 System.out.println("Taille childInstance : " + ListChildDef.getLength());
						 for(int i = 0; i < ListChildDef.getLength(); i++){
							 System.out.println("valeur du noeud fils : " + ListChildDef.item(i).getNodeValue());
							 
							 
							 
							 
								/////////////////Interfaces///////////////////////
								if(ListChildDef.item(i).getNodeName() == "interface")
								 {
									String nom = null;
									String nomInterface = null;
									if (ListChildDef.item(i).getAttributes().getNamedItem("name") == null){
										//System.out.println("nom null !!");
										nomInterface = "UnnamedInterface" /*+ nextInterf*/;
										nextInterf ++;
									} else {
										nomInterface = ListChildDef.item(i).getAttributes().getNamedItem("name").getNodeValue();
									}
							
									 pw.print("<cl:Interface name=\"" + nomInterface + "\">\n");
									 
									 /////////////////Services///////////////
									 NodeList ListChildServ = ListChildDef.item(i).getChildNodes();
									 for(int s=0; s<ListChildServ.getLength(); s++)
									 {	
										 
										 String nomServ = null;
										 String kindServ="";
										 System.out.println("nom des noeuds :" + ListChildServ.item(s).getNodeName());
										 if(ListChildServ.item(s).getNodeName() == "service"){
											 
													if (ListChildServ.item(s).getAttributes().getNamedItem("name") == null){
														//System.out.println("nom null !!");
														nomServ = "UnnamedService" /*+ nextService*/;
														nextService ++;
													} else {
														nomServ = ListChildServ.item(s).getAttributes().getNamedItem("name").getNodeValue();
													}
												 
												 
											     try{kindServ =ListChildServ.item(s).getAttributes().getNamedItem("kind").getNodeValue();}
										         catch(Exception e){kindServ = "business";}
										     if(ListChildServ.item(s).getChildNodes().getLength() == 0){    
										         pw.print("<cl:Service name=\"" + nomServ + "\" kind=\"" + kindServ + "\"/>\n");
											 } else {
												 String returnedType = "";
												 if(ListChildServ.item(s).getAttributes().getNamedItem("returnedType") != null){
													 returnedType = ListChildServ.item(s).getAttributes().getNamedItem("returnedType").getNodeValue();
												 }
												 pw.print("<cl:Service name=\"" + nomServ + "\" kind=\"" + kindServ + "\" returnedType=\"" + returnedType + "\">\n");
												 NodeList ListChildArgBody = ListChildServ.item(s).getChildNodes();
												 for(int a=0; a < ListChildArgBody.getLength(); a++)
												 {
													 //System.out.println("nom des noeuds :" + ListChildArgBody.item(s).getNodeName());
													 if(ListChildArgBody.item(a).getNodeName() == "arg"){
														 String nomArg = "";
														 String typeArg = "";
														 if(ListChildArgBody.item(a).getAttributes().getNamedItem("type") != null){
															 typeArg = ListChildArgBody.item(a).getAttributes().getNamedItem("type").getNodeValue();
														 }
														 if(ListChildArgBody.item(a).getAttributes().getNamedItem("name") != null){
															 nomArg = ListChildArgBody.item(a).getAttributes().getNamedItem("name").getNodeValue();
														 }
														 pw.print("<cl:Arg>\n<cl:Name>" + nomArg + "</cl:Name>\n" + "<cl:Type>" + typeArg + "</cl:Type>\n</cl:Arg>\n");
													 }
													 
													 if(ListChildArgBody.item(a).getNodeName().equals("body")){
														 String lgBody = "";
														 String inBody = "";
														 if(ListChildArgBody.item(a).getAttributes().getNamedItem("language") != null){
															 lgBody = ListChildArgBody.item(a).getAttributes().getNamedItem("language").getNodeValue();
														 }
														 if(ListChildArgBody.item(a).getAttributes().getNamedItem("value") != null){
															 inBody = ListChildArgBody.item(a).getAttributes().getNamedItem("value").getNodeValue();
														 }
														 pw.print("<cl:Body language=\"" + lgBody + "\">" + inBody + "</cl:Body>\n");
													 }
													 
												 }
												 pw.print("</cl:Service>\n");
											 }
										 }
									 }
									 
									 
									 pw.print("</cl:Interface>\n");
									 
									 listInterfaceRef.add(nomInstance + "/@componentInstance." + numInstance + "/@interface." + numInterfaceInt);
									 numInterfaceInt++;
									 listInterfaceNom.add(nomInterface);
									 System.out.println("ajout interface  : " + nom);
									 System.out.println("ajout interface num : " + nomInstance + "/@componentInstance." + numInstance + "/@interface." + numInterfaceInt);
								 }
							 
							 
							 
							 
							 
							 
							 
							 if(ListChildDef.item(i).getNodeName() == "port")
								 {
									String nomPort = null;
									
									if (ListChildDef.item(i).getAttributes().getNamedItem("name") == null){
										//System.out.println("nom null !!");
										if(ListChildDef.item(i).getAttributes().getNamedItem("xsi:type").getNodeValue().equals("gcl:ProvidedPort")){
											nomPort = "UnnamedProvidedPort" /*+ nextPortProv*/;
											nextPortProv ++;
										} else {
											nomPort = "UnnamedRequiredPort" /*+ nextPortReq*/;
											nextPortReq ++;
										}						
										//Element port1 = doc.createElement("node");
										//port1.setAttribute(name, value)
										//port1.setAttribute("name", nom);
										//System.out.println("Port1 : " + ((Node)port1).getAttributes().getNamedItem("name") );
										
										//OldNode = noeudDescriptor.replaceChild(port1, ListChildDescr.item(c));
										/*ListChildDescr.item(c).getAttributes().setNamedItem(port1);*/
									} else {
										nomPort = nomInst + "." + ListChildDef.item(i).getAttributes().getNamedItem("name").getNodeValue();
									}
									 
									 //System.out.println("nom du port /" + nom + "/");
									 String direction = "required";
									 if(ListChildDef.item(i).getAttributes().getNamedItem("xsi:type").getNodeValue().equals("gcl:ProvidedPort"))
										 direction = "provided";
									 String visibility="";
								     try{visibility = ListChildDef.item(i).getAttributes().getNamedItem("visibility").getNodeValue();}
							         catch(Exception e){visibility = "internal";}
									
							         String defineByI ="";
									 String defineByIRef ="";
									 NodeList ListChildDef2 = ListChildDef.item(i).getChildNodes();
									 
									 if(ListChildDef2.getLength() > 0){
																 
										 defineByIRef = ListChildDef2.item(1).getAttributes().getNamedItem("Interface").getNodeValue();
										 System.out.println("definedByIRef : " + defineByIRef);
										 if(listInterfaceRef.contains(defineByIRef)){
											 defineByI = listInterfaceNom.get(listInterfaceRef.indexOf(defineByIRef));
											 System.out.println("definedByInterface : " + defineByI);
										 }
									 }
									 
									 /*pw.print("<cl:Port name=\"" + nomPort + "\">\n");
									 pw.print("<cl:Direction>" + direction + "</cl:Direction>\n");
									 pw.print("<cl:Visibility>" + visibility + "</cl:Visibility>\n");
									 pw.print("<cl:DefinedByInterface>" + defineByI + "</cl:DefinedByInterface>\n");
									 pw.print("</cl:Port>\n");*/
									 
									 listInstance_PortDescr.add(nomInstance + "/@componentInstance." + numInstance + "/@port." + numPortInt);
									 listInstance_PortRef.add(nomInstance + "/@componentInstance." + numInstance + "/@port." + numPortInt);
									 numPortInt++;
									 listInstance_PortNom.add(nomPort);
									 System.out.println("ajout du port : " + nomPort);
									 System.out.println("ajout du num port : " + nomInstance + "/@componentInstance." + numInstance + "/@port." + numPortInt);
								 }
							 
								 if(ListChildDef.item(i).getNodeName() == "binding")
								 {
									 System.out.println("binding trouve !");
									listBinding.add(ListChildDef.item(i));
								 }
								 if(ListChildDef.item(i).getNodeName() == "Component_Instance")
								 {
									 System.out.println("Remplissage !!!!!");
									 RemplirDescriptor(ListChildDef.item(i));
								 }
								
								 
							}
								System.out.println("nom du pere : " + ListChildDescr.item(c).getParentNode().getAttributes().getNamedItem("name").getNodeValue());
								System.out.println("nom instance : " + ListChildDescr.item(c).getAttributes().getNamedItem("name"));
								NodeList ChildInst = ListChildDescr.item(c).getChildNodes();
								defineByD = ListChildDescr.item(c).getAttributes().getNamedItem("defineByDescriptor").getNodeValue();

					 }
					 
					 
					 pw.print("<cl:DefinedByDescriptor>" + defineByD + "</cl:DefinedByDescriptor>\n");
					 
					 System.out.println("nb binding : " + listBinding.size());
				 
					 
					 pw.print("</cl:Component_Instance>\n");

					 
					 
					 //System.out.println("listchilddef taille : " + ListChildDef.getLength());
					 //System.out.println("listchilddef item 1 : " + ListChildDef.item(1).getLocalName());
					 
					 //! si la taille de la liste est vide -> NullExcp !
					 if(ListChildDef.getLength() > 0){
						 RecupInfoDescriptor( ListChildDef.item(1), "//@componentInstance." + numInstance + "/@defineByDescriptor", nomInst);
					 }
					 numInstance++;
					 					 
				 }

			}
			///////Les bindings sont traites en derniers///////////////////
			for(int b=0; b<listBinding.size(); b++)
			{
				System.out.println("lecture des binding !");
				 //String kind = listBinding.get(b).getAttributes().getNamedItem("kind").getNodeValue();
				 String kind="";
				 String name="";
				 
				 try{name = listBinding.get(b).getAttributes().getNamedItem("name").getNodeValue();}
		         catch(Exception e){kind = "b"+ b;}
			      
			     try{kind = listBinding.get(b).getAttributes().getNamedItem("kind").getNodeValue();}
		         catch(Exception e){kind = "simple";}
		         
				 String glue="";
			     try{glue = listBinding.get(b).getAttributes().getNamedItem("glue").getNodeValue();}
		         catch(Exception e){glue = "false";}
				
		         String source ="";
				 String sourceRef ="";
											 
				 sourceRef = listBinding.get(b).getAttributes().getNamedItem("source").getNodeValue();
					System.out.println("sourceRef : " + sourceRef); 
					System.out.println(" ListInst: " + listInstance_PortRef.indexOf(sourceRef));
			     if(listInstance_PortRef.contains(sourceRef)){
			    	 source = listInstance_PortNom.get(listInstance_PortRef.indexOf(sourceRef));
				 }
				 
		         String target ="";
				 String targetRef ="";
											 
				 targetRef = listBinding.get(b).getAttributes().getNamedItem("target").getNodeValue();
				 System.out.println("targetRef : " + targetRef);
				 System.out.println(" ListInstTarget: " + listInstance_PortRef.indexOf(targetRef));
			     if(listInstance_PortRef.contains(targetRef)){
			    	 target = listInstance_PortNom.get(listInstance_PortRef.indexOf(targetRef));
				 }
			     
			     String usedServiceName = "";
			     try{usedServiceName = listBinding.get(b).getAttributes().getNamedItem("usedServiceName").getNodeValue();}
		         catch(Exception e){usedServiceName = "";}
		         
		         StringTokenizer listServiceArg; 
		         try{listServiceArg = new StringTokenizer(listBinding.get(b).getAttributes().getNamedItem("usedServiceArgs").getNodeValue()," ");}
		         catch(Exception e){listServiceArg = null;}
			     
		         
					 pw.print("<cl:Binding name=\"" + name + "\" glue=\"" + glue + "\" kind=\"" + kind + "\">\n");
					 pw.print("<cl:Source>" + source + "</cl:Source>\n");
					 pw.print("<cl:Target>" + target + "</cl:Target>\n");
					 if(!usedServiceName.equals("")){
					     //si on a un service utilise
						 pw.print("<cl:UsedService name=\"" + usedServiceName + "\">\n");
						 System.out.println("nb tokens : " + listServiceArg.countTokens());
						 while(listServiceArg.hasMoreTokens()){
							 pw.print("<cl:Arg>" + listServiceArg.nextToken() + "</cl:Arg>\n");
						 }
						 pw.print("</cl:UsedService>\n");
					 }
					 pw.print("</cl:Binding>\n");
			}
	}
	
	void RecupInfoDescriptor(Node noeudDescriptor, String nomDescriptor, String nomInstance){
		int numInterface =0;
		int numPort =0;
		int numInstance =0;
		
		//if(noeudDescriptor.hasChildNodes()){
		
		//System.out.println("nom noeud desc : " + noeudDescriptor.getLocalName());
		
		NodeList ListChildDescr = noeudDescriptor.getChildNodes();
		for(int c=0; c<ListChildDescr.getLength();c++){
		
			/////////////////Interfaces///////////////////////
			if(ListChildDescr.item(c).getNodeName() == "interface")
			 {
				String nom = null;
				if (ListChildDescr.item(c).getAttributes().getNamedItem("name") == null){
					//System.out.println("nom null !!");
					nom = "UnnamedInterface" /*+ nextInterf*/;
					nextInterf ++;
				} else {
					nom = ListChildDescr.item(c).getAttributes().getNamedItem("name").getNodeValue();
				}				 
				 listInterfaceRef.add(nomDescriptor + "/@interface." + numInterface);
				 numInterface++;
				 listInterfaceNom.add(nom);
			 }
			
			/////////////////Ports///////////////////////
//			else if(ListChildDescr.item(c).getNodeName() == "port")
//			 {
//				
//				String nom = null;
//				if (ListChildDescr.item(c).getAttributes().getNamedItem("name") == null){
//					//System.out.println("nom null !!");
//					if(ListChildDescr.item(c).getAttributes().getNamedItem("xsi:type").getNodeValue().equals("gcl:ProvidedPort")){
//						nom = "UnnamedProvidedPort" /*+ nextPortProv*/;
//						nextPortProv ++;
//					} else {
//						nom = "UnnamedRequiredPort" /*+ nextPortReq*/;
//						nextPortReq ++;
//					}						
//					/*Element port1 = doc.createElement("node");
//					port1.setAttribute("name","port1");
//					ListChildDescr.item(c).getAttributes().setNamedItem(port1);*/
//				} else {
//					nom = ListChildDescr.item(c).getAttributes().getNamedItem("name").getNodeValue();
//				}
//				 					
//				 listInstance_PortRef.add(nomDescriptor + "/@port." + numPort);
//				 numPort++;
//				 listInstance_PortNom.add(nomInstance + "." + nom);
//		         
//			 }
			
			/////////////////Binding///////////////////////
			//On verifie que les binding ont un lien avec le descripteur principal
//			else if(ListChildDescr.item(c).getNodeName() == "binding")
//			 {
//				String sourceRef = ListChildDescr.item(c).getAttributes().getNamedItem("source").getNodeValue();
//
//				String targetRef = ListChildDescr.item(c).getAttributes().getNamedItem("target").getNodeValue();
//					 
//			   //if(listInstance_PortDescr.contains(targetRef) || listInstance_PortDescr.contains(sourceRef))
//			   listBinding.add(ListChildDescr.item(c));
//			 }
			
			/////////////////Instances///////////////////////
			else if(ListChildDescr.item(c).getNodeName() == "componentInstance")
			 {
				 String nom = null;
					if (ListChildDescr.item(c).getAttributes().getNamedItem("name") == null){
						//System.out.println("nom null !!");
						nom = "UnnamedComponentInstance" /*+ nextCompInst*/;
						nextCompInst ++;
					} else {
						nom = ListChildDescr.item(c).getAttributes().getNamedItem("name").getNodeValue();
					}
				
		         String defineByD ="";
				 NodeList ListChildDef = ListChildDescr.item(c).getChildNodes();
				 
				 if(ListChildDef.getLength() > 0){
					 					 
					 RecupInfoDescriptor( ListChildDef.item(1), nomInstance + "/@componentInstance." + numInstance + "/@defineByDescriptor", nom);
					 numInstance++;
				 }	
			 }		
		}
		//}
	}
}
