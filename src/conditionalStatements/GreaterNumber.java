package conditionalStatements;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        if (numberOne > numberTwo) {
            System.out.println(numberOne);
        } else {
            System.out.println(numberTwo);
        }
    }
}
