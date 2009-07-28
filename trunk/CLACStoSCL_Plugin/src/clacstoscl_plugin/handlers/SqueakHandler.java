package clacstoscl_plugin.handlers;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class SqueakHandler extends AbstractHandler {

	/**
	 * The constructor.
	 */
    public SqueakHandler(){
    
    }
	
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
						"Ce n'est pas un fichier SCL!!");
			   return null;
		   }
		   else if(!extension[1].equals("scl")){
			   MessageDialog.openInformation(
					   window.getShell(),
					   "CLACS",
					  "Ce n'est pas un fichier SCL !!");
			  return null;
		  }
			MessageDialog.openInformation( window.getShell(),
					"CLACS", 
					"Lancement de Squeak ");
		 try{
		
			 //String[] command = {"/bin/sh", "-c", "~/Stage/Squeak/Squeak-3.9-8_Linux/squeak -plugins ~/Stage/Squeak/Squeak-3.9-8_Linux ~/Stage/Squeak/Squeak-3.9-8_Linux/SCL.image file://" + f.getPath()};
			 //String[] command = { "cmd.exe", "/c", "C://Users//Roseline//FAC//Squeak//Squeak//Squeak.exe C://Users//Roseline//FAC//Squeak//Squeak//SCL.image file:///" + f.getPath()};
			 
			 String dossier = "Squeak//";
			 String command = dossier + "squeak" + dossier + "SCL.image file://" + f.getPath();
			 
			 Runtime runtime = Runtime.getRuntime();
			 runtime.exec(command);	 
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
		
    return null;
	}

}

