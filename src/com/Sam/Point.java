package com.Sam;
/**
* @author Sam Hossaini
* @date 04/11/2024
* writing the method review program
*/
public class Point {
	//instance variables
	/**
	 *  instance variables x and y
	 */
	private double x,y;
	//setting the point
	/**
	 * setter constructor
	 * @param x coordinate
	 * @param y coordinate
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;		
		
	}
	
	//Default constructor sets to (0,0)
	/**
	 * default constructor
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 *  getter for X coordinate
	 * @return x
	 */
	public double getX() {
		return this.x ;
	}
	
	/**
	 * getter for Y coordinate
	 * @return y
	 */
	public double getY() {
		return this.y;
	}
	
	//returns the euclidean distance between the two points
	/**
	 * finds the distance between two points
	 * @param o is the Default point
	 * @return distance
	 */
	public double dist(Point o) {
		double d ;
		double i;
		double j;
		
		
		i = Math.pow(o.x - this.x, 2);
		j = Math.pow(o.y - this.y, 2);
		
		d = i + j;
		
		return Math.sqrt(d);
		
		
	}
	//returns the midpoint between the two points
	/**
	 * return the midpoint between the two points
	 * @param o the default point
	 * @return midpoint
	 */
	public Point midpoint(Point o) {
		double a ;
		double b ;
		
		
		a = (o.x + this.x)/2;
		b = (o.y + this.y)/2;
		
		Point c = new Point(a,b);
		
		
		
		return c;
	}
	
}

