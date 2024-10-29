package whileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;
        final int maxSteps = 10000;

        while (steps < maxSteps) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                steps += Integer.parseInt(scanner.nextLine());
                break;
            }
            steps += Integer.parseInt(input);
        }
        if (steps >= maxSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!%n", Math.abs(maxSteps - steps));
        } else {
            System.out.printf("%d more steps to reach goal.", maxSteps - steps);
        }
    }
}

/*
1500
300
2500
3000
Going home
200
*/