package GCLACS.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import GCLACS.GCLACSPackage;
import GCLACS.diagram.edit.commands.BodyTypeCreateCommand;
import GCLACS.diagram.edit.commands.ComponentInstance2CreateCommand;
import GCLACS.diagram.edit.commands.RequiredPortCreateCommand;
import GCLACS.diagram.edit.commands.ServicesCreateCommand;
import GCLACS.diagram.providers.GclacsElementTypes;

/**
 * @generated
 */
public class ComponentInstanceInstanceCompartimentItemSemanticEditPolicy extends
		GclacsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GclacsElementTypes.Interface_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCLACSPackage.eINSTANCE
						.getComponentInstance_Interface());
			}
			return getGEFWrapper(new RequiredPortCreateCommand(req));
		}
		if (GclacsElementTypes.ComponentInstance_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCLACSPackage.eINSTANCE
						.getComponentInstance_ComponentInstance());
			}
			return getGEFWrapper(new ServicesCreateCommand(req));
		}
		if (GclacsElementTypes.RequiredPort_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCLACSPackage.eINSTANCE
						.getComponentInstance_Port());
			}
			return getGEFWrapper(new BodyTypeCreateCommand(req));
		}
		if (GclacsElementTypes.ProvidedPort_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCLACSPackage.eINSTANCE
						.getComponentInstance_Port());
			}
			return getGEFWrapper(new ComponentInstance2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
