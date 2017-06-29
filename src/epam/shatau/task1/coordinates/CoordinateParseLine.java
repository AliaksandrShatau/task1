package epam.shatau.task1.coordinates;

import epam.shatau.task1.entity.CoordinateLine;

public class CoordinateParseLine {
		
	public String[] coordinatePoint(String coordinateline, String lineDelimeter) {
		
		CoordinateLine coordinateLine = new CoordinateLine();
		
		//set values
		coordinateLine.setCoordinatesLine(coordinateline);
		coordinateLine.setDelimiter(lineDelimeter);

		//get array
		String[] coordinat = coordinateLine.getCoordinatesLine().split(coordinateLine.getDelimiter());
		
		return coordinat;

	}	
	
}
