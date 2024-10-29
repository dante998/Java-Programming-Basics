package forLoop;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            switch (letter) {
                case 'a' -> result += 1;
                case 'e' -> result += 2;
                case 'i' -> result += 3;
                case 'o' -> result += 4;
                case 'u' -> result += 5;
            }
        }
        System.out.println(result);
    }
}
