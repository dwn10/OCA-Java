package aufgaben_basic.Nov;

/* Aufgabe: Wortfrequenz zählen , das den Benutzer nach
einem Text fragt und dann die Häufigkeit jedes Wortes im Text ausgibt. */

import java.util.HashMap;
import java.util.Scanner;

public class WortfrequenzZählen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n*****************************");
        System.out.print("\nGib einen Text ein: ");
        String text = scanner.nextLine();
        scanner.close();

        // Entferne alle Satzzeichen und setze alle Buchstaben in Kleinbuchstaben um
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        System.out.println("\n*****************************");

        // Wort in Großbuchstaben umwandeln
        text = text.toUpperCase();

        // Zähle die Häufigkeit jedes Wortes im Text
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : text.split(" ")) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Gib die Häufigkeit jedes Wortes aus
        System.out.println("Wortfrequenz:\n");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
            System.out.println("*****************************");
        }
    }
}