package CIST104MidtermsCode;
import java.util.Scanner;
public class InputScannerPractice {
	
	public static void main (String []args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("===WELCOME TO RODEN'S DELIVERY RESTOBAR===");
		
		System.out.print("Enter customer name: ");
		String custName = myScan.nextLine();
		
		System.out.print("Enter food item: ");
		String foodName = myScan.nextLine();
	
		System.out.print("Enter price per item: ");
		int price = myScan.nextInt();
		
		System.out.print("Enter quantity: ");
		int quantity = myScan.nextInt();
		
		System.out.print("Enter delivery distance (km): ");
		int distance = myScan.nextInt();
		
		System.out.print("Are you a member? (true/false): ");
		boolean isMember = myScan.nextBoolean();
		
		double subtotal = price * quantity;
		double deliverFee = 0;
		double disCount = 0;
		
		if (distance < 4) {
			deliverFee = 50;
		}
		else if (distance < 11) {
			deliverFee = 100;
		}
		else {
			deliverFee = 200;
		}
		
		if (isMember == true && subtotal >= 1000) {
			disCount = 0.10;
		}
		
		double finalDisc = subtotal * disCount;
		
		double finalPayment = (subtotal + deliverFee) - finalDisc;
		
		System.out.println("");
		
		System.out.println("---ORDER SUMMARY---");
		
		System.out.println("Customer: " + custName);
		System.out.println("Food Item: " + foodName);
		System.out.println("Quantity: " + quantity);
		System.out.println("");
		
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Deliver Fee: " + deliverFee);
		System.out.println("Discount: " + finalDisc);
		System.out.println("");
		
		System.out.println("Final Payment: " + finalPayment);
		System.out.println("");
		System.out.println("Order Succesfully placed");
		
		myScan.close();
	}

}
