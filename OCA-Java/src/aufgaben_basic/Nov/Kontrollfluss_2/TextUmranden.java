package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Text um bestimmte Zeichen ergänzen
Schreibe ein Programm, das den Benutzer nach einem Text und einem Zeichen fragt
und dann den Text um dieses Zeichen herum ergänzt.  */

public class TextUmranden {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Text fragen
        System.out.println("\n****************************");
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = System.console().readLine();

        // Wort in Großbuchstaben umwandeln
        text = text.toUpperCase();

        // Benutzer nach einem Zeichen fragen
        System.out.println("****************************");
        System.out.println("\nGeben Sie ein Zeichen ein: ");
        char zeichen = System.console().readLine().charAt(0);

        // Text um das Zeichen ergänzen
        text = zeichen + text + zeichen;

        // Text ausgeben
        System.out.println("****************************");
        System.out.println("\nDer umrandete Text lautet: " + text);
        System.out.println("\n****************************");
    }
}
