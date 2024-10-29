package nestedLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int firstMultiplier = 1; firstMultiplier <= 10; firstMultiplier++) {
            for (int secondMultiplier = 1; secondMultiplier <= 10; secondMultiplier++) {
                int result = firstMultiplier * secondMultiplier;
                System.out.printf("%d * %d = %d%n", firstMultiplier, secondMultiplier, result);
            }
        }
    }
}
