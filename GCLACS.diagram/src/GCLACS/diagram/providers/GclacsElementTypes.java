package GCLACS.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import GCLACS.GCLACSPackage;
import GCLACS.diagram.part.GclacsDiagramEditorPlugin;

/**
 * @generated
 */
public class GclacsElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private GclacsElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Document_Root_79 = getElementType("GCLACS.diagram.Document_Root_79"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentInstance_1001 = getElementType("GCLACS.diagram.ComponentInstance_1001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Interface_2001 = getElementType("GCLACS.diagram.Interface_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Services_2002 = getElementType("GCLACS.diagram.Services_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BodyType_2003 = getElementType("GCLACS.diagram.BodyType_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Arg_2004 = getElementType("GCLACS.diagram.Arg_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentInstance_2005 = getElementType("GCLACS.diagram.ComponentInstance_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RequiredPort_2006 = getElementType("GCLACS.diagram.RequiredPort_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProvidedPort_2007 = getElementType("GCLACS.diagram.ProvidedPort_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DefineByInterface_3001 = getElementType("GCLACS.diagram.DefineByInterface_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Binding_3002 = getElementType("GCLACS.diagram.Binding_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return GclacsDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Document_Root_79, GCLACSPackage.eINSTANCE
					.getDocument_Root());

			elements.put(ComponentInstance_1001, GCLACSPackage.eINSTANCE
					.getComponentInstance());

			elements
					.put(Interface_2001, GCLACSPackage.eINSTANCE.getInterface());

			elements.put(Services_2002, GCLACSPackage.eINSTANCE.getServices());

			elements.put(BodyType_2003, GCLACSPackage.eINSTANCE.getBodyType());

			elements.put(Arg_2004, GCLACSPackage.eINSTANCE.getArg());

			elements.put(ComponentInstance_2005, GCLACSPackage.eINSTANCE
					.getComponentInstance());

			elements.put(RequiredPort_2006, GCLACSPackage.eINSTANCE
					.getRequiredPort());

			elements.put(ProvidedPort_2007, GCLACSPackage.eINSTANCE
					.getProvidedPort());

			elements.put(DefineByInterface_3001, GCLACSPackage.eINSTANCE
					.getDefineByInterface());

			elements.put(Binding_3002, GCLACSPackage.eINSTANCE.getBinding());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Document_Root_79);
			KNOWN_ELEMENT_TYPES.add(ComponentInstance_1001);
			KNOWN_ELEMENT_TYPES.add(Interface_2001);
			KNOWN_ELEMENT_TYPES.add(Services_2002);
			KNOWN_ELEMENT_TYPES.add(BodyType_2003);
			KNOWN_ELEMENT_TYPES.add(Arg_2004);
			KNOWN_ELEMENT_TYPES.add(ComponentInstance_2005);
			KNOWN_ELEMENT_TYPES.add(RequiredPort_2006);
			KNOWN_ELEMENT_TYPES.add(ProvidedPort_2007);
			KNOWN_ELEMENT_TYPES.add(DefineByInterface_3001);
			KNOWN_ELEMENT_TYPES.add(Binding_3002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
