package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double fullHouse = rows * columns;

        switch (projection) {
            case "Premiere" -> System.out.printf("%.2f leva", fullHouse * 12);
            case "Normal" -> System.out.printf("%.2f leva", fullHouse * 7.50);
            case "Discount" -> System.out.printf("%.2f leva", fullHouse * 5);
            default -> System.out.println("There is no such projection.");
        }
    }
}
