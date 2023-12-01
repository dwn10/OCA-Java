package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Anagramme prüfen
Schreibe ein Programm, das den Benutzer nach zwei Wörtern fragt und dann prüft,
ob diese Wörter Anagramme voneinander sind (d.h. dieselben Buchstaben in
unterschiedlicher Reihenfolge enthalten).  */

import java.util.Arrays;
import java.util.Scanner;

public class AnagrammePrüfen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*********************************************************");
        System.out.print("\nBitte geben Sie das erste Wort ein: ");
        String word1 = scanner.nextLine();

        System.out.print("\nBitte geben Sie das zweite Wort ein: ");
        String word2 = scanner.nextLine();

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        boolean areAnagrams = Arrays.equals(word1Array, word2Array);

        if (areAnagrams) {
            System.out.println("\n*********************************************************");
            System.out.printf("'%s' und '%s' sind Anagramme voneinander.", word1, word2);
            System.out.println("\n*********************************************************");
        } else {
            System.out.println("\n*********************************************************");
            System.out.printf("'%s' und '%s' sind keine Anagramme voneinander.", word1, word2);
            System.out.println("\n*********************************************************");
        }
    }
}
