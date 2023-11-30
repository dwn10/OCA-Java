package aufgaben_basic.Nov;

/* Aufgabe: Text umwandeln , das den Benutzer nach
einem Text fragt und dann diesen Text in Großbuchstaben ausgibt. */

public class TextUmwandeln {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Text fragen
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = System.console().readLine();

        // Text in Großbuchstaben umwandeln
        text = text.toUpperCase();

        // Text ausgeben
        System.out.println("\nDer Text in Großbuchstaben lautet: " + text);
    }
}
