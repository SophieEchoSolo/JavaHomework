import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Calculate the percentage of dogs and cats in a shelter
 */

public class Percentage {

	public static void main(String[] args) {
		//create Scanner instance
		Scanner input = new Scanner(System.in);

		//declare variables
		float dogs = 0;
		float cats = 0;
		float total = 0;
		float percentCats = 0;
		float percentDogs =0;

		//Ask user for number of cats
		System.out.print("Please enter the number of cats: ");
		//Get the input
		cats = input.nextInt();

		//Ask user for number of dogs
		System.out.print("Please enter the number of dogs: ");
		//Get the input
		dogs = input.nextInt();
		
		//Calculate the total number of animals
		total = cats + dogs;
		
		//Calculate the percentages
		percentCats = cats / total * 100;
		percentDogs = dogs / total * 100;
		
		//Print out the information to the user
		System.out.println("There are a total of " + total + " animals in the shelter");
		System.out.println("Cats make up " + percentCats + "%");
		System.out.println("Dogs make up " + percentDogs + "%");
		
		
	}//end main

}//end class
