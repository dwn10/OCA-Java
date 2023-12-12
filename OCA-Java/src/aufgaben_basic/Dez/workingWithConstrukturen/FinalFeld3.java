package aufgaben_basic.Dez.workingWithConstrukturen;

/* Entwickle eine Klasse mit einem finalen Feld
und einer Methode, die versucht, diesen Wert zu ändern. */

public class FinalFeld3 {

    // finales Feld
    private final int wert = 10;

    // Methode, die versucht, den Wert des finalen Felds zu ändern
    public void aendern() {
        // Fehlermeldung ausgeben
        System.out.println("Fehler: Der Wert des finalen Felds darf nicht geändert werden.");
    }

    public static void main(String[] args) {
        FinalFeld feld = new FinalFeld();
        feld.aendern();
    }
}
