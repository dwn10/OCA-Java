package aufgaben_advanced.Tag1.com;

import java.util.Scanner;

public class Alter_in_Sekunden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Alter abfragen
        System.out.print("\nGeben Sie Ihr Alter ein: ");
        int ageInYears = scanner.nextInt();
        scanner.close();

        // Anzahl der Jahre berechnen
        int ageInDays = ageInYears * 365;
        // Anzahl der Tage berechnen
        int ageInSeconds = ageInDays * 24 * 60 * 60;

        // Ergebnis ausgeben
        System.out.println("\nIch bin " + ageInSeconds + " Sekunden alt.");
    }
}

// Daher entspricht ein Jahr:

// 31.536.000 Sekunden
// 525.600 Minuten
// 8.760 Stunden
// 365 Tage
// 52 Wochen und 1 Tag
// 12 Monate