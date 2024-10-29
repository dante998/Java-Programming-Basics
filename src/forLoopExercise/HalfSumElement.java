package forLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            sum += currentNumber;

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        int sumWithout = sum - maxNumber;

        if (sumWithout == maxNumber) {
            System.out.printf("Yes%nSum = %d", maxNumber);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sumWithout - maxNumber));
        }
    }
}
