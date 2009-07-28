import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import GCLACS.DefineByInterface;
import GCLACS.Document_Root;
import GCLACS.GCLACSFactory;
import GCLACS.Interface;
import GCLACS.Port;
import GCLACS.Visibility;


public class ParsingPort {

	
	public Port analyse(Node NodePort){
		Port P1 = GCLACSFactory.eINSTANCE.createPort();
		
		//nom port
		String nomPort = NodePort.getAttributes().getNamedItem("name").getNodeValue().toString();

		NodeList childPort = NodePort.getChildNodes();
		Visibility vPort = null;
		DefineByInterface def = null;
		
		for(int p = 0; p < childPort.getLength(); p++){
			
			if(childPort.item(p).getNodeName().equals("cl:Visibility")){
				//visibilite port
				String visibilityPort = childPort.item(p).getTextContent();
				vPort = Visibility.INTERNAL;
				if(visibilityPort.equals("external")){
					vPort = Visibility.EXTERNAL;
				}
			}
									
			if(childPort.item(p).getNodeName().equals("cl:Direction")){
				//direction port
				String directionPort = childPort.item(p).getTextContent();
				if(directionPort.equals("provided")){
					P1 = GCLACSFactory.eINSTANCE.createProvidedPort();
				} else {
					P1 = GCLACSFactory.eINSTANCE.createRequiredPort();
				}
			}
			
			/*if(childPort.item(p).getNodeName().equals("cl:DefinedByInterface")){
				//defineByInterface
				String defByI = childPort.item(p).getTextContent();
				def = GCLACSFactory.eINSTANCE.createDefineByInterface();
				if(getInterfaceMM(defByI) == null){
					Interface I1 = GCLACSFactory.eINSTANCE.createInterface();
					I1.setName(defByI);
					def.setInterface(I1);
					CI.getInterface().add(I1);
				} else {
					def.setInterface(getInterfaceMM(defByI));
				}
			}*/
		}
		P1.setName(nomPort);
		P1.setVisibility(vPort);
		//P1.setDefineByInterface(def);
		//def.setPort(P1);
		
		return P1;
		
	}
	
	public String getPortName(Node PortNode){
		//nom port
		String nomPort = "";
		try{
			nomPort = PortNode.getAttributes().getNamedItem("name").getNodeValue().toString();
		} catch (Exception e){
			nomPort = "UnnamedPort";
			System.out.println("Un port n'est pas nommé !");
			e.printStackTrace();
		}
		return nomPort;
	}

}
