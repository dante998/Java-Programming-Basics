package firstStepsExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthInCentimeters = Integer.parseInt(scanner.nextLine());
        int widthInCentimeters = Integer.parseInt(scanner.nextLine());
        int heightInCentimeters = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = lengthInCentimeters * widthInCentimeters * heightInCentimeters;
        double volumeLetters = volume * 0.001;
        double result = volumeLetters - (volumeLetters * (percent / 100));
        
        System.out.println(result);
    }
}
