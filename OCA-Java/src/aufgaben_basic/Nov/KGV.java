package aufgaben_basic.Nov;

// Aufgabe: Kleinste gemeinsame Vielfache (kgV)
// Schreibe eine Methode, die das kleinste gemeinsame Vielfache von zwei Zahlen
// berechnet. Rufe diese Methode aus der main-Methode auf und gib das Ergebnis aus.

// Klassendeklaration
class KGV {

    // Methode zum Berechnen des kleinsten gemeinsamen Vielfachen
    static int berechneKGV(int a, int b) {

        // Falls eine der Zahlen 0 ist, ist das kgV 0
        if (a == 0 || b == 0) {
            return 0;
        }

        // Variable zum Speichern des kgV
        int kgv = 1;

        // Solange a und b nicht teilbar sind
        while (a % b != 0) {

            // Aktuelles kgV wird um b multipliziert
            kgv *= b;

            // b wird durch den Rest von a und b geteilt
            b = a % b;
        }

        // kgv zurückgeben
        return kgv;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Eingabezahlen
        int a = 15;
        int b = 21;

        // Berechnung des kgV
        int kgv = berechneKGV(a, b);

        // Ausgabe des kgV
        System.out.println("\nDas kleinste gemeinsame Vielfache von " + a + " und " + b + " ist: " + kgv);
    }
}
