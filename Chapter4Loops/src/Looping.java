import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Example of using scanner for user input
 */

public class Looping {

	public static void main(String[] args) {
		//Initiate a scanner instance
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int loops = 0;
		int factor = 0;
		
		//ask user for number - integer
		System.out.print("Enter a multiplication factor greater than or equal to 1:");
		//Get the input
		factor = input.nextInt();
		if (factor <= 0) {
			System.out.print("Number must be greater than or equal to 1");
		}//end if
		else {
			//ask user for number - integer
			System.out.println("Enter the number times you want this to loop. Must be greater than or equal to 1:");
			//Get the input
			loops = input.nextInt();
			if (loops <= 0) {
				System.out.println("Number must be greater than or equal to 1");
			}//end if
			else {
				//Create loop from 1 to loops
				System.out.println("Loops       Factor");
				System.out.println("-----       ------");

				for( int start = 1; start <= loops; start++) {
					factor = factor * start;
					System.out.printf("% 5d     % 5d\n",start, factor);
					}//end loop
				}//end else
		}//end else
		input.close();
	}//end main

}//end class
