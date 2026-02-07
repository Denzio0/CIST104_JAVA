package JavConditionalsPractice;
import java.util.Scanner;
public class JavIfElsePRac {

	public static void main(String[] args) {
		
		/*IF ELSE*/

		int powerLevel;
		Scanner level = new Scanner(System.in);
		
		System.out.print("ENTER POWER LEVEL: ");
		powerLevel = level.nextInt();
		
		if (powerLevel >= 10) {
			System.out.println("YOU ARE A POWERFUL BEING");
			
		}
		
		else {
			System.out.println("PRACTICE MORE!");
		}
		
		
		int gradeLevel;
		Scanner grade = new Scanner(System.in);
		
		System.out.print("ENTER GRADE LEVEL: ");
		gradeLevel = grade.nextInt();
		
		if (gradeLevel == 6) {
			System.out.print("YOUR ARE ALLOWED TO ENTER THE CAMPUS");
	
		}
		else {
			System.out.print("YOU ARE NOT ALLOWED TO ENTER THE CAMPUS! ");
			
		}
		
	}

}
