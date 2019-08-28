package spoj_EUCGAME;

import java.util.Scanner;

public class GraEuklidesa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i< t; i++){

            String[] tab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(tab[0]);
            int b = Integer.parseInt(tab[1]);
            int tmp = 0;

            while (a != b){

                tmp = a;
                a -= b;
                if (a < 0){

                    b = -a;
                    a = tmp;
                }

            }
            System.out.println(a + b);
        }
    }
}
