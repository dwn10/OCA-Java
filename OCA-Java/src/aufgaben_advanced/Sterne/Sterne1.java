package aufgaben_advanced.Sterne;

/* Sternbilder mit for-Schleifen
Der Java-Code mit Kommentare, für die Eingabe:


bitte Ganzzahl eingeben:
7  */

/*  * * * * * * *
    * * * * * * *
    * * * * * * *
    * * * * * * *
    * * * * * * *
    * * * * * * *
    * * * * * * *  */

import java.util.Scanner;

public class Sterne1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-- Sternbilder --");
        System.out.println("bitte Ganzzahl eingeben: ");
        System.out.println("\n*********** Task 1 **********");
        int zahl = input.nextInt();

        // Die äußere Schleife iteriert über die Anzahl der Zeilen,
        // die ausgegeben werden sollen.
        for (int i = 0; i < zahl; i++) {

            // Die innere Schleife iteriert über die Anzahl der Sterne
            // in jeder Zeile.
            for (int j = 0; j < zahl; j++) {

                // In jeder Iteration der inneren Schleife wird ein Stern
                // ausgegeben.
                System.out.print("* ");
            }

            // Am Ende jeder Iteration der äußeren Schleife wird
            // ein Zeilenumbruch ausgegeben.
            System.out.println();
        }
    }
}