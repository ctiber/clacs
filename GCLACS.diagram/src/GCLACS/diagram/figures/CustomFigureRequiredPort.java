package GCLACS.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;

public class CustomFigureRequiredPort extends Shape{
	private int[] myCachedPath = new int[10];
	
	@Override
	protected void fillShape(Graphics graphics) {
		org.eclipse.draw2d.geometry.Rectangle r = getBounds();
		


		/*graphics.drawLine(r.x, r.y + r.height, r.x, r.y);
		graphics.drawLine(r.x, r.y, r.x + r.width, r.y);
		graphics.drawLine(r.x, r.y + r.height, r.x + r.width, r.y + r.height);*/
		graphics.fillRectangle(getBounds());
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		org.eclipse.draw2d.geometry.Rectangle r = getBounds();
		
		setPathPoint(0, r.x + r.width - 1, r.y + r.height - 1);
		setPathPoint(1, r.x, r.y + r.height - 1);
		setPathPoint(2, r.x, r.y);
		setPathPoint(3, r.x + r.width - 1,  r.y);
		//setPathPoint(4, r.x + r.width - 1,  r.y + r.height - 1);
		
		int centerX = r.x + r.width / 2;
		int centerY = r.y + r.height / 2;

		graphics.drawOval(centerX, r.y, 3 * r.height / 2, r.height);

		//graphics.drawArc(centerX, r.y, 3 * r.height / 2, r.height, 5, 100);
		//graphics.drawOval(r.x, r.y, r.width, r.height);
		
		//graphics.drawOval(r.x + r.width/10, r.y + r.height/10, r.width - r.width/10, r.height - r.height/10);
		//graphics.drawOval(r.x + r.width/10 + 3, r.y + r.height/10 + 3, r.width - r.width/10, r.height - r.height/10);
		
		graphics.drawLine(myCachedPath[0], myCachedPath[1], myCachedPath[2], myCachedPath[3]);
		graphics.drawLine(myCachedPath[2], myCachedPath[3], myCachedPath[4], myCachedPath[5]);
		graphics.drawLine(myCachedPath[4], myCachedPath[5], myCachedPath[6], myCachedPath[7]);
		graphics.setLineWidth(10);
	}
	
	private void setPathPoint(int index, int x, int y){
		myCachedPath[index * 2] = x;
		myCachedPath[index * 2 + 1] = y;
	}

}
