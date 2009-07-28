package GCLACS.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;

public class CustomFigureBody extends Shape{
	private int[] myCachedPath = new int[8];
	
	@Override
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

	@Override
	protected void outlineShape(Graphics graphics) {
		org.eclipse.draw2d.geometry.Rectangle r = getBounds();
		
		int centerX = r.x + r.width / 2;
		int centerY = r.y + r.height / 2;
		
		graphics.drawLine(r.x, r.y, r.x + r.width - 1, r.y);
		graphics.drawLine(r.x, r.y, r.x + r.width/ 4 , r.y + r.height - 1);
		graphics.drawLine(r.x + r.width / 4, r.y + r.height - 1, r.x +  3 * r.width/4, r.y + r.height - 1);
		graphics.drawLine(r.x +  3 * r.width/4, r.y + r.height - 1, r.x + r.width, r.y);
		//graphics.drawLine(r.x + 3 * r.width/4, r.y + r.height -1, r.width - 1, r.height - 1);
		//graphics.drawOval(r.x + r.width/10 - 1, r.y + r.height/10 - 1, r.width - r.width/10 - 1, r.height - r.height/10 - 1);
		//graphics.drawOval(r.x + r.width/10 + 3, r.y + r.height/10 + 3, r.width - r.width/10 - 3, r.height - r.height/10 - 3);
	}
	
	private void setPathPoint(int index, int x, int y){
		myCachedPath[index * 2] = x;
		myCachedPath[index * 2 + 1] = x;
	}

}

