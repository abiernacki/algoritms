package Algoritm12;

import java.util.Scanner;

public class Zadania9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość:");
        int wys = scanner.nextInt();

        System.out.println("Podaj grubość:");
        int gru = scanner.nextInt();

        System.out.println("Podaj szerokość:");
        int szer = scanner.nextInt();

        for (int i = 1; i < szer; i++) {
            for (int j = 0; j < szer - gru; j++) {
                System.out.print("L");
            }
            System.out.println();
        }

        for (int i = 0; i < gru; i++) {
            for (int j = 1; j < szer; j++) {
                System.out.print("L");
            }
            System.out.println();
        }
    }
}