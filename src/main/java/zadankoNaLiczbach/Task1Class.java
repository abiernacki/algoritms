// Napisać program, który tworzy dwuwymiarową tablicę liczb całkowitych o losowej wielkości (wylosowanej z
//zakresu [10, 20]), gdzie liczba wierszy jest taka sama, jak liczba kolumn.

//Następnie tablica zostaje uzupełniona liczbami losowymi z zakresu [-100, 100], z wyjątkiem elementów
//znajdujących się na przekątnej tablicy, które w (losowo) ok. 50% przypadków otrzymują wartość 1, a w
//pozostałych 50% przypadków wartość -1.

package zadankoNaLiczbach;

import java.util.Random;

public class Task1Class {

    public static void main(String[] args) {

        Random random = new Random();

        int n = random.nextInt(3) + 4;


        int[][] tab = new int[n][n];
        int[] tabPom = {1, -1};


        int temp = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(201) - 100;
                if (i == j) {
                    temp = random.nextInt(2);
                    tab[i][j] = tabPom[temp];
                }
                if (j == n - 1 - i) {
                    temp = random.nextInt(2);
                    tab[i][j] = tabPom[temp];
                }
            }
        }

        int[] max = new int[2];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (max[0] < tab[i][j]) {
                    max[0] = tab[i][j];
                }
                if (max[0] > max[1]) {
                    temp = max[1];
                    max[1] = max[0];
                    max[0] = temp;
                }
            }

        }
        System.out.println("MAX1: " + max[0]);
        System.out.println("MAX2: " + max[1]);

        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if(i*j > tab[i][j]){
                    count++;
                }
            }
        }

        System.out.println("LICZBA KOMÓREK ILOCZYNU: " + count);

        int sumParzyste = 0;
        int sumNieparzyste = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (i % 2 == 0) {
                    sumParzyste = sumParzyste + tab[i][j];
                }
                if (j % 2 != 0) {
                    sumNieparzyste = sumNieparzyste + tab[i][j];
                }
            }
        }

        System.out.println("SUMA parzyste: " + sumParzyste);
        System.out.println("SUMA nieparzyste: " + sumNieparzyste);

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
