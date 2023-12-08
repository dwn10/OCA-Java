package aufgaben_basic.Dez.Verzweigungen;

/* Entwickle eine Methode, die prüft, ob ein Jahr ein Schaltjahr ist oder nicht. */

public class SchaltjahrPruefung {

    // Methode zum Prüfen, ob ein Jahr ein Schaltjahr ist
    public static boolean istSchaltjahr(int jahr) {
        // Jahr muss durch 4 teilbar sein
        if (jahr % 4 != 0) {
            return false;
        }

        // Jahr muss nicht durch 100 teilbar sein, außer es ist durch 400 teilbar
        if (jahr % 100 == 0 && jahr % 400 != 0) {
            return false;
        }

        // Jahr ist ein Schaltjahr
        return true;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Jahr eingeben
        System.out.println("\n******************************");
        System.out.println("Geben Sie ein Jahr ein: ");
        int jahr = Integer.parseInt(System.console().readLine());

        // Prüfen, ob Jahr ein Schaltjahr ist
        boolean istSchaltjahr = istSchaltjahr(jahr);

        // Ergebnis ausgeben
        System.out.println("******************************");
        System.out.println(jahr + " ist " + (istSchaltjahr ? "ein" : "kein") + " Schaltjahr.");
    }
}
