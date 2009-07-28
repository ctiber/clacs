package CLACS;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class ComponentInstanceFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureDescriptorComponentName;
	/**
	 * @generated
	 */
	private WrappingLabel fFigureComponentInstanceNameFigure;

	/**
	 * @generated
	 */
	public ComponentInstanceFigure() {

		FlowLayout layoutThis = new FlowLayout();
		layoutThis.setStretchMinorAxis(false);
		layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

		layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
		layoutThis.setMajorSpacing(5);
		layoutThis.setMinorSpacing(5);
		layoutThis.setHorizontal(true);

		this.setLayoutManager(layoutThis);

		this.setCornerDimensions(new Dimension(15, 15));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureComponentInstanceNameFigure = new WrappingLabel();
		fFigureComponentInstanceNameFigure.setText("UnnamedComponentInstance");

		this.add(fFigureComponentInstanceNameFigure);

		fFigureDescriptorComponentName = new WrappingLabel();
		fFigureDescriptorComponentName
				.setText("UnnamedAssociatedDescriptorComponentName");

		this.add(fFigureDescriptorComponentName);

	}

	/**
	 * @generated
	 */
	private boolean myUseLocalCoordinates = false;

	/**
	 * @generated
	 */
	protected boolean useLocalCoordinates() {
		return myUseLocalCoordinates;
	}

	/**
	 * @generated
	 */
	protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
		myUseLocalCoordinates = useLocalCoordinates;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureDescriptorComponentName() {
		return fFigureDescriptorComponentName;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureComponentInstanceNameFigure() {
		return fFigureComponentInstanceNameFigure;
	}

}
