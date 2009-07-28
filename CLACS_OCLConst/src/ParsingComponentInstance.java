import org.w3c.dom.Node;

import GCLACS.ComponentInstance;
import GCLACS.ComponentKind;
import GCLACS.GCLACSFactory;


public class ParsingComponentInstance {

	public ComponentInstance analyse(Node ComponentInstanceNode){
		ComponentInstance c = GCLACSFactory.eINSTANCE.createComponentInstance();
		String defineByDesc = "";
		String nameComp = "";
		
		//defineByDesc
		//try{
			defineByDesc = ComponentInstanceNode.getChildNodes().item(1).getTextContent();
		//}catch(Exception e){
			
		//}
		c.setDefineByDescriptor(defineByDesc);
		//Kind
		ComponentKind CK = null;
		if(ComponentInstanceNode.getAttributes().getNamedItem("kind").getNodeValue().toString().equals("contract")){
			CK = ComponentKind.CONTRACT;
		} else if(ComponentInstanceNode.getAttributes().getNamedItem("kind").getNodeValue().toString().equals("constraint")){
			CK = ComponentKind.CONSTRAINT;
    	} else {
    		CK = ComponentKind.BUSINESS;
    	}
		c.setKind(CK);
		
		//nom Comp
		nameComp = ComponentInstanceNode.getAttributes().getNamedItem("name").getNodeValue().toString();
		c.setName(nameComp);
		
		return c;
	}
	
}
