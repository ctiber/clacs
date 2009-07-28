package GCLACS.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import GCLACS.GCLACSPackage;

/**
 * @generated
 */
public class GclacsDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == GCLACSPackage.eINSTANCE.getDocument_Root()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getInterface()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getComponentInstance()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getServices()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getPort()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getRequiredPort()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getBinding()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getProvidedPort()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getDefineByInterface()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getArg()) {
			return true;
		}
		if (eClass == GCLACSPackage.eINSTANCE.getBodyType()) {
			return true;
		}
		return false;
	}

}
