package spoj_BINOMS;

import java.util.Scanner;

public class Dwumiany {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {

            String[] tab = scanner.nextLine().split(" ");
            double a = Double.parseDouble(tab[0]);
            double b = Double.parseDouble(tab[1]);
            System.out.println((int)Newton(a, b));

        }
    }

    private static double Newton(double a, double b) {

        double wynik = 1;
        for (int i = 1; i <= b; i++) {

            wynik = (wynik * (a - i + 1)) / i;
        }
        return Math.round(wynik);
    }
}
