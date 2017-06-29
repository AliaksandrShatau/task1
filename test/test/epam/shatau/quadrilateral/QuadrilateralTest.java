package test.epam.shatau.quadrilateral;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.entity.Point;
import epam.shatau.task1.entity.Quadrilateral;

public class QuadrilateralTest {

	@Test
		
	public void quadrilateralTest() {
					
		Quadrilateral quadrilateral = new Quadrilateral();
		
		//set initial values
		Point point1 = new Point();
		point1.setX(1);
		point1.setY(1);
		
		Point point2 = new Point();
		point2.setX(5);
		point2.setY(1);	
		
		Point point3 = new Point();
		point3.setX(4);
		point3.setY(5);
		
		Point point4 = new Point();
		point4.setX(1);
		point4.setY(4);	
		
		//set coordinates
		quadrilateral.setPointA(point1);
		quadrilateral.setPointB(point2);
		quadrilateral.setPointC(point3);
		quadrilateral.setPointD(point4);

		double AB = quadrilateral.defineLineAB();
		double BC = quadrilateral.defineLineBC();
		double CD = quadrilateral.defineLineCD();
		double DA = quadrilateral.defineLineDA();
		
		
		double expected = 14.285383285;
		double actual = AB + BC + CD + DA;
		
		
		System.out.println("Initial data: " + "\r"
				+ "point A (" + point1.getX() + ", " + point1.getY() + ") -> AB is " + AB + "\r"
				+ "point B (" + point2.getX() + ", " + point2.getY() + ") -> BC is " + BC + "\r"
				+ "point C (" + point3.getX() + ", " + point3.getY() + ") -> CD is " + CD + "\r"
				+ "point D (" + point4.getX() + ", " + point4.getY() + ") -> DA is " + DA + "\r"
				+ "Expected Perimeter is " + expected + ", Actual Perimeter Is " + actual
				);
				
		Assert.assertEquals(expected, actual, 0.000_000_1);

		}
		
	
}
