import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import GCLACS.Arg;
import GCLACS.GCLACSFactory;


public class ParsingArg {

	public Arg analyse(Node NodeArg){
		Arg Arg1 = GCLACSFactory.eINSTANCE.createArg();
		
		NodeList listArgChild = NodeArg.getChildNodes();
		
		for(int arg = 0; arg < listArgChild.getLength(); arg ++){
			if(listArgChild.item(arg).getNodeName() == "cl:Name"){
				//nom Arg
				String nomArg = listArgChild.item(arg).getTextContent();
				Arg1.setName(nomArg);
			}
			if(listArgChild.item(arg).getNodeName() == "cl:Type"){
				//type arg
				String typeArg = listArgChild.item(arg).getTextContent();
				System.out.println("typearg : " + typeArg);
				Arg1.setType(typeArg);
			}
		}
		
		return Arg1;
	}
}
