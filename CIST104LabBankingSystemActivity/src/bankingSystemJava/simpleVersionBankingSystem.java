//FAMERO, MARC RODEN D. BSIT 1-3
//INTERMEDIATE PROGRAMMING (CIST104 LAB)
package bankingSystemJava;
import java.util.Scanner;
public class simpleVersionBankingSystem {


	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctPIN = "1234";
        int loginAttempts = 3; 
        boolean loggedIn = false;

        double balance = 5000.0;

        while (loginAttempts > 0 && !loggedIn) {
            System.out.print("Enter your 4-digit PIN: ");
            String enteredPIN = input.nextLine().trim();

            if (enteredPIN.equals(correctPIN)) {
                loggedIn = true;
                System.out.println("PIN correct. Welcome!");
            } else {
                loginAttempts--;
                System.out.println("Incorrect PIN! Attempts left: " + loginAttempts);

                if (loginAttempts == 0) {
                    System.out.println("Too many failed attempts. Account locked for 6 seconds.");
                    try {
                        Thread.sleep(6000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    loginAttempts = 3;
                    System.out.println("You can try again now.");
                }
            }
        }

        if (!loggedIn) {
            System.out.println("Exiting system...");
            input.close();
            return;
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("Your current balance: ₱" + balance);
                    break;

                case "2":
                    System.out.print("Enter amount to withdraw: ₱");
                    double withdrawAmount = readAmount(input);

                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount. Must be greater than 0.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Overdraft! You cannot withdraw more than your balance.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: ₱" + balance);
                        printReceipt("Withdrawal", withdrawAmount, balance);
                    }
                    break;

                case "3":
                    System.out.print("Enter amount to deposit: ₱");
                    double depositAmount = readAmount(input);

                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount. Must be greater than 0.");
                    } else {
                        balance += depositAmount;
                        System.out.println("Deposit successful. New balance: ₱" + balance);
                        printReceipt("Deposit", depositAmount, balance);
                    }
                    break;

                case "4":
                    exit = true;
                    System.out.println("Thank you for using Simple Banking System!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }
        }

        input.close();
    }

    public static double readAmount(Scanner input) {
        double amount = -1;
        try {
            amount = Double.parseDouble(input.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a numeric value.");
        }
        return amount;
    }

    public static void printReceipt(String type, double amount, double balance) {
        System.out.println("-------- TRANSACTION RECEIPT --------");
        System.out.println("Transaction type: " + type);
        System.out.println("Amount: ₱" + amount);
        System.out.println("Remaining balance: ₱" + balance);
        System.out.println("------------------------------------");
    }
}
