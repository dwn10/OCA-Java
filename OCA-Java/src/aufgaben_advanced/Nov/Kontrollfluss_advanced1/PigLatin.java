package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Text in Pig Latin übersetzen
Schreibe ein Programm, das den Benutzer nach einem Wort fragt und dann dieses
Wort in Pig Latin übersetzt.  */

import java.util.Scanner;

public class PigLatin {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einem Wort fragen
        System.out.println("\n**************************************");
        System.out.println("\nGeben Sie ein Wort ein: ");
        String wort = scanner.next();

        // Wort in Pig Latin übersetzen
        wort = wort.substring(1) + wort.charAt(0) + "ay";

        // Wort ausgeben
        System.out.println("**************************************");
        System.out.println("\nDas Wort in Pig Latin lautet: " + wort);
        System.out.println("**************************************");
    }
}
