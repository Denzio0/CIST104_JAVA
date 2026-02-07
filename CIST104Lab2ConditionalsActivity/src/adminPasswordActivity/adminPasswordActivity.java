package adminPasswordActivity;
import java.util.Scanner;
public class adminPasswordActivity {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] credentials = {"admin", "1234"};
        String username;
        String password;

        int attempts = 5;
        boolean access = false;

        System.out.println("========================================");
        System.out.println("            SECURE LOGIN SYSTEM          ");
        System.out.println("========================================");

        while (attempts > 0 && !access) {

            System.out.println("Attempts left: " + attempts);
            System.out.print("Enter username: ");
            username = input.nextLine();

            System.out.print("Enter password: ");
            password = input.nextLine();

            System.out.println("----------------------------------------");

            if (username.equals(credentials[0]) && password.equals(credentials[1])) {
                access = true;
            } else {
                attempts--;
                System.out.println("Invalid credentials");
            }

            System.out.println("========================================");
        }

        if (access) {
            System.out.println("            ACCESS GRANTED               ");
        } else {
            System.out.println("        SYSTEM LOCKED. TRY AGAIN LATER   ");
        }

        System.out.println("========================================");

        input.close();
    }
}