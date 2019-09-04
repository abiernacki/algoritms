package spoj_TABLICA;

import java.util.Scanner;

public class Tablica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] tab = scanner.nextLine().split(" ");

        for (int i = tab.length - 1; i >= 0; i--){
            System.out.print(tab[i] + " ");
        }
    }
}
