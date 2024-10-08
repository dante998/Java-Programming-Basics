package firstStepsExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChickenMenus = Integer.parseInt(scanner.nextLine());
        int numberOfFishMenus = Integer.parseInt(scanner.nextLine());
        int numberOfVeganMenus = Integer.parseInt(scanner.nextLine());

        double chickenMenu = numberOfChickenMenus * 10.35;
        double fishMenu = numberOfFishMenus * 12.40;
        double veganMenu = numberOfVeganMenus * 8.15;

        double totalPriceOfTheMenus = chickenMenu + fishMenu + veganMenu;
        double desertPrice = (totalPriceOfTheMenus * 20 / 100);
        double priceOfTheDelivery = 2.50;
        double totalPrice = totalPriceOfTheMenus + desertPrice + priceOfTheDelivery;

        System.out.print(totalPrice);
    }
}
