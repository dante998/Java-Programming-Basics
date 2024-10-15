package conditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        int puzzleToys = Integer.parseInt(scanner.nextLine());
        int dollToys = Integer.parseInt(scanner.nextLine());
        int bearToys = Integer.parseInt(scanner.nextLine());
        int minionToys = Integer.parseInt(scanner.nextLine());
        int truckToys = Integer.parseInt(scanner.nextLine());

        double profit = (puzzleToys * 2.6) + (dollToys * 3) + (bearToys * 4.1) + (minionToys * 8.2) + (truckToys * 2);

        if (puzzleToys + dollToys + bearToys + minionToys + truckToys >= 50) {
            profit = profit - (profit * 25 / 100);
        }

        profit = profit - (profit * 10 / 100);

        if (priceTrip <= profit) {
            System.out.printf("Yes! %.2f lv left.", profit - priceTrip);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceTrip - profit);
        }
    }
}
