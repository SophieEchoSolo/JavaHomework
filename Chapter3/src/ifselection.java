import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Example of using scanner for user input
 */

public class ifselection {

	public static void main(String[] args) {
		// create an instance of the Scanner object
		// Always use when getting input from user
		Scanner input = new Scanner(System.in);

		//declare variable
		int num = 0;
		
		//ask user for number - integer
		System.out.print("Enter an integer between 1-10 and I will return the text form of that number");
		//Get the input
		num = input.nextInt();
		
		//Check for numbers outside range then print out the correct number
		if (num < 1 | num > 10) {
			System.out.print("Please enter an integer between 1 and 10");
			}//end if
		else if (num == 1) {
			System.out.print("one");
			}//end else if
		else if (num == 2) {
			System.out.print("two");
			}//end else if
		else if (num == 3) {
			System.out.print("three");
			}//end else if
		else if (num == 4) {
			System.out.print("four");
			}//end else if
		else if (num == 5) {
			System.out.print("five");
			}//end else if
		else if (num == 6) {
			System.out.print("six");
			}//end else if
		else if (num == 7) {
			System.out.print("seven");
			}//end else if
		else if (num == 8) {
			System.out.print("eight");
			}//end else if
		else if (num == 9) {
			System.out.print("nine");
			}//end else if
		else {
			System.out.print("ten");
			}//end else

	}//end main

}//end class
