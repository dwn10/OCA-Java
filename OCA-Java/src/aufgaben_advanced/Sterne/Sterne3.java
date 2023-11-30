package aufgaben_advanced.Sterne;

/*  * . . . . . .
    . * . . . . .
    . . * . . . .
    . . . * . . .
    . . . . * . .
    . . . . . * .
    . . . . . . *  */

import java.util.Scanner;

public class Sterne3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-- Sternbilder --");
        System.out.println("bitte Ganzzahl eingeben: ");
        int zahl = input.nextInt();

        // Die äußere Schleife iteriert über die Anzahl der Zeilen,
        // die ausgegeben werden sollen.
        for (int i = 0; i < zahl; i++) {

            // Die innere Schleife iteriert über die Anzahl der Sterne
            // in jeder Zeile.
            for (int j = 0; j < zahl; j++) {

                // In jeder Iteration der inneren Schleife wird ein Stern
                // ausgegeben, wenn die Zeilennummer und die Spaltennummer
                // gleich sind.
                if (i == j) {
                    System.out.print("* ");
                } else {
                    // In allen anderen Iterationen der inneren Schleife
                    // wird ein Leerzeichen ausgegeben.
                    System.out.print(". ");
                }
            }

            // Am Ende jeder Iteration der äußeren Schleife wird
            // ein Zeilenumbruch ausgegeben.
            System.out.println();
        }
    }
}
