package aufgaben_basic.Nov.Exceptions_Errors_basic;

/* Aufgabe: Eigene Exception-Klasse erstellen
Erstelle eine benutzerdefinierte Exception-Klasse mit dem Namen CustomException. */

// Klassendeklaration
public class CustomException {

    public static void main(String[] args) {

        // CustomException werfen
        try {
            throw new CustomException("\nDies ist eine CustomException.");
        } catch (CustomException e) {
            // Exception abfangen
            System.out.println(e.getMessage());
        }
    }
}
