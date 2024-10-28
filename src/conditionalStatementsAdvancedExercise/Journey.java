package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination;
        double expenses;

        if (budget <= 100) {
            destination = "Bulgaria";
            expenses = switch (season) {
                case "summer" -> budget * 30 / 100;
                case "winter" -> budget * 70 / 100;
                default -> 0;
            };
        } else if (budget <= 1000) {
            destination = "Balkans";
            expenses = switch (season) {
                case "summer" -> budget * 40 / 100;
                case "winter" -> budget * 80 / 100;
                default -> 0;
            };
        } else {
            destination = "Europe";
            expenses = budget * 90 / 100;
        }

        String type = "";
        if (season.equals("winter") || destination.equals("Europe")) {
            type = "Hotel";
        } else if (season.equals("summer")) {
            type = "Camp";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", type, expenses);
    }
}
