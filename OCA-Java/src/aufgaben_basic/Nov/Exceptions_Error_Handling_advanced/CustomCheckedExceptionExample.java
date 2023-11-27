package aufgaben_basic.Nov.Exceptions_Error_Handling_advanced;

/* Aufgabe: Eigene Checked Exception mit mehreren Konstruktoren
Erstelle eine eigene Checked Exception CustomCheckedException mit mehreren Konstruktoren und einer zusätzlichen Information.  */

// Klassendeklaration
public class CustomCheckedExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("Dies ist eine benutzerdefinierte Checked Exception.",
                    "Zusätzliche Informationen.");
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getAdditionalInfo());
        }
    }
}
