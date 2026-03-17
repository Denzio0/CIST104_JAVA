package CIST104MidtermsCode;
import java.util.Scanner;
public class AdvCircularTrankAnalyzer {
	
	public static void main (String [] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		String runCompete;
		String perfLevel;
		
		System.out.print("Enter runner name: ");
		String runName = myScan.nextLine();
		
		System.out.print("Enter track radius (meters): ");
		double radius = myScan.nextDouble();
		
		System.out.print("Enter number of laps completed: ");
		int laps = myScan.nextInt();
		
		System.out.print("Enter running time (minutes): ");
		double minutes = myScan.nextDouble();
		
		System.out.print("Are you training for a competition? (true/false): ");
		boolean isCompete = myScan.nextBoolean();
		
		double trackCirc = 2 * Math.PI * radius;
		double totalDistance = trackCirc * laps;
		double speed = totalDistance/minutes;
		
		if (speed < 80) {
			perfLevel = "Beginner level";
		}
		else if (speed < 120) {
			perfLevel = "Moderate performance";
		}
		else if (speed >= 120) {
			perfLevel = "High performance runner";
		}
		else {
			perfLevel = "INVALID SPEED PLS TRY AGAIN!";
		}
		
		if (isCompete && totalDistance > 5000) {
			runCompete = "Competition training goal achieved";
		}
		else {
			runCompete = "Keep training to reach competition level";
		}
		
		System.out.println("");
		
		System.out.println("----- RUNNING ANALYSIS -----");
		
		System.out.println("Runner: " + runName);
		System.out.println("Track Radius: " + radius + " meters");
		
		System.out.println("");
		
		System.out.printf("Track Circumference: %.2f meters\n", trackCirc);
		System.out.printf("Total Distance Covered: %.2f meters\n " , totalDistance);
		System.out.printf("Average Speed: %.2f meters per minute\n ", speed);
		
		System.out.println("");
		
		System.out.println("Performance Level: " + perfLevel);
		System.out.println(runCompete);
		
		myScan.close();
		
	}

}
