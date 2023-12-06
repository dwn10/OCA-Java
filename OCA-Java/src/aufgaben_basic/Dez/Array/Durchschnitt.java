package aufgaben_basic.Dez.Array;

/* Aufgabe: Durchschnitt berechnen:
Schreibe eine Methode, um den Durchschnitt aller Zahlen in einem Array zu berechnen.
 */

import java.util.Scanner;

public class Durchschnitt {

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach einer Zahl.
        System.out.println("\n****************************************");
        System.out.println("Geben Sie eine Zahl ein:");
        int zahl = scanner.nextInt();

        // Rufe die Methode `durchschnitt()` auf und speichere das Ergebnis in der
        // Variable `durchschnitt`.
        int durchschnitt = durchschnitt(zahl);

        // Gib den Durchschnitt aus.
        System.out.println("****************************************");
        System.out.println("Der Durchschnitt ist " + durchschnitt + ".");
        System.out.println("****************************************");
    }

    // Methode zur Berechnung des Durchschnitts.
    public static int durchschnitt(int zahl) {
        // Initialisiere die Variable `durchschnitt` mit 0.
        int durchschnitt = 0;

        // Gehe von 1 bis zur Zahl.
        for (int i = 1; i <= zahl; i++) {
            // Addiere i zu `durchschnitt`.
            durchschnitt += i;
        }

        // Dividiere `durchschnitt` durch die Zahl.
        durchschnitt /= zahl;

        // Gib `durchschnitt` zurück.
        return durchschnitt;
    }
}
