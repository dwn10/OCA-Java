package aufgaben_advanced.Nov.Tag2.com;

public class Kapital_prozent {
    public static void main(String[] args) {

        // Variablen initialisieren
        int kapital = 100;
        int jahr = 1;
        int prozent = 3;

        // Startkapital ausgeben
        System.out.println("\nStartkapital beträgt " + kapital + " Euro\n");

        // Kapital nach 1 Jahr ausgeben
        kapital = kapital * (1 + prozent / 100);
        System.out.println("Kapital nach " + jahr + " Jahr(en): " + kapital);

        // Kapital nach 2 Jahren ausgeben
        jahr++;
        kapital = kapital * (1 + prozent / 100);
        System.out.println("Kapital nach " + jahr + " Jahr(en): " + kapital);

        // Kapital nach 3 Jahren ausgeben
        jahr++;
        kapital = kapital * (1 + prozent / 100);
        System.out.println("Kapital nach " + jahr + " Jahr(en): " + kapital);

        // Kapital nach 4 Jahren ausgeben
        jahr++;
        kapital = kapital * (1 + prozent / 100);
        System.out.println("Kapital nach " + jahr + " Jahr(en): " + kapital);

        // Kapital nach 5 Jahren ausgeben
        jahr++;
        kapital = kapital * (1 + prozent / 100);
        System.out.println("Kapital nach " + jahr + " Jahr(en): " + kapital);
    }
}
