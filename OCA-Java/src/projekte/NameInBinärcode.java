package projekte;

import java.util.Scanner;

public class NameInBinärcode {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner für Benutzereingabe
        Scanner scanner = new Scanner(System.in);

        // Benutzer nach einem Namen fragen
        System.out.println("\nGeben Sie einen Namen ein: ");
        String name = scanner.nextLine();

        // Namen in Binärcode übersetzen
        String binärcode = "";
        for (char c : name.toCharArray()) {
            binärcode += Integer.toBinaryString(c);
        }

        // Binärcode ausgeben
        System.out.println("***********************************************************");
        System.out.println("\nDer Binärcode des Namens " + name + " lautet: \n" + binärcode);
        System.out.println("\n***********************************************************");
    }
}
