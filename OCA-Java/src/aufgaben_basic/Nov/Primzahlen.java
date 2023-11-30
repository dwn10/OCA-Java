package aufgaben_basic.Nov;

/* Aufgabe: Primzahlen finden
Schreibe eine Methode, die alle Primzahlen bis zu einer gegebenen Grenze ausgibt.  */

import java.util.ArrayList;

public class Primzahlen {

    public static void main(String[] args) {
        int limit = 100;

        // Initialisiere die Liste der Primzahlen.
        ArrayList<Integer> primes = new ArrayList<>();

        // Gehe von 2 bis zur Grenze.
        for (int i = 2; i <= limit; i++) {
            // Prüfe, ob i eine Primzahl ist.
            if (istPrimzahl(i)) {
                // Wenn i eine Primzahl ist, dann füge sie der Liste hinzu.
                primes.add(i);
            }
        }

        // Gib die Liste der Primzahlen aus.
        System.out.println("Die Primzahlen bis " + limit + " sind:");
        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    // Methode zum Prüfen, ob eine Zahl eine Primzahl ist.
    private static boolean istPrimzahl(int n) {
        // Wenn n kleiner oder gleich 1 ist, dann ist sie keine Primzahl.
        if (n <= 1) {
            return false;
        }

        // Prüfe, ob n durch eine Zahl von 2 bis zur Quadratwurzel von n teilbar ist.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                // Wenn n durch eine Zahl teilbar ist, dann ist sie keine Primzahl.
                return false;
            }
        }

        // Wenn n keine der vorhergehenden Bedingungen erfüllt, dann ist sie eine
        // Primzahl.
        return true;
    }
}
