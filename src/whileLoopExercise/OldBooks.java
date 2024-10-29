package whileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String input = scanner.nextLine();
        int countBooks = 0;

        while (!input.equals("No More Books") && !input.equals(book)) {
            countBooks++;
            input = scanner.nextLine();
        }

        if (input.equals(book)) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", countBooks);
        }
    }
}

