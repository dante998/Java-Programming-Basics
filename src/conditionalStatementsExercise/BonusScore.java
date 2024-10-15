package conditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        double bonus;

        if (points <= 100) {
            bonus = 5;
        } else if (points <= 1000) {
            bonus = points * ((double) 20 / 100);
        } else {
            bonus = points * ((double) 10 / 100);
        }

        if (points % 2 == 0) {
            bonus += 1;
        } else if (points % 10 == 5) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(points + bonus);
    }
}
