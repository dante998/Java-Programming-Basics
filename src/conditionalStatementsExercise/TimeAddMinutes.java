package conditionalStatementsExercise;

import java.util.Scanner;

public class TimeAddMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int addMinutes = Integer.parseInt(scanner.nextLine());

        minutes += addMinutes;

        hour += minutes / 60;
        minutes = minutes % 60;

        if (hour >= 24) {
            hour = hour % 24;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
