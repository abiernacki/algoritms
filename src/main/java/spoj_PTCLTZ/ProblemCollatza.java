package spoj_PTCLTZ;

import java.util.Scanner;

public class ProblemCollatza {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {

            int s = Integer.parseInt(scanner.nextLine());
            System.out.println(oblicz(s, 0));
        }
    }

    private static int oblicz(int s, int n) {

        if (s == 1) {
            return n;
        } else {
            if (s % 2 == 1) {
                return oblicz(3 * s + 1, ++n);
            } else {
                return oblicz(s / 2, ++n);
            }
        }
    }
}
