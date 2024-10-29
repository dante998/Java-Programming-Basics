package whileLoopExercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int pennies = (int) Math.round(change * 100);
        int totalCoins = 0;

        while (pennies > 0) {
            if (pennies >= 200) {
                pennies -= 200;
            } else if (pennies >= 100) {
                pennies -= 100;
            } else if (pennies >= 50) {
                pennies -= 50;
            } else if (pennies >= 20) {
                pennies -= 20;
            } else if (pennies >= 10) {
                pennies -= 10;
            } else if (pennies >= 5) {
                pennies -= 5;
            } else if (pennies >= 2) {
                pennies -= 2;
            } else {
                pennies -= 1;
            }
            totalCoins++;
        }
        System.out.print(totalCoins);
    }
}
