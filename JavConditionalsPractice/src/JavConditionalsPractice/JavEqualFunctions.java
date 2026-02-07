package JavConditionalsPractice;
import java.util.Scanner;
public class JavEqualFunctions {

	public static void main(String[] args) {

		String love;
		Scanner l = new Scanner(System.in);
		
		System.out.print("ENTER THE WORD: ");
		love = l.nextLine();
		
		if (love.equalsIgnoreCase("I LOVE YOU"));/*READS THE CONTENT INSTEAD OF THE MEMORY*/ {
			System.out.println("I LOVE YOU TOO");
			
		}
		
	}

}
