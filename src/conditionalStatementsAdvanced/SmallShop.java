package conditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        switch (city) {
            case "Sofia" -> {
                switch (product) {
                    case "coffee" -> System.out.println(amount * 0.50);
                    case "water" -> System.out.println(amount * 0.80);
                    case "beer" -> System.out.println(amount * 1.20);
                    case "sweets" -> System.out.println(amount * 1.45);
                    case "peanuts" -> System.out.println(amount * 1.60);
                }
            }
            case "Plovdiv" -> {
                switch (product) {
                    case "coffee" -> System.out.println(amount * 0.40);
                    case "water" -> System.out.println(amount * 0.70);
                    case "beer" -> System.out.println(amount * 1.15);
                    case "sweets" -> System.out.println(amount * 1.30);
                    case "peanuts" -> System.out.println(amount * 1.50);
                }
            }
            case "Varna" -> {
                switch (product) {
                    case "coffee" ->System.out.println(amount * 0.45);
                    case "water" ->System.out.println(amount * 0.70);
                    case "beer" ->System.out.println(amount * 1.10);
                    case "sweets" -> System.out.println(amount * 1.35);
                    case "peanuts"-> System.out.println(amount * 1.55);
                }
            }
        }
    }
}
