package CIST104MidtermsCode;
import java.util.Scanner;
public class InputScannerAreaRect {
	
	public static void main (String [] args) {
	
	Scanner myScan = new Scanner (System.in);
	
	System.out.print("ENTER RECTANGLE WIDTH: ");
	double rectWidth = myScan.nextDouble();
	
	System.out.print("ENTER RECTANGLE LENGTH: ");
	double rectLength = myScan.nextDouble();
	
	double rectArea = rectWidth * rectLength;
	
	System.out.println("THE AREA OF THE RECTANGLE IS: " + rectArea + "cm²");
	
	myScan.close();

	}
}
