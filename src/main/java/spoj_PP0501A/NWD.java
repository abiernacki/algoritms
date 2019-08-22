package spoj_PP0501A;

import java.util.Scanner;

public class NWD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {

            String tekst = scanner.nextLine();
            ;
            String[] tekstTab = tekst.split(" ");
            int a = Integer.parseInt(tekstTab[0]);
            int b = Integer.parseInt(tekstTab[1]);

            System.out.println(nwd(a, b));
        }

    }

    public static int nwd(int a, int b) {

        while (b != 0){

            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
