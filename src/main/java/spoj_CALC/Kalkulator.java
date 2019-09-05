package spoj_CALC;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tekst;

        while (!(tekst = scanner.nextLine()).equals("")) {

            String[] tab = tekst.split(" ");
            int a = Integer.parseInt(tab[1]);
            int b = Integer.parseInt(tab[2]);

            switch (tab[0]) {

                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                case "%":
                    System.out.println(a % b);
                    break;

            }
        }
    }
}
