package schreibtischtest.Dez.Robot;

/* Basisklasse Robot
 *  - Attribute: name, isHostile
 * Subklasse Terminator, erbt von Robot
 *  - Attribute: targetName
 * Subklasse Transformer, erbt von Robot
 *  - Attribute: faction
 * Subklasse Android, erbt von Robot
 *  - Attribute: isHuman
 *
 * Erstellen Sie von jeder Klasse ein Objekt und weisen sie den Attributen über die Konstruktoren beliebige Werte zu.
 * Testen Sie die Attribute durch Konsolenausgaben
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner initialisieren
        Scanner scanner = new Scanner(System.in);

        // Objekte der Klassen erstellen
        Robot robot = new Robot("Robby", true);
        Terminator terminator = new Terminator("T-800", true, "Sarah Connor");
        Transformer transformer = new Transformer("Optimus Prime", false, "Autobots");
        Android android = new Android("Data", false, true);

        // Attributen Werte zuweisen
        System.out.println("\n************************************");
        System.out.println("Geben Sie dem Roboter einen neuen Namen ein:");
        robot.setName(scanner.nextLine());
        System.out.println("Geben Sie dem Terminator ein neues Zielnamen ein:");
        terminator.setTargetName(scanner.nextLine());
        System.out.println("Geben Sie dem Transformer eine neue Fraktion ein:");
        transformer.setFaction(scanner.nextLine());
        System.out.println("Geben Sie dem Androiden an, ob er menschlich ist:");
        android.setHuman(scanner.nextBoolean());

        // Attribute ausgeben
        System.out.println(
                "Der Roboter heißt " + robot.getName() + " und ist " + (robot.isHostile() ? "aggressiv" : "friedlich"));
        System.out.println("Der Terminator hat das Ziel " + terminator.getTargetName() + " zu töten.");
        System.out.println("Der Transformer gehört zur Fraktion " + transformer.getFaction() + ".");
        System.out.println("Der Android ist " + (android.isHuman() ? "ein Mensch" : "kein Mensch"));
    }
}
