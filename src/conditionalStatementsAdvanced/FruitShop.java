package conditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                switch (fruit) {
                    case "banana" -> System.out.printf("%.2f", amount * 2.50);
                    case "apple" -> System.out.printf("%.2f", amount * 1.20);
                    case "orange" -> System.out.printf("%.2f", amount * 0.85);
                    case "grapefruit" -> System.out.printf("%.2f", amount * 1.45);
                    case "kiwi" -> System.out.printf("%.2f", amount * 2.70);
                    case "pineapple" -> System.out.printf("%.2f", amount * 5.50);
                    case "grapes" -> System.out.printf("%.2f", amount * 3.85);

                    default -> System.out.println("error");
                }
            }
            case "Saturday", "Sunday" -> {
                switch (fruit) {
                    case "banana" -> System.out.printf("%.2f", amount * 2.70);
                    case "apple" -> System.out.printf("%.2f", amount * 1.25);
                    case "orange" -> System.out.printf("%.2f", amount * 0.90);
                    case "grapefruit" -> System.out.printf("%.2f", amount * 1.60);
                    case "kiwi" -> System.out.printf("%.2f", amount * 3.00);
                    case "pineapple" -> System.out.printf("%.2f", amount * 5.60);
                    case "grapes" -> System.out.printf("%.2f", amount * 4.20);

                    default -> System.out.println("error");
                }
            }
            default -> System.out.println("error");
        }
    }
}
