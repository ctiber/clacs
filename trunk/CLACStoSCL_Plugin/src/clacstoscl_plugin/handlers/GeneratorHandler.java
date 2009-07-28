package clacstoscl_plugin.handlers;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.RefreshAction;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.*;
import java.lang.Object;

import java.io.*;

import org.w3c.dom.Element;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.ui.PartInitException;

import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.views.framelist.BackAction;
import org.eclipse.ui.views.navigator.IResourceNavigator;

import org.eclipse.core.resources.*;
import org.eclipse.core.resources.refresh.IRefreshResult;
import org.eclipse.core.resources.refresh.RefreshProvider;
import org.eclipse.core.runtime.Path;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class GeneratorHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public GeneratorHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */ 
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);	
		
		ValidatorHandler valid = new ValidatorHandler();
		File f = valid.RecuperationFichierCourant();
		if(f != null){  
			String[] extension = f.getName().split("\\.");
			if(extension.length < 2){
				MessageDialog.openInformation(
						window.getShell(),
						"CLACS",
						"Ce n'est pas un fichier CLACS !!");
			   return null;
		   }
		   else if(!extension[1].equals("cl")){
			   MessageDialog.openInformation(
					   window.getShell(),
					   "CLACS",
					  "Ce n'est pas un fichier CLACS !!");
			  return null;
		  }
		
		  GenerationCode(f, window);
		}
		return null;
	}

	
	void GenerationCode(File file , IWorkbenchWindow window){
		System.out.println("debut generation code SCL");
	   try{
		   //////////////////////////////
		   //Ouverture du fichier XML
		   /////////////////////////////
		   DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();	
	 	   DocumentBuilder db = dbf.newDocumentBuilder();
	 	   Document doc = db.parse(file);		
	 	   doc.getDocumentElement().normalize();	
	 		
	 	   //////////////////////////
	 	   //Debut Initialisation
	 	   /////////////////////////
	 	   String textEntete="";
	 	   String textRequired="";
	 	   String textProvided="";
		   String textRequiredIntern="";
	 	   String textProvidedIntern="";
	 	   String textMethod="";
	 	   String textInit="";
	 	   //String categorie=doc.getDocumentElement().getAttributes().getNamedItem("name").getNodeValue()+"_category";
	 	   String categorie=doc.getDocumentElement().getElementsByTagName("cl:DefinedByDescriptor").item(0).getTextContent()+"_category";
	 	  
	 	   String nomDescriptor="";
	 	 
	       
 		   ArrayList<ArrayList<String>> namesInterfacesPortsRequired = new ArrayList<ArrayList<String>>(); 
 		   namesInterfacesPortsRequired.add(new ArrayList<String>());//Interfaces
 		   namesInterfacesPortsRequired.add(new ArrayList<String>());//Ports
 		   ArrayList<ArrayList<String>> namesInterfacesPortsProvided = new ArrayList<ArrayList<String>>(); 
 		   namesInterfacesPortsProvided.add(new ArrayList<String>());//Interfaces
 		   namesInterfacesPortsProvided.add(new ArrayList<String>());//Ports
		    
 		   ArrayList<Element> listInterfacesRequired = new ArrayList<Element>(); 
 		   ArrayList<Element> listInterfacesProvided = new ArrayList<Element>(); 
  		   ArrayList<String> listPortsRequired = new ArrayList<String>(); 
		   ArrayList<String> listPortsProvided = new ArrayList<String>(); 
		   
		   ArrayList<ArrayList<String>> namesInterfacesPortsRequiredIntern = new ArrayList<ArrayList<String>>(); 
 		   namesInterfacesPortsRequiredIntern.add(new ArrayList<String>());//Interfaces
 		   namesInterfacesPortsRequiredIntern.add(new ArrayList<String>());//Ports
 		   ArrayList<ArrayList<String>> namesInterfacesPortsProvidedIntern = new ArrayList<ArrayList<String>>(); 
 		   namesInterfacesPortsProvidedIntern.add(new ArrayList<String>());//Interfaces
 		   namesInterfacesPortsProvidedIntern.add(new ArrayList<String>());//Ports
 		    
		   ArrayList<Element> listInterfacesRequiredIntern = new ArrayList<Element>(); 
		   ArrayList<Element> listInterfacesProvidedIntern = new ArrayList<Element>(); 
		   ArrayList<String> listPortsRequiredIntern = new ArrayList<String>(); 
		   ArrayList<String> listPortsProvidedIntern = new ArrayList<String>(); 
		   
		   ArrayList<Element> listInstance= new ArrayList<Element>();
		   ArrayList<Element> listBinding = new ArrayList<Element>();
		   ArrayList<Element> listBindingGlue = new ArrayList<Element>();
	       
 		   GeneratorCode.EnteteFichier EnteteFichier = new GeneratorCode.EnteteFichier();
 		   GeneratorCode.FichierPortRequired FichierPortRequired = new GeneratorCode.FichierPortRequired();
 		   GeneratorCode.FichierPortProvided FichierPortProvided = new GeneratorCode.FichierPortProvided();
		   GeneratorCode.FichierPortRequiredIntern FichierPortRequiredIntern = new GeneratorCode.FichierPortRequiredIntern();
 		   GeneratorCode.FichierPortProvidedIntern FichierPortProvidedIntern = new GeneratorCode.FichierPortProvidedIntern();
 		   GeneratorCode.FichierMethodProvided FichierMethodProvided = new GeneratorCode.FichierMethodProvided();
 		   GeneratorCode.FichierMethodInit FichierMethodInit = new GeneratorCode.FichierMethodInit();
 		  
	       NodeList ListDescriptor = doc.getElementsByTagName("cl:Component_Instance");	
	       NodeList listInterface = doc.getElementsByTagName("cl:Interface");
	       ////////////////////////
	       //Fin Initialisation
	       ///////////////////////
	       for(int d=0; d<1;d++){
	 		   
	 		   nomDescriptor = ListDescriptor.item(d).getChildNodes().item(1).getTextContent();
	 		   
	 		   namesInterfacesPortsRequired.get(0).clear();
	 		   namesInterfacesPortsProvided.get(0).clear(); 
	 		   listInterfacesRequired.clear();
	 		   listInterfacesProvided.clear();
   	 		   listPortsRequired.clear(); 
	 		   listPortsProvided.clear();

	 		   
	 		   namesInterfacesPortsRequiredIntern.get(0).clear();
			   namesInterfacesPortsProvidedIntern.get(0).clear(); 
			   listInterfacesRequiredIntern.clear();
			   listInterfacesProvidedIntern.clear();
			   listPortsRequiredIntern.clear();
			   listPortsProvidedIntern.clear(); 
	 		   
			   listInstance.clear();
			   listBinding.clear();
			   listBindingGlue.clear();
			   
			   ////////////////////////
			   //Tri des interfaces
			   ///////////////////////
	 		    NodeList ListChildDescr = ListDescriptor;
	 			for(int c=0; c<ListChildDescr.getLength();c++){
	 				
	 				System.out.println("noeud de base : " + ListChildDescr.item(c).getNodeName());
	 				
	 		 	     if(ListChildDescr.item(c).getNodeName() == "cl:Component_Instance" && ListDescriptor.item(0) != ListChildDescr.item(c))
	 	 				listInstance.add(((Element)ListChildDescr.item(c)));
	 				 	
	 		 	     if(ListChildDescr.item(c).getChildNodes() != null){
	 		 	     	NodeList ListChildInst = ListChildDescr.item(c).getChildNodes();
	 		 	     
	 				 	for(int i = 0; i < ListChildInst.getLength(); i ++){
	 				 		
	 				 		System.out.println("noeud parse : " + ListChildInst.item(i).getNodeName());		 		
	 				 		
	 				 		if(ListChildInst.item(i).getNodeName() == "cl:Port" && ((Element)ListChildInst.item(i)).getElementsByTagName("cl:Direction").item(0).getTextContent().equals("required")){
	 		 					if(ListChildInst.item(i).getNodeName() == "cl:Port" && ((Element)ListChildInst.item(i)).getElementsByTagName("cl:Visibility").item(0).getTextContent().equals("external")){
	 		 						namesInterfacesPortsRequired.get(0).add(((Element)ListChildInst.item(i)).getElementsByTagName("cl:DefinedByInterface").item(0).getTextContent());
	 		 						namesInterfacesPortsRequired.get(1).add(ListChildInst.item(i).getAttributes().getNamedItem("name").getNodeValue());
	 		 					}
	 		 					else{
	 		 						namesInterfacesPortsRequiredIntern.get(0).add(((Element)ListChildInst.item(i)).getElementsByTagName("cl:DefinedByInterface").item(0).getTextContent());
	 		 						namesInterfacesPortsRequiredIntern.get(1).add(ListChildInst.item(i).getAttributes().getNamedItem("name").getNodeValue());
	 		 					}
	 		 				 }
	 		 		 	     else if(ListChildInst.item(i).getNodeName() == "cl:Port" && ((Element)ListChildInst.item(i)).getElementsByTagName("cl:Direction").item(0).getTextContent().equals("provided")){
	 		 		 	    	 	if(ListChildInst.item(i).getNodeName() == "cl:Port" && ((Element)ListChildInst.item(i)).getElementsByTagName("cl:Visibility").item(0).getTextContent().equals("external")){
	 		 		 	    	 		namesInterfacesPortsProvided.get(0).add(((Element)ListChildInst.item(i)).getElementsByTagName("cl:DefinedByInterface").item(0).getTextContent());		
	 		 		 	    	 		namesInterfacesPortsProvided.get(1).add(ListChildInst.item(i).getAttributes().getNamedItem("name").getNodeValue());
	 		 		 	    	 	}
	 		 		 	    	 	else{
	 		 		 	    	 		namesInterfacesPortsProvidedIntern.get(0).add(((Element)ListChildInst.item(i)).getElementsByTagName("cl:DefinedByInterface").item(0).getTextContent());		
	 		 		 	    	 		namesInterfacesPortsProvidedIntern.get(1).add(ListChildInst.item(i).getAttributes().getNamedItem("name").getNodeValue());
	 		 		 	    	 	}
	 		 		 	     }
	 		 			
	 		 		 	     else if(ListChildInst.item(i).getNodeName() == "cl:Binding"){
	 		 		 	    	 System.out.println("binding parse");
	 		 		 	    	String kindBind ="";
	 		 		 	    	 try{
	 		 		 	    		kindBind = ((Element)ListChildInst.item(i)).getAttributes().getNamedItem("kind").getNodeValue();
	 		 		 	    	 }catch(NullPointerException e){
	 		 		 	    		kindBind = "simple";
	 		 		 	    	 }
	 		 	 				if(!kindBind.equals("constraintConnection") && !kindBind.equals("contractConnection")){
	 		 	 					if(((Element)ListChildInst.item(i)).getAttributes().getNamedItem("glue").getNodeValue().equals("false"))
	 		 	 						listBinding.add(((Element)ListChildInst.item(i)));
	 		 	 					else
	 		 	 						listBindingGlue.add(((Element)ListChildInst.item(i)));
	 		 	 				}
	 		 	 			 }
	 				 	}
	 		 	     }
	 			}
	 		   
	 		   for(int i=0; i<listInterface.getLength(); i++){
	 			   //On test si les services de l'interface sont de kind => business
	 			  String kind = ((Element)listInterface.item(i)).getElementsByTagName("cl:Service").item(0).getAttributes().getNamedItem("kind").getNodeValue();
	 			   if(kind.equals("business")){
	 				   String nameInterface = ((Element)listInterface.item(i)).getAttributes().getNamedItem("name").getNodeValue();
	 				  
	 				   //port required
	 				   if(namesInterfacesPortsRequired.get(0).contains(nameInterface)){
	 					   listInterfacesRequired.add((Element)listInterface.item(i));
	 					   for(int n=0; n<namesInterfacesPortsRequired.get(0).size(); n++){
	 						   if(namesInterfacesPortsRequired.get(0).get(n).equals(nameInterface)){
	 							   listPortsRequired.add(namesInterfacesPortsRequired.get(1).get(n));
	 							   break;
	 						   }
	 					   }
	 				   }
	 				   //port provided
	 				   if(namesInterfacesPortsProvided.get(0).contains(nameInterface)){
	 					   listInterfacesProvided.add((Element)listInterface.item(i));
	 					   for(int n=0; n<namesInterfacesPortsProvided.get(0).size(); n++){
	 						   if(namesInterfacesPortsProvided.get(0).get(n).equals(nameInterface)){
	 							   listPortsProvided.add(namesInterfacesPortsProvided.get(1).get(n));
	 							   break;
	 						   }
	 					   }
	 				   }
	 			   
	 				   //Interfaces des Ports interns required
	 				   if(namesInterfacesPortsRequiredIntern.get(0).contains(nameInterface)){
	 					   listInterfacesRequiredIntern.add((Element)listInterface.item(i));
	 					   for(int n=0; n<namesInterfacesPortsRequiredIntern.get(0).size(); n++){
	 						   if(namesInterfacesPortsRequiredIntern.get(0).get(n).equals(nameInterface)){
	 							   listPortsRequiredIntern.add(namesInterfacesPortsRequiredIntern.get(1).get(n));
	 							   break;
	 						   }
	 					   }
	 				   }
	 				   //port interne provided
	 				   if(namesInterfacesPortsProvidedIntern.get(0).contains(nameInterface)){
	 					   listInterfacesProvidedIntern.add((Element)listInterface.item(i));
	 					   for(int n=0; n<namesInterfacesPortsProvidedIntern.get(0).size(); n++){
	 						   if(namesInterfacesPortsProvidedIntern.get(0).get(n).equals(nameInterface)){
	 							   listPortsProvidedIntern.add(namesInterfacesPortsProvidedIntern.get(1).get(n));
	 							   break;
	 						   }
	 					   }
	 				   }
	 			   	}	 		
	 		   }
	 		   
	 		   ////////////////////////
	 		   //Cretaion du Fichier
	 		   ///////////////////////
	 		   String nomFichier = file.getParent() + "/" + nomDescriptor + ".scl";
	 		   File newFile = new File(nomFichier);
		 	   PrintWriter pw = new PrintWriter(new FileWriter(newFile));
		 	   
		 	   textEntete = EnteteFichier.generate(new Object []{nomDescriptor,categorie});
		 	   pw.print(textEntete);
		 	   		  
	 		   textRequired = FichierPortRequired.generate(new Object []{listInterfacesRequired, listPortsRequired});
		 	   pw.print(textRequired);
		 	   
	 		   textProvided = FichierPortProvided.generate(new Object []{listInterfacesProvided, listPortsProvided});
	 		   if(listInterfacesRequiredIntern.size()== 0 && listInterfacesProvidedIntern.size()==0)
	 			   pw.print(textProvided + ".");//Pas de ports internes
	 		   else
	 			  pw.print(textProvided + ";");//Il y a des ports internes
		 	   
		 	   if(listInterfacesRequiredIntern.size()!=0 || listInterfacesProvidedIntern.size()!=0){
		 		   textRequiredIntern = FichierPortRequiredIntern.generate(new Object []{listInterfacesRequiredIntern, listPortsRequiredIntern});
			 	   pw.print(textRequiredIntern);
			 	   
		 		   textProvidedIntern = FichierPortProvidedIntern.generate(new Object []{listInterfacesProvidedIntern, listPortsProvidedIntern});
			 	   pw.print(textProvidedIntern);	 
		 	   }

		 	   if(listBinding.size()!=0 || listBindingGlue.size()!=0 || listInstance.size()!=0){
		 		   textInit = FichierMethodInit.generate(new Object[]{nomDescriptor,listInstance, listBinding, listBindingGlue});
			 	   pw.print(textInit);
		 	   }
		 	  
	 		   textMethod = FichierMethodProvided.generate(new Object[]{nomDescriptor,listInterfacesProvided});
		 	   pw.print(textMethod);
		 	   
		 	   pw.close();
		 	   
		 	   MessageDialog.openInformation( window.getShell(),"CLACS", "Generation de code scl");
		 	  
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
	
	   }
	   catch(Exception ex){
	 	  	 ex.printStackTrace();
	   }
	 	    
	}

}

