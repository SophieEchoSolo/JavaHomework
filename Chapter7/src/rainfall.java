import java.util.Scanner;

/*
 * Sophie Solo
 * CSC-151
 * Rainfall array homework assignment
 */

public class rainfall {

	public static void main(String[] args) {
		//defining variable
		double[] rainfall = new double[7];
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		//initiate scanner
		Scanner input = new Scanner(System.in);
		
		//for loop to prompt and get rain amounts
		for (int i=0; i < rainfall.length; i++) {
			System.out.println("Enter rain amount for " + days[i] + ": ");
			rainfall[i] = input.nextDouble();
		} //end for
		
		//call functions
		rainfallAverage(rainfall);		
		highestRainfall(rainfall, days);		
		lowestRainfall(rainfall, days);
		
	} //end main
	
	//function to determine average rainfall for the week	
	public static void rainfallAverage(double[] rainfall) {
		double total = 0;
		for (int i = 0; i < rainfall.length; i++) {
			total += rainfall[i];
		}//end for
		//determine the average and print the results
		double avg = total / rainfall.length;
		System.out.printf("Average rainfall for the week is %.1f\n", avg);
	} //end rainfallAverage
	
	//function to determine highest rainfall in the array	
	public static void highestRainfall(double[] rainfall, String[] days) {
		
		double highest = 0;
		int highestDay = 0;
		//determine the highest and print the results
		for (int i = 0; i < rainfall.length; i++) {
			
			if (rainfall[i]>highest) {
				highest = rainfall[i];
				highestDay = i;
			}//end if
			
		}//end for
		System.out.printf("Highest rainfall for the week was on %s\n", days[highestDay]);
		
	}//end highestRainfall
	
	//function to determine lowest rainfall in the array
	public static void lowestRainfall(double[] rainfall, String[] days) {
		
		double lowest = 100;
		int lowestDay = 0;
		//determine the lowest and print the results
		for (int i = 0; i < rainfall.length; i++) {
			
			if (rainfall[i]<lowest) {
				lowest = rainfall[i];
				lowestDay = i;
			}//end if
			
		}//end for
		
		System.out.printf("Lowest rainfall for the week was on %s\n", days[lowestDay]);
		
	}//end lowestRainfall

} //end class
