package aufgaben_advanced.Sterne;

/*  *  *  *
    *  .  *
    *  .  *
    *  .  *
    *  *  *  */

public class Sterne4 {

    public static void main(String[] args) {
        // Initialisiere die Variablen für die Höhe und die Breite des Rhombus.
        int hoehe = 5;
        int breite = 3;

        // Zeichne den Rhombus.
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite; j++) {
                if (i == 0 || i == hoehe - 1 || j == 0 || j == breite - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
