/*
Napisac program, który wczytuje od uzytkownika ciag znaków, a nastepnie
sprawdza, czy podany ciag jest palindromem.
 */

package Algoritm7;

import java.util.Scanner;

public class Zadania4zadanie3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringi = scanner.nextLine();

        stringi.toLowerCase();
        char[] tab = stringi.toCharArray();
        char[] reverseTab = new char[stringi.length()];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                reverseTab[tab.length - 1 - i] = tab[i];
            }
        }

        for (int i = 0; i < reverseTab.length; i++) {
            if (tab[i] == reverseTab[i]) {
                System.out.println("Jest palindromem");
                break;
            } else {
                System.out.println("Nie jest palindromem");
                break;
            }
        }
    }
}

