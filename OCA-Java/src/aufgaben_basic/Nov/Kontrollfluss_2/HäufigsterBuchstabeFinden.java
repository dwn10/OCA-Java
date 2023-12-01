package aufgaben_basic.Nov.Kontrollfluss_2;

/* Aufgabe: Häufigsten Buchstaben finden
Schreibe ein Programm, das den Benutzer nach einem Text fragt und dann den
häufigsten Buchstaben im Text ausgibt.  */

import java.util.HashMap;
import java.util.Map;

public class HäufigsterBuchstabeFinden {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einem Text fragen
        System.out.println("\nGeben Sie einen Text ein: ");
        String text = System.console().readLine();

        // Häufigkeiten der Buchstaben ermitteln
        Map<Character, Integer> buchstabenHäufigkeiten = new HashMap<>();
        for (char buchstabe : text.toCharArray()) {
            if (buchstabenHäufigkeiten.containsKey(buchstabe)) {
                buchstabenHäufigkeiten.put(buchstabe, buchstabenHäufigkeiten.get(buchstabe) + 1);
            } else {
                buchstabenHäufigkeiten.put(buchstabe, 1);
            }
        }

        // Buchstabe mit der höchsten Häufigkeit ermitteln
        Character häufigsterBuchstabe = null;
        int höchsteHäufigkeit = 0;
        for (Map.Entry<Character, Integer> eintrag : buchstabenHäufigkeiten.entrySet()) {
            if (eintrag.getValue() > höchsteHäufigkeit) {
                häufigsterBuchstabe = eintrag.getKey();
                höchsteHäufigkeit = eintrag.getValue();
            }
        }

        // Buchstabe ausgeben
        if (häufigsterBuchstabe != null) {
            System.out.println("\n***************************************");
            System.out.println("\nDer häufigste Buchstabe im Text ist " + häufigsterBuchstabe + " (Häufigkeit: "
                    + höchsteHäufigkeit + ").");
        } else {
            System.out.println("Der Text enthält keine Buchstaben.");
        }
    }
}