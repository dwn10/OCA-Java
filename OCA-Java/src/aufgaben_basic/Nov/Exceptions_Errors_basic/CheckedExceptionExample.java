package aufgaben_basic.Nov.Exceptions_Errors_basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Checked Exceptions sollten immer abgefangen werden,
um sicherzustellen, dass das Programm ordnungsgemäß funktioniert.
Unchecked Exceptions können hingegen ignoriert werden,
da sie erst während der Laufzeit auftreten können. */

// Checked Exception
public class CheckedExceptionExample {

    // Methode, die eine Checked Exception wirft
    static void throwCheckedException() throws FileNotFoundException {

        // File öffnen
        File file = new File("nicht_vorhanden.txt");

        // File lesen
        Scanner scanner = new Scanner(file);
    }

    // Hauptmethode
    public static void main(String[] args) {

        // Methode aufrufen
        try {
            throwCheckedException();
        } catch (FileNotFoundException e) {
            // Exception abfangen
            System.out.println("\nDie Datei konnte nicht gefunden werden.");
        }
    }
}