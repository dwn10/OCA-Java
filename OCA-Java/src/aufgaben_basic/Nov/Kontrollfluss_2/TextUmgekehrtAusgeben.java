package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Text umgekehrt ausgeben
, das den Benutzer nach einem Text fragt und dann den Text in
umgekehrter Reihenfolge ausgibt.  */

public class TextUmgekehrtAusgeben {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Text fragen
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = System.console().readLine();

        // Text in umgekehrter Reihenfolge speichern
        String umgekehrterText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            umgekehrterText += text.charAt(i);
        }

        // Text ausgeben
        System.out.println("\nDer Text in umgekehrter Reihenfolge lautet: " + umgekehrterText);
    }
}
