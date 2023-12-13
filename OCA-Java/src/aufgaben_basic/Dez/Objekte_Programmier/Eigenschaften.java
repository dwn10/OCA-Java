package aufgaben_basic.Dez.Objekte_Programmier;

/* Entwickle eine Lösung um mittels Methoden auf die Eigenschaften der Objekt
zuzugreifen und gebe für alle Objekt aus Aufgabe 1 diese mittels der Methode
aus. Nutze hierfür eine Element gesteuerte Schleife.  */

import java.util.Scanner;

public class Eigenschaften {

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach der Anzahl der Objekte.
        public class StatischeFelder {

            // Initialisiere das erste statische Feld.
            static int x = 10;

            // Initialisiere das zweite statische Feld.
            static String y = "Hallo Welt!";

            public static void main(String[] args) {
                // Gib die beiden statischen Felder aus.
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }
        }
        System.out.println("Geben Sie die Anzahl der Personen ein:");
        int anzahlObjekte = scanner.nextInt();

        // Initialisiere das Array der Objekte.
        Person[] personen = new Person[anzahlObjekte];

        // Initialisiere die Variablen zur Speicherung der Eigenschaften der Objekte.
        String name;
        int alter;

        // Initialisiere die Objekte im Array.
        for (int i = 0; i < anzahlObjekte; i++) {
            // Frage den Benutzer nach den Eigenschaften des aktuellen Objekts.
            System.out.println("****************************************");
            System.out.println("Geben Sie den Namen des " + (i + 1) + ". Persons ein:");
            name = scanner.next();
            System.out.println("Geben Sie das Alter des " + (i + 1) + ". Persons ein:");
            alter = scanner.nextInt();

            // Erstelle das aktuelle Objekt.
            personen[i] = new Person(name, alter);
        }

        // Rufe die Methode `gibEigenschaftenAus()` für jedes Objekt auf.
        for (Person person : personen) {
            person.gibEigenschaftenAus();
        }
    }
}

class Person {

    private String name;
    private int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void gibEigenschaftenAus() {
        System.out.println("****************************************");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
    }
}
