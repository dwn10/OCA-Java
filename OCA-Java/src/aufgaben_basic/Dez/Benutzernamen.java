package aufgaben_basic.Dez;

/* Eingabe von Benutzernamen:
Das Programm sollte den Benutzer nach der Anzahl der Benutzernamen fragen, die eingegeben werden sollen.
Danach soll der Benutzer aufgefordert werden, jeden Benutzernamen einzeln einzugeben.

Speichern der Benutzernamen:
Die eingegebenen Benutzernamen sollen in einem Array von Strings gespeichert werden.

Ausgabe der gespeicherten Benutzernamen:
Das Programm soll die gespeicherten Benutzernamen aus dem Array auslesen und auf der Konsole ausgeben. */

import java.util.Scanner;

public class Benutzernamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Frage den Benutzer nach der Anzahl der Benutzernamen.
        System.out.println("\n****************************************");
        System.out.print("Geben Sie die Anzahl der Benutzernamen ein: ");
        int anzahl = scanner.nextInt();
        String[] benutzernamen = new String[anzahl];
        scanner.nextLine();
        for (int i = 0; i < anzahl; i++) {
            System.out.println("\n****************************************");
            System.out.print("Geben Sie den Benutzernamen " + (i + 1) + " ein: ");
            benutzernamen[i] = scanner.nextLine();
        }
        System.out.println("\n****************************************");
        System.out.println("Die eingegebenen Benutzernamen sind:\n");
        for (String benutzername : benutzernamen) {
            System.out.println(benutzername);
        }
    }
}
