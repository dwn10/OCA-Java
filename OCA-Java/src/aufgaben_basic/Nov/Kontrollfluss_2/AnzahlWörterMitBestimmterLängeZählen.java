package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Anzahl der Wörter mit bestimmter Länge zählen
Schreibe ein Programm, das den Benutzer nach einem Satz und einer Wortlänge
fragt und dann die Anzahl der Wörter im Satz ausgibt, die genau diese Länge haben.  */

import java.util.Scanner;

public class AnzahlWörterMitBestimmterLängeZählen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einem Satz fragen
        System.out.println("\n****************************");
        System.out.print("\nBitte geben Sie einen Satz ein: ");
        String sentence = scanner.nextLine();

        System.out.print("\nBitte geben Sie eine Wortlänge ein: ");
        int length = scanner.nextInt();

        // Anzahl der Wörter
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.length() == length) {
                count++;
            }
        }
        // Anzahl ausgeben
        System.out.println("\n****************************");
        System.out.printf("Es gibt %d Wört(er) in dem Satz '%s', die genau %d Zeichen lang sind.", count, sentence,
                length);
        System.out.println("\n****************************");
    }
}
