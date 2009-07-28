package GCLACS.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import GCLACS.GCLACSPackage;
import GCLACS.diagram.edit.commands.RequiredPort2CreateCommand;
import GCLACS.diagram.providers.GclacsElementTypes;

/**
 * @generated
 */
public class InterfaceBodyArgsCompartimentsItemSemanticEditPolicy extends
		GclacsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GclacsElementTypes.Services_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCLACSPackage.eINSTANCE
						.getInterface_Service());
			}
			return getGEFWrapper(new RequiredPort2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
