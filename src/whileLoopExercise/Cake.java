package whileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int pieces = width * length;

        String input;

        while (pieces > 0 && !"STOP".equals(input = scanner.nextLine())) {
            pieces -= Integer.parseInt(input);
        }

        if (pieces > 0) {
            System.out.printf("%d pieces are left.", pieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        }
    }
}
