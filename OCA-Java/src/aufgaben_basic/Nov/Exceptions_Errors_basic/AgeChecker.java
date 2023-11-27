package aufgaben_basic.Nov.Exceptions_Errors_basic;

// Aufgabe: Benutzerdefinierte Exception mit throws
// Erstelle eine Methode checkAge in einer Klasse AgeChecker, die das Alter einer
// Person überprüft. Wenn das Alter kleiner als 18 ist, soll eine benutzerdefinierte UnderAgeException geworfen werden.

// Klassendeklaration
class AgeChecker {

    // Methode zum Überprüfen des Alters
    static void checkAge(int alter) throws UnderAgeException {

        // Wenn das Alter kleiner als 18 ist, werfen wir eine Exception
        if (alter < 18) {
            throw new UnderAgeException("\nDas Alter ist unter 18.");
        }
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Alter
        int alter = 17;

        // Aufruf der Methode checkAge()
        try {
            checkAge(alter);
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Benutzerdefinierte Exception
class UnderAgeException extends Exception {

    // Konstruktor
    public UnderAgeException(String message) {
        super(message);
    }
}
