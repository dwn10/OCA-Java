package aufgaben_basic.Dez.Schleifen;

/* Erstelle eine Schleife, die die geraden Zahlen von 1 bis 20 ausgibt. */

public class GeradeZahlen {

    public static void main(String[] args) {
        // Initialisiere die Variable zur Speicherung der aktuellen Zahl.
        int zahl = 2;

        // Gehe solange die Zahl kleiner oder gleich 20 ist, weiter.
        while (zahl <= 20) {
            // Gib die Zahl aus.
            System.out.println(zahl);

            // Erhöhe die Zahl um 2.
            zahl += 2;
        }
    }
}
