package GCLACS.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import GCLACS.diagram.edit.commands.BindingCreateCommand;
import GCLACS.diagram.edit.commands.BindingReorientCommand;
import GCLACS.diagram.edit.commands.DefineByInterfaceCreateCommand;
import GCLACS.diagram.edit.commands.DefineByInterfaceReorientCommand;
import GCLACS.diagram.edit.parts.BindingEditPart;
import GCLACS.diagram.edit.parts.DefineByInterfaceEditPart;
import GCLACS.diagram.providers.GclacsElementTypes;

/**
 * @generated
 */
public class BodyTypeItemSemanticEditPolicy extends
		GclacsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GclacsElementTypes.DefineByInterface_3001 == req.getElementType()) {
			return getGEFWrapper(new DefineByInterfaceCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GclacsElementTypes.Binding_3002 == req.getElementType()) {
			return getGEFWrapper(new BindingCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GclacsElementTypes.DefineByInterface_3001 == req.getElementType()) {
			return null;
		}
		if (GclacsElementTypes.Binding_3002 == req.getElementType()) {
			return getGEFWrapper(new BindingCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DefineByInterfaceEditPart.VISUAL_ID:
			return getGEFWrapper(new DefineByInterfaceReorientCommand(req));
		case BindingEditPart.VISUAL_ID:
			return getGEFWrapper(new BindingReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
