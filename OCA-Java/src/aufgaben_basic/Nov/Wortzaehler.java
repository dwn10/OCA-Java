package aufgaben_basic.Nov;

// Aufgabe: Anzahl der Wörter zählen
// Schreibe eine Methode, die die Anzahl der Wörter in einem gegebenen String
// zurückgibt. Rufe diese Methode aus der main-Methode auf und gib die Anzahl der Wörter aus.

// Klassendeklaration
class Wortzaehler {

    // Methode zum Zählen der Wörter in einem String
    static int zaehleWoerter(String text) {

        // Anzahl der Wörter
        int anzahlWoerter = 0;

        // Leerzeichen-Zeichen
        char leerzeichen = ' ';

        // Für jedes Zeichen im String
        for (int i = 0; i < text.length(); i++) {

            // Wenn das aktuelle Zeichen ein Leerzeichen ist
            if (text.charAt(i) == leerzeichen) {

                // Anzahl der Wörter erhöhen
                anzahlWoerter++;
            }
        }

        // Anzahl der Wörter zurückgeben
        return anzahlWoerter;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Text
        String text = "\nHallo Welt, wie geht es dir?";

        // Anzahl der Wörter
        int anzahlWoerter = zaehleWoerter(text);

        // Ausgabe der Anzahl der Wörter
        System.out.println("\nDie Anzahl der Wörter in \"" + text + "\" ist: " + anzahlWoerter);
    }
}
