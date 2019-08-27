package spoj_PTROL;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class Rol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {

            String[] tab = scanner.nextLine().split(" ");
            Queue<String> kolejka = new ArrayDeque<String>();

            for (int j = 0; j < tab.length; j++) {

                kolejka.add(tab[j]);
            }

            ((ArrayDeque<String>) kolejka).removeFirst();
            String var = ((ArrayDeque<String>) kolejka).removeFirst();
            kolejka.add(var);

            Iterator<String> it = kolejka.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
            System.out.println();
        }
    }
}
