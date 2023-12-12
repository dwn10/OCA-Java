package aufgaben_basic.Dez.Primitive_Datentypen;

/* Schreibe eine Funktion, die die Quersumme einer gegebenen Zahl berechnet.

Ausgabe

Geben Sie eine Zahl ein: 123456789
Die Quersumme von 123456789 ist 45 */

public class QuersummeBerechnen {

    // Funktion zur Berechnung der Quersumme
    public static int quersummeBerechnen(int zahl) {

        // Variable zur Zwischenspeicherung der Quersumme
        int quersumme = 0;

        // Solange die Zahl nicht 0 ist
        while (zahl > 0) {

            // Aktuelle Ziffer der Zahl addieren
            quersumme += zahl % 10;

            // Zahl um 10 verringern
            zahl /= 10;
        }

        // Quersumme zurückgeben
        return quersumme;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Zahl eingeben
        System.out.println("\n******************************");
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());

        // Quersumme berechnen
        int quersumme = quersummeBerechnen(zahl);

        // Quersumme ausgeben
        System.out.println("******************************");
        System.out.println("Die Quersumme von " + zahl + " ist " + quersumme);
    }
}
