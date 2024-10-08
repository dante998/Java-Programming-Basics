package firstStepsExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTaxBasketball = Integer.parseInt(scanner.nextLine());

        double basketballShoes = yearTaxBasketball - (yearTaxBasketball  * 40 / 100.0);
        double basketballEquipment = basketballShoes - (basketballShoes * 20 / 100.0);
        double basketball = basketballEquipment / 4;
        double basketballAccessories = basketball / 5;

        double expenses = yearTaxBasketball + basketballShoes + basketballEquipment + basketball + basketballAccessories;

        System.out.print(expenses);
    }
}
