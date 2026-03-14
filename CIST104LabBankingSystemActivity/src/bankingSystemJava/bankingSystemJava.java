//FAMERO, MARC RODEN D. BSIT 1-3
//INTERMEDIATE PROGRAMMING (CIST104 LAB)
package bankingSystemJava;
import java.util.Scanner;
public class bankingSystemJava {
	
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        final String correctPIN = "1234";
        int loginAttempts = 3; 
        boolean loggedIn = false;

        double balance = 5000.0;

        while (loginAttempts > 0 && !loggedIn) {
            try {
                System.out.print("Enter your 4-digit PIN: ");
                String enteredPIN = input.nextLine().trim();

                if (enteredPIN.equals(correctPIN)) {
                    loggedIn = true;
                    showLoading("Verifying PIN");
                } else {
                    loginAttempts--;
                    System.out.println(RED + "Incorrect PIN! Attempts left: " + loginAttempts + RESET);

                    if (loginAttempts == 0) {
                        System.out.println(RED + "Too many failed attempts. Account locked for 6 seconds." + RESET);
                        Thread.sleep(6000);
                        loginAttempts = 3;
                        System.out.println(GREEN + "You can try again now." + RESET);
                    }
                }
            } catch (Exception e) {
                System.out.println(RED + "Input error! Please try again." + RESET);
                input.nextLine();
            }
        }

        if (!loggedIn) {
            System.out.println(RED + "Exiting system..." + RESET);
            input.close();
            return;
        }

        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("\nSelect an option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");

                System.out.print("Enter choice: ");
                String choice = input.nextLine().trim();

                switch (choice) {
                    case "1":
                        System.out.println(GREEN + "Your current balance: ₱" + balance + RESET);
                        break;

                    case "2":
                        System.out.print("Enter amount to withdraw: ₱");
                        double withdrawAmount = readAmount(input);

                        if (withdrawAmount <= 0) {
                            System.out.println(RED + "Invalid amount. Must be greater than 0." + RESET);
                        } else if (withdrawAmount > balance) {
                            System.out.println(RED + "Overdraft! You cannot withdraw more than your balance." + RESET);
                        } else {
                            boolean confirm = false;
                            while (!confirm) {
                                System.out.print("Are you sure you want to withdraw ₱" + withdrawAmount + "? (1 = Yes, 0 = No): ");
                                String proceed = input.nextLine().trim();

                                if (proceed.equals("1")) {
                                    balance -= withdrawAmount;
                                    System.out.println(GREEN + "Withdrawal successful. New balance: ₱" + balance + RESET);
                                    printReceipt("Withdrawal", withdrawAmount, balance);
                                    confirm = true;
                                } else if (proceed.equals("0")) {
                                    System.out.println(GREEN + "Withdrawal cancelled." + RESET);
                                    confirm = true;
                                } else {
                                    System.out.println(RED + "Invalid input! Please enter 1 for Yes or 0 for No." + RESET);
                                }
                            }
                        }
                        break;

                    case "3":
                        System.out.print("Enter amount to deposit: ₱");
                        double depositAmount = readAmount(input);
                        if (depositAmount <= 0) {
                            System.out.println(RED + "Invalid amount. Must be greater than 0." + RESET);
                        } else {
                            balance += depositAmount;
                            System.out.println(GREEN + "Deposit successful. New balance: ₱" + balance + RESET);
                            printReceipt("Deposit", depositAmount, balance);
                        }
                        break;

                    case "4":
                        exit = true;
                        System.out.println(GREEN + "Thank you for using Famero's Banking System!" + RESET);
                        break;

                    default:
                        System.out.println(RED + "Invalid option. Please choose 1-4." + RESET);
                }
            } catch (Exception e) {
                System.out.println(RED + "An error occurred! Please try again." + RESET);
                input.nextLine();
            }
        }

        input.close();
    }

    public static double readAmount(Scanner input) {
        double amount = -1;
        try {
            amount = Double.parseDouble(input.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println(RED + "Invalid input! Please enter a numeric value." + RESET);
        } catch (Exception e) {
            System.out.println(RED + "Error reading amount. Please try again." + RESET);
            input.nextLine();
        }
        return amount;
    }

    public static void printReceipt(String type, double amount, double balance) {
        System.out.println(CYAN + "----------- TRANSACTION RECEIPT -----------" + RESET);
        System.out.println("Transaction type: " + type);
        System.out.println("Amount: ₱" + amount);
        System.out.println("Remaining balance: ₱" + balance);
        System.out.println(CYAN + "------------------------------------------" + RESET);
    }

    public static void showLoading(String message) throws InterruptedException {
        System.out.print(message);
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            Thread.sleep(300);
        }
        System.out.println("\n");
    }
}