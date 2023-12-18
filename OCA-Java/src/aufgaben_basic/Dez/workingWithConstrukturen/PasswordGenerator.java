package workingWithConstrukturen;

import java.util.Random;

public class PasswordGenerator {

    // Hauptmethode
    public static void main(String[] args) {

        // Zufallszahlengenerator erstellen
        Random random = new Random();

        // Zeichensatz erstellen
        String zeichensatz = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

        // 12-stelliges Kennwort erstellen
        String kennwort = "";
        for (int i = 0; i < 12; i++) {
            kennwort += zeichensatz.charAt(random.nextInt(zeichensatz.length()));
        }

        // Kennwort ausgeben
        System.out.println("\n***************************************");
        System.out.println("Das generierte Kennwort lautet: " + kennwort);
    }
}