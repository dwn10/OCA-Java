package aufgaben_basic.Dez.Primitive_Datentypen;

/* Entwickle eine Methode, die prüft,
ob eine Zahl ein Palindrom ist. */

public class PalindromPrüfen {

    // Methode, die prüft, ob eine Zahl ein Palindrom ist
    public static boolean istPalindrom(int zahl) {

        // Zahl in einen String konvertieren
        String zahlString = Integer.toString(zahl);

        // String von hinten nach vorne durchlaufen
        for (int i = zahlString.length() - 1; i >= 0; i--) {

            // Wenn die aktuelle Ziffer nicht mit der nächsten Ziffer übereinstimmt,
            // ist die Zahl kein Palindrom
            if (zahlString.charAt(i) != zahlString.charAt(zahlString.length() - i - 1)) {
                return false;
            }
        }

        // Wenn alle Ziffern übereinstimmen, ist die Zahl ein Palindrom
        return true;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Zahl eingeben
        System.out.println("\n******************************");
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());

        // Prüfen, ob die Zahl ein Palindrom ist
        boolean istPalindrom = istPalindrom(zahl);

        // Ergebnis ausgeben
        if (istPalindrom) {
            System.out.println("******************************");
            System.out.println("Die Zahl ist ein Palindrom.");
        } else {
            System.out.println("******************************");
            System.out.println("Die Zahl ist kein Palindrom.");
        }
    }
}
