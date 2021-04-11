/*
 * Sophie Solo
 * CSC-151
 * Asks a user to enter a data for a student
 */

public class DurhamTech {
	
	//fields
	private String studentName;
	private int studentNum;
	private double creditsReceived;
	private double creditHours;
	
	//constructor
	//special methods used to initialize fields
	public DurhamTech(String name, int num, double credits, double hours) {
		studentName = name;
		studentNum = num;
		creditsReceived = credits;
		creditHours = hours;
	}//end constructor
	
	//setters and getters
	public void setName(String name) {
		studentName = name;
	}
	public String getName() {
		return studentName;
	}	
	public void setNum(int num) {
		studentNum = num;
	}
	public int getNum() {
		return studentNum;
	}
	public void setCredits(double credits) {
		creditsReceived = credits;
	}
	public double getCredits() {
		return creditsReceived;
	}
	public void setHours(double hours) {
		creditHours = hours;
	}
	public double getHours() {
		return creditHours;
	}
	
	//Calculation method
	public double calcGPA(double creditsReceived, double creditHours) {
		return creditsReceived/creditHours;
	}//end calculation method
	
}//end class
