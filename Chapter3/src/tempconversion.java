import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Example of using scanner for user input
 */
public class tempconversion {

	public static void main(String[] args) {
		//start scanner instance
		Scanner input = new Scanner(System.in);
		
		//declare variables
		Double temp = null;
		String unit = null;	
		Double converted = null;
		
		//ask user for number - double
		System.out.println("Enter a temperature in Fahrenheit");
		//Get the input
		temp = input.nextDouble();
		
		//ask user for a string
		System.out.println("Would you like this converted to Kelvin or Celcius");
		//get the input
		unit = input.next();
		
		//Compare strings to determine conversion formula
		if (unit.equalsIgnoreCase("kelvin")) {
			converted = (temp - 32) * .5556 + 273.15;
		}//end if
		else if (unit.equalsIgnoreCase("celcius")) {
			converted = (temp - 32) * .5556;
		}// end else if 
		else {
			System.out.println("Error: please enter Celcius or Kelvin");
		}//end else
		
		//print the results
		System.out.printf("Your input converts to %.2d " + unit, converted);
				

	}//end main

}//end class
