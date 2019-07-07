/*
Napisać program, który wczytuje od użytkownika liczbę oznaczającą,
ile należy wylosować liczb z zakresu od -100 do 100.
Następnie dokonuje obliczeń stosunku wylosowanych liczb dodatnich do liczb ujemnych oraz najmniejsze i
największej znalezionej liczby.
Wynikiem działania programu powinna być informacja na temat wszystkich trzechwartości.

W programie nie należy używać tablic.
 */

package zestaw4zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Zestaw4Zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Podaj ilość liczb");
        int number = scanner.nextInt();

        int[] numbers = new int[number];

        int CounterMinus = 0;
        int CounterPlus = 0;
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = -100 + generator.nextInt(201);

            if (numbers[i] < 0) {
                CounterMinus++;
            } else if (numbers[i] > 0) {
                CounterPlus++;
            }
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }

        System.out.print("//bo stosunek " + CounterPlus + "/" + CounterMinus + " min: " + min + ", max: " + max);
    }
}
