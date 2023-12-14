package aufgaben_basic.Dez.Enum;

/*  Aufgabe:  indem ein Benutzer über ein Menü zwischen
    drei Möglichkeiten auswählen kann.
    Die auswählbaren Möglichkeiten werden über ein Enum erfasst.
    Es sollen "JA", "NEIN" und "VIELLEICHT" auswählbar sein.

    In einem Switch-Case wird die Eingabe auf Übereinstimmung
    mit den Enum-Konstanten geprüft und der Benutzer erhält
    passend zu seiner Auswahl eine Ausgabe.

    Trifft der Benutzer eine ungültige Wahl, soll
    eine Fehlermeldung ausgegeben werden.

    Hinweis: Die Auswahlmöglichkeiten können per Schleife
    mithilfe der Methode values() des Enums ausgegeben werden.
    Mit valueOf() kann aus einem String eine Enum-Konstante gemacht werden. */

import java.util.Scanner;

public class AuswahlMenüMitEnum {

    // Enum mit den Auswahlmöglichkeiten
    public enum Auswahl {
        JA,
        NEIN,
        VIELLEICHT
    }

    public static void main(String[] args) {

        // Scanner für die Benutzereingabe
        Scanner scanner = new Scanner(System.in);

        // Auswahlmöglichkeiten ausgeben
        System.out.println("\n**************************************");
        System.out.println("Bitte wählen Sie eine der folgenden Möglichkeiten aus:");
        for (Auswahl auswahl : Auswahl.values()) {
            System.out.println(auswahl);
        }

        // Benutzereingabe abfragen
        System.out.println("**************");
        System.out.println("Ihre Auswahl: ");
        String eingabe = scanner.nextLine();
        System.out.println("**************");
        // Eingabe auf Übereinstimmung mit den Enum-Konstanten prüfen
        Auswahl auswahl = Auswahl.valueOf(eingabe.toUpperCase());

        // Ausgabe der Auswahl
        switch (auswahl) {
            case JA:
                System.out.println("Sie haben JA gewählt.");
                break;
            case NEIN:
                System.out.println("Sie haben NEIN gewählt.");
                break;
            case VIELLEICHT:
                System.out.println("Sie haben VIELLEICHT gewählt.");
                break;
            default:
                System.out.println("Ungültige Eingabe.");
        }
    }
}
