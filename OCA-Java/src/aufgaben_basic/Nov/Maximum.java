package aufgaben_basic.Nov;

/* Aufgabe: Maximum von drei Zahlen finden
Schreibe eine Methode, die das Maximum von drei gegebenen Zahlen zurückgibt.  */

public class Maximum {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Rufe die Methode `maximum()` auf und speichere das Ergebnis in der Variable
        // `max`.
        int max = maximum(a, b, c);

        // Gib das Ergebnis aus.
        System.out.println("Das Maximum der drei Zahlen ist " + max);
    }

    // Methode zum Finden des Maximums von drei Zahlen.
    public static int maximum(int a, int b, int c) {
        // Initialisiere die Variable `max` mit der ersten Zahl.
        int max = a;

        // Vergleiche die zweite Zahl mit `max`.
        if (b > max) {
            // Wenn die zweite Zahl größer ist als `max`, dann setze `max` auf die zweite
            // Zahl.
            max = b;
        }

        // Vergleiche die dritte Zahl mit `max`.
        if (c > max) {
            // Wenn die dritte Zahl größer ist als `max`, dann setze `max` auf die dritte
            // Zahl.
            max = c;
        }

        // Gib `max` zurück.
        return max;
    }
}
