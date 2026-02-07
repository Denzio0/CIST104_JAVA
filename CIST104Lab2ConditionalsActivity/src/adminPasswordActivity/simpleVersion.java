package adminPasswordActivity;
import java.util.Scanner;
public class simpleVersion {

	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);

	        String[] data = {"admin", "1234"};
	        String username;
	        String password;

	        int tries = 5;
	        boolean access = false;

	        while (tries > 0 && !access) {
	            System.out.print("Username: ");
	            username = input.nextLine();

	            System.out.print("Password: ");
	            password = input.nextLine();

	            if (username.equals(data[0]) && password.equals(data[1])) {
	                access = true;
	                System.out.println("Access Granted");
	            } else {
	                tries--;
	                System.out.println("Access Denied");
	            }
	        }

	        if (!access) {
	            System.out.println("System Locked");
	        }

	        input.close();
	    }
	}