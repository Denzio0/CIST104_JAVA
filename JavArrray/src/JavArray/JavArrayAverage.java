package JavArray;

public class JavArrayAverage {

	public static void main(String[] args) {
		
		/*JAVA ARRAY AVERAGE PROGRAM*/
		
		int studGrade[] = {12, 7, -3, 25, 19};
		
		
		System.out.println("The values stored in the array are: " + studGrade[0] + ", " +
																	studGrade[1] + ", " +
																	studGrade[2] + ", " +
																	studGrade[3]+ ", " +
																	studGrade[4]);
																			
		System.out.println("The total sum of all elements is: " + (studGrade[0] + 
																	studGrade[1] + 
																	studGrade[2] + 
																	studGrade[3]+ 
																	studGrade[4]));

	float y = 5.0f;
		 System.out.println("The number of elements is: " + y);
		 
		 System.out.println("The computed average is: "  + (studGrade[0] +
															studGrade[1] + 
															studGrade[2] + 
															studGrade[3]+ 
															studGrade[4]) / y);
			 
	}

}
