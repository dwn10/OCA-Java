package aufgaben_basic.Nov.Exceptions_Error_Handling_advanced;

/* Aufgabe: Verwendung von finally mit einem Fehler  Verwende finally
zusammen mit einem Fehler, der in einem catch-Block auftritt.  */

public class FinallyWithError {

    // Methode, die einen Fehler auslöst
    static void throwError() {

        // Fehler werfen
        throw new ArithmeticException("\nArithmeticException in der Methode throwError()");
    }

    // Hauptmethode
    public static void main(String[] args) {

        // try-catch-finally-Block
        try {
            // Methode throwError() aufrufen
            throwError();
        } catch (ArithmeticException e) {
            // Fehler abfangen
            System.out.println("\nFehler abgefangen: " + e.getMessage());
        } finally {
            // finally-Block wird immer ausgeführt, unabhängig davon, ob eine Exception
            // geworfen wird
            System.out.println("\nfinally-Block ausgeführt");
        }
    }
}
