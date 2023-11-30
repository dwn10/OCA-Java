package aufgaben_basic.Nov;

/* Aufgabe: Zahlenreihe ausgeben , das den Benutzer nach
einer Zahl fragt und dann die Zahlen von 1 bis zur eingegebenen Zahl ausgibt.  */

public class ZahlenreiheAusgeben {

    // Hauptmethode
    public static void main(String[] args) {

        System.out.println("\n************************");
        // Benutzer nach einer Zahl fragen
        System.out.println("\nGeben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());

        System.out.println("************************");
        // Zahlenreihe ausgeben
        for (int i = 1; i <= zahl; i++) {
            System.out.println(i);
        }
    }
}
