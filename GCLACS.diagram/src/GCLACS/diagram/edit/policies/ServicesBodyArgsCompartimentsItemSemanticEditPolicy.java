package GCLACS.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import GCLACS.GCLACSPackage;
import GCLACS.diagram.edit.commands.InterfaceCreateCommand;
import GCLACS.diagram.edit.commands.ProvidedPortCreateCommand;
import GCLACS.diagram.providers.GclacsElementTypes;

/**
 * @generated
 */
public class ServicesBodyArgsCompartimentsItemSemanticEditPolicy extends
		GclacsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GclacsElementTypes.BodyType_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCLACSPackage.eINSTANCE
						.getServices_Body());
			}
			return getGEFWrapper(new ProvidedPortCreateCommand(req));
		}
		if (GclacsElementTypes.Arg_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCLACSPackage.eINSTANCE
						.getServices_Arg());
			}
			return getGEFWrapper(new InterfaceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
