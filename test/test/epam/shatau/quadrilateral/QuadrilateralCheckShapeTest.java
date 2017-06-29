package test.epam.shatau.quadrilateral;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.check.QuadrilateralCheckShape;
import epam.shatau.task1.entity.Point;

public class QuadrilateralCheckShapeTest {

	@Test
	public void testShape() {
		
		boolean expected = false;
		
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
		
		pointD.setX(4); //2
		pointD.setY(2);	//4
		
        //               |
		//            5  |       .
		//            4  | ,      
		//            3  |      
		//            2  |       .  
		//            1  | .       .
		//            0  |______________
		//                 1 2 3 4 5
		
		
		boolean actual = new QuadrilateralCheckShape().isConvex(pointA, pointB, pointC, pointD);   
		
		System.out.println("Actual: isConvex " + actual + "\r" + "expected: isConvex " + expected);
						
		Assert.assertEquals(expected, actual);	
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
