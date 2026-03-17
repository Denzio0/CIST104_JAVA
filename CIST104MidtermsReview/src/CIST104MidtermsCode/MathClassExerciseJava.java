package CIST104MidtermsCode;
import java.util.Scanner;
public class MathClassExerciseJava {
	
	public static void main (String [] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("CIRCLE COMPONENTS CALCULATOR");
		
		System.out.print("ENTER THE RADIUS OF THE CIRCLE: ");
		double radius = myScan.nextDouble();
		
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		
		System.out.println("");
		
		System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS: " + circumference + "cm");
		System.out.println("THE AREA OF THE CIRCLE IS: " + area + "cm²");
		System.out.println("THE VOLUME OF THE CIRCLE IS: " + volume + "cm³");
		
		myScan.close();
	}

}
