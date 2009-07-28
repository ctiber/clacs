package clacstoscl_plugin.handlers;
import java.io.File;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.eclipse.ui.*;
import org.eclipse.ui.internal.EditorReference;

import GCLACS.GCLACSPackage;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ValidatorHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public ValidatorHandler() {
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
		
		//récupération de l'élément racine :		
		
		IEditorInput input = ieditorpart.getEditorInput();
		if (input == null)
		return null;
		
		return ((IPathEditorInput) input).getPath().toFile();		
	}

	void VerificationArchi(File file, IWorkbenchWindow window){
		   String[] extension = file.getName().split("\\.");
		   if(extension.length < 2){
			   MessageDialog.openInformation(
						window.getShell(),
						"CLACS",
						"Ce n'est pas un fichier CLACS !!");
			   
			   return;
		   }
		   else if(!extension[1].equals("cl")){
			   MessageDialog.openInformation(
						window.getShell(),
						"CLACS",
						"Ce n'est pas un fichier CLACS !!");
			   return;
		   }
		   else{//Verification des references aux Interfaces et aux Descripteurs
			  
			   try{
			   DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();	
		 	   DocumentBuilder db = dbf.newDocumentBuilder();
		 	   Document doc = db.parse(file);		
		 	   doc.getDocumentElement().normalize();	
	 		
		 	   if( !VerificationNoms(doc).equals("")){
		 		  MessageDialog.openInformation(
							window.getShell(),
							"CLACS",
							VerificationNoms(doc));
				   return;
		 	   }
		 	   else if( !VerificationService(doc).equals("")){
			 		  MessageDialog.openInformation(
								window.getShell(),
								"CLACS",
								VerificationService(doc));
					   return;
			   }
		 	   /*else if(!VerificationPortInterface(doc)){
				  
				   MessageDialog.openInformation(
							window.getShell(),
							"CLACS",
							"Un port fait référence à une interface inconnue !!");
				   return;
			   }*/
			   /*else if(!VerificationInterfaceType(doc)){
					  
				   MessageDialog.openInformation(
							window.getShell(),
							"CLACS",
							"Tous les services d'une meme interface doivent avoir le meme kind !!\n" +
							"Chaque interface doit avoir au moins 1 service !");
				   return;
			   }*/			   
			   else if(! VerificationInstanceDescripteur(doc,file.getParent())){
				   MessageDialog.openInformation(
							window.getShell(),
							"CLACS",
							"Une instance de composant fait référence à un descripteur de composant inconnu !!");
				   return;
			   }
		 	   
			   else{   
		   
				   MessageDialog.openInformation(
					window.getShell(),
					"CLACS",
					"Le fichier CLACS est correct!!");
			   }
		    }
		   catch(Exception ex){
	 	  	 ex.printStackTrace();	
	 	   }
		 }
	}
	
	boolean VerificationPortInterface(Document doc){
		NodeList ListInterface = doc.getElementsByTagName("cl:Interface");	
		NodeList ListPort = doc.getElementsByTagName("cl:Port");	
		
		boolean correct = true;
		
		for(int i=0; i<ListPort.getLength();i++){	
			NodeList nodeDefineByI =  ((Element)ListPort.item(i)).getElementsByTagName("cl:DefinedByInterface");
			String nomInterface = nodeDefineByI.item(0).getTextContent();	
		
			correct = false;
			
			for(int j=0; j<ListInterface.getLength();j++){	
				String nom = ((Element)ListInterface.item(j)).getAttributes().getNamedItem("name").getNodeValue();
				
				if(nomInterface.equals(nom)){
					correct = true;
					break;
				}
			}
			if(!correct)return false;
		}
		
		return correct;
	}
	
	boolean VerificationInterfaceType(Document doc){
		NodeList ListInterface = doc.getElementsByTagName("cl:Interface");	
		
		boolean correct = false;
			
		for(int j=0; j<ListInterface.getLength();j++){	
			NodeList ListServ = ((Element)ListInterface.item(j)).getElementsByTagName("cl:Service");
			
			correct = false;
			if(ListServ.getLength() == 0){ //Pas de service ! -> erreur
				correct = false;
			}
			else if(ListServ.getLength() == 1){ //S'il y a un service pas de probleme de type
				correct = true;
			}
			else{//S'ils sont plusieurs,la il faut vérifier qu'ils sont tous du meme kind
				correct = true;
			    String kind = ListServ.item(0).getAttributes().getNamedItem("kind").getNodeValue();
				for(int s=1; s<ListServ.getLength(); s++){
					if(!kind.equals(ListServ.item(s).getAttributes().getNamedItem("kind").getNodeValue())){
						correct = false;
						break;
					}
				}
			}		
			if(!correct)return false;
		}		
		return correct;
	}
	
	boolean VerificationInstanceDescripteur(Document doc, String chemin){
		
		NodeList ListDescriptor = doc.getElementsByTagName("cl:Component_Descriptor");	
		NodeList ListInstance = doc.getElementsByTagName("cl:Component_Instance");	
		
		boolean correct = true;
		
		for(int i=0; i<ListInstance.getLength();i++){	
			NodeList nodeDefineByD =  ((Element)ListInstance.item(i)).getElementsByTagName("cl:DefinedByDescriptor");
			String nomDescriptor = nodeDefineByD.item(0).getTextContent();	
		
			correct = false;
			
			for(int j=0; j<ListDescriptor.getLength();j++){	
				String nom = ((Element)ListDescriptor.item(j)).getAttributes().getNamedItem("name").getNodeValue();
				
				if(nomDescriptor.equals(nom)){
					correct = true;
					break;
				}
			}
			if(!correct){//Le descripteur n'est pas dans le fichier on le cherche dans la bibliotheque
				//System.out.println("Descripteur exist ?");
				String nomFichierDesc = chemin + "/" + nomDescriptor + ".cl";
				if((new File(nomFichierDesc).exists())){
					//System.out.println("Oui !Descripteur exist !");
					correct = true;
				} else {
					//System.out.println("Non Descripteur exist pas !");
					return false;
				}
			}
		}
		
		return correct;
	}
	
	/* fonction qui s'assure que les services business n'ont pas de child et que les services constraints ont un body*/
	public String VerificationService(Document doc){
		String result = "";
		
		NodeList ListService = doc.getElementsByTagName("cl:Service");
		
		for(int i=0; i<ListService.getLength();i++){
			
			if(ListService.item(i).getAttributes().getNamedItem("kind").getNodeValue().equals("business")){
				if(ListService.item(i).getChildNodes().getLength() > 0){
					result += "Erreur : Un Service de kind \"business\" ne doit pas avoir d'enfant !\n";
					break;
				}
			}
			
			if(ListService.item(i).getAttributes().getNamedItem("kind").getNodeValue().equals("constraintCheck")){
				if(ListService.item(i).getChildNodes().getLength() > 0){
					NodeList ListsousService = ListService.item(i).getChildNodes();
					boolean bodyExist = false;
					for(int j = 0; j < ListsousService.getLength(); j++){
						if(ListsousService.item(j).getNodeName().equals("cl:Body")){
							bodyExist = true;
						}
					}
					if(!bodyExist){
						result += "Erreur : Un Service de kind \"constraintCheck\" doit avoir un Body !\n";
					}
					break;
				} else {
					result += "Erreur : Un Service de kind \"constraintCheck\" doit avoir un Body !\n";
					break;
				}
			}
		}
		
		return result;
	}
	
	/* fonction qui s'assure que tous les elements de l'architecture ont bien un nom */
	public String VerificationNoms(Document doc){
		
		String result = "";
		
		NodeList ListDescriptor = doc.getElementsByTagName("cl:Component_Descriptor");	
		NodeList ListInstance = doc.getElementsByTagName("cl:Component_Instance");
		NodeList ListPort = doc.getElementsByTagName("cl:Port");
		NodeList ListInterface = doc.getElementsByTagName("cl:Interface");
		NodeList ListService = doc.getElementsByTagName("cl:Service");
		NodeList ListBinding = doc.getElementsByTagName("cl:Binding");
		
		result += verifAllNamedElement(ListDescriptor);
		result += verifAllNamedElement(ListInstance);
		result += verifAllNamedElement(ListPort);
		result += verifAllNamedElement(ListInterface);
		result += verifAllNamedElement(ListService);
		result += verifAllNamedElement(ListBinding);
		
		return result;
	}
	
	/* fonction qui s'assure que les elements de la liste ListN ont tous un attribut name non vide */
	public static String verifAllNamedElement(NodeList ListN){
		String result = "";
		for(int i=0; i<ListN.getLength();i++){
			if(ListN.item(i).getAttributes().getNamedItem("name") == null || ListN.item(i).getAttributes().getNamedItem("name").getNodeValue() == ""){
				result += "Erreur : Certains '" + ListN.item(i).getNodeName().toString().substring(3, ListN.item(i).getNodeName().toString().length()) + "' ne sont pas nommés !\n";
				break;
			}
		}
		return result;
	}
	
}
