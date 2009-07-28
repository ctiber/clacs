import org.w3c.dom.Node;

import GCLACS.GCLACSFactory;
import GCLACS.ServiceKind;
import GCLACS.Services;


public class ParsingService {

	public Services analyse(Node NodeService){
		Services s1 = GCLACSFactory.eINSTANCE.createServices();
		
		
		s1.setName(getServiceName(NodeService));
		
		//returnedType
		String retType = "boolean";
		if(NodeService.getAttributes().getNamedItem("returnedType") != null)
			retType = NodeService.getAttributes().getNamedItem("returnedType").getNodeValue().toString();
		s1.setReturnedType(retType);
		
		//kind
		String typekind = "";
		ServiceKind sk1 = ServiceKind.BUSINESS;
		try{
			typekind = NodeService.getAttributes().getNamedItem("kind").getNodeValue().toString();
			
			if(typekind.equals("constraintCheck")){
			sk1 = ServiceKind.CONSTRAINT_CHECK;
			} else if (typekind.equals("contractCheck")){
				sk1 = ServiceKind.CONTRACT_CHECK;
			}
		} catch(Exception e){
			sk1 = ServiceKind.BUSINESS;
		}
		s1.setKind(sk1);
		
		return s1;
	}
	
	public String getServiceName(Node ServiceNode){
		//nom service
		String nomServ ="";
		try{
			nomServ = ServiceNode.getAttributes().getNamedItem("name").getNodeValue().toString();
		} catch(Exception e){
			nomServ = "UnnamedService";
			System.out.println("Un service n'est pas nommé !");
			e.printStackTrace();
		}
		return nomServ;
	}
}
