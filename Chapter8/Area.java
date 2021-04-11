/*
 * Sophie Solo
 * CSC-151
 * Example of using scanner for user input
 */

public class Area {
	
	//fields or properties
	private double radius = 0;
	private double length = 0;
	private double width = 0;
	private double height = 0;
	
	static double pi = Math.PI;
	public static int areasCalculated = 0;
	
	//constructor
	public Area(double radius, double height, double length, double width) {
		this.radius = radius;
		this.height = height;
		this.length = length;
		this.width = width;
		areasCalculated++;		
	}
	
	//setters and getters
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setlength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}	
	
	//overload methods
	public static double areaCalculator(double radius){
		return pi * radius * radius;
	}
	
	public static double areaCalculator(double length, double width){
		return length * width;
	}
	
	public static double areaCalculator(float radius, float height){
		return pi * radius * radius * height;
	}
	
	

}//end class Area
