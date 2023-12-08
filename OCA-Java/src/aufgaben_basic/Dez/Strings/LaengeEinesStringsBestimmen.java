package aufgaben_basic.Dez.Strings;

/* Implementiere eine Funktion, die die Länge eines
Strings ohne die  Verwendung von length() bestimmt. */

public class LaengeEinesStringsBestimmen {

    // Hauptmethode
    public static void main(String[] args) {

        // String erstellen
        String string = "Hallo Welt!";

        // Länge des Strings bestimmen
        int laenge = laengeOhneLength(string);

        // Länge des Strings ausgeben
        System.out.println("\n******************************");
        System.out.println(string + " Die Länge des Strings beträgt " + laenge);
    }

    // Funktion zur Bestimmung der Länge eines Strings ohne Verwendung von length()
    private static int laengeOhneLength(String string) {

        // Variable zur Speicherung der Länge des Strings
        int laenge = 0;

        // Schleife, die den String durchläuft
        for (char zeichen : string.toCharArray()) {
            // Länge um 1 erhöhen
            laenge++;
        }

        // Länge des Strings zurückgeben
        return laenge;
    }
}
