package GCLACS.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

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
import GCLACS.diagram.part.GclacsVisualIDRegistry;
import GCLACS.diagram.view.factories.BindingKindViewFactory;
import GCLACS.diagram.view.factories.BindingNameViewFactory;
import GCLACS.diagram.view.factories.BindingViewFactory;
import GCLACS.diagram.view.factories.BodyTypeViewFactory;
import GCLACS.diagram.view.factories.ComponentInstance2ViewFactory;
import GCLACS.diagram.view.factories.ComponentInstanceDefineByDescriptor2ViewFactory;
import GCLACS.diagram.view.factories.ComponentInstanceDefineByDescriptorViewFactory;
import GCLACS.diagram.view.factories.ComponentInstanceInstanceCompartiment2ViewFactory;
import GCLACS.diagram.view.factories.ComponentInstanceInstanceCompartimentViewFactory;
import GCLACS.diagram.view.factories.ComponentInstanceName2ViewFactory;
import GCLACS.diagram.view.factories.ComponentInstanceNameViewFactory;
import GCLACS.diagram.view.factories.ComponentInstanceViewFactory;
import GCLACS.diagram.view.factories.DefineByInterfaceViewFactory;
import GCLACS.diagram.view.factories.Document_RootViewFactory;
import GCLACS.diagram.view.factories.InterfaceBodyArgsCompartimentsViewFactory;
import GCLACS.diagram.view.factories.InterfaceNameViewFactory;
import GCLACS.diagram.view.factories.InterfaceViewFactory;
import GCLACS.diagram.view.factories.ProvidedPortNameViewFactory;
import GCLACS.diagram.view.factories.ProvidedPortViewFactory;
import GCLACS.diagram.view.factories.RequiredPort2ViewFactory;
import GCLACS.diagram.view.factories.RequiredPortNameViewFactory;
import GCLACS.diagram.view.factories.RequiredPortViewFactory;
import GCLACS.diagram.view.factories.ServicesBodyArgsCompartimentsViewFactory;
import GCLACS.diagram.view.factories.ServicesNameViewFactory;
import GCLACS.diagram.view.factories.ServicesViewFactory;

/**
 * @generated
 */
public class GclacsViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (Document_RootEditPart.MODEL_ID.equals(diagramKind)
				&& GclacsVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return Document_RootViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = GclacsVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = GclacsVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!GclacsElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != GclacsVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!Document_RootEditPart.MODEL_ID
						.equals(GclacsVisualIDRegistry
								.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case ComponentInstanceEditPart.VISUAL_ID:
				case RequiredPortEditPart.VISUAL_ID:
				case RequiredPort2EditPart.VISUAL_ID:
				case ProvidedPortEditPart.VISUAL_ID:
				case InterfaceEditPart.VISUAL_ID:
				case BodyTypeEditPart.VISUAL_ID:
				case ComponentInstance2EditPart.VISUAL_ID:
				case ServicesEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != GclacsVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case ComponentInstanceNameEditPart.VISUAL_ID:
				case ComponentInstanceDefineByDescriptorEditPart.VISUAL_ID:
				case ComponentInstanceInstanceCompartimentEditPart.VISUAL_ID:
					if (ComponentInstanceEditPart.VISUAL_ID != GclacsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceNameEditPart.VISUAL_ID:
				case InterfaceBodyArgsCompartimentsEditPart.VISUAL_ID:
					if (RequiredPortEditPart.VISUAL_ID != GclacsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ServicesNameEditPart.VISUAL_ID:
				case ServicesBodyArgsCompartimentsEditPart.VISUAL_ID:
					if (RequiredPort2EditPart.VISUAL_ID != GclacsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ComponentInstanceName2EditPart.VISUAL_ID:
				case ComponentInstanceDefineByDescriptor2EditPart.VISUAL_ID:
				case ComponentInstanceInstanceCompartiment2EditPart.VISUAL_ID:
					if (ServicesEditPart.VISUAL_ID != GclacsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RequiredPortNameEditPart.VISUAL_ID:
					if (BodyTypeEditPart.VISUAL_ID != GclacsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ProvidedPortNameEditPart.VISUAL_ID:
					if (ComponentInstance2EditPart.VISUAL_ID != GclacsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BindingKindEditPart.VISUAL_ID:
				case BindingNameEditPart.VISUAL_ID:
					if (BindingEditPart.VISUAL_ID != GclacsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !GclacsVisualIDRegistry.canCreateNode(containerView,
						visualID)) {
			return null;
		}
		switch (visualID) {
		case ComponentInstanceEditPart.VISUAL_ID:
			return ComponentInstanceViewFactory.class;
		case ComponentInstanceNameEditPart.VISUAL_ID:
			return ComponentInstanceNameViewFactory.class;
		case ComponentInstanceDefineByDescriptorEditPart.VISUAL_ID:
			return ComponentInstanceDefineByDescriptorViewFactory.class;
		case RequiredPortEditPart.VISUAL_ID:
			return RequiredPortViewFactory.class;
		case InterfaceNameEditPart.VISUAL_ID:
			return InterfaceNameViewFactory.class;
		case RequiredPort2EditPart.VISUAL_ID:
			return RequiredPort2ViewFactory.class;
		case ServicesNameEditPart.VISUAL_ID:
			return ServicesNameViewFactory.class;
		case ProvidedPortEditPart.VISUAL_ID:
			return ProvidedPortViewFactory.class;
		case InterfaceEditPart.VISUAL_ID:
			return InterfaceViewFactory.class;
		case ServicesEditPart.VISUAL_ID:
			return ServicesViewFactory.class;
		case ComponentInstanceName2EditPart.VISUAL_ID:
			return ComponentInstanceName2ViewFactory.class;
		case ComponentInstanceDefineByDescriptor2EditPart.VISUAL_ID:
			return ComponentInstanceDefineByDescriptor2ViewFactory.class;
		case BodyTypeEditPart.VISUAL_ID:
			return BodyTypeViewFactory.class;
		case RequiredPortNameEditPart.VISUAL_ID:
			return RequiredPortNameViewFactory.class;
		case ComponentInstance2EditPart.VISUAL_ID:
			return ComponentInstance2ViewFactory.class;
		case ProvidedPortNameEditPart.VISUAL_ID:
			return ProvidedPortNameViewFactory.class;
		case ComponentInstanceInstanceCompartimentEditPart.VISUAL_ID:
			return ComponentInstanceInstanceCompartimentViewFactory.class;
		case InterfaceBodyArgsCompartimentsEditPart.VISUAL_ID:
			return InterfaceBodyArgsCompartimentsViewFactory.class;
		case ServicesBodyArgsCompartimentsEditPart.VISUAL_ID:
			return ServicesBodyArgsCompartimentsViewFactory.class;
		case ComponentInstanceInstanceCompartiment2EditPart.VISUAL_ID:
			return ComponentInstanceInstanceCompartiment2ViewFactory.class;
		case BindingKindEditPart.VISUAL_ID:
			return BindingKindViewFactory.class;
		case BindingNameEditPart.VISUAL_ID:
			return BindingNameViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!GclacsElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = GclacsVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != GclacsVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case DefineByInterfaceEditPart.VISUAL_ID:
			return DefineByInterfaceViewFactory.class;
		case BindingEditPart.VISUAL_ID:
			return BindingViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
