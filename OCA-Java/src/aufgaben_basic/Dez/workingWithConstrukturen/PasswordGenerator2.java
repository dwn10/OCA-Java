package workingWithConstrukturen;

/* 12-stelliger Zufallskennwortgenerator mit Großbuchstaben,
Kleinbuchstaben, Zahlen und Symbolen.
wobei der Benutzer die Anzahl der Zeichen zwischen 8 und 22 eingibt */

import java.util.Random;

public class PasswordGenerator2 {

    // Konstanten für die verschiedenen Zeichenkategorien
    private static final char[] GROSSBUCHSTABEN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] KLEINBUCHSTABEN = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] ZAHLEN = "0123456789".toCharArray();
    private static final char[] SYMBOLE = "!@#$%^&*()-_=+[]{}<>,./?;'\"".toCharArray();

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach der gewünschten Kennwortlänge fragen
        System.out.println("\n************************************************************");
        System.out.println("Geben Sie die gewünschte Kennwortlänge in Zeichen ein (8-22): ");
        int kennwortlaenge = Integer.parseInt(System.console().readLine());

        // Zufallskennwort generieren
        String kennwort = generiereKennwort(kennwortlaenge);

        // Kennwort ausgeben
        System.out.println("***************************************");
        System.out.println("Das generierte Kennwort lautet: " + kennwort);
    }

    // Methode zum Generieren eines Zufallskennworts
    private static String generiereKennwort(int kennwortlaenge) {

        // Zufallszahlengenerator initialisieren
        Random random = new Random();

        // Zeichenketten für die verschiedenen Zeichenkategorien erstellen
        String grossbuchstaben = new String(GROSSBUCHSTABEN);
        String kleinbuchstaben = new String(KLEINBUCHSTABEN);
        String zahlen = new String(ZAHLEN);
        String symbole = new String(SYMBOLE);

        // Zufallszeichen aus den verschiedenen Zeichenketten generieren
        StringBuilder kennwortBuilder = new StringBuilder();
        for (int i = 0; i < kennwortlaenge; i++) {
            int zeichenKategorie = random.nextInt(4);
            switch (zeichenKategorie) {
                case 0:
                    kennwortBuilder.append(grossbuchstaben.charAt(random.nextInt(grossbuchstaben.length())));
                    break;
                case 1:
                    kennwortBuilder.append(kleinbuchstaben.charAt(random.nextInt(kleinbuchstaben.length())));
                    break;
                case 2:
                    kennwortBuilder.append(zahlen.charAt(random.nextInt(zahlen.length())));
                    break;
                case 3:
                    kennwortBuilder.append(symbole.charAt(random.nextInt(symbole.length())));
                    break;
            }
        }

        // Zufallskennwort zurückgeben
        return kennwortBuilder.toString();
    }
}
