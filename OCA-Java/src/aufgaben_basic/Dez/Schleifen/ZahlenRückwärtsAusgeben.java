package aufgaben_basic.Dez.Schleifen;

/* Entwickle eine Schleife, die die Zahlen rückwärts von 10 bis 1 ausgibt. */

public class ZahlenRückwärtsAusgeben {

    // Hauptmethode
    public static void main(String[] args) {

        // Variable für die aktuelle Zahl
        int zahl = 10;

        // Schleife, die die Zahlen rückwärts ausgibt
        while (zahl >= 1) {
            // Zahl ausgeben
            System.out.println(zahl);

            // Zahl um 1 verringern
            zahl--;
        }
    }
}
