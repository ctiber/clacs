import org.w3c.dom.Node;

import GCLACS.ComponentInstance;
import GCLACS.ComponentKind;
import GCLACS.GCLACSFactory;


public class ParsingComponentInstance {

	public ComponentInstance analyse(Node ComponentInstanceNode){
		ComponentInstance c = GCLACSFactory.eINSTANCE.createComponentInstance();
		String defineByDesc = "";
		
		//defineByDesc
		try{
			defineByDesc = ComponentInstanceNode.getChildNodes().item(1).getTextContent();
		}catch(Exception e){
			defineByDesc = "UnnamedComponentDescriptor";
			System.out.println("Erreur : Pas de descripteur pour ce composant !");
			e.printStackTrace();
		}
		c.setDefineByDescriptor(defineByDesc);
		
		//Kind
		ComponentKind CK = null;
		try{
			if(ComponentInstanceNode.getAttributes().getNamedItem("kind").getNodeValue().toString().equals("contract")){
				CK = ComponentKind.CONTRACT;
			} else if(ComponentInstanceNode.getAttributes().getNamedItem("kind").getNodeValue().toString().equals("constraint")){
				CK = ComponentKind.CONSTRAINT;
	    	}
		}catch(Exception e){
			CK = ComponentKind.BUSINESS;
		}
		c.setKind(CK);
		
		
		c.setName(getComponentInstanceName(ComponentInstanceNode));
		
		return c;
	}
	
	public String getComponentInstanceName(Node ComponentInstanceNode){
		String nameComp = "";
		
		//nom Comp
		try{
			nameComp = ComponentInstanceNode.getAttributes().getNamedItem("name").getNodeValue().toString();
		}catch(Exception e){
			nameComp = "UnnamedComponentInstance";
			System.out.println("Erreur : Pas de nom d'instance pour ce composant !");
			e.printStackTrace();
		}
		return nameComp;
	}
	
}
