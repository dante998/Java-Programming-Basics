package firstSteps;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metersToBeLandscaped = Double.parseDouble(scanner.nextLine());

        double priceForLandscape = metersToBeLandscaped * 7.61;
        double discountFromAmount = 0.18 * priceForLandscape;
        double calculateFinalSum = priceForLandscape - discountFromAmount;

        System.out.printf("The final price is: %s lv. \nThe discount is: %s lv.", calculateFinalSum, discountFromAmount);
    }
}
