package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Textverschlüsselung mit Vigenère-Chiffre
Schreibe ein Programm, das den Benutzer nach einem Text und einem Schlüsselwort
fragt und dann den Text mit der Vigenère-Chiffre verschlüsselt.  */

import java.util.Scanner;

public class VigenereCipher {

    // Hauptmethode
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Benutzer nach einem Text fragen
        System.out.println("***********************************************");
        System.out.println("\nGeben Sie den Text ein, den Sie verschlüsseln möchten:");
        String text = scanner.nextLine().toLowerCase();
        // Benutzer nach einem Schlüsselwort fragen
        System.out.println("\nGeben Sie das Schlüsselwort ein:");
        String key = scanner.nextLine().toLowerCase();
        String encryptedText = encrypt(text, key);
        // Verschlüsselten Text ausgeben
        System.out.println("***********************************************");
        System.out.println("Verschlüsselter Text: " + encryptedText);
        System.out.println("***********************************************");
    }

    // Text verschlüsseln
    public static String encrypt(String text, String key) {
        String encryptedText = "";
        int keyIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int shift = key.charAt(keyIndex) - 'a';
                char encryptedChar = (char) ((c - 'a' + shift) % 26 + 'a');
                encryptedText += encryptedChar;
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                encryptedText += c;
            }
        }
        return encryptedText;
    }
}
