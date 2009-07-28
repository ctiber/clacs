package GCLACS.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import GCLACS.diagram.providers.GclacsElementTypes;

/**
 * @generated
 */
public class GclacsPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNode1Group());
		paletteRoot.add(createLink2Group());
	}

	/**
	 * Creates "Node" palette tool group
	 * @generated
	 */
	private PaletteContainer createNode1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Node1Group_title);
		paletteContainer.add(createInterface1CreationTool());
		paletteContainer.add(createRequiredPort2CreationTool());
		paletteContainer.add(createProvidedPort3CreationTool());
		paletteContainer.add(createComponentInstance4CreationTool());
		paletteContainer.add(createService5CreationTool());
		paletteContainer.add(createArgsService6CreationTool());
		paletteContainer.add(createBodyService7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Link" palette tool group
	 * @generated
	 */
	private PaletteContainer createLink2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Link2Group_title);
		paletteContainer.add(createDefineByInterface1CreationTool());
		paletteContainer.add(createBinding2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterface1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GclacsElementTypes.Interface_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Interface1CreationTool_title,
				Messages.Interface1CreationTool_desc, types);
		entry.setSmallIcon(GclacsElementTypes
				.getImageDescriptor(GclacsElementTypes.Interface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRequiredPort2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GclacsElementTypes.RequiredPort_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RequiredPort2CreationTool_title,
				Messages.RequiredPort2CreationTool_desc, types);
		entry.setSmallIcon(GclacsElementTypes
				.getImageDescriptor(GclacsElementTypes.RequiredPort_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProvidedPort3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GclacsElementTypes.ProvidedPort_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ProvidedPort3CreationTool_title,
				Messages.ProvidedPort3CreationTool_desc, types);
		entry.setSmallIcon(GclacsElementTypes
				.getImageDescriptor(GclacsElementTypes.ProvidedPort_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentInstance4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(GclacsElementTypes.ComponentInstance_1001);
		types.add(GclacsElementTypes.ComponentInstance_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ComponentInstance4CreationTool_title,
				Messages.ComponentInstance4CreationTool_desc, types);
		entry.setSmallIcon(GclacsElementTypes
				.getImageDescriptor(GclacsElementTypes.ComponentInstance_1001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createService5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GclacsElementTypes.Services_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Service5CreationTool_title,
				Messages.Service5CreationTool_desc, types);
		entry.setSmallIcon(GclacsElementTypes
				.getImageDescriptor(GclacsElementTypes.Services_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgsService6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GclacsElementTypes.Arg_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ArgsService6CreationTool_title,
				Messages.ArgsService6CreationTool_desc, types);
		entry.setSmallIcon(GclacsElementTypes
				.getImageDescriptor(GclacsElementTypes.Arg_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBodyService7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GclacsElementTypes.BodyType_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BodyService7CreationTool_title,
				Messages.BodyService7CreationTool_desc, types);
		entry.setSmallIcon(GclacsElementTypes
				.getImageDescriptor(GclacsElementTypes.BodyType_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDefineByInterface1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GclacsElementTypes.DefineByInterface_3001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DefineByInterface1CreationTool_title,
				Messages.DefineByInterface1CreationTool_desc, types);
		entry.setSmallIcon(GclacsElementTypes
				.getImageDescriptor(GclacsElementTypes.DefineByInterface_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBinding2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(GclacsElementTypes.Binding_3002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Binding2CreationTool_title,
				Messages.Binding2CreationTool_desc, types);
		entry.setSmallIcon(GclacsElementTypes
				.getImageDescriptor(GclacsElementTypes.Binding_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
