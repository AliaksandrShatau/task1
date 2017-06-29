package epam.shatau.task1.action;

import epam.shatau.task1.entity.Point;
import epam.shatau.task1.entity.Quadrilateral;

public class QuadrilateralActionSquare {
	

	public double square(Point pointA, Point pointB, Point pointC, Point pointD) {
		
		Quadrilateral quadrilateral = new Quadrilateral();
		TriangleActionSquare square = new TriangleActionSquare();
		
		//set coordinates
		quadrilateral.setPointA(pointA);
		quadrilateral.setPointB(pointB);
		quadrilateral.setPointC(pointC);
		quadrilateral.setPointD(pointD);
		
		double squareABC;
		double squareACD;
		
		double squareABD;
		double squareBCD;	
	
		squareABC = square.squareTreangle(pointA, pointB, pointC);
		squareACD = square.squareTreangle(pointA, pointC, pointD);
		squareABD = square.squareTreangle(pointA, pointB, pointD);
		squareBCD = square.squareTreangle(pointB, pointC, pointD);

		return (squareABC + squareACD) > (squareABD + squareBCD) ? (squareABD + squareBCD) : (squareABC + squareACD);
	}		

}
