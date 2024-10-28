package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermens = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season) {
            case "Spring" -> {
                price = 3000;
                if (fishermens <= 6) {
                    price = price - (price * 10 / 100);
                } else if (fishermens <= 11) {
                    price = price - (price * 15 / 100);
                } else {
                    price = price - (price * 25 / 100);
                }
            }
            case "Summer", "Autumn" -> {
                price = 4200;
                if (fishermens <= 6) {
                    price = price - (price * 10 / 100);
                } else if (fishermens <= 11) {
                    price = price - (price * 15 / 100);
                } else {
                    price = price - (price * 25 / 100);
                }
            }
            case "Winter" -> {
                price = 2600;
                if (fishermens <= 6) {
                    price = price - (price * 10 / 100);
                } else if (fishermens <= 11) {
                    price = price - (price * 15 / 100);
                } else {
                    price = price - (price * 25 / 100);
                }
            }
        }
        if (!season.equals("Autumn") && fishermens % 2 == 0) {
            price = price - (price * 5 / 100);
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else if (price > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
