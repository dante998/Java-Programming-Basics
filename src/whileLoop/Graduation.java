package whileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        int lowGrade = 0;
        double averageGrade = 0;
        int schoolClass = 1;

        while (schoolClass <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4) {
                schoolClass++;
                averageGrade += grade;
            } else {
                lowGrade++;
            }

            if (lowGrade == 2) {
                break;
            }
        }

        if (lowGrade == 2) {
            System.out.printf("%s has been excluded at %d grade", student, schoolClass);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", student, averageGrade / 12);
        }
    }
}
