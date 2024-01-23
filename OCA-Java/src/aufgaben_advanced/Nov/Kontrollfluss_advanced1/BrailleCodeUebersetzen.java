package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: Text in BrailleCode übersetzen
Schreibe ein Programm, das den Benutzer nach einem Text fragt und dann diesen
Text Zeichen für Zeichen in BrailleCode übersetzt. */

import java.util.Scanner;

public class BrailleCodeUebersetzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // BrailleCode representation for letters
        String[] brailleABC = {
                "⠁", // a
                "⠃", // b
                "⠉ ", // c
                "⠙ ", // d
                "⠑ ", // e
                "⠋ ", // f
                "⠛ ", // g
                "⠓ ", // h
                "⠊ ", // i
                "⠚ ", // j
                "⠅ ", // k
                "⠇ ", // l
                "⠍ ", // m
                "⠝", // n
                "⠕", // o
                "⠏ ", // p
                "⠟ ", // q
                "⠗ ", // r
                "⠎ ", // s
                "⠞", // t
                "⠥", // u
                "⠧", // v
                "⠺ ", // w
                "⠭ ", // x
                "⠽ ", // y
                "⠵" // z
        };

        String[] nummer_0_9 = {
                "⠼⠚ ", // 0
                "⠼⠁ ", // 1
                "⠼⠃ ", // 2
                "⠼⠉ ", // 3
                "⠼⠙ ", // 4
                "⠼⠑ ", // 5
                "⠼⠋ ", // 6
                "⠼⠛ ", // 7
                "⠼⠓ ", // 8
                "⠼⠊ " // 9
        };

        System.out.println("\n******************************************************************");
        System.out.println("Geben Sie den Text ein, den Sie in BrailleCode übersetzen möchten:");
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
                    System.out.print(brailleABC[index] + " ");
                }
            }
        }
    }
}
