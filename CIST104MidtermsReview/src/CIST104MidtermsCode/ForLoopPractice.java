package CIST104MidtermsCode;
import java.util.Scanner;
public class ForLoopPractice {
	
	public static void main (String []args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("Enter Person A: ");
		String personA = myScan.nextLine();
		
		System.out.print("Enter Person B: ");
		String personB = myScan.nextLine();
		
		System.out.print("Enter number of compatibility tests: ");
		int compT = myScan.nextInt();
		
		System.out.println("");
		
		
		double finalScore = 0;
		
		for (int i = 1; i <= compT; i++) {
			System.out.print("Test " + i + " score: ");
			double tempScore = myScan.nextDouble();
			finalScore += tempScore;
		}
		
		double average = finalScore/compT;
		String result = "";
		
		if (average > 80 && average < 100) {
			result = "Perfect Match";
		}
		else if (average < 80 && average >= 60) {
			result = "Strong Connection";
		}
		else if (average < 60 && average >= 40) {
			result = "Possible Relationship";
		}
		else if (average < 40 && average > 0) {
			result = "Friendship Level";
		}
		else {
			result = "NOT COMPATIBLE AT ALL";
		}
		
		
		
		System.out.println("");
		System.out.println("Love Compatibility Report");
		
		System.out.println("Person A: " + personA);
		System.out.println("Person B: " + personB);
		
		System.out.println("");
		
		System.out.println("Average Compatibility Score: " + average);
		System.out.println("Relationship Result: " + result);
		
		
		myScan.close();
	}

}
