package spoj_RNO_DOD;

import java.util.Scanner;

public class ProsteDodawanie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {

            int ile = Integer.parseInt(scanner.nextLine());
            String tekst = scanner.nextLine();
            String[] tekstTab = tekst.split(" ");
            int wynik = 0;

            for (String aTekstTab : tekstTab) {

                wynik += Integer.parseInt(aTekstTab);
            }
            System.out.println(wynik);
        }
    }
}
