package conditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commissions = 0;

        boolean isValid = true;

        switch (town) {
            case "Sofia" -> {
                if (sales >= 0 && sales <= 500) {
                    commissions = sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commissions = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commissions = sales * 0.08;
                } else if (sales > 10000) {
                    commissions = sales * 0.12;
                } else isValid = false;
            }
            case "Varna" -> {
                if (sales >= 0 && sales <= 500) {
                    commissions = sales * 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    commissions = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    commissions = sales * 0.10;
                } else if (sales > 10000) {
                    commissions = sales * 0.13;
                } else isValid = false;
            }
            case "Plovdiv" -> {
                if (sales >= 0 && sales <= 500) {
                    commissions = sales * 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    commissions = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commissions = sales * 0.12;
                } else if (sales > 10000) {
                    commissions = sales * 0.145;
                } else isValid = false;
            }
            default -> isValid = false;
        }

        if (!isValid) {
            System.out.printf("error%n");
        } else {
            System.out.printf("%.2f%n", commissions);
        }
    }
}
