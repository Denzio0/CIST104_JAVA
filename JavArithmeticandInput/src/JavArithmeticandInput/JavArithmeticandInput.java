package JavArithmeticandInput;
import java.util.Scanner;

public class JavArithmeticandInput {

	public static void main(String[] args) {

	String z;
	Scanner lalagyan = new Scanner(System.in);
	
	System.out.print("ENTER DEN THE SHIKII: ");
	z= lalagyan.nextLine();
	
	System.out.println("IN GAME NAME: " + z);
	
	int num;
	Scanner num_Input = new Scanner(System.in);
	
	System.out.print("ENTER A NUMBER: ");
	num = num_Input.nextInt();

	System.out.println("YOUR CHOSEN NUMBER IS: " + num);
	
	float gwa;
	Scanner grade = new Scanner(System.in);
	
	System.out.println("ENTER YOUR GWA: ");
	gwa = grade.nextFloat();
	
	System.out.println("YOUR GWA IS: " + gwa);
		
	int u = 88;
	int p = 2;
	
	int g = 20;
	int h = 5;
	
	System.out.println(u + p);
	System.out.println(u - p);
	System.out.println(u * p);
	System.out.println(u / p);
	System.out.println(u % p);
	
	System.out.println((g/h) + "r." + (g%h));
	g++;
	System.out.println(g);
	h--;
	System.out.println(h);
	
	
	/*ONE FUNCTION CALCULATOR*/
	
		int num1;
		Scanner firstNum = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER: ");
		
		num1 = firstNum.nextInt();
		
		
		int num2;
		Scanner secNum = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER: ");
		
		num2 = secNum.nextInt();
		
		System.out.println("Num 1 is: " + num1);
		System.out.println("Num 2 is: " + num2);
		
		System.out.println("ADDITION RESULT: " + (num1 + num2));
		System.out.println("SUBTRACTION RESULT: " + (num1 - num2));
		System.out.println("MULTIPLICATION RESULTS: " + (num1 * num2));
		System.out.println("DIVISION RESULTS: " + (num1 / num2) + "r." + (num1%num2));
		
	}

}
