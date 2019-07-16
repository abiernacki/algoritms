package Algoritm10;

import java.util.Random;

public class Zestaw3Zadanie2 {

    public static void main(String[] args) {

        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int tab[] = new int[20];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 1) {
                one++;
            }
            if (tab[i] == 2) {
                two++;
            }
            if (tab[i] == 3) {
                three++;
            }
            if (tab[i] == 4) {
                four++;
            }
            if (tab[i] == 5) {
                five++;
            }
            if (tab[i] == 6) {
                six++;
            }
            if (tab[i] == 7) {
                seven++;
            }
            if (tab[i] == 8) {
                eight++;
            }
            if (tab[i] == 9) {
                nine++;
            }
            if (tab[i] == 10) {
                ten++;
            }
        }

        System.out.println("Wylosowane liczby: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        System.out.println("Wystąpienia:");
        System.out.println("1 - " + one);
        System.out.println("2 - " + two);
        System.out.println("3 - " + three);
        System.out.println("4 - " + four);
        System.out.println("5 - " + five);
        System.out.println("6 - " + six);
        System.out.println("7 - " + seven);
        System.out.println("8 - " + eight);
        System.out.println("9 - " + nine);
        System.out.println("10 - " + ten);

    }
}
