package forLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLily = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int money = 0;

        for (int currentAge = 1; currentAge <= ageLily; currentAge++) {

            if (currentAge % 2 == 0) {
                money += 10 * (currentAge / 2) - 1;
            } else {
                money += toyPrice;
            }
        }

        if (money >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", Math.abs(washingMachinePrice - money));
        } else {
            System.out.printf("No! %.2f", Math.abs(money - washingMachinePrice));
        }
    }
}
