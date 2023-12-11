package aufgaben_basic.Dez.workingWithConstrukturen;

/*  Implementiere eine Klasse mit einem statischen Feld
und einem finalen Feld. Ändere den Wert des finalen Feldes
in einem statischen Initializer.  */

public class StatischeFelder {

    // Statisches Feld
    static int staticFeld = 10;

    // Finales Feld
    final int finalesFeld = 20;

    // Statischer Initializer
    static {
        finalesFeld = 30;
    }

    // Hauptmethode
    public static void main(String[] args) {
        System.out.println("Statisches Feld: " + staticFeld);
        System.out.println("Finales Feld: " + finalesFeld);
    }
}
