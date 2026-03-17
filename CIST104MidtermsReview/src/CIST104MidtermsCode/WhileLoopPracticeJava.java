package CIST104MidtermsCode;
import java.util.Scanner;
public class WhileLoopPracticeJava {
	
	public static void main (String [] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("Enter sorcerer name: ");
		String sorName = myScan.nextLine().toUpperCase();
		
		System.out.print("Enter training goal (rounds): ");
		int train = myScan.nextInt();
		
		int finalSession = 0;
		
		
		while(finalSession < train) {
			System.out.print("Enter rounds completed in this session:");
			int session = myScan.nextInt();
			finalSession += session;
			System.out.println("Total rounds completed: " + finalSession);
		}
		
		System.out.println("Training complete");
		
		System.out.println("");
		
		System.out.println("Sorcerer: " + sorName);
		System.out.println("Total Rounds Completed: " + finalSession);
		
		System.out.println("");
		
		System.out.println("Training complete. Sorcerer has improved their cursed energy control.");
		myScan.close();		
		
	}

}
