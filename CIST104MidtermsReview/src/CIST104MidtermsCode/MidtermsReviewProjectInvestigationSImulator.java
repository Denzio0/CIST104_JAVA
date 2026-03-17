package CIST104MidtermsCode;
import java.util.*;
public class MidtermsReviewProjectInvestigationSImulator { 

	public static void main (String []args) throws InterruptedException {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("Investigator: ");
		String investName = myScan.nextLine();
		
		System.out.print("Number of suspects: ");
		int numSuspects = myScan.nextInt();
		
		myScan.nextLine();
	
		double finalScore = 0;

		final double dangerThreshold = 75.0;
		
		for (int i = 0; i < numSuspects; i++) {
			System.out.println();
			System.out.print("Suspect name: ");
			String susName = myScan.nextLine().toUpperCase();
			int nameLength = susName.length();
			
			System.out.print("Age: ");
			int susAge = myScan.nextInt();
			
			System.out.print("Initial suspicion score: ");
			double susScore = myScan.nextDouble();
			
			System.out.print("Criminal record: ");
			boolean isCriminal = myScan.nextBoolean();
			
			System.out.print("Choose action: ");
			int action = myScan.nextInt();
			
			if (nameLength > 10) {
				susScore += 5;
			}
			
			if (susAge  < 18) {
				susScore -=10;
			}
			
			if (isCriminal) {
				susScore +=20;
			}
			
			finalScore = susScore;
		
		String investStatus ="";
		
		if (finalScore >= 90) {
			investStatus = "Immediate Investigation";
		}
		else if (finalScore > dangerThreshold) {
			investStatus = "High Priority";
		}
		else if (finalScore < 75 && finalScore > 49) {
			investStatus = "Moderate Suspicion";
		}
		else if (finalScore < 50 && finalScore > 0) {
			investStatus = "Low Suspicion";
		}
		
		String chosen ="";
		
		switch (action) {
		case (1): chosen = "Surveillance";
		break;
		case (2): chosen = "Interrogation";
		break;
		case (3): chosen = "Background Check";
		break;
		case (4): chosen = "Close Case";
		break;
		default: chosen = "THAT IS NOT A VALID CHOICE";
		break;
		}
		
		System.out.println("INVESTIGATION REPORT");
		System.out.println();
		System.out.println("Investigator: " + investName);
		System.out.println("Suspect: " + susName);
		System.out.println("Name Length: " + nameLength);
		System.out.println();
		System.out.println("Final Suspicion Score: " + susScore);
		System.out.println("Status: " + investStatus);
		System.out.println("Final Suspicion Score: " + finalScore);
		System.out.println("Selected Action: " + chosen);
		
		if (investStatus.toLowerCase().equals("high priority")) {
			for (int z = 0; z < 3; z++) {
				System.out.println("Tracking suspect...");
			}
		}
		
		}
		
		myScan.close();
		
	}
	
	
}
