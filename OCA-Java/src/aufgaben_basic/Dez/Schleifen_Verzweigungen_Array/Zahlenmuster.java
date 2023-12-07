package aufgaben_basic.Dez.Schleifen_Verzweigungen_Array;

/* Schleifen und Array :
Zahlenmuster ausgeben:
Schreibe einen Code, der folgendes Muster ausgibt:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5   */

public class Zahlenmuster {

    public static void main(String[] args) {
        // Initialisiere das Array mit der gewünschten Anzahl von Zahlen.
        int[] zahlen = new int[5];

        // Fülle das Array mit den Zahlen 1 bis 5.
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i + 1;
        }

        // Gehe von der ersten bis zur letzten Position des Arrays.
        for (int i = 0; i < zahlen.length; i++) {
            // Gib die Zahlen im Array aus.
            for (int j = 0; j <= i; j++) {
                System.out.print(zahlen[j]);
            }

            // Gib einen Zeilenumbruch aus.
            System.out.println();
        }
    }
}
