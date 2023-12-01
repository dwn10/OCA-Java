package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Textkompression
Schreibe ein Programm, das den Benutzer nach einem Text fragt und dann den Text
mithilfe einer einfachen Textkompressionsmethode komprimiert. Zum Beispiel:
aaaabbbcc wird zu a4b3c2.  */

import java.util.Scanner;

public class TextKompression {
    // Hauptmethode
    public static void main(String[] args) {
        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einem Text fragen
        System.out.println("\n**************************************");
        System.out.print("\nBitte geben Sie einen Text ein: ");
        String text = scanner.nextLine();

        // Text komprimieren
        StringBuilder compressedText = new StringBuilder();
        char currentCharacter = text.charAt(0);
        int currentCount = 1;
        for (int i = 1; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == currentCharacter) {
                currentCount++;
            } else {
                compressedText.append(currentCharacter);
                compressedText.append("");
                compressedText.append(currentCount);
                compressedText.append(" | ");
                currentCharacter = character;
                currentCount = 1;
            }
        }
        compressedText.append(currentCharacter);
        compressedText.append("");
        compressedText.append(currentCount);

        // Komprimierten Text erstellen
        System.out.println("\n**************************************");
        System.out.printf("\nDer komprimierte Text lautet: %s", compressedText.toString());
        System.out.println("\n**************************************");
    }
}
