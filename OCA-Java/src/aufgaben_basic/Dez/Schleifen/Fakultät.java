package aufgaben_basic.Dez.Schleifen;

/* Implementiere eine Schleife, die die Fakultät einer gegebenen Zahl  berechnet. */

public class Fakultät {

    public static void main(String[] args) {
        // Eingabe der Zahl
        System.out.println("\n*************************");
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());

        // Fakultät berechnen
        int fakultät = 1;
        for (int i = 1; i <= zahl; i++) {
            fakultät *= i;
        }

        // Fakultät ausgeben
        System.out.println("*************************");
        System.out.println("Die Fakultät von " + zahl + " ist " + fakultät);
    }
}
