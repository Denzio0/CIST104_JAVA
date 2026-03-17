package CIST104MidtermsCode;
import java.util.Scanner;
public class UserInputJavaReview {
	
	public static void main (String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("ENTER DIFFICULTY NUMBER: ");
		int difficulty = myScan.nextInt();
		myScan.nextLine(); //clears the input buffer
		
		System.out.print("INPUT PLAYABLE CHARACTER: ");
		String playChar = myScan.nextLine();
		
		System.out.print("INPUT MIND STATE: ");
		int mindState = myScan.nextInt();
		
		System.out.print("INPUT STAMINA IN DECIMALS: ");
		double stamina = myScan.nextDouble();
		
		System.out.print("IS THE PLAYABLE CHARACTER VALID (true/false): ");
		boolean isValid = myScan.nextBoolean();
		
		System.out.println("");
		
		System.out.println("DIFFICULTY LEVEL IS: ");
		System.out.println("YOU HAVE CHOSE THE CHARACTER: " + playChar);
		System.out.println("THE CURRECT MIND STATE LEVEL IS: " + mindState);
		System.out.println("THE CURRENT DECIMAL STAMINA IS: " + stamina);
		
		if (isValid) {
			System.out.println("THE CHARACTER IS VALID");
		}
		
		else {
			System.out.println("THE CHARACTER IS NOT VALID");
			
		}
		
		myScan.close();
		
	}
	

}
