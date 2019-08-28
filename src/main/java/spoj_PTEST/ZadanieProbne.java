package spoj_PTEST;

import java.util.Scanner;

public class ZadanieProbne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(Sum(a, b));

    }

    private static int Sum(int a, int b) {
        return a + b;
    }
}
