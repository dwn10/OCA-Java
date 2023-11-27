package aufgaben_basic.Nov.Exceptions_Errors_basic;

// Aufgabe: Mehrere Methodenaufrufe mit throws
// Erstelle eine Methode calculateResult, die zwei andere Methoden aufruft und die throws-Klausel verwendet.

// Klassendeklaration
class CalculateResult {

    // Methode zum Berechnen des Ergebnisses
    static int calculateResult(int zahl1, int zahl2) throws Exception {

        // Methode 1 aufrufen
        int zahl3 = add(zahl1, zahl2);

        // Methode 2 aufrufen
        int zahl4 = multiply(zahl3, zahl2);

        // Ergebnis zurückgeben
        return zahl4;
    }

    // Methode zum Addieren zweier Zahlen
    static int add(int zahl1, int zahl2) throws Exception {

        // Wenn eine der Zahlen negativ ist, werfen wir eine Exception
        if (zahl1 < 0 || zahl2 < 0) {
            throw new Exception("\nEine der Zahlen ist negativ.");
        }

        // Ergebnis zurückgeben
        return zahl1 + zahl2;
    }

    // Methode zum Multiplizieren zweier Zahlen
    static int multiply(int zahl1, int zahl2) throws Exception {

        // Wenn eine der Zahlen 0 ist, werfen wir eine Exception
        if (zahl1 == 0 || zahl2 == 0) {
            throw new Exception("\nEine der Zahlen ist 0.");
        }

        // Ergebnis zurückgeben
        return zahl1 * zahl2;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Eingabezahlen
        int zahl1 = 10;
        int zahl2 = 2;

        // Aufruf der Methode calculateResult()
        try {
            int ergebnis = calculateResult(zahl1, zahl2);
            System.out.println("\nErgebnis: " + ergebnis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
