package aufgaben_advanced.Nov.Sterne;

public class Sterne6 {

    public static void main(String[] args) {
        // Initialisiere die Zeilenzahl.
        int zeilenzahl = 5;

        // Gehe von 1 bis zur Zeilenzahl.
        for (int zeile = 1; zeile <= zeilenzahl; zeile++) {
            // Initialisiere die Anzahl der Sterne in der aktuellen Zeile.
            int sterneanzahl = 2 * zeile - 1;

            // Gehe von 1 bis zur Anzahl der Sterne in der aktuellen Zeile.
            for (int stern = 1; stern <= sterneanzahl; stern++) {
                // Gib einen Stern aus.
                System.out.print(" * ");
            }

            // Gib einen Zeilenumbruch aus.
            System.out.println();
        }
    }
}
