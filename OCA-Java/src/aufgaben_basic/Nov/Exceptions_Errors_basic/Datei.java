package aufgaben_basic.Nov.Exceptions_Errors_basic;

// Aufgabe: Mehrere Exceptions mit throws
// Erstelle eine Methode openFile mit der throws-Klausel für FileNotFoundException und IOException.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Klassendeklaration
public class Datei {
    public static void main(String[] args) {
        // Aufruf der Methode openFile()
        try {
            openFile("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("\nDatei wurde nicht gefunden: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("\nDatei konnte nicht gelesen werden: " + e.getMessage());
        }
    }

    // Wenn ein I/O-Fehler aufgetreten ist, werfen wir eine Ausnahme
    public static void openFile(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("\nDatei wurde nicht gefunden: " + fileName);
        }
    }
}