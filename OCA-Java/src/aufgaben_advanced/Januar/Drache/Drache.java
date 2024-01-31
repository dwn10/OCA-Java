package aufgaben_advanced.Januar.Drache;

import java.util.Scanner;

public class Drache {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n***********************************");
        System.out.print("Geben Sie den Namen des Drachen ein: ");
        String name = scanner.nextLine();

        System.out.print("Ist der Drache hungrig? (ja/nein): ");
        boolean hungrig = scanner.nextLine().equalsIgnoreCase("ja");

        int lebenskraft = 10;
        System.out.println("Der Drache " + name + " wurde erstellt.");

        while (lebenskraft > 0) {
            System.out.print("Geben Sie ein Opfer ein: ");
            String opfer = scanner.nextLine();

            if (hungrig) {
                System.out.println("Lecker... ein " + opfer + ".");
                System.out.println("Bitte, bitte... schreie... so schmeckst du besser.");
                System.out.print("Soll der Drache " + opfer + " fressen? (ja/nein): ");
                boolean fressen = scanner.nextLine().equalsIgnoreCase("ja");

                if (fressen) {
                    System.out.println("RÜLPS MAHLZEIT");
                }
            } else {
                System.out.println("Der Drache " + name + " ist nicht hungrig.");
            }

            System.out.print("Wie stark soll der Schlag sein? ");
            int staerke = scanner.nextInt();
            scanner.nextLine();

            System.out.println("AUTCH!!");
            lebenskraft -= staerke;
        }

        System.out.println("Ich bin mausetot.");
    }
}

// 1. Der Drache ist hungrig
// 2. Der Drache füttert ein Opfer
// 3. Der Drache greift ein Opfer an
// 4. Der Drache ist nicht hungrig
// 5. Der Drache ist mausetot
