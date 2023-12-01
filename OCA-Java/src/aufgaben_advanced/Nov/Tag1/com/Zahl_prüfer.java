package aufgaben_advanced.Nov.Tag1.com;

public class Zahl_prüfer {
    public static void main(String[] args) {

        // Zahl vom Benutzer abfragen
        System.out.println("\nBitte geben Sie eine Zahl ein:");
        int zahl = Integer.parseInt(System.console().readLine());

        System.out.println("\n***************************");

        // Prüfen, ob die Zahl gerade ist
        if (zahl % 2 == 0) {
            System.out.println(zahl + " ist gerade");
        } else {
            System.out.println(zahl + " ist ungerade");
        }
    }
}
