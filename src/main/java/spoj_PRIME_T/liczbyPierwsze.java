package spoj_PRIME_T;

import java.util.Scanner;

public class liczbyPierwsze {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String wynik;

        for (int i = 0; i < n; i++) {

            wynik = czyPierwsza(scanner.nextInt()) ? "TAK" : "NIE";
            System.out.println(wynik);
        }
    }

    public static boolean czyPierwsza(int a) {

        if (a == 1) {
            return false;
        }
        for (int i = 2; i < (a / 2) + 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
