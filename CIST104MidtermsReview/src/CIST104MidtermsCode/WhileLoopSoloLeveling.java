package CIST104MidtermsCode;
import java.util.Scanner;
public class WhileLoopSoloLeveling {
	public static void main (String [] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("Enter hunter name: ");
		String huntName = myScan.nextLine();
		
		System.out.print("Enter current level: ");
		int curLevel = myScan.nextInt();
		
		System.out.print("Enter target level: ");
		int targetLevel = myScan.nextInt();
		
		System.out.println("");
		
		int dunRun = 1;
		int expEarned = 0;
		double totalExp = 0;
		
		while (curLevel < targetLevel) {
			System.out.println("Dungeon Run: " + dunRun);
			System.out.print("EXP earned: ");
			expEarned = myScan.nextInt();
			
			double expReq = 1000 * curLevel;
			
			System.out.print("Boss encounter? (true/false): ");
			boolean isBoss = myScan.nextBoolean();
			if (isBoss) {
				System.out.print("Boss defeated? (true/false): ");
				boolean bossDefeated = myScan.nextBoolean();
				if (bossDefeated) {
					expEarned += (500 * curLevel);
				}
				
				else if (!isBoss || !bossDefeated && curLevel < 1) {
					curLevel -= 1;
					expEarned -= (0.5 * expEarned);
				}
				
				else {
				}
			}
			
			totalExp += expEarned;
			
			if (totalExp >= expReq) {
				curLevel++;
				totalExp -= expReq;
			}
			
			dunRun++;
			
			double finalReq = (1000 * curLevel);
			
			System.out.println("");
			
			System.out.println("Current Level: " + curLevel);
			System.out.println("Total EXP: " + totalExp);
			System.out.println("EXP needed for next level: " + finalReq);
			
			System.out.println("");
			
		}
		
		System.out.println("Hunter " + huntName + "has reached level " + targetLevel + '!' + "Total EXP: " + expEarned);
		System.out.println("Solo Leveling Success!");
		
		myScan.close();
		
		
	}
}
