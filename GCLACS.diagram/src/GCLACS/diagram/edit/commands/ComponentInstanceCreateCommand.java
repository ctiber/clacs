package GCLACS.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import GCLACS.Document_Root;
import GCLACS.GCLACSPackage;

/**
 * @generated
 */
public class ComponentInstanceCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ComponentInstanceCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		Document_Root container = (Document_Root) getElementToEdit();
		if (container.getComponentInstance() != null) {
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return GCLACSPackage.eINSTANCE.getDocument_Root();
	}

}
