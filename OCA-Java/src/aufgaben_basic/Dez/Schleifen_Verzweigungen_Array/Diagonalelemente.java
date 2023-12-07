package aufgaben_basic.Dez.Schleifen_Verzweigungen_Array;

/* Diagonalelemente einer Matrix:
Schreibe Code, der die Diagonalelemente einer quadratischen Matrix ausgibt.
 */

public class Diagonalelemente {

    public static void main(String[] args) {
        // Initialisiere die Matrix.
        int[][] matrix = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Initialisiere die Variable zur Speicherung der Diagonalelemente.
        int[] diagonalelemente = new int[matrix.length];

        // Gehe durch die Matrix und speichere die Diagonalelemente in der Variable
        // `diagonalelemente`.
        for (int i = 0; i < matrix.length; i++) {
            diagonalelemente[i] = matrix[i][i];
        }

        // Gib die Diagonalelemente aus.
        System.out.println("\n****************************************");
        System.out.println("Die Diagonalelemente der Matrix sind:");
        for (int diagonalelement : diagonalelemente) {
            System.out.println(diagonalelement);
        }
    }
}
