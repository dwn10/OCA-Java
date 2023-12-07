package aufgaben_basic.Dez.Schleifen_Verzweigungen_Array;

/* Aufgabe: Array-Summe:
Schreibe eine Methode, die die Summe aller Elemente in einem Array von Ganzzahlen berechnet.  */

import java.util.Scanner;

public class ArraySumme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Elemente im Array ein:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Geben Sie die Elemente des Arrays ein:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Die Summe aller Elemente im Array beträgt: " + summe(arr));
    }

    /**
     * Berechnet die Summe aller Elemente in einem Array von Ganzzahlen.
     *
     * @param arr das Array von Ganzzahlen
     * @return die Summe aller Elemente im Array
     */
    public static int summe(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
