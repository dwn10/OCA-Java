package aufgaben_basic.Nov.Exceptions_Error_Handling_advanced;

/* Aufgabe: Mehrere Threads und Exception-Handling
Schreibe einen Code, der mehrere Threads startet und Exception-Handling zwischen diesen Threads ermöglicht. */

public class MultiThreadExceptionHandling {

    // Hauptmethode
    public static void main(String[] args) {

        // Thread 1 erstellen
        Thread thread1 = new Thread(() -> {
            try {
                // Exception werfen
                throw new NullPointerException("NullPointerException in Thread 1");
            } catch (NullPointerException e) {
                // Exception abfangen
                System.out.println("\nException in Thread 1 abgefangen: " + e.getMessage());
            }
        });

        // Thread 2 erstellen
        Thread thread2 = new Thread(() -> {
            try {
                // Exception werfen
                throw new ArithmeticException("ArithmeticException in Thread 2");
            } catch (ArithmeticException e) {
                // Exception abfangen
                System.out.println("\nException in Thread 2 abgefangen: " + e.getMessage());
            }
        });

        // Threads starten
        thread1.start();
        thread2.start();
    }
}
