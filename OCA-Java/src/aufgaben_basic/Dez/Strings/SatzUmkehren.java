package aufgaben_basic.Dez.Strings;

/* Schreibe einen Algorithmus, der einen gegebenen Satz
in umgekehrter  Reihenfolge ausgibt.

Algorithmus zum Ausgeben eines Satzes in umgekehrter Reihenfolge

1. Den Satz in einen Array von Wörtern zerlegen.
2. Den Array von Wörtern von hinten nach vorne durchlaufen.
3. Jedes Wort ausgeben. */

public class SatzUmkehren {

    // Hauptmethode
    public static void main(String[] args) {

        // Satz eingeben
        System.out.println("\n******************************");
        System.out.println("Geben Sie einen Satz ein: ");
        String satz = System.console().readLine();

        // Satz in Wörter zerlegen
        String[] woerter = satz.split(" ");

        // Wörter in umgekehrter Reihenfolge ausgeben
        for (int i = woerter.length - 1; i >= 0; i--) {
            System.out.print(woerter[i] + " | ");
        }

        System.out.println();
    }
}
