package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Textumkehrung ohne Wörter umdrehen
Schreibe ein Programm, das den Benutzer nach einem Satz fragt und dann die
Reihenfolge der Wörter umdreht, aber jedes Wort bleibt in seiner ursprünglichen
Reihenfolge.  */

import java.util.Scanner;

public class TextUmkehrenOhneWörterUmdrehen {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einem Satz fragen
        System.out.println("**************************************");
        System.out.println("\nGeben Sie einen Satz ein: ");
        String satz = scanner.nextLine();

        // Satz in Wörter zerlegen
        String[] wörter = satz.split(" ");

        // Wörter in umgekehrter Reihenfolge
        String[] umgekehrteWörter = new String[wörter.length];
        for (int i = wörter.length - 1; i >= 0; i--) {
            umgekehrteWörter[wörter.length - 1 - i] = wörter[i];
        }

        // Umgekehrten Satz ausgeben
        System.out.println("**************************************");
        System.out.println("Der umgekehrte Satz lautet: " + String.join(" ", umgekehrteWörter));
        System.out.println("**************************************");
    }
}