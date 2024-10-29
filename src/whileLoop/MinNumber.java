package whileLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!command.equals("Stop")) {
            int currentNumber = Integer.parseInt(command);

            if (minNumber > currentNumber) {
                minNumber = currentNumber;
            }
            command = scanner.nextLine();
        }
        System.out.print(minNumber);
    }
}
