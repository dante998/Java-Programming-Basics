package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfStay = Integer.parseInt(scanner.nextLine()) - 1;
        String typeOfRoom = scanner.nextLine();
        String rate = scanner.nextLine();

        double price = 0;

        switch (typeOfRoom) {
            case "room for one person" -> price = daysOfStay * 18;
            case "apartment" -> {
                price = daysOfStay * 25;

                if (daysOfStay < 10) {
                    price = price - (price * 30 / 100);
                } else if (daysOfStay < 15) {
                    price = price - (price * 35 / 100);
                } else {
                    price = price - (price * 50 / 100);
                }
            }
            case "president apartment" -> {
                price = daysOfStay * 35;

                if (daysOfStay < 10) {
                    price = price - (price * 10 / 100);
                } else if (daysOfStay < 15) {
                    price = price - (price * 15 / 100);
                } else {
                    price = price - (price * 20 / 100);
                }
            }
        }

        if (rate.equals("positive")) {
            price = price + (price * 25 / 100);
        } else if (rate.equals("negative")) {
            price = price - (price * 10 / 100);
        }
        System.out.printf("%.2f", price);
    }
}
