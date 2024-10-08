package firstStepsExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int requiredAmountOfNylon = Integer.parseInt(scanner.nextLine()) + 2;
        int requiredAmountOfPaint = Integer.parseInt(scanner.nextLine());
        int requiredAmountOfThinner = Integer.parseInt(scanner.nextLine());
        int hoursToCompleteTheWork = Integer.parseInt(scanner.nextLine());

        double safetyNylon = requiredAmountOfNylon * 1.50;
        double paint = requiredAmountOfPaint * 14.50;
        double thinnerForPainting = requiredAmountOfThinner * 5;
        double sumForBags = 0.40;

        double sumForMaterials = safetyNylon + paint + (paint * 10 / 100) + thinnerForPainting + sumForBags;
        double sumForWorkers = (sumForMaterials * 30 / 100) * hoursToCompleteTheWork;
        double totalSum = sumForMaterials + sumForWorkers;

        System.out.print(totalSum);
    }
}
