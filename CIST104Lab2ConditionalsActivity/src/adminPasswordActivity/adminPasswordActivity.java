//FAMERO, MARC RODEN D. BSIT 1-3
//INTERMEDIATE PROGRAMMING (CIST104 LAB)
package adminPasswordActivity;
import java.util.Scanner;
public class adminPasswordActivity {
	
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        String defaultUser = "admin";
        String defaultPass = "1234";

        String storedUser = "";
        String storedPass = "";

        String username;
        String password;

        int attempts = 5;
        boolean access = false;

        System.out.println(CYAN + "========================================");
        System.out.println("        NOT SO SECURE LOGIN SYSTEM      ");
        System.out.println("========================================" + RESET);

        System.out.println("Default Account: admin / 1234");

        System.out.println("\n>>> REGISTER NEW ACCOUNT <<<");

        System.out.print("Create username: ");
        storedUser = input.nextLine();

        System.out.print("Create password: ");
        storedPass = input.nextLine();

        System.out.println(GREEN + "Registration complete.\n" + RESET);

        while (attempts > 0 && !access) {

            System.out.println("Attempts left: " + attempts);

            System.out.print("Enter username: ");
            username = input.nextLine();

            if (username.trim().isEmpty()) {
                System.out.println(RED + "Username cannot be empty." + RESET);
                continue;
            }

            System.out.print("Enter password: ");
            password = input.nextLine();

            if (password.trim().isEmpty()) {
                System.out.println(RED + "Password cannot be empty." + RESET);
                continue;
            }

            System.out.println("----------------------------------------");

            if ((username.equalsIgnoreCase(defaultUser) && password.equals(defaultPass)) ||
                (username.equalsIgnoreCase(storedUser) && password.equals(storedPass))) {

                access = true;

                showLoading("Accessing your account");

                System.out.println(GREEN + "Access Granted. Welcome " + username + "!" + RESET);

                boolean running = true;

                while (running) {

                    System.out.println("\n|| What would you like to do?");
                    System.out.println(">> 1: Check information <<");
                    System.out.println(">> 2: Log-out <<");
                    System.out.println(">> 3: End Program <<");

                    System.out.print("Enter your input here: ");
                    int choice = Integer.parseInt(input.nextLine());

                    if (choice == 1) {

                        System.out.println("\nStored Information");
                        System.out.println("Username: " + username);
                        System.out.println("Password: " + password);

                    } else if (choice == 2) {

                        System.out.println("\nLogging out...");
                        access = false;
                        running = false;

                    } else if (choice == 3) {

                        System.out.println("\n>>> Ending the Program ... <<<");
                        input.close();
                        System.exit(0);

                    } else {

                        System.out.println(RED + "Invalid option." + RESET);
                    }
                }

            } else {

                attempts--;
                System.out.println(RED + "Invalid credentials." + RESET);

                if (attempts == 0) {
                    System.out.println(RED + "Too many failed attempts. Locking account for 15 seconds..." + RESET);
                    Thread.sleep(15000);
                    attempts = 5;
                    System.out.println(GREEN + "You can try again now." + RESET);
                }
            }

            System.out.println("========================================");
        }

        input.close();
    }

    public static void showLoading(String message) throws InterruptedException {

        System.out.print("\n" + message);

        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }

        System.out.println("\n");
    }
}