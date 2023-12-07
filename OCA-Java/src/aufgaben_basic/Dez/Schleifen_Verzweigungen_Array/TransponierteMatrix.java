package aufgaben_basic.Dez.Schleifen_Verzweigungen_Array;

/* Transponierte Matrix:
Entwickle eine Funktion, die die transponierte Form einer Matrix berechnet.
 */

public class TransponierteMatrix {

    public static void main(String[] args) {
        // Initialisiere die Matrix.
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Rufe die Methode `transponiere()` auf und speichere das Ergebnis in der
        // Variable `transponierteMatrix`.
        int[][] transponierteMatrix = transponiere(matrix);

        // Gib die transponierte Matrix aus.
        for (int i = 0; i < transponierteMatrix.length; i++) {
            for (int j = 0; j < transponierteMatrix[i].length; j++) {
                System.out.print(transponierteMatrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    // Methode zur Berechnung der transponierten Form einer Matrix.
    public static int[][] transponiere(int[][] matrix) {
        // Initialisiere die transponierte Matrix.
        int[][] transponierteMatrix = new int[matrix[0].length][matrix.length];

        // Gehe für jede Zeile der Matrix durch.
        for (int i = 0; i < matrix.length; i++) {
            // Gehe für jedes Element der aktuellen Zeile durch.
            for (int j = 0; j < matrix[i].length; j++) {
                // Füge das aktuelle Element an die transponierte Matrix an.
                transponierteMatrix[j][i] = matrix[i][j];
            }
        }

        // Gib die transponierte Matrix zurück.
        return transponierteMatrix;
    }
}
