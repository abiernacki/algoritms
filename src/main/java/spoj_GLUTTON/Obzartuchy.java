package spoj_GLUTTON;

import java.util.Scanner;

public class Obzartuchy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){

            String[] tab = scanner.nextLine().split(" ");
            int ileOsob = Integer.parseInt(tab[0]);
            double iloscCiastek = Double.parseDouble(tab[1]);
            double day = 86400;
            double zjedli = 0;
            for (int j = 0; j < ileOsob; j++){

                zjedli += Math.floor(day / Double.parseDouble(scanner.nextLine()));
            }
            System.out.println(Math.ceil(zjedli / iloscCiastek));
        }
    }
}
