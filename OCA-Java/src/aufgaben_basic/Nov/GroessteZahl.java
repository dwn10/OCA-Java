package aufgaben_basic.Nov;

/* Aufgabe: Größte Zahl finden 
Schreibe ein Programm, das den Benutzer nach einer Reihe von Zahlen fragt und dann die größte Zahl ausgibt.  */

import java.util.Scanner;

public class GroessteZahl {

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Initialisiere die Variable zur Speicherung der größten Zahl.
        int groessteZahl = -1;

        // Frage den Benutzer nach einer Reihe von Zahlen.
        System.out.println("Geben Sie eine Reihe von Zahlen ein. Zum Beenden geben Sie eine negative Zahl ein.");
        while (true) {
            int zahl = scanner.nextInt();

            // Wenn die Zahl größer als die bisher größte Zahl ist, dann aktualisiere die
            // größte Zahl.
            if (zahl > groessteZahl) {
                groessteZahl = zahl;
            }

            // Wenn die Zahl negativ ist, dann beende den Loop.
            if (zahl < 0) {
                break;
            }
        }

        // Gib die größte Zahl aus.
        System.out.println("Die größte Zahl ist " + groessteZahl + ".");
    }
}
