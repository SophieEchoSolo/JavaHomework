import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Sentences and strings homework
 */

public class Sentence {
	Scanner input = new Scanner(System.in);
	
	private String sentence;
	
	public Sentence(String str) {
		sentence = str;
	}
	
	//setters and getters
	public void setName(String str) {
		sentence = str;
	}
	public String getName() {
		return sentence;
	}	
	
	public void countVowels(String sentence){
		//initialize variables
		int vowels = 0;
		//convert string to all lower case for comparing
		String sentLower = sentence.toLowerCase();
		//for loop to move through the string one letter at a time
		for (int i = 0; i < sentLower.length(); ++i) {
			//assigns each letter to a variable for if statement
			char ch = sentLower.charAt(i);
		
		  // check if character is any of a, e, i, o, u
		  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		    ++vowels;
		  }//end if
		}//end for
		
		System.out.printf("Vowels: %d \n", vowels);
		
	}//end countVowels
	
	public void countLetters(String sentence){
		//initialize variables
		int numT = 0;
		//convert string to all lower case for comparing
		String sentLower = sentence.toLowerCase();
		//for loop to move through the string one letter at a time
		for (int i = 0; i < sentLower.length(); ++i) {
			//assigns each letter to a variable for if statement
			char ch = sentLower.charAt(i);
			// check if character is a T
			if (ch == 't') {
				++numT;
			}//end if
		}//end for
		
		System.out.printf("Number of T's: %d \n", numT);
		
	}//end countLetters
	
	public void displayOtherWord(String sentence){
		//initialize variables
		String[] strArray;
		
		//Split the string on spaces to separate the words
		strArray = sentence.split(" ");
		
		//for loop to move through the array 	
		for (int i = 0; i < strArray.length; ++i) {
			//checks for odd numbers
			if ((i+1)%2 != 0) {
				//prints the odd numbered indexes 
				System.out.print(strArray[i] + " ");
			}//end if
			else {
				//if the number is even the code skips
				continue;
			}//end else
		}//end for
		
		System.out.println();
	}//end displayOtherWord

	public void displayReplacedWord(String sentence){
		//initialize variables
		StringBuilder sb = new StringBuilder();
		
		//Split the string on spaces to separate the words
		sb.append(sentence);
		
		//asks user for word to replace
		System.out.println("Word to replace: ");
		String repWord = input.nextLine();
		
		//asks user for the replacement word
		System.out.println("Replacement word: ");
		String newWord = input.nextLine();
		
		//replaces the word using the indexes needed
		int repIndex = sb.indexOf(repWord);
		sb.replace(repIndex, repIndex+repWord.length(), newWord + " ");
		
		System.out.println("New sentence: " + sb);
		
	}//end displayReplacedWord


}//end class
