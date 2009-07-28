package CLACS;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class InterfaceFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureInterfaceNameFigure;

	/**
	 * @generated
	 */
	public InterfaceFigure() {

		FlowLayout layoutThis = new FlowLayout();
		layoutThis.setStretchMinorAxis(false);
		layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

		layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
		layoutThis.setMajorSpacing(5);
		layoutThis.setMinorSpacing(5);
		layoutThis.setHorizontal(true);

		this.setLayoutManager(layoutThis);

		this.setCornerDimensions(new Dimension(8, 8));
		this.setLineStyle(Graphics.LINE_DASH);
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureInterfaceNameFigure = new WrappingLabel();
		fFigureInterfaceNameFigure.setText("UnnamedInterface");

		this.add(fFigureInterfaceNameFigure);

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
	public WrappingLabel getFigureInterfaceNameFigure() {
		return fFigureInterfaceNameFigure;
	}

}
