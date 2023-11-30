package aufgaben_advanced.Sterne;

/*          *
            *  *  *
            *  *  *  *  *
            *  *  *
            *            */

public class Sterne5 {

    public static void main(String[] args) {
        // Initialisiere die Variablen für die Anzahl der Sterne pro Zeile.
        int[] anzahlSterne = { 1, 3, 5, 3, 1 };

        // Gehe für jede Zeile durch.
        for (int zeile = 1; zeile <= 5; zeile++) {
            // Zeichne die Sterne für die aktuelle Zeile.
            for (int stern = 1; stern <= anzahlSterne[zeile - 1]; stern++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}