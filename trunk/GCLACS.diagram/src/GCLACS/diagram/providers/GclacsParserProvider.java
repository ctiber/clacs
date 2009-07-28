package GCLACS.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import GCLACS.GCLACSPackage;
import GCLACS.diagram.edit.parts.BindingKindEditPart;
import GCLACS.diagram.edit.parts.BindingNameEditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceDefineByDescriptor2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceDefineByDescriptorEditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceName2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceNameEditPart;
import GCLACS.diagram.edit.parts.InterfaceNameEditPart;
import GCLACS.diagram.edit.parts.ProvidedPortNameEditPart;
import GCLACS.diagram.edit.parts.RequiredPortNameEditPart;
import GCLACS.diagram.edit.parts.ServicesNameEditPart;
import GCLACS.diagram.parsers.MessageFormatParser;
import GCLACS.diagram.part.GclacsVisualIDRegistry;

/**
 * @generated
 */
public class GclacsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser componentInstanceName_4007Parser;

	/**
	 * @generated
	 */
	private IParser getComponentInstanceName_4007Parser() {
		if (componentInstanceName_4007Parser == null) {
			componentInstanceName_4007Parser = createComponentInstanceName_4007Parser();
		}
		return componentInstanceName_4007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentInstanceName_4007Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getComponentInstance_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentInstanceDefineByDescriptor_4008Parser;

	/**
	 * @generated
	 */
	private IParser getComponentInstanceDefineByDescriptor_4008Parser() {
		if (componentInstanceDefineByDescriptor_4008Parser == null) {
			componentInstanceDefineByDescriptor_4008Parser = createComponentInstanceDefineByDescriptor_4008Parser();
		}
		return componentInstanceDefineByDescriptor_4008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentInstanceDefineByDescriptor_4008Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getComponentInstance_DefineByDescriptor(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceName_4002Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceName_4002Parser() {
		if (interfaceName_4002Parser == null) {
			interfaceName_4002Parser = createInterfaceName_4002Parser();
		}
		return interfaceName_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceName_4002Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getInterface_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser servicesName_4001Parser;

	/**
	 * @generated
	 */
	private IParser getServicesName_4001Parser() {
		if (servicesName_4001Parser == null) {
			servicesName_4001Parser = createServicesName_4001Parser();
		}
		return servicesName_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createServicesName_4001Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getServices_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentInstanceName_4005Parser;

	/**
	 * @generated
	 */
	private IParser getComponentInstanceName_4005Parser() {
		if (componentInstanceName_4005Parser == null) {
			componentInstanceName_4005Parser = createComponentInstanceName_4005Parser();
		}
		return componentInstanceName_4005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentInstanceName_4005Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getComponentInstance_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentInstanceDefineByDescriptor_4006Parser;

	/**
	 * @generated
	 */
	private IParser getComponentInstanceDefineByDescriptor_4006Parser() {
		if (componentInstanceDefineByDescriptor_4006Parser == null) {
			componentInstanceDefineByDescriptor_4006Parser = createComponentInstanceDefineByDescriptor_4006Parser();
		}
		return componentInstanceDefineByDescriptor_4006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentInstanceDefineByDescriptor_4006Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getComponentInstance_DefineByDescriptor(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser requiredPortName_4003Parser;

	/**
	 * @generated
	 */
	private IParser getRequiredPortName_4003Parser() {
		if (requiredPortName_4003Parser == null) {
			requiredPortName_4003Parser = createRequiredPortName_4003Parser();
		}
		return requiredPortName_4003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRequiredPortName_4003Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getPort_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser providedPortName_4004Parser;

	/**
	 * @generated
	 */
	private IParser getProvidedPortName_4004Parser() {
		if (providedPortName_4004Parser == null) {
			providedPortName_4004Parser = createProvidedPortName_4004Parser();
		}
		return providedPortName_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProvidedPortName_4004Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getPort_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bindingKind_4009Parser;

	/**
	 * @generated
	 */
	private IParser getBindingKind_4009Parser() {
		if (bindingKind_4009Parser == null) {
			bindingKind_4009Parser = createBindingKind_4009Parser();
		}
		return bindingKind_4009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBindingKind_4009Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getBinding_Kind(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bindingName_4010Parser;

	/**
	 * @generated
	 */
	private IParser getBindingName_4010Parser() {
		if (bindingName_4010Parser == null) {
			bindingName_4010Parser = createBindingName_4010Parser();
		}
		return bindingName_4010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBindingName_4010Parser() {
		EAttribute[] features = new EAttribute[] { GCLACSPackage.eINSTANCE
				.getBinding_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComponentInstanceNameEditPart.VISUAL_ID:
			return getComponentInstanceName_4007Parser();
		case ComponentInstanceDefineByDescriptorEditPart.VISUAL_ID:
			return getComponentInstanceDefineByDescriptor_4008Parser();
		case InterfaceNameEditPart.VISUAL_ID:
			return getInterfaceName_4002Parser();
		case ServicesNameEditPart.VISUAL_ID:
			return getServicesName_4001Parser();
		case ComponentInstanceName2EditPart.VISUAL_ID:
			return getComponentInstanceName_4005Parser();
		case ComponentInstanceDefineByDescriptor2EditPart.VISUAL_ID:
			return getComponentInstanceDefineByDescriptor_4006Parser();
		case RequiredPortNameEditPart.VISUAL_ID:
			return getRequiredPortName_4003Parser();
		case ProvidedPortNameEditPart.VISUAL_ID:
			return getProvidedPortName_4004Parser();
		case BindingKindEditPart.VISUAL_ID:
			return getBindingKind_4009Parser();
		case BindingNameEditPart.VISUAL_ID:
			return getBindingName_4010Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GclacsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GclacsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GclacsElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
