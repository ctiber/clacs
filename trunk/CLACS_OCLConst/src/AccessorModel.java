import java.util.List;

import GCLACS.ComponentInstance;
import GCLACS.Document_Root;
import GCLACS.Interface;
import GCLACS.Port;
import GCLACS.Services;


public class AccessorModel {
	
	/* retourne le port du Document_Root ayant le nom 'nomPort' */
	public Port getPortMM(String nomPort ,Document_Root DR){
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
	
	/* retourne l'instance de composant du Document_Root ayant le nom 'nomCI' */
	public ComponentInstance getCompInstMM(String nomCI, Document_Root DR){
		//System.out.println("nom CI : " + nomCI);
		List<ComponentInstance> listCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < listCI.size(); i++){
			if(listCI.get(i).getName().equals(nomCI)){
				//System.out.println("nom CI trouveee");
				return listCI.get(i);
			}
		}
		
		if(DR.getComponentInstance().getName().equals(nomCI)){
			return DR.getComponentInstance();
		}
		
		return null;
	}
	
	/* retourne le service du Document_Root ayant le nom 'nomServ' */
	public Services getServicesMM(String nomServ, Document_Root DR){
		List<Interface> listInterf = DR.getComponentInstance().getInterface();
		for(int i = 0; i < listInterf.size(); i++){
			for(int j = 0; j < listInterf.get(i).getService().size(); j++){
				if(listInterf.get(i).getService().get(j).getName().equals(nomServ)){
					return listInterf.get(i).getService().get(j);
				}
			}
		}
		List<ComponentInstance> listCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < listCI.size(); i++){
			for(int j = 0; j < listCI.get(i).getInterface().size(); j++){
				for(int k = 0; k < listCI.get(i).getInterface().get(j).getService().size(); k++){
					if(listCI.get(i).getInterface().get(j).getService().get(k).getName().equals(nomServ)){
						return listInterf.get(i).getService().get(j);
					}
				}
			}
		}
		
		return null;
	}
	

	/* retourne l'interface du Document_Root ayant pour nom 'nomInterface' */
	public Interface getInterfaceMM(String nomInterface, Document_Root DR){
		List<ComponentInstance> ListCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < ListCI.size(); i++){
			for(int j = 0; j < ListCI.get(i).getInterface().size(); j++){
				if(ListCI.get(i).getInterface().get(j).getName().equals(nomInterface)){
					return ListCI.get(i).getInterface().get(j);
				}
			}
		}
		for(int i = 0; i < DR.getComponentInstance().getInterface().size(); i++){
			if(DR.getComponentInstance().getInterface().get(i).getName().equals(nomInterface)){
				return DR.getComponentInstance().getInterface().get(i);
			}
		}
		return null;
	}
	
		
	//adapte le nom du port : si il contient une hierarchie, on la coupe 
	public String adaptPort(String nomPort){
		
		if(nomPort.contains(".")){
			int indexDuDernierPoint = nomPort.lastIndexOf(".") + 1;
			nomPort = nomPort.substring(indexDuDernierPoint, nomPort.length());
		} 
			return nomPort;
	}

	
	
}
