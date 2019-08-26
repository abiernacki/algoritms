package spoj_GLUTTON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Obzartuchy {

    public static void main(String[] args) throws IOException {

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scanner.readLine());

        for (int i = 0; i < n; i++){

            String[] tab = scanner.readLine().split(" ");
            int ileOsob = Integer.parseInt(tab[0]);
            double iloscCiastek = Double.parseDouble(tab[1]);
            double day = 86400;
            double zjedli = 0;
            for (int j = 0; j < ileOsob; j++){

                zjedli += Math.floor(day / Double.parseDouble(scanner.readLine()));
            }
            System.out.println((int)Math.ceil(zjedli / iloscCiastek));
        }
    }
}
