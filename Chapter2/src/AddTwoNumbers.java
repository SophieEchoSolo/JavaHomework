import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Example of using scanner for user input
 */

public class AddTwoNumbers {

	public static void main(String[] args) {
		// create an instance of the Scanner object
		// Always use when getting input from user
		Scanner input = new Scanner(System.in);

		//declare variable
		int number1 = 0;
		int number2 = 0;
		int sum = 0;

		//ask user for first number - integer
		System.out.print("Enter the first integer: ");
		//Get the input
		number1 = input.nextInt();

		//ask user for second number - integer
		System.out.print("Enter the second integer: ");
		//Get the input
		number2 = input.nextInt();
		
		//processing
		sum = number1 + number2;
		
		//display the answer
		System.out.print("The sum is: " + sum);


	} //end main

}//end class
