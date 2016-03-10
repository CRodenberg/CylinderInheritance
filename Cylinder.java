/*
Cylinder.java
Programmer: Cole Rodenberg
Date: 2/4/2016
Description: The Cylinder class is derived from the class CircleWithPoint
which is derived from the class Point2. Cylinder adds a height variable
and usual operations of a cylinder.
*/

public class Cylinder extends CircleWithPoint{
	private double height;
	
	//Default Constructor
	public Cylinder(){
		super();
		setHeight(0);
	}//End default constructor
	
	//Constructor with four parameters
	public Cylinder(double x, double y, double r, double h){
		super(x, y, r);
		setHeight(h);
	}//End constructor
	
	//copy constructor
	public Cylinder(Cylinder c){
		super(c);
		height = c.height;
	}//End copy constructor
	
	//Sets the height of the cylinder
	public void setHeight(double h){
		if(h>=0)
			height = h;
		else
			height = 0;
	}//End setHeight
	
	//Sets the circle of the cylinder
	public void setCircle(double x, double y, double r){
		super.setCircle(x,y,r);
	}//End setCircle
	
	//Sets the center of the cylinder
	public void setCenter(double x, double y){
		super.setCenter(x,y);
	}//End setCenter
	
	//Sets the properties of the cylinder
	public void setCylinder(double x, double y, double r, double h){
		setCircle(x,y,r);
		setHeight(h);
	}//End setCylinder

	//returns the height of the cylinder
	public double getHeight(){
		return height;
	}//End getHeight
	
	//calculates and returns the volume of the cylinder
	public double volume(){
		return (super.area()*height);
	}//End volume
	
	//calculates and returns the surface area of the cylinder
	public double surfaceArea(){
		return (super.circumference()*height + 2 * super.area());
	}//End surfaceArea
	
	//returns the properties of the cylinder as a string
	public String toString(){
		return ("\n\t*Properties of the Cylinder*\n\tCenter: (" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ");\n\t" +
				"Radius: " + String.format("%.2f", radius) + ";\n\t" + "Height: " + String.format("%.2f", height) + ";\n\t" +
				"Volume: " + String.format("%.2f", volume()) + ";\n\t" + "Surface Area: " + String.format("%.2f", surfaceArea()) + ";\n");
	}//End toString
	
	//Returns true if the cylinders are equal; false if not
	public boolean equals(Cylinder c){
		return (super.equals(c) && height == c.height);
	}//End equals
}//End Cylinder
