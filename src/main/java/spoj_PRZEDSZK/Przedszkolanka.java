package spoj_PRZEDSZK;

import java.util.Scanner;

public class Przedszkolanka {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int mniejsza;
        int wieksza;
        int tmp;


        for (int i = 0; i < N; i++){

            Scanner scanner1 = new Scanner(System.in);
            String tekst = scanner1.nextLine();

            String[] tekstTab = tekst.split(" ");
            mniejsza = Integer.parseInt(tekstTab[0]);
            wieksza = Integer.parseInt(tekstTab[1]);

            if (mniejsza > wieksza){
                tmp = mniejsza;
                wieksza = mniejsza;
                mniejsza = tmp;
            }

            int wynik = wieksza;
            while (wynik % mniejsza != 0 || wynik % wieksza != 0){

                wynik += wieksza;
            }
            System.out.println(wynik);
        }
    }
}
