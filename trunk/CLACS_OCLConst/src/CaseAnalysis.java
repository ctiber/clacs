import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import GCLACS.ComponentInstance;
import GCLACS.Document_Root;
import GCLACS.GCLACSFactory;


public class CaseAnalysis {

	ParsingComponentInstance pc = new ParsingComponentInstance(); 
	ParsingInterface pi = new ParsingInterface();
	ParsingPort pp = new ParsingPort();
	ParsingService ps = new ParsingService();
	ParsingBinding pb = new ParsingBinding();
	ConstraintInterpretor ci = new ConstraintInterpretor();
	
	Document_Root DR;
	
	
	public CaseAnalysis(String[] argFiles){
		
		if (!verifArgFiles(argFiles)){
			System.out.println("Pas d'argument !");
			return;
		}
		
		//instance du méta-modèle GCLACS
		DR = GCLACSFactory.eINSTANCE.createDocument_Root();
		
		//variables permettant le parsing des fichiers 
		DocumentBuilderFactory dbf = null;
	    DocumentBuilder db = null;
	    Document doc = null;
	    
	    /****** Premier fichier analysé, sert à construire le Document_Root ******/
	    try{
	    dbf = DocumentBuilderFactory.newInstance();	
		db = dbf.newDocumentBuilder();
		doc = db.parse(argFiles[0]);		
		doc.getDocumentElement().normalize();
	    }catch(Exception ex){
			ex.printStackTrace();	
	 	}
	    
	    //on selectionne le noeud
	    NodeList NoeudRacine = doc.getElementsByTagName("cl:Component_Instance");
	    Node NoeudComponentInstanceGeneral = NoeudRacine.item(0);
	    
	    //on analyse le noeud et on créé son instance
	    ComponentInstance ComponentInstanceGeneral = pc.analyse(NoeudComponentInstanceGeneral);
	    
	    //on l'ajoute au modèle
	    DR.setComponentInstance(ComponentInstanceGeneral);
	    
	    
	}
	
	public boolean verifArgFiles(String[] ArgFiles){
		if(ArgFiles.length == 0)
			return false;
		return true;
	}
}
