package at_1_1;

public class Circle {// Save as "Circle.java"
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;
	
	
	// Constructors (overloaded)
	// Constructs a Circle instance with default value for radius and color */
	public Circle() { // 1st (default) constructor
		radius = 1.0;
		color = "red";
	}
	
	//Constructs a Circle instance with the given radius and default color */
	public Circle(double radius) { // 2nd constructor
		this.radius = radius;
		color = "red";
	}
	
	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}
	
	//Returns the radius
	public double getRadius() {
		return radius;
	}
	
	//Returns the area of this Circle instance/
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String getColor() {
		return color;
		
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}
