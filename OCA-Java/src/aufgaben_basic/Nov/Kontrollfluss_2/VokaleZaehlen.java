package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Vokale zählen
Schreibe ein Programm, das den Benutzer nach einem Wort oder Satz fragt und dann
die Anzahl der Vokale im Text ausgibt.  */

public class VokaleZaehlen {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Text fragen
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = System.console().readLine();

        // Array mit den Vokalen erstellen
        char[] vokale = new char[] { 'a', 'e', 'i', 'o', 'u' };

        // Anzahl der Vokale zählen
        int anzahlVokale = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vokale.length; j++) {
                if (text.charAt(i) == vokale[j]) {
                    anzahlVokale++;
                    break;
                }
            }
        }

        // Anzahl der Vokale ausgeben
        System.out.println("\n***************************");
        System.out.println("Die Anzahl der Vokale in dem Text lautet: " + anzahlVokale);
    }
}
