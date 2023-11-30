package aufgaben_advanced.Sterne;

/*      *  *
      * * * * *
        *  *
      * * * * *
        *  *        */

public class Sterne7 {
    public static void main(String[] args) {
        // Definieren Sie die Zeichenfolgen, die das Muster darstellen
        String[] pattern = { "   *  *   ", " * * * * *  ", "   *  *   ", " * * * * *  ", "   *  *   " };

        // Schleife durch jede Zeichenfolge und geben Sie sie aus
        for (String line : pattern) {
            System.out.println(line);
        }
    }
}