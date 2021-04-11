import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Grades multiple array homework assignment
 */
public class GradesArrayHw {

	public static void main(String[] args) {
		
		//Initialize variables
		double scores[][] = new double[5][5];
		Scanner input = new Scanner(System.in);
		int i = 0;
		
		//While loop to gather user inputs for test scores
		while (i < 26){
			System.out.println("Please enter student number(1-5) or -1 to quit and view data: ");
			int student = input.nextInt();
			//Checks for input to break out of the loop
			if (student == -1) {
				break;
			}
			else {
				//Gets user inputs for the tests and scores
				System.out.println("Please test number(1-5): ");
				int test = input.nextInt();
				System.out.println("Please enter test score: ");
				double testScore = input.nextDouble();
				//logic to enter test score to the appropriate position in the array
				scores[student-1][test-1] = testScore;
			}	
			i++;			
		}//end while loop
		
		//Creates headers for table for cleaner output	
		System.out.println("Student    Test 1    Test 2    Test 3   Test 4   Test 5    Avg");
		System.out.println("_______________________________________________________________");
		//for loops to loop through table
		for (int row = 0; row < scores.length; row++) {
			//declare variables for the loop
			double total = 0;
			System.out.printf("Student %d:   ", row + 1);
			//for loop that moves through the columns
			for (int col = 0; col < scores[row].length; col++) {
				System.out.printf("%.1f      ", scores[row][col]);
				total += scores[row][col];				
			}//end inner for
			//calculates averages for each row
			System.out.printf("%.1f", total / scores[row].length);
			System.out.println("\n");
		}//end outer for
		
		//close scanner		
		input.close();
	}//end main

}//end class
