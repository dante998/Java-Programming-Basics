package whileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int spendCount = 0;
        int days = 0;

        while (excursionPrice > availableMoney && spendCount < 5) {
            days++;
            String command = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "spend" -> {
                    spendCount++;
                    availableMoney -= amount;

                    if (availableMoney < 0) {
                        availableMoney = 0;
                    }
                }
                case "save" -> {
                    availableMoney += amount;

                    if (spendCount != 0) {
                        spendCount = 0;
                    }
                }
            }
        }

        if (spendCount == 5 || excursionPrice > availableMoney) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else {
            System.out.printf("You saved the money for %d days.%n", days);
        }
    }
}

/*
*
250
150
spend
50
spend
50
save
100
save
100 */