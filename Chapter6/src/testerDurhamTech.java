import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Tester app for DurhamTech class
 */

public class testerDurhamTech {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//ask user for string
		System.out.print("Enter student's name: ");
		//Get the input
		String name = input.next();
		
		//ask user for number - integer
		System.out.print("Enter student user ID number: ");
		//Get the input
		int num = input.nextInt();
		
		//ask user for number - integer
		System.out.print("Enter credits received: ");
		//Get the input
		double credits = input.nextDouble();
		
		//ask user for number - integer
		System.out.print("Enter credits hours: ");
		//Get the input
		double hours = input.nextDouble();
		
		DurhamTech dtcc = new DurhamTech(name, num, credits, hours);
		
		//display inputs on the screen for user
		System.out.println("Student Name: " + dtcc.getName());
		System.out.println("Student ID: " + dtcc.getNum());
		System.out.println("Credits Received: " + dtcc.getCredits());
		System.out.println("Credit Hours: " + dtcc.getHours());
		
		//call calcGPA method from DurhamTech class
		dtcc.calcGPA(credits, hours);
		System.out.printf("%s, with student number %5d has a GPA of %.2f", name, num, credits/hours);
		
		input.close();

	}//end main

}//end class
