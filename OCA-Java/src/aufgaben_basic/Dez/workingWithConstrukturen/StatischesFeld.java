package aufgaben_basic.Dez.workingWithConstrukturen;

/* Schreibe eine Klasse mit einem statischen Feld,
das von einer Methode, die kein Objekt erfordert, zurückgegeben wird.  */

public class StatischesFeld {

    // Statisches Feld
    public static int zahl = 10;

    // Methode, die das statische Feld zurückgibt
    public static int getZahl() {
        return zahl;
    }

    // Hauptmethode
    public static void main(String[] args) {
        System.out.println(getZahl()); // Ausgabe: 10
    }
}
