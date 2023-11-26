package aufgaben_advanced.Tag3.com;

import java.util.Scanner;

public class Schaltjahr_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("Bitte geben Sie eine Jahreszahl ein:");
        // Variablen initialisieren
        int jahr = scanner.nextInt();
        boolean schaltjahr = false;
        // Schaltjahr prüfen
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    schaltjahr = true;
                }
            } else {
                schaltjahr = true;
            }
        }
        // Ergebnis ausgeben
        if (schaltjahr) {
            System.out.println("********************************************");
            System.out.println(jahr + " \nist ein Schaltjahr.");
            System.out.println("********************************************");
        } else {
            System.out.println(jahr + " \nist kein Schaltjahr.");
            System.out.println("********************************************");
        }
    }
}
