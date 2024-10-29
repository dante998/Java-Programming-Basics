package forLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double maxPoints = 1250.5;

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < judges; i++) {
            String judge = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            points += judge.length() * judgePoints / 2;

            if (points >= maxPoints) {
                break;
            }
        }

        if (points >= maxPoints) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, maxPoints - points);
        }
    }
}
