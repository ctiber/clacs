package GCLACS.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import GCLACS.diagram.part.GclacsVisualIDRegistry;

/**
 * @generated
 */
public class GclacsNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 5006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GclacsNavigatorItem) {
			GclacsNavigatorItem item = (GclacsNavigatorItem) element;
			return GclacsVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
