package epam.shatau.task1.action;

import epam.shatau.task1.entity.Point;
import epam.shatau.task1.entity.Quadrilateral;

public class QuadrilateralActionPerimeter {
	
	public double lengthPerimeter(Point pointA, Point pointB, Point pointC, Point pointD) {
		
		Quadrilateral quadrilateral = new Quadrilateral();
		
		//set coordinates
		quadrilateral.setPointA(pointA);
		quadrilateral.setPointB(pointB);
		quadrilateral.setPointC(pointC);
		quadrilateral.setPointD(pointD);
		
		return quadrilateral.defineLineAB() 
				+ quadrilateral.defineLineBC() 
				+ quadrilateral.defineLineCD() 
				+ quadrilateral.defineLineDA();

	}	

}
