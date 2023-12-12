package schreibtischtest;

/* Erstelle ein Programm, welches den User nach E-Mail-Adresse, Name und Alter
 fragt. Diese eingaben sollen auf Korrektheit geprüft werden.
 Eine E-Mail braucht ein @ Zeichen.
 Der Name darf keine Zahlen enthalten und das Alter kann nur aus Ganzzahlen bestehen.
 Diese eingaben müssen so lange wiederholt werden bis diese dem Format entsprechen.
 Im Anschluss sollen aus den Eingaben ein Objekt vom Typ Person erstellt werden.
 Dabei sollen der eingegebene Wert als Values für die Eigenschaften des Type Person dienen.
 Kleiner Tipp => Keep it Simple. Mach nur das, was gefordert ist. */

import java.util.Scanner;

public class Person {

    private String email;
    private String name;
    private int alter;

    public Person(String email, String name, int alter) {
        this.email = email;
        this.name = name;
        this.alter = alter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }

    public static void main(String[] args) {
        // Initialisiere den Scanner.
        Scanner scanner = new Scanner(System.in);

        // Frage den Benutzer nach E-Mail-Adresse, Name und Alter.
        System.out.println("\n********************************");
        System.out.println("Geben Sie Ihre E-Mail-Adresse ein:");
        String email = scanner.nextLine();

        System.out.println("********************************");
        System.out.println("Geben Sie Ihren Namen ein:");
        String name = scanner.nextLine();

        System.out.println("********************************");
        System.out.println("Geben Sie Ihr Alter ein:");
        int alter = scanner.nextInt();

        // Prüfe die Eingaben auf Korrektheit.
        while (!email.contains("@")) {
            System.out.println("Die E-Mail-Adresse muss ein @-Zeichen enthalten.");
            System.out.println("********************************");
            System.out.println("Geben Sie Ihre E-Mail-Adresse erneut ein:");
            email = scanner.nextLine();
        }

        while (name.matches(".*\\d.*")) {
            System.out.println("Der Name darf keine Zahlen enthalten.");
            System.out.println("********************************");
            System.out.println("Geben Sie Ihren Namen erneut ein:");
            name = scanner.nextLine();
        }

        while (alter < 0) {
            System.out.println("Das Alter muss eine positive Ganzzahl sein.");
            System.out.println("********************************");
            System.out.println("Geben Sie Ihr Alter erneut ein:");
            alter = scanner.nextInt();
        }

        // Erstelle ein Objekt vom Typ Person.
        System.out.println("********************************");
        Person person = new Person(email, name, alter);

        // Gib die Person aus.
        System.out.println(person);
    }
}
