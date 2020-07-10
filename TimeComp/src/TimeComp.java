import java.util.Scanner;
public class TimeComp {

	public static void main(String[] args) {
		// Lewis University Programming Fundamentals Week One Lab
		// Brent Harshbarger
		
		//This program takes request a number that represents a total number of seconds. 
		//It will then be converted into Hours, Minutes, and Seconds with the results printed to the computer screen.
		
		//Assignment of memory location for user input number that will be converted
		int inSeconds;
		
		//Print user input to screen and input value to be assigned to inSeconds
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide a number of seconds to be converted into Hours, Minutes, Seconds: ");
		inSeconds = scan.nextInt();
	
		//Calculates seconds
		int forMin = inSeconds/60;
		int seconds = inSeconds%60;
		
		//Calculates minutes
		int forHours = forMin/60;
		int minutes = forMin%60;
		
		//Calculates hours
		int hours = forMin/60;
		
		//Prints computations to screen		
		System.out.println(hours + " Hours " + minutes + " Minutes " + seconds +" Seconds." );		

	}

}
