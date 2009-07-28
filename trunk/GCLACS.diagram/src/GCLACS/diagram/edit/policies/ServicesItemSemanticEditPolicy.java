package GCLACS.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import GCLACS.diagram.edit.parts.BodyTypeEditPart;
import GCLACS.diagram.edit.parts.ComponentInstance2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceInstanceCompartiment2EditPart;
import GCLACS.diagram.edit.parts.RequiredPortEditPart;
import GCLACS.diagram.edit.parts.ServicesEditPart;
import GCLACS.diagram.part.GclacsVisualIDRegistry;

/**
 * @generated
 */
public class ServicesItemSemanticEditPolicy extends
		GclacsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (GclacsVisualIDRegistry.getVisualID(node)) {
			case ComponentInstanceInstanceCompartiment2EditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (GclacsVisualIDRegistry.getVisualID(cnode)) {
					case RequiredPortEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case ServicesEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case BodyTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case ComponentInstance2EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
	}

}
