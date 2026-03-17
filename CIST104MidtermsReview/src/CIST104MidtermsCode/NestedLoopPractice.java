package CIST104MidtermsCode;
import java.util.Scanner;
public class NestedLoopPractice {
	public static void main (String [] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("ENTER NUMBER OF ROWS: ");
		int rows = myScan.nextInt();
		
		for (int i = 0; i < rows; i++) {
			System.out.print("*");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
		
		myScan.close();
		
		
	}
	
	

}
