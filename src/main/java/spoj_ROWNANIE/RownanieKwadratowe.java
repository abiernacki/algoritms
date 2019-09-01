package spoj_ROWNANIE;

import java.util.Scanner;

public class RownanieKwadratowe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String liczby;

        while ((liczby = scanner.nextLine()) != null) {

            String[] tab = liczby.split(" ");
            float a = Float.parseFloat(tab[0]);
            float b = Float.parseFloat(tab[1]);
            float c = Float.parseFloat(tab[2]);
            float delta = b * b - 4 * a * c;

            if (delta > 0) {
                System.out.println("2");
            } else if (delta == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

        }
    }
}
