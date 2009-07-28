import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.Box;
import javax.swing.JLabel;

import org.eclipse.emf.ocl.query.QueryFactory;

import GCLACS.Arg;
import GCLACS.Binding;
import GCLACS.BodyType;
import GCLACS.ComponentInstance;
import GCLACS.ComponentKind;
import GCLACS.Document_Root;
import GCLACS.GCLACSFactory;
import GCLACS.Interface;
import GCLACS.Port;
import GCLACS.ServiceKind;
import GCLACS.Services;
import GCLACS.Visibility;


public class ConstraintInterpretor {

	static AccessorModel am = new AccessorModel();
	
	boolean cstFound = false;
	
	/**** fonction analysant les contraintes du composant c ****/
	public void constraintAnalyzer(ComponentInstance c, Document_Root DR, FenetreGUI FG){
	    for(int n = 0; n < c.getInterface().size(); n++){
			List<Services> ls = c.getInterface().get(n).getService();
			//System.out.println("nb de services dans cette interface : " + ls.size());
			for(int s = 0; s < ls.size(); s++){
				if(ls.get(s).getKind() == ServiceKind.CONSTRAINT_CHECK){
					
					//contrainte
					BodyType constraintB = ls.get(s).getBody();
					
					//determination du contexte
					ComponentInstance compBody = getComponentInstanceWithConstraint(constraintB, DR);
					if(compBody.equals("null")){
						JLabel JError = new JLabel("Le corps de la contrainte est vide !");
						JError.setForeground(Color.red);
						FG.contentError.add(JError);
						return;
					}
					ComponentInstance CompDest = getListComponentInstanceLinkWithComp(compBody, DR);
					System.out.println("composant destination : " + CompDest);
					
					//contexte de la contrainte
					ComponentInstance CompContext = CompDest;
					//FG.content.add(new JLabel("Contexte de la contrainte : " + CompContext.getName().toString()));
					//traitement des contraintes sans argument
					if(ls.get(s).getArg() == null || ls.get(s).getArg().size() == 0){
						this.cstFound = true;
						System.out.println("contrainte sans argument");
						System.out.println("requete : " + constraintB.getValue());
						Object resultat = null;
						try{
							org.eclipse.emf.ocl.query.Query qocl = QueryFactory.eINSTANCE.createQuery(constraintB.getValue(), CompContext.eClass());
							resultat = qocl.evaluate(CompContext);
						}catch(java.lang.IllegalArgumentException e){
							JLabel JError = new JLabel("Erreur : " + e.getMessage() + " pour le service '" + ls.get(s).getName() + "' du composant '" + c.getName() + "'" );
							JError.setForeground(Color.red);
							FG.contentError.add(JError);
							return;
						}
						FG.content.add(new JLabel("''" + constraintB.getValue() + "''"));
						FG.contentArg.add(new JLabel("aucun"));
						JLabel JRes = new JLabel(resultat.toString());
						if(resultat.toString().equals("true")){
							JRes.setForeground(Color.green);
						} else if (resultat.toString().equals("false")){
							JRes.setForeground(Color.red);
						}
						FG.contentRes.add(JRes);
						FG.contentW.add(Box.createVerticalStrut(20));
						System.out.println("resultat : " + resultat);
					} else {
						this.cstFound = true;
					//traitement des contraintes avec arguments	
						
						//liste des arguments 
						List<Arg> listArg = ls.get(s).getArg();
						
						if(allArgumentsPresents(constraintB.getValue(), listArg)){
						
						String listParam = null;
						listParam = getListParamWithService(ls.get(s), DR);
						if(listParam.equals("") || listParam.equals("null")){
							JLabel JError = new JLabel("La liste des valeurs pour les parametres est vide !");
							JError.setForeground(Color.red);
							FG.contentError.add(JError);
							return;
						}
						/*if(listParam != null){
							System.out.println("les arguments :" + listArg + " ont pour valeurs : " + listParam);
						}*/
						
						//valeurs des arguments
						StringTokenizer listParamST = new StringTokenizer(listParam, " ");
						ArrayList<String> listP = new ArrayList<String>();
						listP = transformST(listParamST);
						
						//requete
						String requeteOriginale = constraintB.getValue();
						
						//on dispose maintenant de la liste des arguments resolus dans l'ordre
						
						if(listP.size() != listArg.size()){
							//System.out.println("Arg !=");
							JLabel JError = new JLabel("Le nombre d'arguments et de valeurs d'argument est différent!");
							JError.setForeground(Color.red);
							FG.contentError.add(JError);
							return ;
						}
						
						String requeteResultante = getListArgQ(listArg, listP, requeteOriginale, DR, FG);
						
						String correspondanceAV = correspondanceArgValue(listArg,listP);
											
						System.out.println("requete modif : " + requeteResultante);
						//requeteModif = "ComponentInstance.allInstances()";
						//System.out.println("listArgQ : " + listArgQ);
						
											
						
						//System.out.println("eclassifier : " + listArgQ.get(0).getClass().toString());
						
						System.out.println("contexte : " + CompContext);
						org.eclipse.emf.ocl.query.Query qocl = null;
						Object resultat = null;
						try{
							qocl = QueryFactory.eINSTANCE.createQuery(requeteResultante, CompContext.eClass());
							resultat = qocl.evaluate(CompContext);
						}catch(java.lang.IllegalArgumentException e){
							JLabel JError = new JLabel("Erreur : " + e.getMessage() + " pour le service '" + ls.get(s).getName() + "' du composant '" + c.getName() + "'");
							JError.setForeground(Color.red);
							FG.contentError.add(JError);
							return;
						}/*catch(java.lang.IllegalArgumentException e){
							
						}*/
						
						FG.content.add(new JLabel("''" + constraintB.getValue() + "''"));
						FG.contentArg.add(new JLabel("[" + correspondanceAV + "]"));
						JLabel JRes = new JLabel(resultat.toString());
						if(resultat.toString().equals("true")){
							JRes.setForeground(Color.green);
						} else if (resultat.toString().equals("false")){
							JRes.setForeground(Color.red);
						} else {
							JRes = new JLabel("Non booleen");
							JRes.setForeground(Color.red);
						}
						FG.contentRes.add(JRes);
						FG.contentW.add(Box.createVerticalStrut(20));
							System.out.println("resultat : " + resultat);
						
						}else{
							FG.content.add(new JLabel("Les arguments du modèle ne correspondent pas à ceux de la contrainte !"));
							System.out.println("Les arguments du modèle ne correspondent pas à ceux de la contrainte !");
						}
						
					}
					
				}
			}
		}
	}
	
	
	/* transforme le tokenizer st en array list */
	public static ArrayList<String> transformST(StringTokenizer st){
		ArrayList<String> listST = new ArrayList<String>();
		while(st.hasMoreTokens()){
			listST.add(st.nextToken());
		}
		return listST;
	}
	
	
	
	/* fonction retournant le composant contrainte contenant la contrainte b*/
	public static ComponentInstance getComponentInstanceWithConstraint(BodyType b, Document_Root DR){
		ComponentInstance CI;
		Interface I = GCLACSFactory.eINSTANCE.createInterface();
		Services S = GCLACSFactory.eINSTANCE.createServices();
		//on parcours tous les composants
		for(int i = 0; i < DR.getComponentInstance().getComponentInstance().size(); i++){
			
			CI = DR.getComponentInstance().getComponentInstance().get(i);
			System.out.println("CI courant : " + CI);
			//on parcours les interfaces de ces composants
			for(int j = 0; j < CI.getInterface().size(); j++){
				I = CI.getInterface().get(j);
				//on parcours les services de ces interfaces
				for(int k = 0; k < I.getService().size(); k++){
					S = I.getService().get(k);
					if(S.getBody() == b){
						return CI;
					}
				}
			}
		}
		return null;
	}
	
	
	/* retourne la liste des parametres correspondant au service s*/
	public static String getListParamWithService(Services s, Document_Root DR){
		String listParam = "";
		//on récuppere le nom du service
		String nomService = s.getName();
		
		List<ComponentInstance> ListCI = DR.getComponentInstance().getComponentInstance();
		for(int i = 0; i < ListCI.size(); i++){
			for(int j = 0; j < ListCI.get(i).getBinding().size(); j++){
				if(ListCI.get(i).getBinding().get(j).getUsedServiceName() != null){
					if(ListCI.get(i).getBinding().get(j).getUsedServiceName().equals(nomService)){
						listParam += ListCI.get(i).getBinding().get(j).getUsedServiceArgs();
					}
				}
			}
		}
		for(int i = 0; i < DR.getComponentInstance().getBinding().size(); i++){
			if(DR.getComponentInstance().getBinding().get(i).getUsedServiceName() != null){
				if(DR.getComponentInstance().getBinding().get(i).getUsedServiceName().equals(nomService)){
					listParam += DR.getComponentInstance().getBinding().get(i).getUsedServiceArgs();
				}
			}
		}
		return listParam;
	}
	
	
	/* retourne true si tous les arguments du services sont présents dans la contrainte, faux sinon*/
	public static boolean allArgumentsPresents(String constraint, List<Arg> listArg){
		for(int i = 0; i < listArg.size(); i++){
			if(!constraint.contains(listArg.get(i).getName())){
				return false;
			}
		}
		return true;
	}
	
	
	/* fonction retournant tous les composants liés au composant c1 
	 * par un binding avec c1 en port fournis externe (on suppose que le 
	 * composant contrainte c1 va fournir sa contrainte) 
	 * */
	public static ComponentInstance getListComponentInstanceLinkWithComp(ComponentInstance c1, Document_Root DR){
		ComponentInstance CompI = GCLACSFactory.eINSTANCE.createComponentInstance();
		ArrayList<Port> listPort = new ArrayList<Port>();
		ArrayList<Port> listPortCompoDest = new ArrayList<Port>();

		//on parcours tous les ports
		for(int i = 0; i < c1.getPort().size(); i++){
			//on ne regarde que les port externes
			if(c1.getPort().get(i).getVisibility() == Visibility.EXTERNAL){
				listPort.add(c1.getPort().get(i));
			}
		}
		
		//pour chaque port de la liste
		for(int j = 0; j < listPort.size(); j++){
			//on va parser tout les binding et trouver ceux ou les ports de listPort sont présents
			for(int i =0; i < DR.getComponentInstance().getBinding().size(); i++){
				Binding bCurrent = DR.getComponentInstance().getBinding().get(i);
				if(am.adaptPort(bCurrent.getSource().getName()).equals(am.adaptPort(listPort.get(j).getName()))){
					listPortCompoDest.add(bCurrent.getTarget());
				} else if (am.adaptPort(bCurrent.getTarget().getName()).equals(am.adaptPort(listPort.get(j).getName()))){
					listPortCompoDest.add(bCurrent.getSource());
				}
			}
		}
				
		for(int p = 0; p < listPortCompoDest.size(); p++){
			//on a les ports de destination, on va determiner les composants associes
			for(int i = 0; i < DR.getComponentInstance().getComponentInstance().size(); i++){
				for(int j = 0; j < DR.getComponentInstance().getComponentInstance().get(i).getPort().size(); j++){
					if(am.adaptPort(DR.getComponentInstance().getComponentInstance().get(i).getPort().get(j).getName()).equals(am.adaptPort(listPortCompoDest.get(p).getName()))){
						CompI = DR.getComponentInstance().getComponentInstance().get(i);
					}
				}
			}
			
			for(int i = 0; i < DR.getComponentInstance().getPort().size(); i++){
				if(am.adaptPort(DR.getComponentInstance().getPort().get(i).getName()).equals(am.adaptPort(listPortCompoDest.get(p).getName()))){
					CompI = DR.getComponentInstance();
				}
			}
		}
		
		//pour chaque composant ajouté, on regarde si le composant est un composant contrainte
		//si c'est le cas, on le supprime et on relance la fonction
		if(CompI.getKind().equals(ComponentKind.CONSTRAINT)){
			CompI = getListComponentInstanceLinkWithComp(CompI, DR);
		}
		
		return CompI;
	}
	
	//prend la liste des arguments et leurs valeurs et retourne les objets correspondants
	public static String getListArgQ(List<Arg> listArg, ArrayList<String> list, String requete, Document_Root DR, FenetreGUI FG){
		Object ArgQ = null;
		String TypeArgQ =""; //string representant le type de l'argument
		ArrayList<Object> listArgQ = new ArrayList<Object>(); //liste qui va stocker l'ensemble des objets arguments
		
		if(listArg.size() != list.size()){
			FG.content.add(new JLabel("Erreur ! Le nombre d'argument et de valeurs associées différe !"));
		} else {
			for(int a = 0; a < listArg.size(); a++){
				
				ArgQ = null;
				//on parcours tous les arguments
				//on determine leur type
				//on recherche leur instance avec leur nom et type
				//on ajoute l'instance a la liste des arguments pour la requete
				
				//System.out.println("tokenValue : " + list.get(a));
				//System.out.println("arg : " + listArg.get(a).getName());
				TypeArgQ = listArg.get(a).getType();
				
				if(TypeArgQ.equals("Component_Instance")){
					ArgQ = (ComponentInstance)am.getCompInstMM(list.get(a), DR);
				} else if(TypeArgQ.equals("Interface")){
					ArgQ = (Interface)am.getInterfaceMM(list.get(a), DR);				
				}else if(TypeArgQ.equals("Port")){
					ArgQ = (Port)am.getPortMM(list.get(a), DR);									
				} else if(TypeArgQ.equals("Services")){ 
					ArgQ = (Services)am.getServicesMM(list.get(a), DR);
				}
				
				if(ArgQ != null){
					listArgQ.add(ArgQ);
				}
				
				String typeArg = listArg.get(a).getType();
				String nomArg = listArg.get(a).getName();
				
				requete = generateNewConstraint(typeArg, nomArg,list.get(a), requete);
				
			}
		}
		//on parse les arguments, fait la resolution avec les valeurs, et modifie la contrainte en conséquence		
		return requete;
	}
	
	
	/* va générer une contrainte paramétrés en fonction de la contraint, de l'argument et de la valeur de cet argument */
	public static String generateNewConstraint(String typeArg, String nomArg, String token, String constraint){
		String ajoutRequete = "";
		
		if(typeArg.equals("Component_Instance")){
			ajoutRequete = " let " + (nomArg + " : ComponentInstance = componentInstance->select(c | c.name = '" + token + "')->asSequence()->at(1) in ");
		}
		if(typeArg.equals("Port")){
			ajoutRequete = " let " + (nomArg + " : Port = port->select(p | p.name = '" + token + "')->asSequence()->at(1) in ");
		}
		if(typeArg.equals("Interface")){
			ajoutRequete = " let " + (nomArg + " : Interface = interface->select(i | i.name = '" + token + "')->asSequence()->at(1) in ");
		}
		if(typeArg.equals("Binding")){
			ajoutRequete = " let " + (nomArg + " : Binding = binding->select(b | b.name = '" + token + "')->asSequence()->at(1) in ");
		}
		if(typeArg.equals("Services")){
			ajoutRequete = " let " + (nomArg + " : Services = Services->select(s | s.name = '" + token + "')->asSequence()->at(1) in ");
		}
		constraint = ajoutRequete + constraint;
		return constraint;
	}
	
	
	
	/* créé une string faisant la correspondance entre les arguments et leur valeur
	 * de la forme nomArg1(typeArg1) = valeur1 nomArg2(typeArg2) = valeur2 etc...
	 *  */
	public static String correspondanceArgValue(List<Arg> listArg, ArrayList<String> list){
		String correspondance = "";
		
		for(int i = 0; i < listArg.size(); i++){
			correspondance += listArg.get(i).getName() + "(" + listArg.get(i).getType() + ") = " + list.get(i) + " ";
		}
		
		return correspondance;
	}
	
	
	
	public boolean getCstFound(){
		return cstFound;
	}
	
}
