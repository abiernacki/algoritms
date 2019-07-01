// Napisac program, który:

// utworzy tablice 10 liczb całkowitych i wypełni ja wartosciami losowymi z
// przedziału [−10, . . . , 10],

// wypisze na ekranie zawartosc tablicy,

// wyznaczy najmniejszy oraz najwieszy element w tablicy,

// wyznaczy srednia arytmetyczna elementów tablicy,

// wyznaczy ile elementów jest mniejszych, ile wiekszych od sredniej.

// wypisze na ekranie zawartosc tablicy w odwrotnej kolejnosci, tj. od ostatnie-
//go do pierwszego.

package zestaw3zadanie1;

import java.util.Random;

public class Zestaw3Zadanie1 {

    public static void main(String[] args) {

        int max = 0;
        int min = 0;
        int less = 0;
        int more = 0;
        float sum = 0;
        float avg = 0;
        int tab[] = new int[10];
        int tabReverse[] = new int[tab.length];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = -10 + random.nextInt(21);
        }

        System.out.println("Wylosowane liczby: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
            if (max < tab[i]) {
                max = tab[i];
            }
            if (min > tab[i]) {
                min = tab[i];
            }
            sum += tab[i];
        }
        System.out.println();

        avg = sum / tab.length;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > avg) {
                more++;
            }
            if (tab[i] < avg) {
                less++;
            }
        }

        System.out.println("Min: " + min + ", max:" + max);
        System.out.println("Średnia: " + avg);
        System.out.println("Mniejszych od śr.: " + more);
        System.out.println("Większych od śr.: " + less);


        for (int i = tab.length - 1; i > 0; ) {
            for (int j = 0; j < tab.length; j++) {
                tabReverse[j] = tab[i];
                i--;
            }
        }

        System.out.println("Liczby w odrwrotnej kolejności:");
        for (int i = 0; i < tabReverse.length; i++) {
            System.out.print(tabReverse[i] + " ");
        }

        System.out.println();
    }
}
