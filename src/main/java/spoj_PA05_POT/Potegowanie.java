package spoj_PA05_POT;

import java.util.Scanner;

public class Potegowanie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] ostCyfra =
                {
                        {0, 0, 0, 0},
                        {1, 1, 1, 1},
                        {6, 2, 4, 8},
                        {1, 3, 9, 7},
                        {6, 4, 6, 4},
                        {5, 5, 5, 5},
                        {6, 6, 6, 6},
                        {1, 7, 9, 3},
                        {6, 8, 4, 2},
                        {1, 9, 1, 9},
                };

        int ile = scanner.nextInt();
        for (int i = 0; i < ile; i++) {

            long podstawa = scanner.nextLong();
            long potega = scanner.nextLong();

            System.out.println(ostCyfra[(int) (podstawa % 10)][(int) (potega % 4)]);
        }

    }
}

