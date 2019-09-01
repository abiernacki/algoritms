package spoj_SUMA;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String a;
        while ((a = scanner.nextLine()) != null){

            System.out.println(suma += Integer.parseInt(a));
        }
    }
}
