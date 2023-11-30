package aufgaben_basic.Nov;

/*  Aufgabe: Quadratzahlen berechnen , das den Benutzer nach einer Zahl fragt und dann die
Quadratzahlen bis zur eingegebenen Zahl ausgibt. */

public class QuadratzahlenBerechnen {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einer Zahl fragen
        System.out.println("\nGeben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());

        // Quadratzahlen berechnen
        for (int i = 1; i <= zahl; i++) {
            int quadratzahl = i * i;
            System.out.println(i + "^2 = " + quadratzahl);
        }
    }
}
