package aufgaben_basic.Nov;

//  Aufgabe: Rekursive Methode für die Summe 
// Schreibe eine rekursive Methode, die die Summe der Zahlen von 1 bis zu einer
// gegebenen Zahl berechnet. Rufe diese Methode aus der main-Methode auf und gib das Ergebnis aus.

// Klassendeklaration
class Summe {

    // Rekursive Methode zur Berechnung der Summe
    static int berechneSumme(int n) {

        // Basisfall
        if (n == 0) {
            return 0;
        }

        // Rekursionsfall
        return n + berechneSumme(n - 1);
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Eingabezahl
        int n = 10;

        // Berechnung der Summe
        int summe = berechneSumme(n);

        // Ausgabe der Summe
        System.out.println("\nDie Summe der Zahlen von 1 bis " + n + " ist: " + summe);
    }
}
