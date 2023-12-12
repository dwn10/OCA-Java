package aufgaben_basic.Dez.Verzweigungen;

/* Schreibe ein Programm, das den größten von drei gegebenen Zahlen bestimmt. */

public class GrößtenVonDreiZahlenBestimmen {

    // Hauptmethode
    public static void main(String[] args) {

        // Drei Zahlen einlesen
        System.out.println("\n****************************");
        System.out.println("Geben Sie die erste Zahl ein: ");
        int zahl1 = Integer.parseInt(System.console().readLine());
        System.out.println("Geben Sie die zweite Zahl ein: ");
        int zahl2 = Integer.parseInt(System.console().readLine());
        System.out.println("Geben Sie die dritte Zahl ein: ");
        int zahl3 = Integer.parseInt(System.console().readLine());

        // Größte Zahl bestimmen
        int größteZahl = zahl1;
        if (zahl2 > größteZahl) {
            größteZahl = zahl2;
        }
        if (zahl3 > größteZahl) {
            größteZahl = zahl3;
        }

        // Größte Zahl ausgeben
        System.out.println("****************************");
        System.out.println("Die größte Zahl ist " + größteZahl);
    }
}
