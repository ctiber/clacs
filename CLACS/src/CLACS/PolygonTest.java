package CLACS;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Polygon;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class PolygonTest extends Polygon {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureLabelTest;

	/**
	 * @generated
	 */
	public PolygonTest() {

		FlowLayout layoutThis = new FlowLayout();
		layoutThis.setStretchMinorAxis(false);
		layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

		layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
		layoutThis.setMajorSpacing(5);
		layoutThis.setMinorSpacing(5);
		layoutThis.setHorizontal(true);

		this.setLayoutManager(layoutThis);

		this.setFill(true);
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureLabelTest = new WrappingLabel();
		fFigureLabelTest.setText("LabelTest");

		this.add(fFigureLabelTest);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureLabelTest() {
		return fFigureLabelTest;
	}

}
