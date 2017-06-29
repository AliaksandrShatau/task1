package test.epam.shatau.coordinates;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.coordinates.CoordinateLineValidator;
import epam.shatau.task1.coordinates.CoordinateParseLine;

public class CoordinateLineValidatorTest {

	@Test
	public void test() {
		
		
		String coordinateline = " 1 1 5 1 4 5 4 1 ";
		String lineDelimeter = " ";
		
		String[] resultarray;
		
		CoordinateParseLine coordinateslist = new CoordinateParseLine();
		
		resultarray = coordinateslist.coordinatePoint(coordinateline, lineDelimeter);
			
		CoordinateLineValidator coordinatevalidator = new CoordinateLineValidator();
		
		boolean expected = true;
		boolean actual = coordinatevalidator.checkresult(resultarray);   
		
		System.out.println("Actual result: " + actual + "\r" + "expected result: " + expected);
		
		if (actual == true) { //added "if" just for info
			System.out.println("\r"
					+ "A (" + Integer.parseInt(resultarray[0]) + ", " + Integer.parseInt(resultarray[1]) + ")\r"
					+ "B (" + Integer.parseInt(resultarray[2]) + ", " + Integer.parseInt(resultarray[3]) + ")\r"
					+ "C (" + Integer.parseInt(resultarray[4]) + ", " + Integer.parseInt(resultarray[5]) + ")\r"
					+ "D (" + Integer.parseInt(resultarray[6]) + ", " + Integer.parseInt(resultarray[7]) + ")");
		}			
		
		Assert.assertEquals(expected, actual);	
		
	
	}

}
