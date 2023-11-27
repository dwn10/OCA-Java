package aufgaben_basic.Nov.Exceptions_Errors_basic;

//  Aufgabe: Checked und Unchecked Exceptions 
// Unterscheide zwischen Checked und Unchecked Exceptions in Java und gib Beispiele für jede Art.

// Unchecked Exception
public class UncheckedExceptionExample {

    // Methode, die eine Unchecked Exception wirft
    static void throwUncheckedException() {

        // Null-Referenz
        String nullReferenz = null;

        // Zugriff auf die null-Referenz
        System.out.println(nullReferenz.length());
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Methode aufrufen
        try {
            throwUncheckedException();
        } catch (Exception e) {
            // Exception abfangen
            System.out.println("\nEs ist eine Exception aufgetreten.");
        }
    }
}
