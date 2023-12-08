package aufgaben_basic.Dez.Array;

/* Erstelle ein Array mit den Wochentagen und gib sie in umgekehrter Reihenfolge aus. */

public class Wochentage {

    // Hauptmethode
    public static void main(String[] args) {

        // Wochentage als Array definieren
        System.out.println("\n************************************");
        String[] wochentage = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" };

        // Array in umgekehrter Reihenfolge ausgeben
        for (int i = wochentage.length - 1; i >= 0; i--) {
            System.out.println(wochentage[i]);
        }
    }
}
