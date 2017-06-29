package epam.shatau.task1.action;

import epam.shatau.task1.entity.Point;
import epam.shatau.task1.entity.Quadrilateral;

public class TriangleActionHalfPerimeter {
	
	public double lengthHalfPerimeter(Point pointA, Point pointB, Point pointC) {
		
		Quadrilateral quadrilateral = new Quadrilateral();
		
		//set coordinates
		quadrilateral.setPointA(pointA);
		quadrilateral.setPointB(pointB);
		quadrilateral.setPointC(pointC);

		return (quadrilateral.defineLineAB() + quadrilateral.defineLineBC() + quadrilateral.defineLineAC()) / 2;

	}	
}
