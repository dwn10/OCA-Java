package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

import java.util.Scanner;

public class Lorem_Text {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einem Text fragen
        System.out.println("\n*************************");
        System.out.println("Geben Sie einen Text ein: \n");
        String text = scanner.nextLine();

        // Wörter in Großbuchstaben umwandeln
        text = text.toUpperCase();

        // Array mit Sonderzeichen erstellen
        String[] lorem = { "lorem", "LOREM", "LOREM.", "LOREM!", "LOREM?", "-LOREM", "1.LOREM", "-LOREM", "*LOREM" };

        // Wörter zählen
        int wortzaehlung = 0;
        for (String wort : text.split(" ")) {
            if (istLoremWort(wort, lorem)) {
                wortzaehlung++;
            } else {
                wortzaehlung++;
            }
        }

        // Wörter ausgeben
        System.out.println("*************************");
        System.out.println("Die Gesamtzahl der Wörter beträgt: " + wortzaehlung);
        System.out.println("\n*************************");
        System.out.println("Die Anzahl der Lorem-Wörter beträgt: "
                + zaehleLoremWoerter(text, lorem));
    }

    // Methode, um zu überprüfen, ob ein Wort ein Lorem-Wort ist
    private static boolean istLoremWort(String wort, String[] lorem) {
        for (String s : lorem) {
            if (wort.equals(s)) {
                return true;
            }
        }
        return false;
    }

    // Methode, um die Anzahl der Lorem-Wörter in einem Text zu zählen
    private static int zaehleLoremWoerter(String text, String[] lorem) {
        int zaehlung = 0;
        for (String wort : text.split(" ")) {
            if (istLoremWort(wort, lorem)) {
                zaehlung++;
            }
        }
        return zaehlung;
    }
}