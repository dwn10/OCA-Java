package aufgaben_basic.Dez.Schleifen_Verzweigungen_Array;

/* Aufgabe: Array-Umdrehung:
Drehe die Reihenfolge der Elemente in einem Array um, ohne zusätzliches Array zu verwenden.
 */

import java.util.Scanner;

public class ArrayUmdrehen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n****************************************");
        System.out.print("Geben Sie die Anzahl der Elemente im Array ein: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("\nGeben Sie die Elemente des Arrays ein:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("****************************************");
        System.out.println("Das ursprüngliche Array lautet:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " | ");
        }

        System.out.println("\nDas umgekehrte Array lautet:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " | ");
        }
    }
}
