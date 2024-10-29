package forLoopExercise;

import java.util.Scanner;

public class TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int wins = 0;

        for (int i = 0; i < tournaments; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W" -> {
                    points += 2000;
                    wins++;
                }
                case "F" -> points += 1200;
                case "SF" -> points += 720;
            }
        }

        int finalPoints = startPoints + points;
        double averagePoints = Math.floor((double) points / tournaments);
        double percentageWon = (double) wins / tournaments * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", (int) averagePoints);
        System.out.printf("Percentage: %.2f%%%n", percentageWon);
    }
}
