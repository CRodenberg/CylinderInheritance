/*
Point2.java
Programmer: Cole Rodenberg Date: 2/3/2016
Description: This is a class designed for a point with coordinates(x,y),
constructors for initialization, mutators to change the point, accessors
to access this information, and methods to print the point, calculate the
distance from the origin, and the angle.*/

public class Point2 extends Object{
	protected double x;
	protected double y;
	public Point2(){
		x = 0.0;
		y = 0.0;
	}//End default constructor
	public Point2(double x, double y){
		this.x = x;
		this.y = y;
	}//End Point constructor with 2 parameters
	public Point2(Point2 b){
		x = b.x;
		y = b.y;
	}//End Point copy constructor
	public double getX(){
		return x;
	}//End getX
	public double getY(){
		return y;
	}//End getY
	public void setX(double x){
		this.x = x;
	}//End setX
	public void setY(double y){
		this.y = y;
	}//End setY
	public void setPoint(double x, double y){
		this.x = x;
		this.y = y;
	}//End setPoint
	public String toString(){
		return "Point: (" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ");";
	}//End toString
	public double distance(){
		double d;
		d = Math.sqrt(x*x + y*y);
		return d;
	}//End distance
	public double angle(){
		double a;
		a = Math.atan(y/x);
		return a;
	}//End angle
	public boolean equals(Point2 p){
		return (x == p.x) && (y == p.y);
	}//End equals
	public void makeCopy(Point2 p){
		x = p.x;
		y = p.y;
	}//End makeCopy
	public Point2 getCopy(){
		Point2 temp = new Point2();
		temp.x = x;
		temp.y = y;
		return temp;
	}//End getCopy
}//End Point Class
