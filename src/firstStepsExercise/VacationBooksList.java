package firstStepsExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesCurrentBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int hoursPerDay = (pagesCurrentBook / pagesPerHour) / daysToRead;

        System.out.println(hoursPerDay);
    }
}
