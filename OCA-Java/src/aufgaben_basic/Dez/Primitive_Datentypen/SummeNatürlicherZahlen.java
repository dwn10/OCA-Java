package aufgaben_basic.Dez.Primitive_Datentypen;

/* Schreibe einen Code, der die Summe der ersten n natürlichen Zahlen  berechnet.  */

public class SummeNatürlicherZahlen {

    // Hauptmethode
    public static void main(String[] args) {

        // Benutzer nach einer Zahl fragen
        System.out.println("\n******************************");
        System.out.println("Geben Sie eine Zahl ein: ");
        int n = Integer.parseInt(System.console().readLine());

        // Summe berechnen
        int summe = 0;
        for (int i = 1; i <= n; i++) {
            summe += i;
        }

        // Summe ausgeben
        System.out.println("******************************");
        System.out.println("Die Summe der ersten " + n + " natürlichen Zahlen ist " + summe);
    }
}