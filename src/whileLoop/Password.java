package whileLoop;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();

        while (!confirmPassword.equals(password)) {
            //System.out.println("Wrong password!");
            confirmPassword = scanner.nextLine();
        }
        System.out.print("Welcome " + username + "!");
    }
}
