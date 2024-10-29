package whileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        int poorGradesCount = 0;
        int problemsCount = 0;
        int sumGrades = 0;
        String lastProblem = "";
        String input = scanner.nextLine();

        while (!input.equals("Enough")) {
            lastProblem = input;
            problemsCount++;
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrades += grade;

            if (grade <= 4) {
                poorGradesCount++;

                if (maxPoorGrades == poorGradesCount) {
                    break;
                }
            }
            input = scanner.nextLine();
        }

        if (input.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", (double) sumGrades / problemsCount);
            System.out.printf("Number of problems: %d%n", problemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        }
    }
}


