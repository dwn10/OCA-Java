package aufgaben_basic.Dez;

/*
Aufgabe: Logische Vergleiche
Schreibe eine Methode, die den User auffordert 3 Zahlen nach einander einzugeben.
Daraufhin soll die kleinste der drei Zahlen ermittelt werden.
Dabei sollen gleiche Zahlen als eine Zahl betrachtet werden.
Am Ende soll die kleinste dieser 3 Zahlen auf der Konsole ausgegeben werden.

Zusatz: Sorge dafür das keine gleichen Zahlen eingegeben werden können.
 */

import java.util.Scanner;

public class KleinsteZahl {

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Initialisiere die Variablen zur Speicherung der Zahlen.
        int zahl1 = 0;
        int zahl2 = 0;
        int zahl3 = 0;

        // Frage den Benutzer nach den drei Zahlen.
        System.out.println("\n***************************");
        System.out.println("Geben Sie die erste Zahl ein:");
        zahl1 = scanner.nextInt();

        System.out.println("\nGeben Sie die zweite Zahl ein:");
        zahl2 = scanner.nextInt();

        System.out.println("\nGeben Sie die dritte Zahl ein:");
        zahl3 = scanner.nextInt();

        // Überprüfe, ob zwei der Zahlen gleich sind.
        if (zahl1 == zahl2 || zahl2 == zahl3 || zahl1 == zahl3) {
            // Wenn zwei der Zahlen gleich sind, dann gib eine Fehlermeldung aus.
            System.out.println("\n***************************");
            System.out.println("Die Eingabe enthält zwei gleiche Zahlen.");
            return;
        }

        // Finde die kleinste Zahl.
        int kleinsteZahl = zahl1;
        if (zahl2 < kleinsteZahl) {
            kleinsteZahl = zahl2;
        }
        if (zahl3 < kleinsteZahl) {
            kleinsteZahl = zahl3;
        }

        // Gib die kleinste Zahl aus.
        System.out.println("\n***************************");
        System.out.println("Die kleinste Zahl ist " + kleinsteZahl + ".");
    }
}
