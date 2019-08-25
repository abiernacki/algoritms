package spoj_ETI06F1;

import java.util.Scanner;

public class PolePewnegoKola {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        String[] tekstTab = tekst.split(" ");
        double r = Double.parseDouble(tekstTab[0]);
        double d = Double.parseDouble(tekstTab[1]);
        System.out.println(ObliczPole(r, d));
    }

    public static double ObliczPole(double r, double d) {

        double pi = 3.141592654;
        double wynik = pi * (-1 * ((d / 2) * (d / 2) - r * r));
        return wynik;
    }
}
