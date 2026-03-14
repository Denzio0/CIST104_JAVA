//FAMERO, MARC RODEN D. BSIT 1-3
//INTERMEDIATE PROGRAMMING (CIST104 LAB)
package studentScoreAnalyzer;
import java.util.Scanner;
public class simpleStudScoreAnalyzer {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(CYAN + ">>> STUDENT SCORE ANALYZER <<<" + RESET + "\n");

        int totalStudents = 0;

        while (true) {
            try {
                System.out.print("How many students' scores are we analyzing ?: ");
                totalStudents = Integer.parseInt(input.nextLine().trim());
                if (totalStudents <= 0) {
                    System.out.println(RED + "<< Number of students must be greater than 0 >>" + RESET);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(RED + "<< Invalid input! Please enter a numeric value >>" + RESET);
            }
        }

        double totalScore = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        int passed = 0;

        System.out.println(YELLOW + ">>> Enter Student Details <<<" + RESET);

        for (int i = 1; i <= totalStudents; i++) {

            System.out.print("\n>> Student " + i + " <<\n");

            String name = "";
            double score = 0;

            while (true) {
                System.out.print("Enter student name: ");
                name = input.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println(RED + "<< Name cannot be empty >>" + RESET);
                    continue;
                }
                if (name.matches(".*\\d.*")) {
                    System.out.println(RED + "<< Name cannot contain numbers >>" + RESET);
                    continue;
                }
                break;
            }

            while (true) {
                try {
                    System.out.print("Enter student score: ");
                    score = Double.parseDouble(input.nextLine().trim());
                    if (score <= 0 || score > 100) {
                        System.out.println(RED + "<< Score must be > 0 and <= 100 >>" + RESET);
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(RED + "<< Invalid input! Please enter numeric score >>" + RESET);
                }
            }

            totalScore += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
            if (score >= 75) passed++;

            System.out.println(GREEN + "|| " + i + ") " + name + ": " + score + "/100" + RESET);
        }

        double average = totalScore / totalStudents;

        System.out.println("\n" + CYAN + ">>> STUDENTS' SCORES ANALYSIS <<<" + RESET + "\n");
        System.out.println("Average score: " + String.format("%.1f", average));
        System.out.println("Highest score: " + highest + "/100");
        System.out.println("Lowest score: " + lowest + "/100");
        System.out.println("Student/s passed (75%): " + passed);

        System.out.println(GREEN + "<< End of Famero Student Score Analyzer (NO ARRAY) >>" + RESET);

        input.close();
    }
}