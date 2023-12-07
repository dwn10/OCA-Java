package aufgaben_basic.Dez.Schleifen_Verzweigungen_Array;

/* Matrix-Addition:
Implementiere eine Methode, die zwei Matrizen addiert und das Ergebnis zurückgibt.
 */

public class MatrixAddition {

    public static void main(String[] args) {
        // Initialisiere die beiden Matrizen.
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix2 = { { 7, 8, 9 }, { 10, 11, 12 } };

        // Rufe die Methode `add()` auf und speichere das Ergebnis in der Variable
        // `sum`.
        int[][] sum = add(matrix1, matrix2);

        // Gib die Summe der Matrizen aus.
        for (int[] row : sum) {
            for (int element : row) {
                System.out.print(element + " | ");
            }
            System.out.println();
        }
    }

    // Methode zur Addition von zwei Matrizen.
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        // Überprüfe, ob die Matrizen die gleiche Größe haben.
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Die Matrizen müssen die gleiche Größe haben.");
        }

        // Initialisiere die Summenmatrix.
        int[][] sum = new int[matrix1.length][matrix1[0].length];

        // Addiere die Elemente der beiden Matrizen.
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Gib die Summenmatrix zurück.
        return sum;
    }
}
