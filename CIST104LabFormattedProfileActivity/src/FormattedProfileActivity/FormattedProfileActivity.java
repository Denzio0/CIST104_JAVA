//FAMERO, MARC RODEN D. BSIT 1-3
//INTERMEDIATE PROGRAMMING (CIST104 LAB)
package FormattedProfileActivity;
import java.util.Scanner;
public class FormattedProfileActivity {

	    public static void main(String[] args) {
	        System.out.println("==== FORMATTED PROFILE ====");

	        final String schoolNAME = "WELCOME TO BARANGAY PLM!";
	        System.out.println(schoolNAME);

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("ENTER YOUR FIRST NAME: ");
	        String firstName = scanner.nextLine();

	        System.out.print("ENTER YOUR SURNAME: ");
	        String surName = scanner.nextLine();

	        System.out.print("ENTER YOUR AGE: ");
	        int agePer = Integer.parseInt(scanner.nextLine());

	        System.out.print("ENTER YOUR STUDENT NUMBER:");
	        long studNum = Long.parseLong(scanner.nextLine());
	        
	        System.out.print("ENTER YOUR COURSE: ");
	        String courseStud = scanner.nextLine();
	       
	        System.out.println("====================================");
	        
	        System.out.println("THIS IS YOUR PROFILE INFO");
	        System.out.println("HELLO! " + firstName + " " + surName);
	        System.out.println("YOUR AGE IS: " + agePer);
	        System.out.println("YOUR STUDENT NUMBER IS: " + studNum);
	        System.out.println("YOUR COURSE IS: " + courseStud);

	        scanner.close(); // close scanner
	    }
	}