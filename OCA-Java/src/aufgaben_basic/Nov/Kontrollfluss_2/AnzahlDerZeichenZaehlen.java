package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Anzahl der Zeichen zählen
Schreibe ein Programm, das den Benutzer nach einem Wort und einem Zeichen fragt
und dann die Anzahl dieses Zeichens im Wort ausgibt.  */

public class AnzahlDerZeichenZaehlen {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Wort fragen
        System.out.println("\n*****************************************");
        System.out.println("\nGeben Sie ein Wort ein: ");
        String wort = System.console().readLine();

        // Benutzer nach einem Zeichen fragen
        System.out.println("*****************************************");
        System.out.println("\nGeben Sie ein Zeichen ein: ");
        char zeichen = System.console().readLine().charAt(0);

        // Anzahl des Zeichens im Wort zählen
        int anzahl = 0;
        for (int i = 0; i < wort.length(); i++) {
            if (wort.charAt(i) == zeichen) {
                anzahl++;
            }
        }

        // Anzahl ausgeben
        System.out.println("*****************************************");
        System.out.println("\nDie Anzahl des Zeichens \"" + zeichen + "\" im Wort \"" + wort + "\" = " + anzahl);
        System.out.println("\n*****************************************");
    }
}