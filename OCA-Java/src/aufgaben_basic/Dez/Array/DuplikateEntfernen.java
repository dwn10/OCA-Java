package aufgaben_basic.Dez.Array;

/* Aufgabe: Duplikate entfernen:
Entwickle eine Methode, die alle Duplikate in einem Array entfernt
und ein neues Array ohne Duplikate zurückgibt.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplikateEntfernen {

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach einer Liste.
        System.out.println("\n****************************************");
        System.out.println("Geben Sie eine Liste ein:");
        String liste = scanner.nextLine();

        // Initialisiere die Variable zur Speicherung der Liste ohne Duplikate.
        ArrayList<String> listeOhneDuplikate = new ArrayList<>();

        // Initialisiere eine HashSet, um die Duplikate zu entfernen.
        HashSet<String> set = new HashSet<>();

        // Gehe über die Liste und füge die Elemente der Liste ohne Duplikate hinzu.
        for (String element : liste.split(" ")) {
            if (!set.contains(element)) {
                listeOhneDuplikate.add(element);
                set.add(element);
            }
        }

        // Gib die Liste ohne Duplikate aus.
        System.out.println("****************************************");
        System.out.println("Die Liste ohne Duplikate ist:");
        for (String element : listeOhneDuplikate) {
            System.out.print(element + " | ");
        }
    }
}