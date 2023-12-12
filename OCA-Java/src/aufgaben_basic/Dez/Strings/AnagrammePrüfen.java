package aufgaben_basic.Dez.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagrammePrüfen {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Erstes Wort einlesen
        System.out.println("\n******************************");
        System.out.println("Geben Sie das erste Wort ein: ");
        String wort1 = scanner.nextLine();

        // Zweites Wort einlesen
        System.out.println("******************************");
        System.out.println("Geben Sie das zweite Wort ein: ");
        String wort2 = scanner.nextLine();

        // Anagramm-Prüfung durchführen
        boolean istAnagramm = istAnagramm(wort1, wort2);

        // Ergebnis ausgeben
        if (istAnagramm) {
            System.out.println("******************************");
            System.out.println("Die beiden Wörter sind Anagramme.");
        } else {
            System.out.println("******************************");
            System.out.println("Die beiden Wörter sind keine Anagramme.");
        }
    }

    // Funktion zum Prüfen, ob zwei Strings Anagramme sind
    public static boolean istAnagramm(String wort1, String wort2) {

        // Wörter in Großbuchstaben umwandeln
        wort1 = wort1.toUpperCase();
        wort2 = wort2.toUpperCase();

        // Wörter in Listen umwandeln
        char[] wort1Array = wort1.toCharArray();
        char[] wort2Array = wort2.toCharArray();

        // Wörter sortieren
        Arrays.sort(wort1Array);
        Arrays.sort(wort2Array);

        // Vergleichen, ob die beiden Listen gleich sind
        return Arrays.equals(wort1Array, wort2Array);
    }
}
