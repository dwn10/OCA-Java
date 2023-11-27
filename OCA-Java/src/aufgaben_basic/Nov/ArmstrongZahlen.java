package aufgaben_basic.Nov;

import java.util.ArrayList;
import java.util.List;

// Aufgabe: Prüfen auf Armstrong-Zahl 
// Schreibe eine Methode, die überprüft, ob eine gegebene Zahl eine Armstrong-Zahl
// ist. Gib entsprechend eine Nachricht aus. 

// Klassendeklaration
class ArmstrongZahlen {

    // Methode zum Prüfen auf Armstrong-Zahl
    static boolean istArmstrongZahl(int zahl) {

        // Liste zum Speichern der Ziffern
        List<Integer> ziffern = new ArrayList<>();

        // Zahl in Ziffern zerlegen
        while (zahl > 0) {
            ziffern.add(zahl % 10);
            zahl /= 10;
        }

        // Summe der Quadrate der Ziffern
        int summe = 0;
        for (int ziffer : ziffern) {
            summe += ziffer * ziffer * ziffer;
        }

        // Wenn Summe der Quadrate der Ziffern gleich der Zahl ist, ist es eine
        // Armstrong-Zahl
        return summe == zahl;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Zahl
        int zahl = 153;

        // Prüfung auf Armstrong-Zahl
        boolean istArmstrongZahl = istArmstrongZahl(zahl);

        // Ausgabe der Nachricht
        if (istArmstrongZahl) {
            System.out.println(zahl + " \nist eine Armstrong-Zahl.");
        } else {
            System.out.println(zahl + " \nist keine Armstrong-Zahl.");
        }
    }
}
