package aufgaben_basic.Dez.Schleifen_Verzweigungen_Array;

/* Spiralmuster ausgeben:
Implementiere eine Methode, die eine spiralförmige Matrix ausgibt:
 */

public class Spiralmuster {

    public static void main(String[] args) {
        // Initialisiere die Größe der Matrix.
        int n = 5;

        // Initialisiere die Matrix.
        int[][] matrix = new int[n][n];

        // Fülle die Matrix mit Zahlen von 1 bis n².
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i * n + j + 1;
            }
        }

        // Gib die Matrix aus.
        printSpiral(matrix);
    }

    private static void printSpiral(int[][] matrix) {
        // Initialisiere die Variablen zur Steuerung des Loops.
        int startZeile = 0;
        int startSpalte = 0;
        int endZeile = matrix.length - 1;
        int endSpalte = matrix[0].length - 1;

        // Gehe solange durch die Matrix, bis alle Elemente ausgegeben wurden.
        while (startZeile <= endZeile && startSpalte <= endSpalte) {
            // Gehe von links nach rechts.
            for (int i = startSpalte; i <= endSpalte; i++) {
                System.out.print(matrix[startZeile][i] + " | ");
            }
            startZeile++;

            // Gehe von oben nach unten.
            for (int i = startZeile; i <= endZeile; i++) {
                System.out.print(matrix[i][endSpalte] + " | ");
            }
            endSpalte--;

            // Gehe von rechts nach links.
            if (startZeile <= endZeile) {
                for (int i = endSpalte; i >= startSpalte; i--) {
                    System.out.print(matrix[endZeile][i] + " | ");
                }
                endZeile--;
            }

            // Gehe von unten nach oben.
            if (startSpalte <= endSpalte) {
                for (int i = endZeile; i >= startZeile; i--) {
                    System.out.print(matrix[i][startSpalte] + " | ");
                }
                startSpalte++;
            }
        }
    }
}