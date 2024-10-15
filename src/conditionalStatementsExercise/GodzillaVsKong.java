package conditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int numberExtras = Integer.parseInt(scanner.nextLine());
        double priceClothesExtras = Double.parseDouble(scanner.nextLine());

        double decor = (filmBudget * 10 / 100);
        double sumClothes = numberExtras * priceClothesExtras;

        if (numberExtras > 150) {
            sumClothes = sumClothes - (sumClothes * 10 / 100);
        }

        double totalMovieSum = decor + sumClothes;

        double totalCashLeft = filmBudget - totalMovieSum;

        double neededCash = totalMovieSum - filmBudget;

        if (decor + sumClothes <= filmBudget) {
            System.out.printf("Action!%nWingard starts filming with %.02f leva left.", totalCashLeft);
        } else if (decor + sumClothes > filmBudget) {
            System.out.printf("Not enough money!%nWingard needs %.02f leva more.", neededCash);
        }
    }
}

