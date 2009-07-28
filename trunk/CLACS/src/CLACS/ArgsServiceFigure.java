package CLACS;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.emf.ocl.query.QueryFactory;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

import GCLACS.diagram.figures.CustomFigureArg;

/**
 * @generated
 */
public class ArgsServiceFigure extends CustomFigureArg {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureArgServiceName;

	/**
	 * @generated
	 */
	public ArgsServiceFigure() {

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

		fFigureArgServiceName = new WrappingLabel();
		fFigureArgServiceName.setText("");

		this.add(fFigureArgServiceName);

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
	public WrappingLabel getFigureArgServiceName() {
		return fFigureArgServiceName;
	}

}
