package aufgaben_basic.Dez.Primitive_Datentypen;

/* Implementiere eine Funktion, die prüft, ob eine Zahl eine Primzahl ist. */

public class PrimzahlPrüfer {

    // Funktion, die prüft, ob eine Zahl eine Primzahl ist
    public static boolean istPrimzahl(int zahl) {

        // Eine Zahl ist nur eine Primzahl, wenn sie größer als 1 ist und nur durch 1
        // und sich selbst teilbar ist.
        if (zahl <= 1) {
            return false;
        }

        // Alle Zahlen von 2 bis zur Wurzel der Zahl durchlaufen.
        for (int i = 2; i * i <= zahl; i++) {

            // Wenn die Zahl durch einen der Zahlen teilbar ist, ist sie keine Primzahl.
            if (zahl % i == 0) {
                return false;
            }
        }

        // Die Zahl ist keine Primzahl, wenn sie in einer der Iterationen durch einen
        // der Zahlen teilbar war.
        return true;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Zahl eingeben
        System.out.println("\n******************************");
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());

        // Prüfen, ob die Zahl eine Primzahl ist
        boolean istPrimzahl = istPrimzahl(zahl);

        // Ergebnis ausgeben
        if (istPrimzahl) {
            System.out.println("******************************");
            System.out.println("Die Zahl ist eine Primzahl.");
        } else {
            System.out.println("******************************");
            System.out.println("Die Zahl ist keine Primzahl.");
        }
    }
}
