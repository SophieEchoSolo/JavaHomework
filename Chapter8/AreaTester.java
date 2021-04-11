/*
 * Sophie Solo
 * CSC-151
 * Example of using scanner for user input
 */

public class AreaTester {

	public static void main(String[] args) {
		Area num = new Area(2,10,5.5,100.5);
		
		System.out.printf("The area of a circle with radius %.2f is %.2f\n", num.getRadius(), Area.areaCalculator(num.getRadius()));
		System.out.printf("The area of a rectangle with length %.2f and width %.2f is %.2f\n", num.getLength(), num.getWidth(), Area.areaCalculator(num.getLength(), num.getWidth()));
		System.out.printf("The area of a cylinder with radius %.2f and height %.2f is %.2f\n", num.getRadius(), num.getHeight(), Area.areaCalculator(num.getRadius(), num.getHeight()));
		System.out.printf("Area has been calculated %d times", Area.areasCalculated);
		

	}//end main

}//end class
