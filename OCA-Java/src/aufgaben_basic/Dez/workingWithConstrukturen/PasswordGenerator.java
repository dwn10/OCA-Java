package aufgaben_basic.Dez.workingWithConstrukturen;

/* Aufgabe: Passwortgenerator

Erstelle eine Klasse namens PasswordGenerator, die eine
Passwortgenerierungsfunktion implementiert. Das Passwort soll aus einer
Kombination von Buchstaben, Zahlen und Symbole bestehen.

1. Die Klasse PasswordGenerator soll folgende Funktionalitäten haben:
Einen Konstruktor, der ein Passwort mit einer festgelegten Länge generiert.
Eine Methode generatePassword(), die das generierte Passwort zurückgibt.

2. Implementiere die Methode generatePassword():
Das Passwort soll aus einer zufälligen Kombination von Buchstaben
(Groß- und Kleinbuchstaben) und Zahlen bestehen.
Die Länge des Passworts wird im Konstruktor festgelegt
und soll nicht veränderbar sein.
Verwende die StringBuilder-Klasse, um das Passwort zusammenzusetzen.  */

public class PasswordGenerator {

    // Konstanten für die Zeichen, aus denen das Passwort bestehen soll
    private static final String ZEICHEN = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}<>,.?/";

    // Länge des Passworts
    private int laenge;

    // Konstruktor
    public PasswordGenerator(int laenge) {
        this.laenge = laenge;
    }

    // Methode zum Generieren des Passworts
    public String generatePassword() {

        // StringBuilder zum Zusammensetzen des Passworts
        StringBuilder passwort = new StringBuilder();

        // Zufallszahl für das nächste Zeichen
        int zufallszahl;

        // Passwort generieren
        for (int i = 0; i < laenge; i++) {

            // Zufallszahl zwischen 0 und der Länge des Zeichensatzes
            zufallszahl = (int) (Math.random() * ZEICHEN.length());

            // Zeichen aus dem Zeichensatz hinzufügen
            passwort.append(ZEICHEN.charAt(zufallszahl));
        }

        // Passwort zurückgeben
        return passwort.toString();
    }
}
