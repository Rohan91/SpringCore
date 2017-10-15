package org.sayantan.dobedobedo;

public class Circle implements Shape{

	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
		System.out.println("Centre Point: (" + pointA.getX() + ", " + pointA.getY() + ")");
	}

}
