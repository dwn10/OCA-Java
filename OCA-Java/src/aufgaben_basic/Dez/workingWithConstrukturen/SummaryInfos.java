package aufgaben_basic.Dez.workingWithConstrukturen;

public class SummaryInfos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Default Konstruktor
        // Operator zum erzeugen von Objekten ist der "new" Operator
        // dieser ruf den Konstruktor auf
        // Aufruf => Datentyp(Auto) Bezeichner(a1) Zuweisungsoperator bildung der
        // Instanz dieser Klasse welche auch zum Datentyp wird
        Auto a1 = new Auto(); // Instanziierung
        Auto a2 = new Auto();
        System.out.println(a1.farben);
        System.out.println(a2.farben);
        // a1.fillListWithValues_Farbe();
        // a2.fillListWithValues_Farbe();
        a1.anzahlRaeder = 5;
        a2.anzahlRaeder = 3;
        a1.farben.add("Schwarz");
        a1.MARKE.add("BMW");
        System.out.println(a1.anzahlRaeder);
        System.out.println(a2.anzahlRaeder);
        System.out.println(a1.farben);
        System.out.println(a2.farben);
        System.out.println(a1.MARKE);
        System.out.println(a2.MARKE);
    }

}
