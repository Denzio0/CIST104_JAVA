package JavArray;
import java.util.Scanner;
public class JavArray {

	public static void main(String[] args) {

		System.out.println("JAVA ARRAYS");		
		
		 String friendsNames[] = {"Roden", 	/*0*/
								"Ivanz", 	/*1*/
								"Emman",	/*2*/
								"Alwyn",	/*3*/
								"Gab"};		/*4*/
		
		friendsNames[3] = "Denver"; /* Reassigned Array */
		int favNum[] = {7,8,9,6,4};
		
		System.out.println(friendsNames [2]);
		System.out.println(favNum [4] + favNum[0] + friendsNames [3]);
		
		String jujutsu[] = new String[10];
		jujutsu[0] = "Gojo";
		jujutsu[1] = "Sukuna";
		jujutsu[2] = "Yuji";
		
		System.out.println(jujutsu [0] + " is the strongest of the current era");
		System.out.println(jujutsu [1] + " is the king of curses");
		System.out.println(jujutsu [2] + " is the strongest of the future");
		
		Scanner g = new Scanner(System.in);
		String heroNames[] = new String[20];
		
		System.out.print("ENTER A NAME OF AN ML HERO: ");
		heroNames[0] = g.nextLine();
		
		System.out.println("THE CHOSEN HERO IS: " + heroNames[0]); 
		
		
		}
		
	}

