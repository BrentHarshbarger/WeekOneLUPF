
public class GradeAvg {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Week One Lab Exercise 2
		//Brent Harshbarger
		
		//quiz Scores
		double quizScore1 = 88;
		double quizScore2 = 99;
		double quizScore3 = 78;
		
		//test Scores
		double testScore1 = 89;
		double testScore2 = 92;
		
		//quiz score and test score average variables
		double quizScoreAve; 
		double testScoreAve;
		
		//Calculate average for quiz and test scores
		quizScoreAve = ((quizScore1 + quizScore2 + quizScore3)/3);
		testScoreAve = ((testScore1 + testScore2)/2);
		
		//Print average scores to screen
		System.out.println("The quiz average is " + quizScoreAve);
		System.out.println("The test average is " + testScoreAve);
	}

}
