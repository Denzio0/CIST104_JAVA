// MARC RODEN D. FAMERO BSIT 1-3
// JAVA LABORATORY PRACTICE
// PROFILE FORMAT
package LaboratoryActivity1;
import java.util.Scanner;
public class introToJava_CIST104_Famero {

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
        int agePer = scanner.nextInt();

        System.out.print("ENTER YOUR STUDENT NUMBER:");
        long studNum = scanner.nextLong();

        System.out.println("THIS IS YOUR PROFILE INFO");
        System.out.println("HELLO! " + firstName + " " + surName);
        System.out.println("YOUR AGE IS: " + agePer);
        System.out.println("YOUR STUDENT NUMBER IS: " + studNum);

        scanner.close(); // close scanner
    }
}