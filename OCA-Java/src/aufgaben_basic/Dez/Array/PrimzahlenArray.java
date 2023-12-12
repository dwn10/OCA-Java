package aufgaben_basic.Dez.Array;

import java.util.ArrayList;

/* Aufgabe: Primzahlen finden:
Erstelle eine Funktion, die alle Primzahlen in einem Array von Ganzzahlen identifiziert.
 */

import java.util.Scanner;

public class PrimzahlenArray {

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach einer Ganzzahl.
        System.out.println("\n****************************************");
        System.out.println("Geben Sie eine Ganzzahl ein:");
        int n = scanner.nextInt();

        // Rufe die Funktion `findePrimzahlen()` auf und speichere das Ergebnis in der
        // Variable `primzahlen`.
        String primzahlen = findePrimzahlen(n);

        // Gib das Ergebnis aus.
        System.out.println("\n****************************************");
        System.out.println("Die Primzahlen bis " + n + " sind: " + primzahlen);
    }

    // Funktion zum Finden von Primzahlen.
    private static String findePrimzahlen(int n) {
        // Initialisiere die Liste der Primzahlen.
        ArrayList<Integer> primzahlen = new ArrayList<>();

        // Gehe von 2 bis n.
        for (int i = 2; i <= n; i++) {
            // Prüfe, ob i eine Primzahl ist.
            if (istPrimzahl(i)) {
                // Wenn i eine Primzahl ist, dann füge sie der Liste hinzu.
                primzahlen.add(i);
            }
        }

        // Konvertiere die Liste der Primzahlen in eine Zeichenkette.
        String primzahlenString = primzahlen.toString();

        // Entferne die Klammern und Anführungszeichen aus der Zeichenkette.
        primzahlenString = primzahlenString.substring(1, primzahlenString.length() - 1);

        // Gib die Zeichenkette zurück.
        return primzahlenString;
    }

    // Funktion zum Prüfen, ob eine Zahl eine Primzahl ist.
    private static boolean istPrimzahl(int n) {
        // Wenn n kleiner oder gleich 1 ist, dann ist sie keine Primzahl.
        if (n <= 1) {
            return false;
        }

        // Prüfe, ob n durch eine Zahl von 2 bis zur Quadratwurzel von n teilbar ist.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                // Wenn n durch eine Zahl teilbar ist, dann ist sie keine Primzahl.
                return false;
            }
        }

        // Wenn n keine der vorhergehenden Bedingungen erfüllt, dann ist sie eine
        // Primzahl.
        return true;
    }
}