package epam.shatau.task1.entity;

public class Point {

	//fields
	private int x; 
	private int y;
	
	//constructors
	public Point() {
	}

	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	//methods
	//getter for x	
	public double getX() {
		return x;
	}
	//setter for x
	public void setX(int x) {
		this.x = x;
	}


	//getter for y
	public double getY() {
		return y;
	}

	//setter for y
	public void setY(int y) {
		this.y = y;
	}

	
	
}
