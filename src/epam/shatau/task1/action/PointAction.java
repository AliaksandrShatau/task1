package epam.shatau.task1.action;

import epam.shatau.task1.entity.Point;

public class PointAction {
	
	public double lengthVector(Point pointVector) {
		
		//hypotenuse - just for test how it works
		return Math.hypot(pointVector.getX(), pointVector.getY());

	}
}
