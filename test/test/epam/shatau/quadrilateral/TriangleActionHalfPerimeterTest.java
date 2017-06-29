package test.epam.shatau.quadrilateral;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.action.TriangleActionHalfPerimeter;
import epam.shatau.task1.entity.Point;

public class TriangleActionHalfPerimeterTest {

	@Test
	public void testLengthHalfPerimeter() {

	
		TriangleActionHalfPerimeter halfPerimeter = new TriangleActionHalfPerimeter();
			
			double expected = 6;
			
			//add points
			Point pointA = new Point();
			Point pointB = new Point();		
			Point pointC = new Point();
	
			//set values
			pointA.setX(0);
			pointA.setY(0);
			
			pointB.setX(4);
			pointB.setY(0);
			
			pointC.setX(4);
			pointC.setY(3);
			
			double actual = halfPerimeter.lengthHalfPerimeter(pointA, pointB, pointC);
			         
			System.out.println("Actual halfPerimeter: " + actual + "\r" + "halfPerimeter square: " + expected);
							
			Assert.assertEquals(expected, actual, 0.000_000_1);	
		
	}

}
