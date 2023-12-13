package aufgaben_basic.Dez.Objekte_Programmier;

/* Desweitern soll nun einen weiter Eigenschaft implementiert werden. Diese
muss unveränderbar sein und muss mit den default Values initialisiert
werden.  */

import java.util.Scanner;

public class Umkehrung {

    private static final String DEFAULT_ZEICHENKETTE = "";

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach einer Zeichenkette.
        System.out.println("\n****************************************");
        System.out.println("Geben Sie eine Zeichenkette ein:");
        String zeichenkette = scanner.nextLine();

        // Initialisiere die Variable zur Speicherung der umgekehrten Zeichenkette.
        String umgekehrteZeichenkette = "";

        // Gehe von der letzten Position der Zeichenkette bis zur ersten Position.
        for (int i = zeichenkette.length() - 1; i >= 0; i--) {
            // Füge das aktuelle Zeichen an die umgekehrte Zeichenkette an.
            umgekehrteZeichenkette += zeichenkette.charAt(i);
        }

        // Gib die umgekehrte Zeichenkette aus.
        System.out.println("\n****************************************");
        System.out.println("Die umgekehrte Zeichenkette ist: " + umgekehrteZeichenkette + ".");
    }

    // Eigenschaft zur Speicherung der Zeichenkette.
    private final String zeichenkette;

    // Konstruktor, der die Zeichenkette initialisiert.
    public Umkehrung(String zeichenkette) {
        this.zeichenkette = zeichenkette;
    }

    // Konstruktor, der die Zeichenkette mit den Default-Wert initialisiert.
    public Umkehrung() {
        this(DEFAULT_ZEICHENKETTE);
    }

    // Getter für die Zeichenkette.
    public String getZeichenkette() {
        return zeichenkette;
    }
}