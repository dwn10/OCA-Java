package aufgaben_advanced.Tag1.com;

public class Zahl_prüfer {
    public static void main(String[] args) {

        // Zahl vom Benutzer abfragen
        System.out.println("\nBitte geben Sie eine Zahl ein:");
        int zahl = Integer.parseInt(System.console().readLine());

        // Prüfen, ob die Zahl gerade ist
        if (zahl % 2 == 0) {
            System.out.println("\nDie Zahl ist gerade");
        } else {
            System.out.println("\nDie Zahl ist ungerade");
        }
    }
}
