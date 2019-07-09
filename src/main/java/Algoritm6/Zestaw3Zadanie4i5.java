/*
Napisac program, który wczytuje od uzytkownika liczbe całkowita, a nastepnie
wyswietla jej reprezentacje w kodzie binarnym (ZM). Podczas konwersji liczby
nalezy kolejne jej bity zapisywac w pomocniczej tablicy liczb całk. o rozmiarze
32. Konwersji nalezy dokonac korzystajac z operacji dzielenia całkowitego oraz
operacji modulo.

Dodatkowo wyswietli liczbe w pozostałych kodach, a wiec ZU1 oraz ZU2.
 */

package Algoritm6;

import java.util.Scanner;

public class Zestaw3Zadanie4i5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] tab = new int[32];
        int[] tabU2 = new int[32];
        int i = 0;
        int inputMinus = input;

        while (input != 0) {

            if (input < 0) {
                input *= -1;
            }

            tab[31 - i] = input % 2;
            input = input / 2;
            i++;

        }
        if (inputMinus < 0) {
            System.out.print("ZM: Liczba " + inputMinus + " binarnie: 1.");
        } else {
            System.out.print("ZM: Liczba " + inputMinus + " binarnie: ");
        }

        for (int j = tab.length - i; j < tab.length; j++) {
            System.out.print(tab[j]);
        }
        System.out.println();

        for (int k = 0; k < tab.length; k++) {
            if (tab[k] == 0) {
                tab[k] = 1;
            } else if (tab[k] == 1) {
                tab[k] = 0;
            }
        }

        if (inputMinus < 0) {
            System.out.print("U1: Liczba " + inputMinus + " binarnie: 1.");
        } else {
            System.out.print("U1: Liczba " + inputMinus + " binarnie: ");
        }

        for (int j = tab.length - i; j < tab.length; j++) {
            System.out.print(tab[j]);
        }
        System.out.println();

        if (inputMinus < 0) {
            System.out.print("U2: Liczba " + inputMinus + " binarnie: 1.");
            String inputString = Integer.toBinaryString(inputMinus);
            System.out.println(inputString.substring(31 - i, 31));
        } else {
            System.out.println("U2: Liczba " + inputMinus + " binarnie: " + Integer.toBinaryString(inputMinus));
        }
    }
}

