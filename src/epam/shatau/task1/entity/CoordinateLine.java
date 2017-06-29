package epam.shatau.task1.entity;

public class CoordinateLine {
	
	private String coordinatesLine;// = " 1 1 5 1 4 5 4 1 ";
	private String delimiter; // = " ";

	public String getCoordinatesLine() {
		return coordinatesLine;
	}
		
	public void setCoordinatesLine(String coordinatesLine) {
		this.coordinatesLine = coordinatesLine.trim();
	}


	public String getDelimiter() {
		return delimiter;
	}
		
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
					
}
