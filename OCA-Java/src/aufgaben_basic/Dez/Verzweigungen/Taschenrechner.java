package aufgaben_basic.Dez.Verzweigungen;

/* Implementiere einen einfachen Taschenrechner mit den Grundrechenarten (+, -, *, /) */

import java.util.Scanner;

public class Taschenrechner {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner für Benutzereingabe
        Scanner scanner = new Scanner(System.in);

        // Operator auswählen
        System.out.println("\n***********************************");
        System.out.println("Wählen Sie einen Operator: +, -, *, /");
        String operator = scanner.next();

        // Operanden eingeben
        System.out.println("***********************************");
        System.out.println("Geben Sie den ersten Operanden ein: ");
        double operand1 = scanner.nextDouble();
        System.out.println("***********************************");
        System.out.println("Geben Sie den zweiten Operanden ein: ");
        double operand2 = scanner.nextDouble();

        // Berechnung durchführen
        double ergebnis = 0;
        switch (operator) {
            case "+":
                ergebnis = operand1 + operand2;
                break;
            case "-":
                ergebnis = operand1 - operand2;
                break;
            case "*":
                ergebnis = operand1 * operand2;
                break;
            case "/":
                ergebnis = operand1 / operand2;
                break;
            default:
                System.out.println("***********************************");
                System.out.println("Ungültiger Operator");
                return;
        }

        // Ergebnis ausgeben
        System.out.println("***********************************");
        System.out.println("Das Ergebnis ist " + ergebnis);
    }
}
