import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import GCLACS.Document_Root;
import GCLACS.GCLACSPackage;


public class SerializerXMI {

	
	public SerializerXMI(String pathXMI, Document_Root DR){

		DR.eResource();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GCLACSPackage.eNS_URI,GCLACSPackage.eINSTANCE);
		URI uri = URI.createFileURI(new File(pathXMI).getAbsolutePath());
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(DR);
		try {
			resource.save(null);
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
