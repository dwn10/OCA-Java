package aufgaben_basic.Dez.Schleifen;

/* Schreibe eine Schleife, die die Zahlen von 1 bis 10 ausgibt. */

public class ZahlenAusgeben {

    public static void main(String[] args) {
        // Initialisiere die Variable `i` mit 1.
        int i = 1;

        // Gehe solange i kleiner oder gleich 10 ist, weiter.
        while (i <= 10) {
            // Gib die Zahl aus.
            System.out.println(i);

            // Erhöhe i um 1.
            i++;
        }
    }
}
