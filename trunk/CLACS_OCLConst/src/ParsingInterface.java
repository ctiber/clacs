import org.w3c.dom.Node;

import GCLACS.GCLACSFactory;
import GCLACS.Interface;


public class ParsingInterface {

	public Interface analyse(Node InterfaceNode){
		Interface I = GCLACSFactory.eINSTANCE.createInterface();
		
		I.setName(getInterfaceName(InterfaceNode));
		
		return I;
	}
	
	public String getInterfaceName(Node InterfaceNode){
		//nomInterface
		String nomInterface ="";
		try{
		nomInterface = InterfaceNode.getAttributes().getNamedItem("name").getNodeValue().toString();
		}catch(Exception e){
			nomInterface = "UnnamedInterface";
			System.out.println("Une interface n'est pas nommée !");			
			e.printStackTrace();
		}
		return nomInterface;
	}
}
