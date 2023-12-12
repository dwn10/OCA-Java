package aufgaben_basic.Dez.workingWithConstrukturen;

/* Erstelle eine Klasse mit einem finalen Feld und einer statischen Methode, die auf dieses Feld zugreift. */

public class FinalFeld {

    // Deklaration des finalen Felds in einem Konstruktor
    private final int PI;

    // Konstruktor
    public FinalFeld() {
        this.PI = 3.1415;
    }

    // Statische Methode, die auf das Feld zugreift
    public static void gibPiAus() {
        System.out.println("Der Wert von PI ist: " + new FinalFeld().PI);
    }

    // Hauptmethode
    public static void main(String[] args) {
        gibPiAus();
    }
}
