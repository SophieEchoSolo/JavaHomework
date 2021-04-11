import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Converting feet into different measurement units
 */

public class ConvertFeet {

	public static void main(String[] args) {
		//initiate scanner instance
		Scanner input = new Scanner(System.in);
		
		//ask user for number - integer
		System.out.print("Enter a number in feet and I will convert to inches, kilometers, and miles: ");
		//Get the input
		int numFeet = input.nextInt();
		
		//Calls the created method to convert user input into inches 		
		double answer = convertToInches(numFeet);
		System.out.printf("Feet to inches: %.2f ", answer);
		System.out.println();
		
		//Calls the created method to convert user input into Kilometers 	
		double answer2 = convertToKilometers(numFeet);
		System.out.printf("Feet to Kilometers: %.2f ", answer2);
		System.out.println();
		
		//Calls the created method to convert user input into Miles 	
		double answer3 = convertToMiles(numFeet);
		System.out.printf("Feet to Miles: %.2f ", answer3);
		System.out.println();
		

	} //end main
	
	//creates method to convert user input into inches
	public static double convertToInches(double numFeet) {
		
		double answer = numFeet*12.0;
		return answer;
	}//end convertToInches

	//creates method to convert user input into kilometers
	public static double convertToKilometers(double numFeet) {
		
		double answer = numFeet/3281;
		return answer;
	}//end convertToKilometers

	//creates method to convert user input into Miles
	public static double convertToMiles(double numFeet) {
		
		double answer = numFeet/5280;
		return answer;
	}//end convertToMiles


}//end class
