package CIST104MidtermsCode;
import java.util.Scanner;
import java.util.InputMismatchException;
public class SwitchCasePractice {
	
	public static void main (String [] args ) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("JUJUTSU KAISEN CHARACTER SELECTOR");
		System.out.print("Choose a character (1–10): ");
		int choseNum = myScan.nextInt();
		
		switch(choseNum) {
		case (1): 
			System.out.println("Character: Yuji Itadori ");
			System.out.println("Ability: Superhuman Strength, Black Flash, Blood Manipulation");
		break;
		case (2): 
			System.out.println("Character: Megumi Fushiguro");
			System.out.println("Ability: Ten Shadows Technique");
		break;
		case (3): 
			System.out.println("Character: Nobara Kugisaki ");
			System.out.println("Ability: Straw Doll Technique");
		break;
		case (4): 
			System.out.println("Character: Satoru Gojo");
			System.out.println("Ability: Limitless and Six Eyes ");
		break;
		case (5): 
			System.out.println("Character: Ryomen Sukuna ");
			System.out.println("Ability: Malevolent Shrine ");
		break;
		case (6): 
			System.out.println("Character: Kento Nanami ");
			System.out.println("Ability: Ratio Technique ");
		break;
		case (7): 
			System.out.println("Character: Toge Inumaki ");
			System.out.println("Ability: Cursed Speech ");
		break;
		case (8): 
			System.out.println("Character: Maki Zenin ");
			System.out.println("Ability: Heavenly Restriction ");
		break;
		case (9): 
			System.out.println("Character: Yuta Okkotsu ");
			System.out.println("Ability: Rika Manifestation ");
		break;
		case (10): 
			System.out.println("Character: Suguru Geto ");
			System.out.println("Ability: Curse Manipulation ");
		break;
		default: System.out.println("Invalid character selection");
		break;
		
		}
		
	}

}
