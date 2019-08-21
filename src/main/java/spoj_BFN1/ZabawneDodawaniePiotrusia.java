package spoj_BFN1;

import java.util.Scanner;

public class ZabawneDodawaniePiotrusia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {

            int ile= 0;
            String tekst = scanner.nextLine();
            int liczba = Integer.parseInt(tekst);
            int odwrotnie = 0;
            String tekst2 = "";

            do {

                for (int j = (tekst.length() - 1); j >= 0 ; j--){
                    char[] tekstTab = tekst.toCharArray();
                    tekst2 += tekstTab[j];
                }
                odwrotnie = Integer.parseInt(tekst2);
                if (liczba == odwrotnie){
                    break;
                }
                ile++;
                liczba += odwrotnie;
                tekst = String.valueOf(liczba);
                tekst2 = "";
            }while(true);
            System.out.println(liczba + " " + ile);
        }
    }
}
