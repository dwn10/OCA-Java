package aufgaben_basic.Dez.Array;

/*  Aufgabe: Größtes Element:
    Entwickle eine Funktion, die das größte Element in einem Integer-Array findet.

Beispielausgabe

Geben Sie die Größe des Arrays ein: 5

Geben Sie die Zahl an Position 0 ein: 1
Geben Sie die Zahl an Position 1 ein: 2
Geben Sie die Zahl an Position 2 ein: 3
Geben Sie die Zahl an Position 3 ein: 4
Geben Sie die Zahl an Position 4 ein: 5

Das größte Element im Array ist 5.    */

import java.util.Scanner;

public class GroesstesElement {

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach der Größe des Arrays.
        System.out.println("Geben Sie die Größe des Arrays ein:");
        int laenge = scanner.nextInt();

        // Initialisiere das Array.
        int[] zahlen = new int[laenge];

        // Initialisiere die Variable zur Speicherung des größten Elements.
        int groesstesElement = Integer.MIN_VALUE;

        // Lese die Zahlen in das Array ein.
        for (int i = 0; i < laenge; i++) {
            System.out.println("Geben Sie die Zahl an Position " + i + " ein:");
            zahlen[i] = scanner.nextInt();
        }

        // Finde das größte Element im Array.
        for (int zahl : zahlen) {
            if (zahl > groesstesElement) {
                groesstesElement = zahl;
            }
        }

        // Gib das größte Element aus.
        System.out.println("Das größte Element im Array ist " + groesstesElement + ".");
    }
}
