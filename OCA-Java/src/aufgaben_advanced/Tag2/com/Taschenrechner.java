package aufgaben_advanced.Tag2.com;

public class Taschenrechner {
    public static void main(String[] args) {

        // Variablen initialisieren
        int auswahl = 0;
        int zahl1 = 0;
        int zahl2 = 0;

        // Eingabe der Auswahl
        System.out.println("Bitte wählen Sie eine Rechenart aus:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraktion");
        System.out.println("3 - Multiplikation");
        System.out.println("4 - Division");
        auswahl = Integer.parseInt(System.console().readLine());

        // Eingabe der Zahlen
        System.out.println("Bitte geben Sie die erste Zahl ein:");
        zahl1 = Integer.parseInt(System.console().readLine());
        System.out.println("Bitte geben Sie die zweite Zahl ein:");
        zahl2 = Integer.parseInt(System.console().readLine());

        // Berechnung durchführen
        int ergebnis = 0;
        switch (auswahl) {
            case 1:
                ergebnis = addieren(zahl1, zahl2);
                break;
            case 2:
                ergebnis = subtrahieren(zahl1, zahl2);
                break;
            case 3:
                ergebnis = multiplizieren(zahl1, zahl2);
                break;
            case 4:
                ergebnis = dividieren(zahl1, zahl2);
                break;
            default:
                System.out.println("Die Auswahl ist nicht korrekt.");
                break;
        }

        // Ergebnis ausgeben
        System.out.println("Das Ergebnis ist: " + ergebnis);
    }

    // Methode zum Addieren
    public static int addieren(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    // Methode zum Subtrahieren
    public static int subtrahieren(int zahl1, int zahl2) {
        return zahl1 - zahl2;
    }

    // Methode zum Multiplizieren
    public static int multiplizieren(int zahl1, int zahl2) {
        return zahl1 * zahl2;
    }

    // Methode zum Dividieren
    public static int dividieren(int zahl1, int zahl2) {
        if (zahl2 == 0) {
            System.out.println("Durch 0 dividieren ist nicht möglich.");
            return 0;
        }
        return zahl1 / zahl2;
    }
}
