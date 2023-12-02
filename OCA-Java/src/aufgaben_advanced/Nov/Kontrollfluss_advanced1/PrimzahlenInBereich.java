package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Primzahlen in einem Bereich finden
Schreibe ein Programm, das den Benutzer nach einem Zahlenbereich fragt und dann
die Primzahlen in diesem Bereich ausgibt. */

import java.util.Scanner;

public class PrimzahlenInBereich {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach Startwert fragen
        System.out.println("**************************************");
        System.out.println("\nGeben Sie den Startwert ein: ");
        int startwert = scanner.nextInt();

        // Benutzer nach Endwert fragen
        System.out.println("Geben Sie den Endwert ein: ");
        int endwert = scanner.nextInt();

        // Primzahlen in dem Bereich finden
        for (int i = startwert; i <= endwert; i++) {
            if (istPrimzahl(i)) {
                System.out.print(i + " | ");
            }
        }

        // Scanner schließen
        scanner.close();
    }

    // Methode, um zu überprüfen, ob eine Zahl eine Primzahl ist
    private static boolean istPrimzahl(int zahl) {
        for (int i = 2; i * i <= zahl; i++) {
            if (zahl % i == 0) {
                return false;
            }
        }

        return true;
    }
}
