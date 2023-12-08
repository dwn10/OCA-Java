package aufgaben_basic.Dez.Strings;

/* Implementieren Sie eine Funktion, die die Länge einer Zeichenfolge
bestimmt, ohne length() zu verwenden und eine Ausnahme für Leerzeichen zu machen */

public class ZeichenfolgeLaengeOhneLength {

    // Hauptmethode
    public static void main(String[] args) {

        // Zeichenfolge definieren
        String zeichenfolge = " Hallo Welt! ";

        // Zeichenfolgelänge ohne length() bestimmen
        int laenge = zeichenfolge.replaceAll(" ", "").length();

        // Ausgabe der Zeichenfolgelänge
        System.out.println("\n***************************************");
        System.out.println(zeichenfolge + "Die Zeichenfolgelänge beträgt " + laenge + " Zeichen.");
    }

    // Funktion zum Bestimmen der Zeichenfolgelänge ohne length()
    public static int laengeOhneLength(String zeichenfolge) {

        // Leerzeichen entfernen
        zeichenfolge = zeichenfolge.replaceAll(" ", "");

        // Zeichenfolgelänge zurückgeben
        return zeichenfolge.length();
    }
}
