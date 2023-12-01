package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Häufigkeit von Substrings zählen
Schreibe ein Programm, das den Benutzer nach einem Text und einem Substring
fragt und dann die Anzahl der Vorkommen dieses Substrings im Text ausgibt.  */

/* Ausgabe

Geben Sie einen Text ein: Hallo Welt!
Geben Sie einen Substring ein: lo
Die Anzahl der Vorkommen von "lo" im Text lautet: 2  */

import java.util.Scanner;

public class HäufigkeitVonSubstringsZählen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach Text fragen
        System.out.println("\n************************************************");
        System.out.print("\nGeben Sie den Text ein: ");
        String text = scanner.nextLine();

        // Benutzer nach Substring fragen
        System.out.print("\nGeben Sie den Substring ein: ");
        String substring = scanner.nextLine();

        // Zähle die Anzahl der Vorkommen des Substrings im Text
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        // Gib die Anzahl der Vorkommen des Substrings aus
        System.out.println("\n************************************************");
        System.out.println("Die Anzahl der Vorkommen von \"" + substring + "\" im Text ist: " + count);
        System.out.println("\n************************************************");

        scanner.close();
    }
}
