package test.epam.shatau.quadrilateral;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.check.TriangleCheckLine;
import epam.shatau.task1.entity.Point;

public class TriangleCheckLineTest {

	@Test
	public void test() {

		//set initial values
		Point point1 = new Point();
		point1.setX(1);
		point1.setY(1);
		
		Point point2 = new Point();
		point2.setX(4);
		point2.setY(4);	
		
		Point point3 = new Point();
		point3.setX(2);
		point3.setY(2);
		
		boolean expected = true;
		
		boolean actual = new TriangleCheckLine().isOneLine(point1, point2, point3);
		
		
		System.out.println("Actual isOneLine " + actual + "\r" + "isOneLine square " + expected);
		
		Assert.assertEquals(expected, actual);		
		
		
		
		
	}

}
