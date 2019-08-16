package spoj_FZI_STEF;

import java.util.Scanner;

public class Stefan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] zyskStrataKazdegoMiasta = new int[1000];
        int sumaZyskówiStrat;
        int max = 0;

        int iloscMiast = scanner.nextInt();

        for (int i = 0; i < iloscMiast; i++)
            zyskStrataKazdegoMiasta[i] = scanner.nextInt();

        for (int miastoStartowe = 0; miastoStartowe < iloscMiast; miastoStartowe++)
            for (int miastoKoncowe = miastoStartowe; miastoKoncowe < iloscMiast; miastoKoncowe++) {
                sumaZyskówiStrat = 0;
                for (int i = miastoStartowe; i <= miastoKoncowe; i++) {
                    sumaZyskówiStrat += zyskStrataKazdegoMiasta[i];
                    if (sumaZyskówiStrat > max)
                        max = sumaZyskówiStrat;
                }
            }
        System.out.println(max);
    }
}
