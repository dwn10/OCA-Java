package aufgaben_basic.Nov.Exceptions_Errors_basic;

/* Aufgabe: Verwendung der eigenen Exception-Klasse Nutze die erstellte CustomException in einem Beispiel. */

/*public class CustomException2 extends Exception {
    public CustomException(String message) {
        super(message);
    }
}*/

public class CustomExceptionExample {
    public static void main(String[] args) {

        // CustomException abfangen
        try {
            // CustomException werfen
            throw new CustomException("\nDies ist eine benutzerdefinierte Ausnahme.");
        } catch (CustomException2 e) {
            // Exception abfangen
            System.out.println(e.getMessage());
        }
    }
}
