package aufgaben_basic.Dez.Objekte_Programmier;

/* Implementiere nun 2 weiter statische Felder. Alle statischen Felder  sollen
initialisiert werden ohne das ein Objekt der Klasse erstellt wird.  */

public class StatischeFelder {

    // Initialisiere das erste statische Feld.
    static int x = 10;

    // Initialisiere das zweite statische Feld.
    static String y = "Hallo Welt!";

    public static void main(String[] args) {
        // Gib die beiden statischen Felder aus.
        System.out.println("\n*************");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
