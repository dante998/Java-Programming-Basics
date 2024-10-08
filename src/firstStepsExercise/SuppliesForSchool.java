package firstStepsExercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packetsOfPens = Integer.parseInt(scanner.nextLine());
        int packetsOfMarkers = Integer.parseInt(scanner.nextLine());
        int litersOfChalkboardCleaner = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceForPens = packetsOfPens * 5.80;
        double priceForMarkers = packetsOfMarkers * 7.20;
        double priceForChalkboardCleaner = litersOfChalkboardCleaner * 1.20;

        double totalPrice = priceForPens + priceForMarkers + priceForChalkboardCleaner;
        double discount = totalPrice * percentDiscount / 100;
        double totalPriceWithDiscount = totalPrice - discount;

        System.out.println(totalPriceWithDiscount);
    }
}
