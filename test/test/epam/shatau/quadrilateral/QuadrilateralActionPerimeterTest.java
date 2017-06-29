package test.epam.shatau.quadrilateral;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.action.QuadrilateralActionPerimeter;
import epam.shatau.task1.entity.Point;


public class QuadrilateralActionPerimeterTest {
	@Test
	
	public void perimeterTest() {
		
		QuadrilateralActionPerimeter perimeter = new QuadrilateralActionPerimeter();
		
		int expected = 14;
		
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
		
		pointD.setX(1);
		pointD.setY(4);	
		
		
		
		double actual = perimeter.lengthPerimeter(pointA, pointB, pointC, pointD);
		
		
		System.out.println("Actual perimeter: " + actual + "\r" + "expected perimeter: " + expected);
						
		Assert.assertEquals(expected, actual, 0.000_000_1);	
		
	}
}
