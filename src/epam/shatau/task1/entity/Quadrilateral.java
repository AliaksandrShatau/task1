package epam.shatau.task1.entity;

import epam.shatau.task1.action.PointActionLength;

public class Quadrilateral {
	//4 points
	private Point pointA = new Point();
	private Point pointB = new Point();
	private Point pointC = new Point();
	private Point pointD = new Point();
	
	//set test coordinates
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	
	//lines for Quadrilateral
	public double defineLineAB() {	
		return new PointActionLength().lengthLine(pointA, pointB);
	}

	public double defineLineBC() {
		return new PointActionLength().lengthLine(pointB, pointC);
	}

	public double defineLineCD() {
		return new PointActionLength().lengthLine(pointC, pointD);
	}

	public double defineLineDA() {
		return new PointActionLength().lengthLine(pointD, pointA);
	}
	
	
	//dioganals
	public double defineLineAC() {
		return new PointActionLength().lengthLine(pointA, pointC);
	}	
	
	public double defineLineBD() {
		return new PointActionLength().lengthLine(pointB, pointD);
	}		
		

}
