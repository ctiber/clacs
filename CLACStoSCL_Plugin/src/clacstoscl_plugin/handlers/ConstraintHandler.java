package clacstoscl_plugin.handlers;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.Synchronizer;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorWithFlyOutPalette;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import GCLACS.ComponentInstance;
import GCLACS.GCLACSFactory;
import GCLACS.GCLACSPackage;
import GCLACS.diagram.part.GclacsDiagramEditor;
import GCLACS.diagram.part.GclacsDiagramEditorPlugin;
import GCLACS.diagram.part.GclacsDiagramEditorUtil;

public class ConstraintHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	
	File f;
	
	public ConstraintHandler() {

	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */ 
	public Object execute(ExecutionEvent event) throws ExecutionException {

		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);	
		ValidatorHandler valid = new ValidatorHandler();
		f = valid.RecuperationFichierCourant();
				
		if(f != null){  

				VerificationArchi(f, window);
		}
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
				
		System.out.println("nom input : " + input.getName());
		if (input == null)
		return null;
		return ((IPathEditorInput) input).getPath().toFile();		
	}

	void VerificationArchi(File file, IWorkbenchWindow window){
		   String[] extension = file.getName().split("\\.");
		   if(!extension[1].equals("gclacs_diagram") && !extension[1].equals("cl")){
			   MessageDialog.openInformation(
						window.getShell(),
						"CLACS",
						"Ce n'est pas un fichier valide (gclacs_diagram ou cl) !!");
			   return;
		   }
		   //si on a un fichier graphique, on le verifie puis on lance la verification des contraintes
		   if(extension[1].equals("gclacs_diagram")){
			  System.out.println("diagram_gclacs !");
			  AdaptaterHandler AH = new AdaptaterHandler();
			  AH.VerificationArchi(file, window);
			  System.out.println("verfi archi Adaptater finie");
			  String dossier = file.getParent();
			  String nomFichier = "";
			 
			 	  file = new File( dossier + "/" + AH.nomDescriptor + ".cl");
			 	
		   }
		   //Verification des references aux Interfaces et aux Descripteurs

			   try{
			   DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();	
		 	   DocumentBuilder db = dbf.newDocumentBuilder();
		 	   Document doc = db.parse(file);		
		 	   doc.getDocumentElement().normalize();	

		 	   
		 	   
		 	  NodeList ListBody = doc.getElementsByTagName("cl:Body");
		 	   System.out.println("taille listbody : " + ListBody.getLength());
//		 	   if(ListBody.getLength() != 0){
//		 		   Vector<String> resultat = new Vector<String>();
//
//		 		  for (int i = 0; i < ListBody.getLength(); i++) {
//		 				String cst = ListBody.item(i).getTextContent();
//
//		 				
//		 				//System.out.println("COmpDescName : " + GCLACSPackage.eINSTANCE.getComponentDescriptor().getName().toString());
//		 				//EClassifier e1 = GCLACSPackage.eINSTANCE.getComponentDescriptor().getName();
//		 				//org.eclipse.emf.ocl.query.Query qocl = QueryFactory.eINSTANCE.createQuery(cst, e1);
//		 				//resultat += qocl.evaluate().toString();
//		 				resultat.add(cst);
//		 				/*ConstraintsAnalyzer CA = new ConstraintsAnalyzer();
//						CA.analyzeOCL(cst);*/
//		 			}
		 		  
		 		 String fileCommand = "";
		 		 NodeList ListComp = doc.getElementsByTagName("cl:DefinedByDescriptor");
		 		 
		 		 String path = file.getAbsolutePath().substring(0, file.getAbsolutePath().length() - file.getName().length());
		 		 
		 		 //System.out.println("path : " + path);
		 		 
		 		 for(int i = 0; i < ListComp.getLength(); i++){
		 				fileCommand = fileCommand + " " + path + ListComp.item(i).getTextContent() + ".cl"; 
		 		 }
		 		 
		 		 
		 		 //System.out.println("chemin is : " + System.getProperty("user.dir").toString());

		 		 //System.out.println("chemin : " + ConstraintHandler.class.getResource("ConstraintHandler.class").getPath());
		 		 String command =  System.getProperty("user.dir") + "/SoftConstraint.jar" + fileCommand;
				 System.out.println("commande : " + command);
				 Runtime runtime = Runtime.getRuntime();
				 runtime.exec(command);
					
		 		  
		 		  /*MessageDialog.openInformation(
					window.getShell(),
					"CLACS",
					"Contraintes  : " + resultat.toString()); 
				   return;
				   */
		 	   //}
			   /*else{   
		   
				   MessageDialog.openInformation(
					window.getShell(),
					"CLACS",
					"Aucune contrainte trouvée, le fichier CLACS est donc correct!!");
			   }*/
		    }
		   catch(Exception ex){
	 	  	 ex.printStackTrace();	
	 	   }
	}

//	public Object AfficherContraintes(Document doc) {
//		//String result = "";
//		Object resultat = null;
//		NodeList ListBody = doc.getElementsByTagName("cl:Body");
//
//		for (int i = 0; i < ListBody.getLength(); i++) {
//			/*result = "Contrainte de language "
//					+ ListBody.item(i).getAttributes().getNamedItem("language")
//							.getNodeValue() + " trouvee : \""
//					+ ListBody.item(i).getTextContent() + "\"\n";*/
//			String cst = ListBody.item(i).getTextContent();
//			//System.out.println(cst);
//			// OCL gestion
//			EClassifier e1 = GCLACSPackage.eINSTANCE.getComponentDescriptor();
//			org.eclipse.emf.ocl.query.Query qocl = QueryFactory.eINSTANCE.createQuery(cst, e1);
//			
//			resultat = qocl.evaluate();
//			//System.out.println("resultat : " + result);
//			//System.out.println("avant cst analyzer");
//			//ConstraintsAnalyzer CA = new ConstraintsAnalyzer();
//			//System.out.println("apres cst analyzer");
//		}
//		return resultat;
//	}

}