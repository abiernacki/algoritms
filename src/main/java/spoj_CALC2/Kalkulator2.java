package spoj_CALC2;

import java.util.Scanner;

public class Kalkulator2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tekst;
        int[] liczby = new int[10];

        while (!(tekst = scanner.nextLine()).equals("")) {

            String[] tab = tekst.split(" ");
            int a = Integer.parseInt(tab[1]);
            int b = Integer.parseInt(tab[2]);

            switch (tab[0]) {

                case "+":
                    System.out.println(liczby[a] + liczby[b]);
                    break;
                case "-":
                    System.out.println(liczby[a] - liczby[b]);
                case "*":
                    System.out.println(liczby[a] * liczby[b]);
                    break;
                case "/":
                    System.out.println(liczby[a] / liczby[b]);
                    break;
                case "%":
                    System.out.println(liczby[a] % liczby[b]);
                    break;
                default:
                    liczby[a] = b;
                    break;
            }
        }
    }
}
