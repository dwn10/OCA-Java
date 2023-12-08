package aufgaben_basic.Dez.Array;

/* Schreibe ein Programm, das ein zweidimensionales Array (Matrix) transponiert. */

public class Transponieren {

    // Hauptmethode
    public static void main(String[] args) {

        // Beispielarray erstellen
        int[][] array = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Transponiertes Array erstellen
        int[][] transponiertesArray = transponieren(array);

        // Transponiertes Array ausgeben
        for (int[] zeile : transponiertesArray) {
            for (int element : zeile) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Methode zum Transponieren eines zweidimensionalen Arrays
    public static int[][] transponieren(int[][] array) {

        // Größe des Arrays ermitteln
        int anzahlZeilen = array.length;
        int anzahlSpalten = array[0].length;

        // Transponiertes Array erstellen
        int[][] transponiertesArray = new int[anzahlSpalten][anzahlZeilen];

        // Transponieren
        for (int i = 0; i < anzahlZeilen; i++) {
            for (int j = 0; j < anzahlSpalten; j++) {
                transponiertesArray[j][i] = array[i][j];
            }
        }

        // Transponiertes Array zurückgeben
        return transponiertesArray;
    }
}
