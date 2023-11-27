package aufgaben_basic.Nov.Exceptions_Error_Handling_advanced;

/* Aufgabe: Exception-Propagation in mehreren Ebenen
Schreibe eine Methode, die eine Exception in einem tief verschachtelten Aufrufstack auslöst und diese in der höchsten Ebene abfängt..  */

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            deepMethod();
        } catch (Exception e) {
            System.out.println("\nException caught: " + e.getMessage());
        }
    }

    public static void deepMethod() throws Exception {
        try {
            deeperMethod();
        } catch (Exception e) {
            throw new Exception("\nException thrown from deepMethod", e);
        }
    }

    public static void deeperMethod() throws Exception {
        try {
            deepestMethod();
        } catch (Exception e) {
            throw new Exception("\nException thrown from deeperMethod", e);
        }
    }

    public static void deepestMethod() throws Exception {
        throw new Exception("\nException thrown from deepestMethod");
    }
}
