package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTimeMin = examHour * 60 + examMin;
        int arrivalTimeMin = arrivalHour * 60 + arrivalMin;

        int difference = examTimeMin - arrivalTimeMin;

        if (difference < 0) {
            System.out.println("Late");
        } else if (difference == 0) {
            System.out.println("On time");
        } else if (difference <= 30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        if (difference < 0) {
            difference = Math.abs(difference);
            if (difference >= 60) {
                System.out.printf("%d:%02d hours after the start", difference / 60, difference % 60);
            } else {
                System.out.printf("%d minutes after the start", difference);
            }
        } else if (difference > 0) {
            if (difference >= 60) {
                System.out.printf("%d:%02d hours before the start", difference / 60, difference % 60);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        }
    }
}

