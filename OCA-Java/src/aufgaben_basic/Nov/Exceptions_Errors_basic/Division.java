package aufgaben_basic.Nov.Exceptions_Errors_basic;

// Aufgabe: throws-Klausel bei Methodenaufruf
// Schreibe eine Methode divide mit der throws-Klausel für ArithmeticException und rufe sie in der main-Methode auf. 

// Klassendeklaration
class Division {

    // Methode zum Dividieren zweier Zahlen
    static int divide(int a, int b) throws ArithmeticException {

        // Wenn der Divisor 0 ist, werfen wir eine Ausnahme
        if (b == 0) {
            throw new ArithmeticException("\nDer Divisor darf nicht 0 sein.");
        }

        // Division durchführen
        return a / b;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Eingabezahlen
        int a = 10;
        int b = 0;

        // Aufruf der Methode divide()
        try {
            int ergebnis = divide(a, b);
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
