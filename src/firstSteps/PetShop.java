package firstSteps;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPackagesDogsFood = Integer.parseInt(scanner.nextLine());
        int countPackagesCatsFood = Integer.parseInt(scanner.nextLine());

        System.out.println(countPackagesDogsFood * 2.50 + countPackagesCatsFood * 4 + " lv.");
    }
}
