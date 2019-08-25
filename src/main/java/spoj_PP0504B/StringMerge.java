package spoj_PP0504B;

import java.util.Scanner;

public class StringMerge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] tekst = scanner.nextLine().split(" ");
            System.out.println(Polacz(tekst[0],tekst[1]));
        }
    }

    public static String Polacz(String a, String b){

        int dlugosc = a.length() < b.length() ? a.length() : b.length();
        String wynik = "";
        String[] tabA  = a.split("");
        String[] tabB  = b.split("");
        for (int i = 0; i < dlugosc; i++){

            wynik += tabA[i];
            wynik += tabB[i];
        }
        return wynik;
        }
}
