package aufgaben_basic.Dez.workingWithConstrukturen;

/* Erstelle eine Klasse mit einem finalen Feld und einem
Konstruktor mit Parametern, um dieses Feld zu initialisieren.  */

public class FinalFeld2 {

    // finales Feld
    private final String name;

    // Konstruktor mit Parametern
public FinalFeld(String name) {
    this.name = name;
}

    // Methode zum Ausgeben des Namens
    public void getName() {
        System.out.println(name);
    }

    // Hauptmethode
    public static void main(String[] args) {
        FinalFeld beispiel = new FinalFeld("Max Mustermann");
        beispiel.getName();
    }
}