package aufgaben_basic.Dez.Array;

/*  Implementiere einen Algorithmus, um das größte Element in einem Array zu finden. */

public class GrößtesElementInArrayFinden {

    // Hauptmethode
    public static void main(String[] args) {

        // Array mit Zahlen erstellen
        int[] zahlen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Algorithmus zum Finden des größten Elements implementieren
        int größtesElement = findMax(zahlen);

        // Ergebnis ausgeben
        System.out.println("\n************************************");
        System.out.println("Das größte Element im Array ist: " + größtesElement);
    }

    // Algorithmus zum Finden des größten Elements
    public static int findMax(int[] zahlen) {

        // Variable zum Speichern des größten Elements initialisieren
        int größtesElement = zahlen[0];

        // Für jedes Element im Array
        for (int i = 1; i < zahlen.length; i++) {

            // Wenn das aktuelle Element größer ist als das bisher größte Element
            if (zahlen[i] > größtesElement) {

                // Das aktuelle Element wird zum größten Element
                größtesElement = zahlen[i];
            }
        }

        // Das größte Element wird zurückgegeben
        return größtesElement;
    }
}
