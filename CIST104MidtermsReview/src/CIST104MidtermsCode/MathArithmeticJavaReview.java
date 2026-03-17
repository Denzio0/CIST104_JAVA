package CIST104MidtermsCode;
import java.util.Scanner;
public class MathArithmeticJavaReview {
	
	public static void main (String [] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("ENTER VALUE FOR X: ");
		double num1 = myScan.nextInt();
		
		System.out.print("ENTER VALUE FOR Y: ");
		double num2 = myScan.nextInt();
		
		myScan.nextLine();
		
		System.out.print("ENTER OPERATOR (+, -, *, /, %):");
		String operator = myScan.nextLine();
		
		if (operator.equals("+")) {
			System.out.println(num1 + num2);
		}
		else if (operator.equals("-")) {
			System.out.println(num1 - num2);
		}
		else if (operator.equals("*")) {
			System.out.println(num1 * num2);
		}
		else if (operator.equals("/")) {
			System.out.println(num1 / num2);
		}
		else if (operator.equals("%")) {
			System.out.println(num1 % num2);
		}
		else {
			System.out.println("INVALID PERATOR");
		}
		
		myScan.close();
		
	}

}
