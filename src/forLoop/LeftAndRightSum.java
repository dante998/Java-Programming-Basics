package forLoop;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int sumFirstColumn = 0;
        int sumSecondColumn = 0;

        for (int i = 1; i <= countNumbers * 2; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (i <= countNumbers) {
                sumFirstColumn += currentNumber;
            } else {
                sumSecondColumn += currentNumber;
            }
        }

        if (sumFirstColumn == sumSecondColumn) {
            System.out.printf("Yes, sum = %d ", sumFirstColumn);
        } else {
            System.out.printf("No, diff = %d ", Math.abs(sumFirstColumn - sumSecondColumn));
        }
    }
}
