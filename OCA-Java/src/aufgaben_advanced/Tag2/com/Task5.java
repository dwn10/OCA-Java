package aufgaben_advanced.Tag2.com;

public class Task5 {
    public static void main(String[] args) {

        // Variablen initialisieren
        long summe = 0;
        int zahl = 2;

        // Primzahlen finden
        while (zahl <= 200000) {
            if (istPrimzahl(zahl)) {
                summe += zahl;
            }
            zahl++;
        }

        // Summe ausgeben
        System.out.println("\nDie Summe aller Primzahlen unter 200000 ist: " + summe);
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
