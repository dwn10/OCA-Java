package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Palindrom-Substring finden
Schreibe ein Programm, das den Benutzer nach einem Text fragt und dann den
längsten Palindrom-Substring in diesem Text findet.  */

import java.util.Scanner;

public class PalindromSubstringFinden {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einem Text fragen
        System.out.println("\n**************************************");
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = scanner.nextLine();

        // Scanner schließen
        scanner.close();

        // Palindrom-Substring finden
        int laenge = 0;
        String palindrom = "";
        for (int i = 0; i < text.length(); i++) {
            for (int j = i; j < text.length(); j++) {
                if (istPalindrom(text.substring(i, j + 1))) {
                    if (j - i + 1 > laenge) {
                        laenge = j - i + 1;
                        palindrom = text.substring(i, j + 1);
                    }
                }
            }
        }

        // Palindrom ausgeben
        System.out.println("\n**************************************");
        System.out.println("Der längste Palindrom-Substring ist: " + palindrom);
        System.out.println("\n**************************************");
    }

    // Methode zum Prüfen, ob ein Text ein Palindrom ist
    private static boolean istPalindrom(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
