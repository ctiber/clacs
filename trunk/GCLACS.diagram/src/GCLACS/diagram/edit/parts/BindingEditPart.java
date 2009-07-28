package GCLACS.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import GCLACS.diagram.edit.policies.BindingItemSemanticEditPolicy;

/**
 * @generated
 */
public class BindingEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

	/**
	 * @generated
	 */
	public BindingEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BindingItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof BindingKindEditPart) {
			((BindingKindEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureBindingKindFigure());
			return true;
		}
		if (childEditPart instanceof BindingNameEditPart) {
			((BindingNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureBindingNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new BindingFigure();
	}

	/**
	 * @generated
	 */
	public BindingFigure getPrimaryShape() {
		return (BindingFigure) getFigure();
	}

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

}
