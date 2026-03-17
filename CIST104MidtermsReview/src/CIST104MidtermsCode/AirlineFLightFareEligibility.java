package CIST104MidtermsCode;
import java.util.Scanner;
public class AirlineFLightFareEligibility {
	public static void main (String [] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("Enter passenger name: ");
		String passName = myScan.nextLine();
		
		System.out.print("Enter age: ");
		int age = myScan.nextInt();
		
		myScan.nextLine();
		
		System.out.print("Enter ticket class (Economy/Business/First): ");
		String tickClass = myScan.nextLine();
		
		System.out.print("Enter base ticket price: ");
		double tickPrice = myScan.nextDouble();
		
		System.out.print("Enter number of checked bags: ");
		int checkBags = myScan.nextInt();
		
		System.out.print("Enter total baggage weight (kg): ");
		double bagWeight = myScan.nextDouble();
		
		System.out.print("Frequent flyer member? (true/false):  ");
		boolean isFlyer = myScan.nextBoolean();
		
		System.out.print("Arrival time before departure (minutes): ");
		int timeArrive = myScan.nextInt();
		
		System.out.print("Does passenger have prohibited items? (true/false): ");
		boolean isProhibited = myScan.nextBoolean();
		
		if (timeArrive > 30 || isProhibited || bagWeight > 50) {
			System.out.print("BOARDING DENIED");
		}
		
		else {
		
			double bagFee = 0;
			
			if (checkBags < 2) {
			
				if (tickClass.equals("Economy")) {
					checkBags -=1 ;
					bagFee = checkBags * 500;
				}
				else if (tickClass.equals("Business")) {
					checkBags -=2 ;
					bagFee = checkBags * 400;
				}
				else if (tickClass.equals("First")) {
					checkBags -=3 ;
					bagFee = checkBags * 300;
					
					}
			
				else {
					System.out.println("NO DISCOUNT SINCE YOU HAVE NO BAGS");
					
				}
				
			}
			else {
				System.out.println("INVALID TICKET CLASS INPUT! PLEASE TRY AGAIN!");
			}
			
			double excessFee = 0;
			
			if (bagWeight > 30) {
				excessFee = 200 * (bagWeight - 30);
			}
			
			double flyDisc = 0;
			
			if (isFlyer && tickPrice >= 10000) {
				flyDisc = 0.08 * tickPrice;
			}
			
			double finalTicket = tickPrice + bagFee + excessFee - (flyDisc);
			
			System.out.println("");
			
			System.out.println("----- FLIGHT CHECK SUMMARY -----");
			
			System.out.println("");
			
			System.out.println("Passenger: " + passName);
			System.out.println("Class: " + tickClass);
			
			System.out.println("");
			
			System.out.println("Base Ticket Price: " + tickPrice);
			System.out.println("Baggage Fee: "+ bagFee);
			System.out.println("Excess Weight Fee: " + excessFee);
			System.out.println("Discount: " + flyDisc);
			
			System.out.println("");
			
			System.out.println("Final Ticket Cost: " + finalTicket);
			
			System.out.println("");
			
			System.out.println("Boarding Status: CLEARED FOR BOARDING");
			
			myScan.close();
			
		}
	}
	
}
