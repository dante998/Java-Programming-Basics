package firstSteps;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        int area = numberOne * numberTwo;

        System.out.println(area);
    }
}
