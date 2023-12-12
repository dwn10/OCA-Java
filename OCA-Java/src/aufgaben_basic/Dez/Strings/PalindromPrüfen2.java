package aufgaben_basic.Dez.Strings;

/* Schreibe eine Methode, die prüft, ob ein String ein Palindrom ist.

Ausgabe:

Geben Sie einen String ein: madam
Der String ist ein Palindrom. */

public class PalindromPrüfen2 {

    // Methode, die prüft, ob ein String ein Palindrom ist
    public static boolean istPalindrom(String s) {

        // String in Kleinbuchstaben umwandeln
        s = s.toLowerCase();

        // Indexvariablen initialisieren
        int i = 0;
        int j = s.length() - 1;

        // Solange die Indexvariablen nicht überlappen
        while (i < j) {

            // Wenn die Zeichen an den Indexvariablen nicht gleich sind
            if (s.charAt(i) != s.charAt(j)) {

                // Palindrom ist nicht erfüllt
                return false;
            }

            // Indexvariablen um eins erhöhen bzw. verringern
            i++;
            j--;
        }

        // Palindrom ist erfüllt
        return true;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // String eingeben
        System.out.println("\n******************************");
        System.out.println("Geben Sie einen String ein: ");
        String s = System.console().readLine();

        // Palindrom prüfen
        boolean istPalindrom = istPalindrom(s);

        // Ergebnis ausgeben
        if (istPalindrom) {
            System.out.println("******************************");
            System.out.println("Der String ist ein Palindrom.");
        } else {
            System.out.println("******************************");
            System.out.println("Der String ist kein Palindrom.");
        }
    }
}
