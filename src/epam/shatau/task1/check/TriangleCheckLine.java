package epam.shatau.task1.check;

import epam.shatau.task1.entity.Point;

public class TriangleCheckLine {
	//if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)) 
	public boolean isOneLine(Point pointA, Point pointB, Point pointC) {
		
		return ((pointC.getX() - pointA.getX()) / (pointB.getX() - pointA.getX()) 
				== (pointC.getY() - pointA.getY()) / (pointB.getY() - pointA.getY()));
	}		
}
