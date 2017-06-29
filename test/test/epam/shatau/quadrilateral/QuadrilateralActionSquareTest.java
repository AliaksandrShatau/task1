package test.epam.shatau.quadrilateral;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.action.QuadrilateralActionSquare;
import epam.shatau.task1.entity.Point;

public class QuadrilateralActionSquareTest {
	
	
	@Test
	
	public void squareTest() {
		
		QuadrilateralActionSquare square = new QuadrilateralActionSquare();
		
		double expected = 3.5;
		
		//add points
		Point pointA = new Point();
		Point pointB = new Point();		
		Point pointC = new Point();
		Point pointD = new Point();	
		
		//set values
		pointA.setX(1);
		pointA.setY(1);
		
		pointB.setX(5);
		pointB.setY(1);
		
		pointC.setX(4);
		pointC.setY(5);
		
		pointD.setX(4);
		pointD.setY(2);	
		
		
		double actual = square.square(pointA, pointB, pointC, pointD);  //                      
		
		System.out.println("Actual square: " + actual + "\r" + "expected square: " + expected);
						
		Assert.assertEquals(expected, actual, 0.000_000_1);	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
