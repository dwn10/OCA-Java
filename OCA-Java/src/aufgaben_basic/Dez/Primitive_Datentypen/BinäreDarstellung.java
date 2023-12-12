package aufgaben_basic.Dez.Primitive_Datentypen;

/*  Schreibe eine Methode, die die binäre
Darstellung einer gegebenen Zahl zurückgibt.  */

public class BinäreDarstellung {

    // Methode zur Berechnung der binären Darstellung einer Zahl
    public static String binäreDarstellung(int zahl) {

        // Hilfsvariablen
        String binär = "";
        int rest;

        // Solange die Zahl größer als 0 ist
        while (zahl > 0) {

            // Rest der Division durch 2
            rest = zahl % 2;

            // Rest an die binäre Darstellung anhängen
            binär = rest + binär;

            // Zahl durch 2 dividieren
            zahl = zahl / 2;
        }

        // Binäre Darstellung zurückgeben
        return binär;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Zahl eingeben
        System.out.println("\n************************************");
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());

        // Binäre Darstellung berechnen
        String binärDarstellung = binäreDarstellung(zahl);

        // Binäre Darstellung ausgeben
        System.out.println("************************************");
        System.out.println("Die binäre Darstellung von " + zahl + " ist " + binärDarstellung);
    }
}
