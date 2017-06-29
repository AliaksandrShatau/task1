package epam.shatau.task1.action;

import epam.shatau.task1.entity.Point;

public class PointActionLength {
	
	public double lengthLine(Point pointA, Point pointB) {
		
		return Math.hypot(pointA.getX() - pointB.getX(), pointA.getY() - pointB.getY());

	}	
}
