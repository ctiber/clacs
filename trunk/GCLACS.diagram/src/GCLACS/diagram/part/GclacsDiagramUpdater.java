package GCLACS.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import GCLACS.Arg;
import GCLACS.Binding;
import GCLACS.BodyType;
import GCLACS.ComponentInstance;
import GCLACS.DefineByInterface;
import GCLACS.Document_Root;
import GCLACS.GCLACSPackage;
import GCLACS.Interface;
import GCLACS.Port;
import GCLACS.ProvidedPort;
import GCLACS.RequiredPort;
import GCLACS.Services;
import GCLACS.diagram.edit.parts.BindingEditPart;
import GCLACS.diagram.edit.parts.BodyTypeEditPart;
import GCLACS.diagram.edit.parts.ComponentInstance2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceEditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceInstanceCompartiment2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceInstanceCompartimentEditPart;
import GCLACS.diagram.edit.parts.DefineByInterfaceEditPart;
import GCLACS.diagram.edit.parts.Document_RootEditPart;
import GCLACS.diagram.edit.parts.InterfaceBodyArgsCompartimentsEditPart;
import GCLACS.diagram.edit.parts.InterfaceEditPart;
import GCLACS.diagram.edit.parts.ProvidedPortEditPart;
import GCLACS.diagram.edit.parts.RequiredPort2EditPart;
import GCLACS.diagram.edit.parts.RequiredPortEditPart;
import GCLACS.diagram.edit.parts.ServicesBodyArgsCompartimentsEditPart;
import GCLACS.diagram.edit.parts.ServicesEditPart;
import GCLACS.diagram.providers.GclacsElementTypes;

/**
 * @generated
 */
public class GclacsDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (GclacsVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceInstanceCompartimentEditPart.VISUAL_ID:
			return getComponentInstanceInstanceCompartiment_5001SemanticChildren(view);
		case InterfaceBodyArgsCompartimentsEditPart.VISUAL_ID:
			return getInterfaceServicesCompartiments_5002SemanticChildren(view);
		case ServicesBodyArgsCompartimentsEditPart.VISUAL_ID:
			return getServicesBodyArgsCompartiments_5003SemanticChildren(view);
		case ComponentInstanceInstanceCompartiment2EditPart.VISUAL_ID:
			return getComponentInstanceInstanceCompartiment_5004SemanticChildren(view);
		case Document_RootEditPart.VISUAL_ID:
			return getDocument_Root_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentInstanceInstanceCompartiment_5001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ComponentInstance modelElement = (ComponentInstance) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInterface().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RequiredPortEditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getComponentInstance().iterator(); it
				.hasNext();) {
			ComponentInstance childElement = (ComponentInstance) it.next();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ServicesEditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getPort().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BodyTypeEditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComponentInstance2EditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceServicesCompartiments_5002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Interface modelElement = (Interface) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getService().iterator(); it.hasNext();) {
			Services childElement = (Services) it.next();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RequiredPort2EditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getServicesBodyArgsCompartiments_5003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Services modelElement = (Services) containerView.getElement();
		List result = new LinkedList();
		{
			BodyType childElement = modelElement.getBody();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProvidedPortEditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getArg().iterator(); it.hasNext();) {
			Arg childElement = (Arg) it.next();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InterfaceEditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComponentInstanceInstanceCompartiment_5004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ComponentInstance modelElement = (ComponentInstance) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInterface().iterator(); it.hasNext();) {
			Interface childElement = (Interface) it.next();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RequiredPortEditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getComponentInstance().iterator(); it
				.hasNext();) {
			ComponentInstance childElement = (ComponentInstance) it.next();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ServicesEditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getPort().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BodyTypeEditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComponentInstance2EditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDocument_Root_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Document_Root modelElement = (Document_Root) view.getElement();
		List result = new LinkedList();
		{
			ComponentInstance childElement = modelElement
					.getComponentInstance();
			int visualID = GclacsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentInstanceEditPart.VISUAL_ID) {
				result.add(new GclacsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (GclacsVisualIDRegistry.getVisualID(view)) {
		case Document_RootEditPart.VISUAL_ID:
			return getDocument_Root_79ContainedLinks(view);
		case ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_1001ContainedLinks(view);
		case RequiredPortEditPart.VISUAL_ID:
			return getInterface_2001ContainedLinks(view);
		case RequiredPort2EditPart.VISUAL_ID:
			return getServices_2002ContainedLinks(view);
		case ProvidedPortEditPart.VISUAL_ID:
			return getBodyType_2003ContainedLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getArg_2004ContainedLinks(view);
		case ServicesEditPart.VISUAL_ID:
			return getComponentInstance_2005ContainedLinks(view);
		case BodyTypeEditPart.VISUAL_ID:
			return getRequiredPort_2006ContainedLinks(view);
		case ComponentInstance2EditPart.VISUAL_ID:
			return getProvidedPort_2007ContainedLinks(view);
		case DefineByInterfaceEditPart.VISUAL_ID:
			return getDefineByInterface_3001ContainedLinks(view);
		case BindingEditPart.VISUAL_ID:
			return getBinding_3002ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (GclacsVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_1001IncomingLinks(view);
		case RequiredPortEditPart.VISUAL_ID:
			return getInterface_2001IncomingLinks(view);
		case RequiredPort2EditPart.VISUAL_ID:
			return getServices_2002IncomingLinks(view);
		case ProvidedPortEditPart.VISUAL_ID:
			return getBodyType_2003IncomingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getArg_2004IncomingLinks(view);
		case ServicesEditPart.VISUAL_ID:
			return getComponentInstance_2005IncomingLinks(view);
		case BodyTypeEditPart.VISUAL_ID:
			return getRequiredPort_2006IncomingLinks(view);
		case ComponentInstance2EditPart.VISUAL_ID:
			return getProvidedPort_2007IncomingLinks(view);
		case DefineByInterfaceEditPart.VISUAL_ID:
			return getDefineByInterface_3001IncomingLinks(view);
		case BindingEditPart.VISUAL_ID:
			return getBinding_3002IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (GclacsVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_1001OutgoingLinks(view);
		case RequiredPortEditPart.VISUAL_ID:
			return getInterface_2001OutgoingLinks(view);
		case RequiredPort2EditPart.VISUAL_ID:
			return getServices_2002OutgoingLinks(view);
		case ProvidedPortEditPart.VISUAL_ID:
			return getBodyType_2003OutgoingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getArg_2004OutgoingLinks(view);
		case ServicesEditPart.VISUAL_ID:
			return getComponentInstance_2005OutgoingLinks(view);
		case BodyTypeEditPart.VISUAL_ID:
			return getRequiredPort_2006OutgoingLinks(view);
		case ComponentInstance2EditPart.VISUAL_ID:
			return getProvidedPort_2007OutgoingLinks(view);
		case DefineByInterfaceEditPart.VISUAL_ID:
			return getDefineByInterface_3001OutgoingLinks(view);
		case BindingEditPart.VISUAL_ID:
			return getBinding_3002OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDocument_Root_79ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentInstance_1001ContainedLinks(View view) {
		ComponentInstance modelElement = (ComponentInstance) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Binding_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getServices_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBodyType_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArg_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentInstance_2005ContainedLinks(View view) {
		ComponentInstance modelElement = (ComponentInstance) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Binding_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRequiredPort_2006ContainedLinks(View view) {
		RequiredPort modelElement = (RequiredPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_DefineByInterface_3001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProvidedPort_2007ContainedLinks(View view) {
		ProvidedPort modelElement = (ProvidedPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_DefineByInterface_3001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDefineByInterface_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBinding_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentInstance_1001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2001IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_DefineByInterface_3001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getServices_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBodyType_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArg_2004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentInstance_2005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRequiredPort_2006IncomingLinks(View view) {
		RequiredPort modelElement = (RequiredPort) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Binding_3002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProvidedPort_2007IncomingLinks(View view) {
		ProvidedPort modelElement = (ProvidedPort) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Binding_3002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDefineByInterface_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBinding_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentInstance_1001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getServices_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBodyType_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArg_2004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComponentInstance_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRequiredPort_2006OutgoingLinks(View view) {
		RequiredPort modelElement = (RequiredPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DefineByInterface_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Binding_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProvidedPort_2007OutgoingLinks(View view) {
		ProvidedPort modelElement = (ProvidedPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DefineByInterface_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Binding_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDefineByInterface_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBinding_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_DefineByInterface_3001(
			Port container) {
		Collection result = new LinkedList();
		DefineByInterface link = container.getDefineByInterface();
		if (DefineByInterfaceEditPart.VISUAL_ID != GclacsVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		Interface dst = link.getInterface();
		Port src = link.getPort();
		result.add(new GclacsLinkDescriptor(src, dst, link,
				GclacsElementTypes.DefineByInterface_3001,
				DefineByInterfaceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Binding_3002(
			ComponentInstance container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getBinding().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Binding) {
				continue;
			}
			Binding link = (Binding) linkObject;
			if (BindingEditPart.VISUAL_ID != GclacsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Port dst = link.getTarget();
			Port src = link.getSource();
			result
					.add(new GclacsLinkDescriptor(src, dst, link,
							GclacsElementTypes.Binding_3002,
							BindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_DefineByInterface_3001(
			Interface target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GCLACSPackage.eINSTANCE
					.getDefineByInterface_Interface()
					|| false == setting.getEObject() instanceof DefineByInterface) {
				continue;
			}
			DefineByInterface link = (DefineByInterface) setting.getEObject();
			if (DefineByInterfaceEditPart.VISUAL_ID != GclacsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Port src = link.getPort();
			result.add(new GclacsLinkDescriptor(src, target, link,
					GclacsElementTypes.DefineByInterface_3001,
					DefineByInterfaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Binding_3002(
			Port target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GCLACSPackage.eINSTANCE
					.getBinding_Target()
					|| false == setting.getEObject() instanceof Binding) {
				continue;
			}
			Binding link = (Binding) setting.getEObject();
			if (BindingEditPart.VISUAL_ID != GclacsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Port src = link.getSource();
			result
					.add(new GclacsLinkDescriptor(src, target, link,
							GclacsElementTypes.Binding_3002,
							BindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_DefineByInterface_3001(
			Port source) {
		Port container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Port) {
				container = (Port) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		DefineByInterface link = container.getDefineByInterface();
		if (DefineByInterfaceEditPart.VISUAL_ID != GclacsVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		Interface dst = link.getInterface();
		Port src = link.getPort();
		if (src != source) {
			return result;
		}
		result.add(new GclacsLinkDescriptor(src, dst, link,
				GclacsElementTypes.DefineByInterface_3001,
				DefineByInterfaceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Binding_3002(
			Port source) {
		ComponentInstance container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ComponentInstance) {
				container = (ComponentInstance) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getBinding().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Binding) {
				continue;
			}
			Binding link = (Binding) linkObject;
			if (BindingEditPart.VISUAL_ID != GclacsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Port dst = link.getTarget();
			Port src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new GclacsLinkDescriptor(src, dst, link,
							GclacsElementTypes.Binding_3002,
							BindingEditPart.VISUAL_ID));
		}
		return result;
	}

}
