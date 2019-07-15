/*
Napisz program, który pobiera od uzytkownika dodatnia liczbe naturalna n i
tworzy tablice a zmiennych typu logicznego (boolean) o rozmiarze n×n. Nastepnie
program powinien wypełnic utworzona tablice, tak by a[i][j] = true jezeli liczby
(i+1) oraz (j+1) sa wzglednie pierwsze, tzn. nie maja wspólnych dzielników poza
1. Tak utworzona tablice nalezy wypisac na ekranie, przy czym dla wartosci true
nalezy wyswietlic znak ”+”, natomiast dla wartosci false znak ”.”. Przykład:
 */

package Algoritm9;

import java.util.Scanner;

public class Zestaw3Zadanie9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą większą od 0:");
        int n = scanner.nextInt();

        boolean[][] tab = new boolean[n][n];
        int moduloRest;
        int firstNumber;
        int secondNumber;


        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                firstNumber = (i + 1);
                secondNumber = (j + 1);
                while (secondNumber != 0) {
                    moduloRest = firstNumber % secondNumber;
                    firstNumber = secondNumber;
                    secondNumber = moduloRest;
                }
                if (firstNumber == 1) {
                    tab[i][j] = true;
                } else {
                    tab[i][j] = false;
                }

            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] == true) {
                    System.out.print("+" + " ");
                } else
                    System.out.print("." + " ");

            }
            System.out.println();
        }


    }
}
