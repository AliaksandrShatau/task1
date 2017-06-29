package test.epam.shatau.coordinates;

import org.junit.Assert;
import org.junit.Test;

import epam.shatau.task1.coordinates.CoordinateFileReader;

public class CoordinateFileReaderTest {

	@Test
	public void test() {
		
		String file = "src\\coordinates.txt";
		
		CoordinateFileReader coordinateFileReader = new CoordinateFileReader();
		
		String[] readArray = coordinateFileReader.readArray(file);
		
		for (int i = 0; i < readArray.length; i++) {
			System.out.println(readArray[i]);
		}
			
		int expected = 11;
		int actual = readArray.length;
		
		
		System.out.println("\r" + "Actual size is " + actual + ", expected " + expected);
		Assert.assertEquals(expected, actual);  
		
		
		
	
	}

}
