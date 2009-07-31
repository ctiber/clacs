import java.util.ArrayList;

import GCLACS.BindingKind;

import sun.awt.image.ImageWatched.Link;


public class LinkedConstraint {

	
	boolean constResult1;
	boolean constResult2;
	BindingKind bindType;
	
	public LinkedConstraint() {
		constResult1 = false;
		constResult2 = false;
		bindType = BindingKind.SIMPLE;
	}
}
