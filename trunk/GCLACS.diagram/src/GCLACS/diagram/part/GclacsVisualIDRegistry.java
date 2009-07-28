package GCLACS.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import GCLACS.Document_Root;
import GCLACS.GCLACSPackage;
import GCLACS.diagram.edit.parts.BindingEditPart;
import GCLACS.diagram.edit.parts.BindingKindEditPart;
import GCLACS.diagram.edit.parts.BindingNameEditPart;
import GCLACS.diagram.edit.parts.BodyTypeEditPart;
import GCLACS.diagram.edit.parts.ComponentInstance2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceDefineByDescriptor2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceDefineByDescriptorEditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceEditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceInstanceCompartiment2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceInstanceCompartimentEditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceName2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceNameEditPart;
import GCLACS.diagram.edit.parts.DefineByInterfaceEditPart;
import GCLACS.diagram.edit.parts.Document_RootEditPart;
import GCLACS.diagram.edit.parts.InterfaceBodyArgsCompartimentsEditPart;
import GCLACS.diagram.edit.parts.InterfaceEditPart;
import GCLACS.diagram.edit.parts.InterfaceNameEditPart;
import GCLACS.diagram.edit.parts.ProvidedPortEditPart;
import GCLACS.diagram.edit.parts.ProvidedPortNameEditPart;
import GCLACS.diagram.edit.parts.RequiredPort2EditPart;
import GCLACS.diagram.edit.parts.RequiredPortEditPart;
import GCLACS.diagram.edit.parts.RequiredPortNameEditPart;
import GCLACS.diagram.edit.parts.ServicesBodyArgsCompartimentsEditPart;
import GCLACS.diagram.edit.parts.ServicesEditPart;
import GCLACS.diagram.edit.parts.ServicesNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GclacsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "GCLACS.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Document_RootEditPart.MODEL_ID.equals(view.getType())) {
				return Document_RootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return GCLACS.diagram.part.GclacsVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GclacsDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GCLACSPackage.eINSTANCE.getDocument_Root().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Document_Root) domainElement)) {
			return Document_RootEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = GCLACS.diagram.part.GclacsVisualIDRegistry
				.getModelID(containerView);
		if (!Document_RootEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (Document_RootEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = GCLACS.diagram.part.GclacsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Document_RootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComponentInstanceInstanceCompartimentEditPart.VISUAL_ID:
			if (GCLACSPackage.eINSTANCE.getInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return RequiredPortEditPart.VISUAL_ID;
			}
			if (GCLACSPackage.eINSTANCE.getComponentInstance().isSuperTypeOf(
					domainElement.eClass())) {
				return ServicesEditPart.VISUAL_ID;
			}
			if (GCLACSPackage.eINSTANCE.getRequiredPort().isSuperTypeOf(
					domainElement.eClass())) {
				return BodyTypeEditPart.VISUAL_ID;
			}
			if (GCLACSPackage.eINSTANCE.getProvidedPort().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentInstance2EditPart.VISUAL_ID;
			}
			break;
		case InterfaceBodyArgsCompartimentsEditPart.VISUAL_ID:
			if (GCLACSPackage.eINSTANCE.getServices().isSuperTypeOf(
					domainElement.eClass())) {
				return RequiredPort2EditPart.VISUAL_ID;
			}
			break;
		case ServicesBodyArgsCompartimentsEditPart.VISUAL_ID:
			if (GCLACSPackage.eINSTANCE.getBodyType().isSuperTypeOf(
					domainElement.eClass())) {
				return ProvidedPortEditPart.VISUAL_ID;
			}
			if (GCLACSPackage.eINSTANCE.getArg().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceEditPart.VISUAL_ID;
			}
			break;
		case ComponentInstanceInstanceCompartiment2EditPart.VISUAL_ID:
			if (GCLACSPackage.eINSTANCE.getInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return RequiredPortEditPart.VISUAL_ID;
			}
			if (GCLACSPackage.eINSTANCE.getComponentInstance().isSuperTypeOf(
					domainElement.eClass())) {
				return ServicesEditPart.VISUAL_ID;
			}
			if (GCLACSPackage.eINSTANCE.getRequiredPort().isSuperTypeOf(
					domainElement.eClass())) {
				return BodyTypeEditPart.VISUAL_ID;
			}
			if (GCLACSPackage.eINSTANCE.getProvidedPort().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentInstance2EditPart.VISUAL_ID;
			}
			break;
		case Document_RootEditPart.VISUAL_ID:
			if (GCLACSPackage.eINSTANCE.getComponentInstance().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentInstanceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = GCLACS.diagram.part.GclacsVisualIDRegistry
				.getModelID(containerView);
		if (!Document_RootEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (Document_RootEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = GCLACS.diagram.part.GclacsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Document_RootEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComponentInstanceEditPart.VISUAL_ID:
			if (ComponentInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentInstanceDefineByDescriptorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentInstanceInstanceCompartimentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RequiredPortEditPart.VISUAL_ID:
			if (InterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceBodyArgsCompartimentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RequiredPort2EditPart.VISUAL_ID:
			if (ServicesNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServicesBodyArgsCompartimentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServicesEditPart.VISUAL_ID:
			if (ComponentInstanceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentInstanceDefineByDescriptor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentInstanceInstanceCompartiment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BodyTypeEditPart.VISUAL_ID:
			if (RequiredPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentInstance2EditPart.VISUAL_ID:
			if (ProvidedPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentInstanceInstanceCompartimentEditPart.VISUAL_ID:
			if (RequiredPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServicesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BodyTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceBodyArgsCompartimentsEditPart.VISUAL_ID:
			if (RequiredPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServicesBodyArgsCompartimentsEditPart.VISUAL_ID:
			if (ProvidedPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentInstanceInstanceCompartiment2EditPart.VISUAL_ID:
			if (RequiredPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServicesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BodyTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentInstance2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Document_RootEditPart.VISUAL_ID:
			if (ComponentInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BindingEditPart.VISUAL_ID:
			if (BindingKindEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BindingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GCLACSPackage.eINSTANCE.getDefineByInterface().isSuperTypeOf(
				domainElement.eClass())) {
			return DefineByInterfaceEditPart.VISUAL_ID;
		}
		if (GCLACSPackage.eINSTANCE.getBinding().isSuperTypeOf(
				domainElement.eClass())) {
			return BindingEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Document_Root element) {
		return true;
	}

}
