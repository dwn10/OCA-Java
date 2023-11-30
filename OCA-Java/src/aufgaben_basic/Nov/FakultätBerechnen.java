package aufgaben_basic.Nov;

/* Aufgabe: Fakultät mit Benutzereingabe , das den Benutzer
nach einer Zahl fragt und dann die Fakultät dieser Zahl ausgibt.  */

public class FakultätBerechnen {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einer Zahl fragen
        System.out.println("\nGeben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());

        // Fakultät berechnen
        int fakultät = 1;
        for (int i = 1; i <= zahl; i++) {
            fakultät *= i;
        }

        // Fakultät ausgeben
        System.out.println("\n Die Fakultät von " + zahl + " ist " + fakultät);
    }
}
