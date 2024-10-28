package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (flowers) {
            case "Roses" -> {
                price = amount * 5;
                if (amount > 80) {
                    price = price - (price * 10 / 100);
                }
            }
            case "Dahlias" -> {
                price = amount * 3.80;
                if (amount > 90) {
                    price = price - (price * 15 / 100);
                }
            }
            case "Tulips" -> {
                price = amount * 2.80;
                if (amount > 80) {
                    price = price - (price * 15 / 100);
                }
            }
            case "Narcissus" -> {
                price = amount * 3;
                if (amount < 120) {
                    price = price + (price * 15 / 100);
                }
            }
            case "Gladiolus" -> {
                price = amount * 2.50;
                if (amount < 80) {
                    price = price + (price * 20 / 100);
                }
            }
        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flowers, budget - price);
        } else if (budget < price) {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
