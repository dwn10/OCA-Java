package aufgaben_basic.Dez.Schleifen_Verzweigungen_Array;

/* Spaltensummen einer Matrix:
Erstelle einen Algorithmus, um die Summe jeder Spalte einer Matrix zu berechnen.
 */

public class Spaltensummen {

    public static void main(String[] args) {
        // Initialisiere die Matrix.
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Initialisiere das Array für die Spaltensummen.
        int[] spaltensummen = new int[matrix.length];

        // Berechne die Spaltensummen.
        for (int zeile = 0; zeile < matrix.length; zeile++) {
            for (int spalte = 0; spalte < matrix[0].length; spalte++) {
                spaltensummen[spalte] += matrix[zeile][spalte];
            }
        }

        // Gib die Spaltensummen aus.
        for (int spaltensumme : spaltensummen) {
            System.out.println(spaltensumme);
        }
    }
}
