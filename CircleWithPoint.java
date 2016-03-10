/*CircleWithPoint.java
Programmer: Cole Rodenberg Date: 2/3/2016
Description: This class inherits the members from the class Point,
and adds the variable radius, and some typical functions needed
for a Circle.
*/

public class CircleWithPoint extends Point2{
	protected double radius;
	
	//default constructor
	public CircleWithPoint(){
		super();
		radius = 1.0;
	}//End default constructor
	
	//constructor with 3 parameters
	public CircleWithPoint(double x, double y, double r){
		super(x,y);
		setRadius(r);
	}//End constructor
	
	//copy constructor
	public CircleWithPoint(CircleWithPoint c){
		super(c);
		radius = c.radius;
	}//End copy constructor
	
	//Sets the radius
	public void setRadius(double r){
		if(r >= 0)
			radius = r;
		else
			radius = 1;
	}//End setRadius
	
	//Sets the center
	public void setCenter(double x, double y){
		super.setPoint(x,y);
	}//End setCenter
	
	//Sets the circle
	public void setCircle(double x, double y, double r){
		super.setPoint(x,y);
		radius = r;
	}//End setCircle
	
	//Returns the radius
	public double getRadius(){
		return radius;
	}//End getRadius
	
	//Calculates and returns the circumference
	public double circumference(){
		return 2*Math.PI*radius;
	}//End circumference
	
	//Calculates and returns the radius
	public double area(){
		return Math.PI*Math.pow(radius,2);
	}//End area
	
	//returns the circle as a string
	public String toString(){
		return ("\n\t*Properties of the Circle*\n\tCenter: (" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ");\n" + "\tRadius: " + 
				String.format("%.2f",radius) + ";\n" + "\tCircumference: " + String.format("%.2f", circumference()) + ";\n" + 
				"\tArea: " + String.format("%.2f", area()) + ";\n");
	}//End toString
	
	//Returns whether the two circles are equal.
	public boolean equals(CircleWithPoint c){
		return (super.equals(c) && radius == c.radius);
	}//End equals
}





