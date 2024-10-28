package conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double apartment = 0;


        switch (month) {
            case "May", "October" -> {
                studio = nights * 50;
                apartment = nights * 65;

                if (nights > 14) {
                    studio = studio - (studio * 30 / 100);
                } else if (nights > 7) {
                    studio = studio - (studio * 5 / 100);
                }
            }
            case "June", "September" -> {
                studio = nights * 75.20;
                apartment = nights * 68.70;

                if (nights > 14) {
                    studio = studio - (studio * 20 / 100);
                }
            }
            case "July", "August" -> {
                studio = nights * 76;
                apartment = nights * 77;
            }
        }
        if (nights > 14) {
            apartment = apartment - (apartment * 10 / 100);

        }
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
