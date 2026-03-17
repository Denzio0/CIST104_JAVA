package CIST104MidtermsCode;
import java.util.Scanner;
public class MathClassReviewJava {
	
	public static void main (String [] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		// double Pi = Math.PI;
		// double e = Math.E;
		// double pow = Math.pow(5, 2);
		// double max = Math.max(100, 90);
		// double min = Math.min(100, 90);
		// double sq = Math.sqrt(121);
		// double up = Math.ceil(4.12);
		// double down = Math.floor(4.12);
		
		System.out.print("ENTER VALUE FOR A: ");
		double a = myScan.nextDouble();
		
		System.out.print("ENTER VALUE FOR B: ");
		double b = myScan.nextDouble();
		
		double c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
		
		System.out.print("THE HYPOTENUSE IS: " + c + "cm");
		
		
		myScan.close();
	
		
		
	}

}
