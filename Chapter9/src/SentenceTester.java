import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Sentences and strings homework
 */

public class SentenceTester {

	public static void main(String[] args) {
		//initialize scanner
		Scanner input = new Scanner(System.in);
		
		//get sentence input from user
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		Sentence sent = new Sentence(sentence);
		
		//create menu for user
		System.out.println("1. Count the number of vowels in the sentence");
		System.out.println("2. Count the number of T's in the sentence");
		System.out.println("3. Display every other word in the sentence");
		System.out.println("4. Display a replaced word in the sentence");
		System.out.println("5. Exit the program");
		System.out.println(" ");
		
		int selection = 0;
		//creates loop to continuously ask for user selection until they exit the program
		while (selection != 5) {
			System.out.println("Selection :");
			
			//grab menu selection from user
			selection = input.nextInt();
			if (selection == 1) {
				sent.countVowels(sentence);
			}
			else if (selection == 2) {
				sent.countLetters(sentence);
			}
			else if (selection == 3) {
				sent.displayOtherWord(sentence);
			}
			else if (selection == 4) {
				sent.displayReplacedWord(sentence);
			}
			else if (selection == 5) {
				break;
			}
			//in case user enters an incorrect number or input 
			else {
				System.out.println("Please enter a valid selection of 1-5: ");
			}
		}
		input.close();
	}//end main

}//end class
