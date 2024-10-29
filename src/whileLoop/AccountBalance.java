package whileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0;

        while (!command.equals("NoMoreMoney")) {
            double currentMoney = Double.parseDouble(command);

            if (currentMoney < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                sum += currentMoney;
                System.out.printf("Increase: %.2f%n", currentMoney);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
