//FAMERO, MARC RODEN D. BSIT 1-3
//INTERMEDIATE PROGRAMMING (CIST104 LAB)
package arrayStudentScoreAnalyzer;
import java.util.Scanner;
public class arrayStudentScoreAnalyzer {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String MAGENTA = "\u001B[35m";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(CYAN + "=== WELCOME TO FAMERO'S STUDENT SCORE ANALYZER ===" + RESET + "\n");

        int numStudents = 0;

        while (true) {
            System.out.print("Please enter the number of students to evaluate: ");
            try {
                numStudents = Integer.parseInt(input.nextLine().trim());
                if (numStudents <= 0) {
                    System.out.println(RED + "Number of students must be at least 1." + RESET);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(RED + "Please enter a valid integer number." + RESET);
            }
        }

        String[] names = new String[numStudents];
        double[] scores = new double[numStudents];

        double totalScores = 0;
        double highestScore = Double.MIN_VALUE;
        double lowestScore = Double.MAX_VALUE;
        int passCount = 0;

        System.out.println(MAGENTA + "\n--- Enter Student Information ---" + RESET);

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n>> Entering details for Student #" + (i + 1));

            while (true) {
                System.out.print("Student name: ");
                String name = input.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println(RED + "Name cannot be blank." + RESET);
                    continue;
                }
                if (name.matches(".*\\d.*")) {
                    System.out.println(RED + "Name cannot include numbers." + RESET);
                    continue;
                }
                names[i] = name;
                break;
            }

            while (true) {
                System.out.print("Score (0-100): ");
                try {
                    double score = Double.parseDouble(input.nextLine().trim());
                    if (score <= 0 || score > 100) {
                        System.out.println(RED + "Score must be greater than 0 and at most 100." + RESET);
                        continue;
                    }
                    scores[i] = score;

                    totalScores += score;
                    if (score > highestScore) highestScore = score;
                    if (score < lowestScore) lowestScore = score;
                    if (score >= 75) passCount++;

                    break;
                } catch (NumberFormatException e) {
                    System.out.println(RED + "Enter a numeric value for the score." + RESET);
                }
            }

            System.out.println(GREEN + "Recorded: " + names[i] + " with score " + scores[i] + "/100" + RESET);
        }

        double averageScore = totalScores / numStudents;

        System.out.println(CYAN + "\n=== STUDENT SCORE SUMMARY ===" + RESET);

        System.out.println("\nAll student results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("• " + names[i] + " --> " + scores[i] + "/100");
        }

        System.out.println("\nAverage score of the class: " + String.format("%.2f", averageScore));
        System.out.println("Top score: " + highestScore + "/100");
        System.out.println("Lowest score: " + lowestScore + "/100");
        System.out.println("Number of students who passed (>=75%): " + passCount);

        System.out.println(GREEN + "\n=== STUDENT SCORE ANALYSIS COMPLETE ===" + RESET);

        input.close();
    }
}