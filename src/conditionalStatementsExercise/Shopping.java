package conditionalStatementsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCards * 250;
        double processorPrice = processors * (videoCardPrice * ((double) 35 / 100));
        double ramMemoryPrice = ramMemory * (videoCardPrice * ((double) 10 / 100));

        double totalSum = videoCardPrice + processorPrice + ramMemoryPrice;

        if (videoCards > processors) {
           totalSum = totalSum - (totalSum * ((double) 15 / 100));
        }

        if (budget >= totalSum) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}
