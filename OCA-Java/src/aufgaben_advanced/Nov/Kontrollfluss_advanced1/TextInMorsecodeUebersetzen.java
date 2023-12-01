package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Text in Morsecode übersetzen
Schreibe ein Programm, das den Benutzer nach einem Text fragt und dann diesen
Text Zeichen für Zeichen in Morsecode übersetzt.

Hierfür das Morsealphabet.
String[] morseABC = {
 ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
 "-.-", ".-..","--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
 "..-", "...-", ".--", "-..-", "-.--", "--..","-----", ".----", "..---",
 "...--", "....-", ".....", "-....", "--...", "---..", "----."
 };
 
 String[] nummer 0-9 = {"-----", ".----", "..---", "...--", "....-", ".....",
 "-....", "--...", "---..", "----."};  */

import java.util.Scanner;

public class TextInMorsecodeUebersetzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] morseABC = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----." };

        String[] nummer_0_9 = { "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..",
                "----." };

        System.out.println("\n******************************************************************");
        System.out.println("Geben Sie den Text ein, den Sie in Morsecode übersetzen möchten:");
        System.out.println("******************************************************************");
        String text = scanner.nextLine().toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                System.out.print(" ");
            } else if (Character.isDigit(c)) {
                int index = Character.getNumericValue(c);
                System.out.print(nummer_0_9[index] + " ");

            } else {
                int index = c - 'a';
                if (index >= 0 && index < 26) {
                    System.out.print(morseABC[index] + " ");
                }
            }
        }
    }
}
