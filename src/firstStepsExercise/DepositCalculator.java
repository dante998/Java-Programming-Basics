package firstStepsExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());

        double ratePerMonth = (deposit * (rate / 100)) / 12;
        double resultSum = deposit + (ratePerMonth * period);

        System.out.print(resultSum);
    }
}
