package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Text ohne Leerzeichen ausgeben
Schreibe ein Programm, das den Benutzer nach einem Text fragt und dann denselben
Text ohne Leerzeichen ausgibt.  */

public class TextOhneLeerzeichenAusgeben {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Text fragen
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = System.console().readLine();

        // Text ohne Leerzeichen erstellen
        String textOhneLeerzeichen = text.replaceAll(" ", "");

        // Text ohne Leerzeichen ausgeben
        System.out.println("\nDer Text ohne Leerzeichen lautet: " + textOhneLeerzeichen);
    }
}
