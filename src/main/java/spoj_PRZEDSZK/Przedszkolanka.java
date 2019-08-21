package spoj_PRZEDSZK;

import java.util.Scanner;

public class Przedszkolanka {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++){

            String tekst = scanner.nextLine();

            String[] tekstTab = tekst.split(" ");
            int mniejsza = Integer.parseInt(tekstTab[0]);
            int wieksza = Integer.parseInt(tekstTab[1]);

            int tmp;
            if (mniejsza > wieksza){
                tmp = mniejsza;
                mniejsza = wieksza;
                wieksza = tmp;
            }

            int wynik = wieksza;
            while (wynik % mniejsza != 0 || wynik % wieksza != 0){

                wynik += wieksza;
            }
            System.out.println(wynik);
        }
    }
}
