package epam.shatau.task1.check;

import epam.shatau.task1.action.TriangleActionSquare;
import epam.shatau.task1.entity.Point;
import epam.shatau.task1.entity.Quadrilateral;

public class QuadrilateralCheckShape {
	
	public boolean isConvex(Point pointA, Point pointB, Point pointC, Point pointD) {
		
		Quadrilateral quadrilateral = new Quadrilateral();
		TriangleActionSquare square = new TriangleActionSquare();
		
		//set coordinates
		quadrilateral.setPointA(pointA);
		quadrilateral.setPointB(pointB);
		quadrilateral.setPointC(pointC);
		quadrilateral.setPointD(pointD);
		
		
		double square1;
		square1 = square.squareTreangle(pointA, pointB, pointC) + square.squareTreangle(pointA, pointC, pointD);
		
		double square2;	
		square2 = square.squareTreangle(pointA, pointB, pointD) + square.squareTreangle(pointB, pointC, pointD);
		
		return Math.abs(square1 - square2) < 0.000_000_1;
		

	}		

}


