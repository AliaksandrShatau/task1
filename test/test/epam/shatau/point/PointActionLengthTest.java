package test.epam.shatau.point;


import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.action.PointActionLength;
import epam.shatau.task1.entity.Point;

public class PointActionLengthTest {
	@Test
	
	public void actionLengthTest() {
		Point pointA = new Point();
		Point pointB = new Point();
		
		
		double expected = 5;
		
		//set test coordinates
		pointA.setX(1);
		pointA.setY(1);
		
		pointB.setX(4);
		pointB.setY(5);	
		
		double actual = new PointActionLength().lengthLine(pointA, pointB);
		
		System.out.println("Actual result is " + actual + ", expected " + expected);
		
		Assert.assertEquals(expected, actual, 0.000_000_1);

	}
	
	
}
