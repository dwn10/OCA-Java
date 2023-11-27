package aufgaben_basic.Nov.Exceptions_Errors_basic;

// Aufgabe: finally-Block und Ressourcenfreigabe
// Schreibe eine Methode openResource mit einem finally-Block,
// um sicherzustellen,dass eine Ressource ordnungsgemäß freigegeben wird.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Klassendeklaration
public class OpenResource {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("file.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nDatei konnte nicht gelesen werden: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
