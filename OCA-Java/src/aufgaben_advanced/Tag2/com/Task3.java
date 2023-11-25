package aufgaben_advanced.Tag2.com;

public class Task3 {
    public static void main(String[] args) {

        // Variablen initialisieren
        int zahl = 2;
        int primzahlAnzahl = 0;

        // Primzahlen zählen
        while (primzahlAnzahl < 100) {
            if (istPrimzahl(zahl)) {
                primzahlAnzahl++;
            }
            zahl++;
        }

        // 100. Primzahl ausgeben
        System.out.println("\nDie 100. Primzahl ist: " + zahl);
    }

    // Methode zum Testen, ob eine Zahl eine Primzahl ist
    public static boolean istPrimzahl(int zahl) {
        for (int i = 2; i * i <= zahl; i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        return true;
    }
}
