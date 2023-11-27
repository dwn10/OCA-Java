package aufgaben_basic.Nov.Exceptions_Errors_basic;

/* Aufgabe: NullPointerException
Schreibe eine Methode, die eine NullPointerException auslöst und fange sie in einem try-catch-Block ab.  */

public class NullPointerExceptionExample {

    // Methode, die eine NullPointerException auslöst
    static void throwNullPointerException() {

        // Null-Referenz erstellen
        String nullReferenz = null;

        // Zugriff auf die null-Referenz
        System.out.println(nullReferenz.length());
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Methode aufrufen
        try {
            throwNullPointerException();
        } catch (NullPointerException e) {
            // Exception abfangen
            System.out.println("\nEs ist eine NullPointerException aufgetreten.");
        }
    }
}
