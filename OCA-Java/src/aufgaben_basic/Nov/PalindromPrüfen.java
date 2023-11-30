package aufgaben_basic.Nov;

public class PalindromPrüfen {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Wort fragen
        System.out.println("\n***************************************");
        System.out.println("Geben Sie ein Wort ein: ");
        String wort = System.console().readLine();

        // Wort in Großbuchstaben umwandeln
        wort = wort.toUpperCase();

        // Palindrom prüfen
        boolean palindrom = true;
        for (int i = 0; i < wort.length() / 2; i++) {
            if (wort.charAt(i) != wort.charAt(wort.length() - i - 1)) {
                palindrom = false;
                break;
            }
        }
        System.out.println("***************************************");
        // Ergebnis ausgeben
        if (palindrom) {
            System.out.println(wort + " Das Wort ist ein Palindrom.");
            System.out.println("***************************************");
        } else {
            System.out.println(wort + " Das Wort ist kein Palindrom.");
            System.out.println("***************************************");
        }
    }
}
