package epam.shatau.task1.action;

import epam.shatau.task1.entity.Point;
import epam.shatau.task1.entity.Quadrilateral;

public class TriangleActionSquare {
	
	public double squareTreangle(Point pointA, Point pointB, Point pointC) {
		
		Quadrilateral quadrilateral = new Quadrilateral();
		
		//set coordinates
		quadrilateral.setPointA(pointA);
		quadrilateral.setPointB(pointB);
		quadrilateral.setPointC(pointC);

		double halfPerimeter = new TriangleActionHalfPerimeter().lengthHalfPerimeter(pointA, pointB, pointC);
		
		return  Math.sqrt(halfPerimeter
	        * (halfPerimeter - quadrilateral.defineLineAB())
	        * (halfPerimeter - quadrilateral.defineLineBC())
	        * (halfPerimeter - quadrilateral.defineLineAC())
	        );		
	}	
}
