package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Text in römische Zahlen umwandeln
Schreibe ein Programm, das den Benutzer nach einer Zahl fragt und dann diese Zahl
in römische Zahlen umwandelt.  */

import java.util.Scanner;

public class TextInRömischeZahlenUmwandeln {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einer Zahl fragen
        System.out.println("**************************************");
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();

        // Zahl in römische Zahlen umwandeln
        String römischeZahl = zahlInRömischeZahlen(zahl);

        // Römische Zahl ausgeben
        System.out.println("**************************************");
        System.out.println("Die Zahl " + zahl);
        System.out.println("in römischen Zahlen ist: " + römischeZahl);
        System.out.println("**************************************");
    }

    // Zahl in römische Zahlen umwandeln
    private static String zahlInRömischeZahlen(int zahl) {

        // Römische Zahlen
        String[] römischeZahlen = { "I", "V", "X", "L", "C", "D", "M" };

        // Römische Zahlenwerte
        int[] römischeZahlenWerte = { 1, 5, 10, 50, 100, 500, 1000 };

        // Römische Zahl erstellen
        StringBuilder römischeZahl = new StringBuilder();

        // Zahl durchlaufen
        for (int i = römischeZahlenWerte.length - 1; i >= 0; i--) {

            // Solange die Zahl größer oder gleich dem aktuellen römischen Zahlenwert ist
            while (zahl >= römischeZahlenWerte[i]) {

                // Römische Zahl anhängen
                römischeZahl.append(römischeZahlen[i]);

                // Zahl um den aktuellen römischen Zahlenwert verringern
                zahl -= römischeZahlenWerte[i];
            }
        }

        // Römische Zahl zurückgeben
        return römischeZahl.toString();
    }
}
