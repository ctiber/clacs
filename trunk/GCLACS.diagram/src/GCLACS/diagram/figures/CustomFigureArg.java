package GCLACS.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;

public class CustomFigureArg extends Shape {
	private int[] myCachedPath = new int[8];
	
	/**
	 * @see Shape#fillShape(Graphics)
	 */
	protected void fillShape(Graphics graphics) {
		org.eclipse.draw2d.geometry.Rectangle r = getBounds();
		
		int centerX = r.x + r.width / 2;
		int centerY = r.y + r.height / 2;
		
		setPathPoint(0, centerX, r.y);
		setPathPoint(1, r.x + r.width, centerY);
		setPathPoint(2, centerX, r.y + r.height);
		setPathPoint(2, r.x, centerY);
		
		graphics.fillRectangle(getBounds());
	}

	/**
	 * @see Shape#outlineShape(Graphics)
	 */
	protected void outlineShape(Graphics graphics) {
		org.eclipse.draw2d.geometry.Rectangle r = getBounds();
		
		int centerX = r.x + r.width / 2;
		int centerY = r.y + r.height / 2;
		
		graphics.drawLine(centerX, r.y, r.x + r.width - 1, centerY);
		graphics.drawLine(centerX, r.y, r.x, centerY);
		graphics.drawLine(centerX, r.y + r.height -1, r.x + r.width -1, centerY);
		graphics.drawLine(centerX, r.y + r.height -1, r.x, centerY);
	}
	
	private void setPathPoint(int index, int x, int y){
		myCachedPath[index * 2] = x;
		myCachedPath[index * 2 + 1] = x;
	}

}