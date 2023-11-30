package aufgaben_basic.Nov;

/* Aufgabe: Wortzähler
Schreibe ein Programm, das den Benutzer nach einem Satz
fragt und dann die Anzahl der Wörter im Satz ausgibt.  */

import java.util.Scanner;

public class Wortzaehler1 {

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach einem Satz.
        System.out.println("\n Geben Sie einen Satz ein:");
        String satz = scanner.nextLine();

        // Initialisiere die Variable zur Speicherung der Anzahl der Wörter.
        int wortanzahl = 0;

        // Gehe von der ersten Position des Satzes bis zum Ende des Satzes.
        for (int i = 0; i < satz.length(); i++) {
            // Wenn das aktuelle Zeichen ein Leerzeichen ist, dann ist das Ende eines Wortes
            // erreicht.
            if (satz.charAt(i) == ' ') {
                // Erhöhe die Anzahl der Wörter um 1.
                wortanzahl++;
            }
        }

        // Wenn der Satz mit einem Leerzeichen endet, dann ist das Ende eines Wortes
        // erreicht.
        if (satz.charAt(satz.length() - 1) == ' ') {
            // Erhöhe die Anzahl der Wörter um 1.
            wortanzahl++;
        }

        // Gib die Anzahl der Wörter aus.
        System.out.println("\n Die Anzahl der Wörter im Satz sind " + wortanzahl + ".");
    }
}
