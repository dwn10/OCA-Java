package aufgaben_basic.Nov;

/* Aufgabe: Umkehrung einer Zeichenkette
Schreibe ein Programm, das den Benutzer nach einer Zeichenkette
fragt und dann die umgekehrte Version dieser Zeichenkette ausgibt.  */

import java.util.Scanner;

public class Umkehrung {

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach einer Zeichenkette.
        System.out.println("\n Geben Sie eine Zeichenkette ein:");
        String zeichenkette = scanner.nextLine();

        // Initialisiere die Variable zur Speicherung der umgekehrten Zeichenkette.
        String umgekehrteZeichenkette = "";

        // Gehe von der letzten Position der Zeichenkette bis zur ersten Position.
        for (int i = zeichenkette.length() - 1; i >= 0; i--) {
            // Füge das aktuelle Zeichen an die umgekehrte Zeichenkette an.
            umgekehrteZeichenkette += zeichenkette.charAt(i);
        }

        // Gib die umgekehrte Zeichenkette aus.
        System.out.println("\n Die umgekehrte Zeichenkette ist " + umgekehrteZeichenkette + ".");
    }
}