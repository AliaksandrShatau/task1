package test.epam.shatau.point;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.action.PointAction;
import epam.shatau.task1.entity.Point;

public class PointActionTest {
	@Test
	public void lengthTest() {
		Point point = new Point();

		point.setX(6);
		point.setY(8);
				
		double expected = 5;
		double actual = new PointAction().lengthVector(point);	
		
		
		System.out.println("Actual result is " + actual + ", expected " + expected);
		
		Assert.assertEquals(expected, actual, 0.000_000_1);

	}
	

}
