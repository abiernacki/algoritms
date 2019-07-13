/*
Wkrótce święta, a jak są święta, to musi być choinka. Narysuj więc choinkę o zadanej wysokości n.

Do rysowania choinki używamy pięciu znaków: | _ / \ o oraz znaku spacji. I tak:
- n znaków "|" (n-1 będących częścią korony, 1 znak będący pniem nie należącym do korony)
- 2*(n-2) znaków "_" będących podstawą korony
- n-1 znaków "/" i n-1 znaków "\" oznaczające kontury korony
- 1 znak "o" umieszczony na szczycie choinki.

Rysunek składa się z n+1 wierszy, gdzie k-ty wiersz za wyjątkiem ostatniego zawiera dokładnie n-1+k znaków
 w tym spacje. Wiersz ostatni zawiera n-1 spacji i jeden znak "|". Rysunek kończy znak końca linii.

 Poniżej choinka o wysokości 3:

  o
 /|\
/_|_\
  |

 */

package christmasTree;

public class Choinka {

    public static void main(String[] args) {
        int n = 6;

        // tip
        for (int p = 0; p < n - 1; p++) {
            System.out.print(" ");
        }
        System.out.print("o");
        System.out.println();
        for (int p = 0; p < n - 2; p++) {
            System.out.print(" ");
        }
        System.out.println("/|\\");

        // christmas tree center
        for (int i = 0; i < n - 2; i++) {
            if (i == (n - 3)) {
                int k = 2 * (n - 2);
                System.out.print("/");
                for (int p = 0; p < k / 2; p++) {
                    System.out.print("_");
                }
                System.out.print("|");
                for (int p = 0; p < k / 2; p++) {
                    System.out.print("_");
                }
                System.out.print("\\");
                System.out.println();
            } else {
                for (int p = 0; p < n - i - 3; p++) {
                    System.out.print(" ");
                }
                System.out.print("/");

                for (int p = 0; p < n + i - 5; p++) {
                    System.out.print(" ");
                }
                System.out.print("|");

                for (int p = 0; p < n + i - 5; p++){
                    System.out.print(" ");
                }
                System.out.print("\\");

                System.out.println();
            }
        }
        // trunk
        for (int p = 0; p < n - 1; p++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
    }

}
