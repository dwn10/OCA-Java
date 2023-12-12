package aufgaben_basic.Dez.Array;

/* Entwickle eine Funktion, die überprüft, ob ein bestimmter Wert in einem Array vorhanden ist. */

public class InArray {

    // Funktion, die überprüft, ob ein bestimmter Wert in einem Array vorhanden ist
    public static boolean inArray(int[] array, int value) {

        // Iteration über das Array
        for (int i = 0; i < array.length; i++) {

            // Wenn der Wert gefunden wurde, gib true zurück
            if (array[i] == value) {
                return true;
            }
        }

        // Wenn der Wert nicht gefunden wurde, gib false zurück
        return false;
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Array mit Werten erstellen
        int[] array = { 1, 2, 3, 4, 5 };

        // Wert, den wir suchen
        int value = 3;

        // Funktion aufrufen und Ergebnis ausgeben
        boolean isInArray = inArray(array, value);
        System.out.println("\n**********************************************");
        System.out.println("Der Wert " + value + " ist in dem Array enthalten: " + isInArray);
    }
}
