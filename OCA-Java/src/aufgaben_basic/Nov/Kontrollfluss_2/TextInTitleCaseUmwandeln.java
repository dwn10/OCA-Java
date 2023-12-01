package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Text in Title Case umwandeln
Schreibe ein Programm, das den Benutzer nach einem Satz fragt und dann jeden
Wortanfang in Großbuchstaben umwandelt.  */

import java.util.ArrayList;
import java.util.List;

public class TextInTitleCaseUmwandeln {

    // Hilfsmethode, um ein Wort in Title Case umzuwandeln
    private static String wortInTitleCase(String wort) {
        return wort.substring(0, 1).toUpperCase() + wort.substring(1);
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Satz fragen
        System.out.println("\nGeben Sie einen Satz ein: ");
        String satz = System.console().readLine();

        // Satz in eine Liste von Wörtern zerlegen
        String[] wörter = satz.split(" ");

        // Liste von Wörtern in Title Case umwandeln
        List<String> wörterInTitleCase = new ArrayList<>();
        for (String wort : wörter) {
            wörterInTitleCase.add(wortInTitleCase(wort));
        }

        // Liste von Wörtern in einen Satz zusammenfügen
        String titelCaseSatz = String.join(" ", wörterInTitleCase);

        // Satz ausgeben
        System.out.println("\nDer Satz in Title Case lautet: " + titelCaseSatz);
    }
}
