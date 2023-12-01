package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Textrotation
Schreibe ein Programm, das den Benutzer nach einem Text und einer Rotationszahl
fragt und dann den Text um die gegebene Rotationsanzahl im Uhrzeigersinn rotiert. */

// Geben Sie einen Text ein: Hallo Welt!
// Geben Sie eine Rotationszahl ein: 2

// Der rotierte Text lautet: !dlrow olleH

import java.util.Scanner;

public class TextRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n************************************************");
        System.out.print("\nBitte geben Sie einen Text ein: ");
        String text = scanner.nextLine();

        System.out.print("\nBitte geben Sie eine Rotationszahl ein: ");
        int rotation = scanner.nextInt();

        int length = text.length();
        rotation %= length;

        String rotatedText = text.substring(length - rotation) + text.substring(0, length - rotation);

        System.out.println("************************************************");
        System.out.printf("Der rotierte Text lautet: %s", rotatedText);
        System.out.println("\n************************************************");
    }
}
