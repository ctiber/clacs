package CLACS;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class ComponentDescriptorFigure extends RectangleFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureComponentDescriptorNameFigure;

	/**
	 * @generated
	 */
	public ComponentDescriptorFigure() {

		FlowLayout layoutThis = new FlowLayout();
		layoutThis.setStretchMinorAxis(false);
		layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

		layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
		layoutThis.setMajorSpacing(5);
		layoutThis.setMinorSpacing(5);
		layoutThis.setHorizontal(true);

		this.setLayoutManager(layoutThis);

		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureComponentDescriptorNameFigure = new WrappingLabel();
		fFigureComponentDescriptorNameFigure
				.setText("UnnamedDescriptorComponent");

		this.add(fFigureComponentDescriptorNameFigure);

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
	public WrappingLabel getFigureComponentDescriptorNameFigure() {
		return fFigureComponentDescriptorNameFigure;
	}

}
