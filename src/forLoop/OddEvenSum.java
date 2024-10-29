package forLoop;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int evenPosition = 0;
        int oddPosition = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenPosition += currentNumber;
            } else {
                oddPosition += currentNumber;
            }
        }

        if (evenPosition == oddPosition) {
            System.out.printf("Yes%nSum = %d", evenPosition);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(evenPosition - oddPosition));
        }
    }
}
