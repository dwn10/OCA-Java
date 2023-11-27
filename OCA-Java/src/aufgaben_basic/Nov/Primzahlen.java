package aufgaben_basic.Nov;

import java.util.ArrayList;
import java.util.List;

//  Aufgabe: Primzahl zwischen zwei Zahlen 
// Schreibe eine Methode, die alle Primzahlen zwischen zwei gegebenen Zahlen
//zurückgibt. Rufe diese Methode aus der main-Methode auf und gib die Primzahlen aus. 

// Klassendeklaration
class Primzahlen {

    // Methode zum Finden aller Primzahlen zwischen zwei gegebenen Zahlen
    static List<Integer> findPrimzahlen(int start, int end) {

        // Liste zum Speichern der Primzahlen
        List<Integer> primzahlen = new ArrayList<>();

        // Für jede Zahl von start bis end
        for (int i = start; i <= end; i++) {

            // Prüfen, ob i eine Primzahl ist
            boolean istPrimzahl = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    istPrimzahl = false;
                    break;
                }
            }

            // Wenn i eine Primzahl ist, dann zur Liste hinzufügen
            if (istPrimzahl) {
                primzahlen.add(i);
            }
        }

        // Liste zurückgeben
        return primzahlen;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Start- und Endwert der Zahlen
        int start = 2;
        int end = 100;

        // Liste der Primzahlen
        List<Integer> primzahlen = findPrimzahlen(start, end);

        // Ausgabe der Primzahlen
        System.out.println("Die Primzahlen zwischen " + start + " und " + end + " sind:");
        for (int primzahl : primzahlen) {
            System.out.println(primzahl);
        }
    }
}
