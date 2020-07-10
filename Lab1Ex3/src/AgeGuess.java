import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Week One Lab
		//Brent Harshbarger
				
		//Define variables for inputs
		String name;
		int ageGuess;
		
		Scanner scan = new Scanner(System.in);
		
		//Get name from user and assign to name variable		
		System.out.println("What is your name? ");
		name = scan.nextLine();
		
		//Get age from user and assign to ageGuess variable
		System.out.println("What is your age? ");
		ageGuess = scan.nextInt();
		
		System.out.println("Your name is " + name + " and your age is " + ageGuess + "."); 
		

	}

}
