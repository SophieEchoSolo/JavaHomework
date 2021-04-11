import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Ask user for a series of inputs and then create a paragraph using print statements
 */

public class WordGame {

	public static void main(String[] args) {
		//create Scanner instance
		Scanner input = new Scanner(System.in);

		//declare variables
		String name =  "name";
		int  age =  0;
		String streetName =  "Street";
		String favColor =  "Color";
		String favTeam =  "Team";
		String dreamJob =  "Job";
		String dreamVacation =  "Vacation";

		//Ask user for name
		System.out.print("Please enter your name: ");
		//Get the input
		name = input.next();
		
		//Ask user for age
		System.out.print("Please enter your age: ");
		//Get the input
		age = input.nextInt();
		
		//Ask user for street name
		System.out.print("Please enter your street name: ");
		//Get the input
		streetName = input.next();
		
		//Ask user for favorite color
		System.out.print("Please enter your favorite color: ");
		//Get the input
		favColor = input.next();
		
		//Ask user for favorite team
		System.out.print("Please enter your favorite team: ");
		//Get the input
		favTeam = input.next();
		
		//Ask user for dream job
		System.out.print("Please enter your dream job: ");
		//Get the input
		dreamJob = input.next();
		
		//Ask user for dream vacation
		System.out.print("Please enter your dream vacation destination: ");
		//Get the input
		dreamVacation = input.next();
		
		//Constructs a print statement about the user with the inputs. 
		System.out.println(name + " who is " + age + " years old, lives on " + streetName + ".");
		System.out.println("Favorite color for " + name + " is " + favColor + " and " + name + " roots for " + favTeam + ".");
		System.out.println(name + " wants to work as a(n) " + dreamJob + " but will be happier at " + dreamVacation + ".");

	}//end main

}//end class
