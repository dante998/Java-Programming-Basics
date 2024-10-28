package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if ((operator.equals("/") || operator.equals("%")) && numberTwo == 0) {
            System.out.printf("Cannot divide %d by zero", numberOne);
        } else {
            double result = switch (operator) {
                case "+" -> numberOne + numberTwo;
                case "-" -> numberOne - numberTwo;
                case "*" -> numberOne * numberTwo;
                case "/" -> (double) numberOne / numberTwo;
                case "%" -> numberOne % numberTwo;
                default -> 0;
            };
            switch (operator) {
                case "+", "-", "*" -> {
                    if (result % 2 == 0) {
                        System.out.printf("%d %s %d = %d - even", numberOne, operator, numberTwo, (int) result);
                    } else {
                        System.out.printf("%d %s %d = %d - odd", numberOne, operator, numberTwo, (int) result);
                    }
                }
                case "/" -> System.out.printf("%d %s %d = %.2f", numberOne, operator, numberTwo, result);
                case "%" -> System.out.printf("%d %s %d = %d", numberOne, operator, numberTwo, (int) result);
            }
        }
    }
}