package aufgaben_advanced.Sterne;

/*  * * * * * * *
    . . . . . . .
    . . . . . . .
    . . . . . . .
    . . . . . . .
    . . . . . . .
    * * * * * * *  */

import java.util.Scanner;

public class Sterne2 {

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

                // In der ersten und letzten Iteration der inneren Schleife
                // wird ein Stern ausgegeben.
                if (i == 0 || i == zahl - 1) {
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
