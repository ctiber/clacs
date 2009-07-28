package GCLACS.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import GCLACS.Arg;
import GCLACS.BodyType;
import GCLACS.diagram.edit.parts.BindingEditPart;
import GCLACS.diagram.edit.parts.BindingKindEditPart;
import GCLACS.diagram.edit.parts.BodyTypeEditPart;
import GCLACS.diagram.edit.parts.ComponentInstance2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceEditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceName2EditPart;
import GCLACS.diagram.edit.parts.ComponentInstanceNameEditPart;
import GCLACS.diagram.edit.parts.DefineByInterfaceEditPart;
import GCLACS.diagram.edit.parts.Document_RootEditPart;
import GCLACS.diagram.edit.parts.InterfaceEditPart;
import GCLACS.diagram.edit.parts.InterfaceNameEditPart;
import GCLACS.diagram.edit.parts.ProvidedPortEditPart;
import GCLACS.diagram.edit.parts.ProvidedPortNameEditPart;
import GCLACS.diagram.edit.parts.RequiredPort2EditPart;
import GCLACS.diagram.edit.parts.RequiredPortEditPart;
import GCLACS.diagram.edit.parts.RequiredPortNameEditPart;
import GCLACS.diagram.edit.parts.ServicesEditPart;
import GCLACS.diagram.edit.parts.ServicesNameEditPart;
import GCLACS.diagram.part.GclacsDiagramEditorPlugin;
import GCLACS.diagram.part.GclacsVisualIDRegistry;
import GCLACS.diagram.providers.GclacsElementTypes;
import GCLACS.diagram.providers.GclacsParserProvider;

/**
 * @generated
 */
public class GclacsNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GclacsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GclacsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GclacsNavigatorItem
				&& !isOwnView(((GclacsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GclacsNavigatorGroup) {
			GclacsNavigatorGroup group = (GclacsNavigatorGroup) element;
			return GclacsDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GclacsNavigatorItem) {
			GclacsNavigatorItem navigatorItem = (GclacsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GclacsVisualIDRegistry.getVisualID(view)) {
		case Document_RootEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?GCLACS?Document_Root", GclacsElementTypes.Document_Root_79); //$NON-NLS-1$
		case ComponentInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?GCLACS?ComponentInstance", GclacsElementTypes.ComponentInstance_1001); //$NON-NLS-1$
		case RequiredPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?GCLACS?Interface", GclacsElementTypes.Interface_2001); //$NON-NLS-1$
		case RequiredPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?GCLACS?Services", GclacsElementTypes.Services_2002); //$NON-NLS-1$
		case ProvidedPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?GCLACS?BodyType", GclacsElementTypes.BodyType_2003); //$NON-NLS-1$
		case InterfaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?GCLACS?Arg", GclacsElementTypes.Arg_2004); //$NON-NLS-1$
		case ServicesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?GCLACS?ComponentInstance", GclacsElementTypes.ComponentInstance_2005); //$NON-NLS-1$
		case BodyTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?GCLACS?RequiredPort", GclacsElementTypes.RequiredPort_2006); //$NON-NLS-1$
		case ComponentInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?GCLACS?ProvidedPort", GclacsElementTypes.ProvidedPort_2007); //$NON-NLS-1$
		case DefineByInterfaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?GCLACS?DefineByInterface", GclacsElementTypes.DefineByInterface_3001); //$NON-NLS-1$
		case BindingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?GCLACS?Binding", GclacsElementTypes.Binding_3002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GclacsDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GclacsElementTypes.isKnownElementType(elementType)) {
			image = GclacsElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GclacsNavigatorGroup) {
			GclacsNavigatorGroup group = (GclacsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GclacsNavigatorItem) {
			GclacsNavigatorItem navigatorItem = (GclacsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GclacsVisualIDRegistry.getVisualID(view)) {
		case Document_RootEditPart.VISUAL_ID:
			return getDocument_Root_79Text(view);
		case ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_1001Text(view);
		case RequiredPortEditPart.VISUAL_ID:
			return getInterface_2001Text(view);
		case RequiredPort2EditPart.VISUAL_ID:
			return getServices_2002Text(view);
		case ProvidedPortEditPart.VISUAL_ID:
			return getBodyType_2003Text(view);
		case InterfaceEditPart.VISUAL_ID:
			return getArg_2004Text(view);
		case ServicesEditPart.VISUAL_ID:
			return getComponentInstance_2005Text(view);
		case BodyTypeEditPart.VISUAL_ID:
			return getRequiredPort_2006Text(view);
		case ComponentInstance2EditPart.VISUAL_ID:
			return getProvidedPort_2007Text(view);
		case DefineByInterfaceEditPart.VISUAL_ID:
			return getDefineByInterface_3001Text(view);
		case BindingEditPart.VISUAL_ID:
			return getBinding_3002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDocument_Root_79Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getComponentInstance_1001Text(View view) {
		IAdaptable hintAdapter = new GclacsParserProvider.HintAdapter(
				GclacsElementTypes.ComponentInstance_1001,
				(view.getElement() != null ? view.getElement() : view),
				GclacsVisualIDRegistry
						.getType(ComponentInstanceNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GclacsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInterface_2001Text(View view) {
		IAdaptable hintAdapter = new GclacsParserProvider.HintAdapter(
				GclacsElementTypes.Interface_2001,
				(view.getElement() != null ? view.getElement() : view),
				GclacsVisualIDRegistry.getType(InterfaceNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GclacsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getServices_2002Text(View view) {
		IAdaptable hintAdapter = new GclacsParserProvider.HintAdapter(
				GclacsElementTypes.Services_2002,
				(view.getElement() != null ? view.getElement() : view),
				GclacsVisualIDRegistry.getType(ServicesNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GclacsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getBodyType_2003Text(View view) {
		BodyType domainModelElement = (BodyType) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getValue();
		} else {
			GclacsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArg_2004Text(View view) {
		Arg domainModelElement = (Arg) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			GclacsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentInstance_2005Text(View view) {
		IAdaptable hintAdapter = new GclacsParserProvider.HintAdapter(
				GclacsElementTypes.ComponentInstance_2005,
				(view.getElement() != null ? view.getElement() : view),
				GclacsVisualIDRegistry
						.getType(ComponentInstanceName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GclacsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getRequiredPort_2006Text(View view) {
		IAdaptable hintAdapter = new GclacsParserProvider.HintAdapter(
				GclacsElementTypes.RequiredPort_2006,
				(view.getElement() != null ? view.getElement() : view),
				GclacsVisualIDRegistry
						.getType(RequiredPortNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GclacsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getProvidedPort_2007Text(View view) {
		IAdaptable hintAdapter = new GclacsParserProvider.HintAdapter(
				GclacsElementTypes.ProvidedPort_2007,
				(view.getElement() != null ? view.getElement() : view),
				GclacsVisualIDRegistry
						.getType(ProvidedPortNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GclacsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDefineByInterface_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBinding_3002Text(View view) {
		IAdaptable hintAdapter = new GclacsParserProvider.HintAdapter(
				GclacsElementTypes.Binding_3002,
				(view.getElement() != null ? view.getElement() : view),
				GclacsVisualIDRegistry.getType(BindingKindEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			GclacsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Document_RootEditPart.MODEL_ID.equals(GclacsVisualIDRegistry
				.getModelID(view));
	}

}
