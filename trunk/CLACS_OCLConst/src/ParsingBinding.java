import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import GCLACS.Binding;
import GCLACS.BindingKind;
import GCLACS.ComponentInstance;
import GCLACS.Document_Root;
import GCLACS.GCLACSFactory;
import GCLACS.Port;


public class ParsingBinding {

	
	public Binding analyse(Node NodeBinding, Document_Root DR){
		Binding B1 = GCLACSFactory.eINSTANCE.createBinding();
		
		//name
		String name = "";
		try{
			name = NodeBinding.getAttributes().getNamedItem("name").getNodeValue();
		}catch(Exception e){
			name = "UnnamedBinding";
			System.out.println("Erreur : Un binding n'estp as nommé !");
			e.printStackTrace();
		}
		B1.setName(name);
		
		
		//glue
		boolean glueValue = false;
		if (NodeBinding.getAttributes().getNamedItem("glue").equals("true")){
			glueValue = true;
		}
		B1.setGlue(glueValue);
		
		//kind
		BindingKind BK1 = BindingKind.SIMPLE;
		try{
			if(NodeBinding.getAttributes().getNamedItem("kind").getNodeValue().equals("delegation")){
				BK1 = BindingKind.DELEGATION;
			} else if (NodeBinding.getAttributes().getNamedItem("kind").equals("constraint")){
				BK1 = BindingKind.CONSTRAINT_CONNECTION;
			} else if (NodeBinding.getAttributes().getNamedItem("kind").equals("contract")){
				BK1 = BindingKind.CONTRACT_CONNECTION;
			}
		}catch(Exception e){
			BK1 = BindingKind.SIMPLE;
		}
		B1.setKind(BK1);
		
		NodeList ListBindChild = NodeBinding.getChildNodes();
		
		for(int j = 0; j < ListBindChild.getLength(); j++){
			
			if(ListBindChild.item(j).getNodeName().equals("cl:Source")){
				//source
				String nomPortSrc = ListBindChild.item(j).getTextContent();
				nomPortSrc = adaptPort(nomPortSrc);
				if(getPortMM(nomPortSrc, DR) == null){
					Port Ps = GCLACSFactory.eINSTANCE.createPort();
					Ps.setName(nomPortSrc);
					B1.setSource(Ps);
				} else {
					Port PSrc = getPortMM(nomPortSrc, DR);
					B1.setSource(PSrc);
				}
				
			} else if(ListBindChild.item(j).getNodeName().equals("cl:Target")){
				//target
				String nomPortTg = ListBindChild.item(j).getTextContent();
				nomPortTg = adaptPort(nomPortTg);			
				if(getPortMM(nomPortTg, DR) == null){
					Port Pt = GCLACSFactory.eINSTANCE.createPort();
					Pt.setName(nomPortTg);
					B1.setTarget(Pt);
				} else {
					Port PTg = getPortMM(nomPortTg, DR);
					B1.setTarget(PTg);
				}
			} else if(ListBindChild.item(j).getNodeName().equals("cl:UsedService")){
				String arg = "";
				NodeList childBinding = ListBindChild.item(j).getChildNodes();
				for(int c = 0; c < childBinding.getLength(); c++){
					if(childBinding.item(c).getNodeName().equals("cl:Arg")){
						//System.out.println("argument : /" + childBinding.item(c).getTextContent() + "/");
						arg += childBinding.item(c).getTextContent() + " ";
					}
				}
				//System.out.println("ServiceArg : " + arg);
				if(ListBindChild.item(j).getAttributes() != null)
						B1.setUsedServiceName(ListBindChild.item(j).getAttributes().getNamedItem("name").getNodeValue());
				B1.setUsedServiceArgs(arg);
			}
		}
		return B1;
	}
	
	//adapte le nom du port : si il contient une hierarchie, on la coupe 
	public static String adaptPort(String nomPort){
		
		if(nomPort.contains(".")){
			int indexDuDernierPoint = nomPort.lastIndexOf(".") + 1;
			nomPort = nomPort.substring(indexDuDernierPoint, nomPort.length());
		} 
			return nomPort;
	}
	
	/* retourne le port du Document_Root ayant le nom 'nomPort' */
	public static Port getPortMM(String nomPort, Document_Root DR){
		List<ComponentInstance> listCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < listCI.size(); i++){
			for(int j = 0; j < listCI.get(i).getPort().size(); j++){
				if(listCI.get(i).getPort().get(j).getName().equals(nomPort)){
					return listCI.get(i).getPort().get(j);
				}
			}
		}
		
		List<Port> listPort = DR.getComponentInstance().getPort();
		//System.out.println("port recherché : " + nomPort);
		for(int i = 0; i < listPort.size(); i++){
			//System.out.println("port analysé : " + listPort.get(i).getName());
			if(listPort.get(i).getName().equals(nomPort)){
				return listPort.get(i);
			}
		}
		
		return null;
	}
}
