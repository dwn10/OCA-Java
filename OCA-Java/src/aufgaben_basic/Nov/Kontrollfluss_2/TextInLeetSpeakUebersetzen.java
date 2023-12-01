package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Text in Leet-Speak übersetzen
Schreibe ein Programm, das den Benutzer nach einem Text fragt und dann den Text
in Leet-Speak übersetzt (z.B. 'a' wird zu '4', 'e' zu '3', 's' zu '5' usw.).  */

import java.util.HashMap;

public class TextInLeetSpeakUebersetzen {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Text fragen
        System.out.println("\n****************************");
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = System.console().readLine();

        // Leet-Speak-Tabelle erstellen
        HashMap<Character, String> leetSpeakTabelle = new HashMap<>();
        leetSpeakTabelle.put('a', "4");
        leetSpeakTabelle.put('e', "3");
        leetSpeakTabelle.put('i', "1");
        leetSpeakTabelle.put('o', "0");
        leetSpeakTabelle.put('s', "5");
        leetSpeakTabelle.put('t', "7");

        // Text in Leet-Speak übersetzen
        String leetSpeakText = "";
        for (int i = 0; i < text.length(); i++) {
            char zeichen = text.charAt(i);
            if (leetSpeakTabelle.containsKey(zeichen)) {
                leetSpeakText += leetSpeakTabelle.get(zeichen);
            } else {
                leetSpeakText += zeichen;
            }
        }

        // Text ausgeben
        System.out.println("\n****************************");
        System.out.println("\nDer Text in Leet-Speak lautet: " + leetSpeakText);
        System.out.println("\n****************************");
    }
}
