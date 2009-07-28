package CLACS;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;

import GCLACS.*;
import GCLACS.diagram.figures.CustomFigureRequiredPort;

/**
 * @generated
 */
public class RequiredPortFigure extends CustomFigureRequiredPort {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureRequiredPortName;

	/**
	 * @generated
	 */
	public RequiredPortFigure() {

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

		fFigureRequiredPortName = new WrappingLabel();
		fFigureRequiredPortName.setText("UnnamedRequiredPort");

		this.add(fFigureRequiredPortName);

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
	public WrappingLabel getFigureRequiredPortName() {
		return fFigureRequiredPortName;
	}

}
