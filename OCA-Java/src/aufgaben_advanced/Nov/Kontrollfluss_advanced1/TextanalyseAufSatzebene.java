package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Textanalyse auf Satzebene
Schreibe ein Programm, das den Benutzer nach einem Text fragt und dann die
Anzahl der Sätze im Text ausgibt.  */

import java.util.Scanner;

public class TextanalyseAufSatzebene {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einem Text fragen
        System.out.println("**************************************");
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = scanner.nextLine();

        // Anzahl der Sätze ermitteln
        int anzahlSätze = 0;
        boolean satzBeginn = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') {
                if (satzBeginn) {
                    anzahlSätze++;
                }
                satzBeginn = false;
            } else {
                satzBeginn = true;
            }
        }

        // Anzahl der Sätze ausgeben
        System.out.println("**************************************");
        System.out.println("Die Anzahl der Sätze im Text beträgt " + anzahlSätze);
        System.out.println("**************************************");
    }
}
