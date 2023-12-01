package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Zwei Texte verschmelzen
Schreibe ein Programm, das den Benutzer nach zwei Texten fragt und dann diese
Texte zeilenweise verschmilzt.  */

import java.util.Scanner;

public class ZweiTexteVerschmelzen {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach dem ersten Text fragen
        System.out.println("**************************************");
        System.out.println("\nGeben Sie den ersten Text ein: ");
        String ersterText = scanner.nextLine();

        // Benutzer nach dem zweiten Text fragen
        System.out.println("\nGeben Sie den zweiten Text ein: ");
        String zweiterText = scanner.nextLine();

        // Texte verschmelzen
        String verschmolzenerText = ersterText + zweiterText;

        // Verschmolzenen Text ausgeben
        System.out.println("**************************************");
        System.out.println("Der verschmolzene Text lautet: " + verschmolzenerText);
        System.out.println("**************************************");
    }
}
