package aufgaben_basic.Dez.Verzweigungen;

/* Schreibe einen Algorithmus, der den BMI (Body Mass Index)
berechnet und den entsprechenden Gesundheitsstatus ausgibt.

< 18.5	    Untergewichtig
18.5 - 25	Normalgewichtig
25 - 30	    Übergewichtig
> 30	    Krankhaft übergewichtig   */

import java.util.Scanner;

public class BMIBerechnen {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach Körpergröße fragen
        System.out.println("\n************************************");
        System.out.println("Geben Sie Ihre Körpergröße in cm ein: ");
        double körpergröße = scanner.nextDouble();

        // Benutzer nach Körpergewicht fragen
        System.out.println("************************************");
        System.out.println("Geben Sie Ihr Körpergewicht in kg ein: ");
        double körpergewicht = scanner.nextDouble();

        // BMI berechnen
        double bmi = körpergewicht / (körpergröße * körpergröße / 10000);

        // Gesundheitsstatus ausgeben
        System.out.println("************************************");
        System.out.println("Ihr BMI beträgt " + bmi + ".");

        // Gesundheitsstatus bestimmen
        String gesundheitsstatus;
        if (bmi < 18.5) {
            gesundheitsstatus = "untergewichtig";
        } else if (bmi < 25) {
            gesundheitsstatus = "normalgewichtig";
        } else if (bmi < 30) {
            gesundheitsstatus = "übergewichtig";
        } else {
            gesundheitsstatus = "krankhaft übergewichtig";
        }

        // Gesundheitsstatus ausgeben
        System.out.println("************************************");
        System.out.println("Ihr Gesundheitsstatus ist " + gesundheitsstatus + ".");
    }
}
