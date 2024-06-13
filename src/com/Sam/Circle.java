package com.Sam;
/**
* @author Sam Hossaini
* @date 02/27/2024
* Create overloaded circle constructors
*/
public class Circle {
	
	/**
	 * x is the x coordinate of the circle
	 * y is the y coordinate of the circle 
	 * radius is the radius of the circle
	 */
	private int x, y, radius;
	// default constructor
	public Circle() {
		
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	/**
	 * will add the numbers and restrictions to the radius
	 * @param radius is the circle
	 */
	
	// constructor again
	public Circle(int radius) {
		this();
		
		if (radius > 100) {
			this.radius = 100;
		} else if (radius < 0) {
			this.radius = 1;
		} else {
			this.radius = radius;
		}
	}
	
	/**
	 * modify instance variables/attributes on object creation, to be specific to each new object
	 * @param x is the coordinate of the circle
	 * @param y is the coordinate of the circle
	 * @param radius is the circle
	 */
	// constructor again
	public Circle(int x, int y, int radius) { // variable names are made same for convenience
		 
		if (x > 100) {
			this.x = 100;
		} else if (x < -100) {
			this.x = -100;
		} else {
			this.x = x;
		}
		
		if (y > 100) {
			this.y = 100;
		} else if (y < -100) {
			this.y = -100;
		} else {
			this.y = y;
		}
		
		if (radius > 100) {
			this.radius = 100;
		} else if (radius < 0) {
			this.radius = 1;
		} else {
			this.radius = radius;
		}
	}
	
	/**
	 * will get the new circle and add them to the previous one
	 * @param c is the new circle
	 */
	public void combineCircle(Circle c) {
		this.radius += c.radius;
		this.x = (this.x + c.x) / 2;
		this.y = (this.y + c.y) / 2;
	}
	
	/**
	 * out put the combine circle
	 */
	public void doubleCircle() {
		combineCircle(this);
	}
	
	/**
	 * will get the newest radius and will return that  
	 * @return will return the newest radius
	 */
	public int getRadius() {
		return this.radius;
	}
	
	/**
	 * will get the origins and will return the origins 
	 */
	public int[] getOrigin() {
		int[] origin = {this.x, this.y};
		return origin;
	}
	/**
	 * will times the radius with out to get the diameter of the circle and will return the diameter of the circle 
	 * @param radius is the radius of the circle
	 * @return return the diameter
	 */
	
	private int diameter(int radius) {
		return radius*2;
	}
	
	/**
	 * will return the area of the circle
	 * @return the area of the circle
	 */
	public double area() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	/**
	 * it out out the oerimeter of the circle
	 * @return the perimeter of the circle
	 */
	public double perimeter() {
		return Math.PI*diameter(this.radius);
	}
	
	/**
	 * void method that does not return anything but updates the current 'this' object
	 * @param x is the x coordinate of the circle 
	 * @param y is the y coordinate of the circle
	 */
	
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	/**
	 * will out put the newest radius of the circle
	 * @param radius is the radius of the circle 
	 */
	public void resize(int radius) {
		this.radius = radius;
	}
	
	/**
	 * funky method that will output its returned string when object of class is output or printed 
	 */
	 
	public String toString() {
		return "(x-" + this.x + ")^2 + (y-" + this.y + ")^2 = " + this.radius + "^2";
	}
}