package com.day5;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public boolean isEqual(Point2D pt) {
		boolean result = false;
//		System.out.println(this.x+" "+pt.x+" "+this.y+" "+pt.y);
		if(this.x == pt.x && this.y == pt.y) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	public double calculateDistance(Point2D pt) {
		double distance = 0;
		distance = Math.sqrt(Math.pow(this.x-pt.x,2)+Math.pow(this.y-pt.y,2));
		return distance;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
