package aufgaben_basic.Dez.Objekte_Programmier;

/* Erstelle einen Typen welche 2 frei wählbare Eigenschaften hat, welche mittels
Konstruktor einen default Value erhalten. Aus diesem Typ sollen nun 10
Objekte unterschiedlicher Ausprägung entstehen. Speicher diese in einem
geeigneten Mengenspeicher. Nutze hierfür eine zählergesteuerte Schleife.   */

import java.util.ArrayList;

public class Objekterstellung {

    public static void main(String[] args) {
        // Erstelle einen Typ mit zwei Eigenschaften.
        class Objekt {
            private String name;
            private int alter;

            // Konstruktor mit Defaultwerten.
            public Objekt() {
                this.name = "Unbekannt";
                this.alter = 0;
            }

            // Getter und Setter für die Eigenschaften.
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
        }

        // Erstelle einen Mengenspeicher für die Objekte.
        ArrayList<Objekt> objekte = new ArrayList<>();

        // Erstelle 10 Objekte unterschiedlicher Ausprägung.
        for (int i = 0; i < 10; i++) {
            // Erstelle ein neues Objekt mit zufälligen Werten für die Eigenschaften.
            Objekt objekt = new Objekt();
            objekt.setName("Objekt " + i);
            objekt.setAlter(i * 10);

            // Füge das Objekt zum Mengenspeicher hinzu.
            objekte.add(objekt);
        }

        // Gib die Objekte aus.
        for (Objekt objekt : objekte) {
            System.out.println("Name: " + objekt.getName() + ", Alter: " + objekt.getAlter());
        }
    }
}
