package forLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());

        int totalPeople = 0;
        double musala = 0, monblan = 0, kilimandjaro = 0, k2 = 0, everest = 0;

        for (int i = 0; i < groupCount; i++) {
            int group = Integer.parseInt(scanner.nextLine());

            totalPeople += group;

            if (group <= 5) {
                musala += group;
            } else if (group <= 12) {
                monblan += group;
            } else if (group <= 25) {
                kilimandjaro += group;
            } else if (group <= 40) {
                k2 += group;
            } else {
                everest += group;
            }
        }

        System.out.printf("%.2f%%%n", (musala / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (monblan / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (kilimandjaro / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (k2 / totalPeople) * 100);
        System.out.printf("%.2f%%", (everest / totalPeople) * 100);
    }
}
