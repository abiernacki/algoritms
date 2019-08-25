package spoj_PP0502B;

import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i =0; i< t; i++){

            String tekst = scanner.nextLine();
            tekst = tekst.substring(2);
            String[] tekstTab = tekst.split(" ");
            for (int j = tekstTab.length - 1; j >= 0; j--){

                System.out.print(tekstTab[j] + " ");
            }
            System.out.println();
        }
    }
}
