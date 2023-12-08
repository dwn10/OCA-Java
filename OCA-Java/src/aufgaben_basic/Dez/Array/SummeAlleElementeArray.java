package aufgaben_basic.Dez.Array;

public class SummeAlleElementeArray {

    // Hauptmethode
    public static void main(String[] args) {

        // Array mit Ganzzahlen erstellen
        int[] array = { 1, 2, 3, 4, 5 };

        // Summe des Arrays berechnen
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }

        // Summe ausgeben
        System.out.println("\n*****************************");
        System.out.println("Die Summe des Arrays ist " + summe);
    }
}
