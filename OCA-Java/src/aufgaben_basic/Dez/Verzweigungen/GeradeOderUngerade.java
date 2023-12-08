package aufgaben_basic.Dez.Verzweigungen;

/*  Schreibe einen Code, der prüft, ob eine gegebene Zahl gerade oder ungerade ist.  */

public class GeradeOderUngerade {

    // Hauptmethode
    public static void main(String[] args) {

        // Zahl einlesen
        System.out.println("\n*************************");
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = Integer.parseInt(System.console().readLine());

        // Zahl prüfen
        if (zahl % 2 == 0) {
            System.out.println("*************************");
            System.out.println("Die Zahl ist gerade.");
        } else {
            System.out.println("*************************");
            System.out.println("Die Zahl ist ungerade.");
        }
    }
}
