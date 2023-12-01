package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Text verschlüsseln
Schreibe ein Programm, das den Benutzer nach einem Text und einer Schlüsselzahl
fragt und dann den Text verschlüsselt, indem jeder Buchstabe um den Schlüsselwert
im alphanumerisch verschoben wird.  */

import java.util.Scanner;

public class TextVerschlüsseln {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einem Text fragen
        System.out.println("\n****************************************");
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = scanner.nextLine();

        // Benutzer nach einer Schlüsselzahl fragen
        System.out.println("\nGeben Sie eine Schlüsselzahl ein: ");
        int schlüsselzahl = scanner.nextInt();

        // Text verschlüsseln
        String verschlüsselterText = "";
        for (char buchstabe : text.toCharArray()) {
            int buchstabencode = Character.getNumericValue(buchstabe);
            buchstabencode += schlüsselzahl;
            if (buchstabencode > 122) {
                buchstabencode -= 26;
            }
            char neuerBuchstabe = (char) buchstabencode;
            verschlüsselterText += neuerBuchstabe;
        }

        // Verschlüsselten Text ausgeben
        System.out.println("\n****************************************");
        System.out.println("\nDer verschlüsselte Text lautet: " + verschlüsselterText);
        System.out.println("\n****************************************");
    }
}
