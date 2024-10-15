package conditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = (double) breakDuration / 8;
        double relaxTime = (double) breakDuration / 4;
        double totalTime = lunchTime + relaxTime + episodeDuration;

        if (breakDuration >= totalTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(breakDuration - totalTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(totalTime - breakDuration));
        }
    }
}
