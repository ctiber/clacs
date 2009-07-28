package CLACS;

import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class BindingFigure extends PolylineConnectionEx {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureBindingNameFigure;
	/**
	 * @generated
	 */
	private WrappingLabel fFigureBindingKindFigure;

	/**
	 * @generated
	 */
	public BindingFigure() {

		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureBindingKindFigure = new WrappingLabel();
		fFigureBindingKindFigure.setText("simple");

		this.add(fFigureBindingKindFigure);

		fFigureBindingNameFigure = new WrappingLabel();
		fFigureBindingNameFigure.setText("UnnamedBinding");

		this.add(fFigureBindingNameFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureBindingNameFigure() {
		return fFigureBindingNameFigure;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureBindingKindFigure() {
		return fFigureBindingKindFigure;
	}

}
