import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.security.SecureRandom;

public class random {

	public static void main(String[] args) {
		// Declare variables
		int p1wins = 0;
		int p2wins = 0;
		int ties = 0;
		
		//Create the SecureRandom instance
		SecureRandom rand = new SecureRandom();
		System.out.println("Player 1      Player 2      Winner");
		System.out.println("--------      --------      ------");
		
		//Looping through 50 random integers for the number game
		for( int i = 0; i < 50 ; i++) {
			//Generating random integers for players
			int p1 = rand.nextInt(9) + 1;
			int p2 = rand.nextInt(9) + 1;
			String winner = null;
			
			//comparing numbers to determine winner
			if (p1 > p2) {
				winner = "Player 1";
				p1wins++;
			}//end if
			
			else if (p2 > p1) {
				winner = "Player 2";
				p2wins++;
			}//end else if 
			
			else {
				winner = "Tied";
				ties++;
			}//end else
			
			System.out.printf("   % 2d            % 2d         %s\n",p1, p2, winner);
			
		}//end for
		
		//Printing the results of the random numbers
		System.out.println();
		System.out.println(" P1 Wins       P2 Wins       Ties");
		System.out.println("--------      --------      ------");
		System.out.printf("   % 2d            % 2d         % 2d\n",p1wins, p2wins, ties);
		
		//Create instance of PrintWriter
		try {
			PrintWriter out = new PrintWriter("output.txt");
			out.println(" P1 Wins       P2 Wins       Ties");
			out.println("--------      --------      ------");
			out.printf("   % 2d            % 2d         % 2d\n",p1wins, p2wins, ties);
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(System.getProperty("user.dir"));
		
	}//end main

}//end class
