package aufgaben_advanced.Nov.Tag3.com;

import java.util.Scanner;

public class Schaltjahr_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n********************************************");
        System.out.println("Bitte geben Sie eine Jahreszahl ein:");
        int jahr = scanner.nextInt();
        boolean schaltjahr = false;
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    schaltjahr = true;
                }
            } else {
                schaltjahr = true;
            }
        }
        int tage = 28;
        if (schaltjahr) {
            tage = 29;
        }
        // Ergebnis ausgeben
        System.out.println("********************************************");
        System.out.println("\nDer Februar hat im Jahr " + jahr + ": " + tage + " Tage.");
        System.out.println("********************************************");
    }
}
