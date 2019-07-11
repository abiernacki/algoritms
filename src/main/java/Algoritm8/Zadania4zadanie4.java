/*
Napisac program, który sumuje cyfry w tekscie podanym przez uzytkownika.
 */

package Algoritm8;

import java.util.Scanner;

public class Zadania4zadanie4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringi = scanner.nextLine();

        int[] numbers = {48, 49, 50, 51, 52, 53, 54, 56, 57, 58};

        int sum = 0;
        int temp = 0;
        for (int i = 0; i < stringi.length(); i++) {
            for (int j = 0; j < numbers.length; j++) {
                temp = stringi.charAt(i);
                if (temp == numbers[j]) {
                    sum += (temp % 48);
                }
            }
        }
        System.out.println(sum);
    }
}
