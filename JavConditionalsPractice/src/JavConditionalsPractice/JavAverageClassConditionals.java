package JavConditionalsPractice;
import java.util.Scanner;
public class JavAverageClassConditionals {

	public static void main(String[] args) {
		
		Scanner grade = new Scanner(System.in);
		int studGrade [] = new int[4];
		
		System.out.print("ENTER 4 STUDENT GRADES: ");
		studGrade[0] = grade.nextInt();
		studGrade[1] = grade.nextInt();
		studGrade[2] = grade.nextInt();
		studGrade[3] = grade.nextInt();
		
		int sum = studGrade[0] + studGrade[1] + studGrade[2] + studGrade[3];
		int ave = sum/4;
		
		System.out.print("THE AVERAGE OF THE STUDENT IS: " + ave + " - ");
		
		if (ave > 100) {
			System.out.print("INVALID GRADE");
		}
		
		else if (ave == 100 || ave >= 98) {
			System.out.print("WITH HIGHEST HONORS");
		}
		
		else if (ave <= 97.99 && ave >= 95 ) {
			System.out.print("WITH HIGH HONORS");
		}
		
		else if (ave <= 94.99 && ave >= 90) {
			System.out.print("WITH HONORS");
		}
		
		else if (ave <= 89.99 && ave >= 75) {;
			System.out.print("PASSED");
		}
		
		else {
			System.out.print("FAILED");
		}
		
	}

}
