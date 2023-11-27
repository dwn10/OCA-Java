package aufgaben_basic.Nov.Exceptions_Errors_basic;

// Aufgabe: ArithmeticException
// Schreibe eine Methode, die eine Division durch Null ausführt und fange die ArithmeticException ab.

// Klassendeklaration
class ArithmeticExceptionDemo {

    // Methode, die eine Division durch Null ausführt
    static void divideByZero() {
        int zahl1 = 10;
        int zahl2 = 0;

        // Division durch Null
        int ergebnis = zahl1 / zahl2;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Methode aufrufen
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            // Exception abfangen
            System.out.println("\nEs ist eine ArithmeticException aufgetreten.");
        }
    }
}
