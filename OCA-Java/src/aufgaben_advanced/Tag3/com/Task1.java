package aufgaben_advanced.Tag3.com;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variablen initialisieren
        int input = 0;
        while (input < 10) {
            // Eingabe abfragen
            System.out.println("\nBitte geben Sie eine Zahl ein, die größer oder gleich 10 ist:");
            input = scanner.nextInt();
            if (input < 10) {
                // Fehlermeldung ausgeben
                System.out.println(
                        "\nDie eingegebene Zahl ist zu klein. Bitte geben Sie eine Zahl ein, die größer oder gleich 10 ist.");
            }
        }
        // Erfolgsmeldung ausgeben
        System.out.println("\nErfolg! Die eingegebene Zahl ist mindestens 10.");
    }
}
