import org.w3c.dom.Node;

import GCLACS.BodyType;
import GCLACS.GCLACSFactory;


public class ParsingBodyType {

	
	public BodyType analyse(Node NodeBodyType){
		BodyType Body1 = GCLACSFactory.eINSTANCE.createBodyType();
		String langB = "";
		String valueB = "";
		
		//langage body
		try{
			langB = NodeBodyType.getAttributes().getNamedItem("language").getNodeValue().toString();
		}catch(Exception e){
			langB = "";
		}
		Body1.setLanguage(langB);
		
		//value body
		try{
			valueB = NodeBodyType.getTextContent();
		} catch(Exception e){
			
		}
		Body1.setValue(valueB);
		
		return Body1;
	}
}
