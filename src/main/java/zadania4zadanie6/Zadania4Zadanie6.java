/*
Napisz program, który umozliwia szyfrowanie podanego ciagu znaków przy użyciu szyfru Cezara,
który jest szczególnym przypadkiem szyfru podstawieniowego monoalfabetycznego.

Uzytkownik program podaje tekst do zaszyfrowania oraz liczbe n, o która przesuniety
jest alfabet za pomoca którego szyfrujemy tekst. Dla uproszczenia mozna
przyjac, ze łanuch wejsciowy składa sie tylko z małych liter alfabetu angielskiego,
tj. ’a’ – ’z’ (26 znaków) oraz spacji.
 */


package zadania4zadanie6;

import java.util.Scanner;

public class Zadania4Zadanie6 {

    public static void main(String[] args) {

        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków do zaszyfrowania:");
        String text = scanner.nextLine();
        System.out.println("Podaj przesunięcie:");
        int code = scanner.nextInt();

        char[] textDivided = text.toCharArray();

        String encodedText = "";
        char letter;
        for (int i = 0; i < textDivided.length; i++) {
            for (int j = 0; j < alfabet.length; j++) {
                letter = textDivided[i];
                if (letter == alfabet[j]) {
                    encodedText = encodedText + alfabet[(j + code) % 27];
                }
            }
        }

        System.out.println(encodedText);


    }
}
