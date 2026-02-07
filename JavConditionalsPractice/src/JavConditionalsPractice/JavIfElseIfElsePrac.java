package JavConditionalsPractice;
import java.util.Scanner;
public class JavIfElseIfElsePrac {

	public static void main(String[] args) {
	
		/* IF ELSE IF ELSE STATEMENT WITH NESTED CONDITIONALS */ 
		long drunkNess;
		Scanner drunk = new Scanner(System.in);
		
		System.out.print("ENTER DRUNKNESS LEVEL: ");
		drunkNess = drunk.nextLong();
		
		
		if(drunkNess >= 100) {
			if (drunkNess < 200)
			System.out.print("YOU ARE NOT ALLOWED TO DRIVE!");
		}
		
		else if (drunkNess >= 50) {
			if (drunkNess < 100)
			System.out.print("IT IS UNSAFE FOR YOUR TO DRIVE! ");
			
		}
		
		else {
			System.out.print("YOU ARE ALLOWED TO DRIVE! DRIVE SAFE!");
			
		}
		
	}

}
