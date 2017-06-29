package test.epam.shatau.coordinates;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.action.QuadrilateralActionSquare;
import epam.shatau.task1.coordinates.CoordinateParseLine;
import epam.shatau.task1.entity.Point;

public class CoordinateActionListTest {

	@Test
	public void test() {
		
		String coordinateline = " 1 1 5 1 4 5 4 1 ";
		String lineDelimeter = " ";
		
		String[] resultarray;
		
		CoordinateParseLine coordinateslist = new CoordinateParseLine();
		
		resultarray = coordinateslist.coordinatePoint(coordinateline, lineDelimeter);
		
		Point pointA = new Point();
		pointA.setX(Integer.parseInt(resultarray[0]));
		pointA.setY(Integer.parseInt(resultarray[1]));		

		Point pointB = new Point();
		pointB.setX(Integer.parseInt(resultarray[2]));
		pointB.setY(Integer.parseInt(resultarray[3]));	
		
		Point pointC = new Point();
		pointC.setX(Integer.parseInt(resultarray[4]));
		pointC.setY(Integer.parseInt(resultarray[5]));	
		
		Point pointD = new Point();
		pointD.setX(Integer.parseInt(resultarray[6]));
		pointD.setY(Integer.parseInt(resultarray[7]));	
		
		QuadrilateralActionSquare square = new QuadrilateralActionSquare();
		
		double expected = 2;
		
		double actual = square.square(pointA, pointB, pointC, pointD);  //                      
		
		System.out.println("Actual square: " + actual + "\r" + "expected square: " + expected + "\r"
				+ "A (" + Integer.parseInt(resultarray[0]) + ", " + Integer.parseInt(resultarray[1]) + ")\r"
				+ "B (" + Integer.parseInt(resultarray[2]) + ", " + Integer.parseInt(resultarray[3]) + ")\r"
				+ "C (" + Integer.parseInt(resultarray[4]) + ", " + Integer.parseInt(resultarray[5]) + ")\r"
				+ "D (" + Integer.parseInt(resultarray[6]) + ", " + Integer.parseInt(resultarray[7]) + ")");
						
		Assert.assertEquals(expected, actual, 0.000_000_1);	

		
	}

}
