package aufgaben_basic.Dez.Strings;

/* Entwickle eine Methode, die prüft, ob ein String
ein Pangramm ist (enthält  alle Buchstaben des Alphabets). */

import java.util.Scanner;

public class PangrammPruefen {

    // Das Alphabet, das wir überprüfen werden
    private static final char[] ALPHABET = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ä', 'ö', 'ü', 'ß' };

    public static void main(String[] args) {
        // Erstelle einen Scanner, um die Eingabe vom Benutzer zu lesen
        Scanner scanner = new Scanner(System.in);

        // Fordere den Benutzer auf, einen String einzugeben
        System.out.println("\n******************************");
        System.out.print("Gib einen String ein: ");
        String input = scanner.nextLine();

        // Überprüfe, ob der String ein Pangramm ist
        boolean isPangram = isPangram(input);

        // Gib das Ergebnis aus
        if (isPangram) {
            System.out.println("******************************");
            System.out.println("Der eingegebene String ist ein Pangramm.");
        } else {
            System.out.println("******************************");
            System.out.println("Der eingegebene String ist kein Pangramm.");
        }
    }

    /**
     * Überprüft, ob der übergebene String ein Pangramm ist.
     *
     * @param input Der zu überprüfende String.
     * @return true, wenn der String ein Pangramm ist, andernfalls false.
     */
    private static boolean isPangram(String input) {
        // Konvertiere den String in Kleinbuchstaben, um die Überprüfung zu vereinfachen
        input = input.toLowerCase();

        // Überprüfe, ob jeder Buchstabe des Alphabets im String enthalten ist
        for (char c : ALPHABET) {
            if (input.indexOf(c) == -1) {
                return false;
            }
        }

        // Wenn wir hier ankommen, ist der String ein Pangramm
        return true;
    }
}
