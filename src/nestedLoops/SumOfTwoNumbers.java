package nestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countCombination = 0;

        boolean foundValidCombination = false;

        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                int currentCombination = i + j;
                countCombination++;

                if (currentCombination == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombination, i, j, currentCombination);
                    foundValidCombination = true;
                    break;
                }
            }

            if (foundValidCombination) {
                break;
            }
        }
        if (!foundValidCombination) {
            System.out.printf("%d combinations - neither equals %d", countCombination, magicNumber);
        }
    }
}