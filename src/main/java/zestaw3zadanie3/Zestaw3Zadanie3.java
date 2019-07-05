/*
Napisz program, który:
• stworzy tablice (macierz) 5 x 5 liczb całkowitych,
• wypełnij ja losowymi wartosciami z zakresu {−5,−4, . . . , 5},
• dla kazdej kolumny wyznacz minimum,
• dla kazdej kolumny wyznaczy maksimum.
Program ma wyswietlac tablice wypełniona liczbami oraz tablice z minimami oraz
maksymami.
 */

package zestaw3zadanie3;

import java.util.Random;

public class Zestaw3Zadanie3 {

    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        Integer[][] tab = new Integer[5][5];
        Integer[] tabMax = {-6,-6,-6,-6,-6};
        Integer[] tabMin = {6,6,6,6,6};
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = -5 + random.nextInt(11);
            }
        }

        for (Integer[] integer : tab) {
            for (int i = 0; i < integer.length; i++) {
                if (integer[i] > tabMax[i]) {
                    tabMax[i] = integer[i];
                }

                if (integer[i] < tabMin[i]) {
                    tabMin[i] = integer[i];
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (Integer integer : tabMin) {
                System.out.print(integer +" ");
        }
        System.out.println();

        for (Integer integer : tabMax) {
            System.out.print(integer +" ");

        }
        System.out.println();


    }
}
