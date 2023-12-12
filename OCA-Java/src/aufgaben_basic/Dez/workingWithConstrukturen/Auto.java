package aufgaben_basic.Dez.workingWithConstrukturen;

import java.util.ArrayList;

public class Auto {

    // Eigenschaften eines Autos
    // anzahlRäder
    // Marke
    // Farbe
    // model(Bauart) Kombi, limusine, Cabrio, Coupe, SUV
    // hubraum
    // ps
    // türen
    byte tueren;
    short ps;
    int hubraum;// wahrscheinlich reicht auch short

    // final Attribute müssen immer entweder direkt Initialisiert werden
    // oder als erstes Staremnet im Konstruktor
    // oder in einem staic Initiliazer
    final String MARKE_MODEL;
    byte anzahlRaeder;
    String farbe;

    // sterotyp static => dieser definiert Eigenschaften welche sich alle Instanzen
    // der Klasse teilen
    // dynamische Speicher kann und sollte nicht fianl
    // weil dies entgegen der natürlichen Logig der dynamic ist
    final ArrayList<String> MARKE = new ArrayList<>();
    static ArrayList<String> farben = new ArrayList<>();

    // sterotype final (Konstanten) => UPPERCASE
    static final String[] MODEL = { "Kombi", "limusine", "Cabrio", "Coupe", "SUV" };// sterotyp könnte helfen

    // static als Initialwert Konstruktor des Compilers(Intizailisiert Werte bevor
    // die Objekte der Klasse gebaut werden)
    static { // wird aufgerufen wenn der Compiler alle Klassen kompiliert => byte Code
             // Umwandeln
        // könnte hier auch aus einer DB kommen
        farben.add("Blau");
        farben.add("Lilla");
        farben.add("Grün");
        farben.add("Gelb");
        farben.add("Rot");
    }

    // Konstruktor zum zeigen des Default Konstruktor Verhalten
    // Sollte kein Konstruktor definiert sein ist immer ein Konstruktor
    // vorhanden => default oder No args Konstruktor
    // public Auto(byte tueren) {}

    /**
     * dieser diesnt zur Veranschaulichung des Konstruktor Verhalten bei einem
     * default Konstruktor
     */
    public Auto() {
        MARKE_MODEL = MARKE.get(3) + MODEL[2];
        // TODO Auto-generated constructor stub
    }

    public Auto(byte tueren, short ps, int hubraum, byte anzahlRaeder, String farbe, String marke_model) {
        MARKE_MODEL = MARKE.get(3) + MODEL[2];
    }

    static public void fillListWithValues_Farbe() {
        farben.add("Blau");
        farben.add("Lilla");
        farben.add("Grün");
        farben.add("Gelb");
        farben.add("Rot");
    }

    public void fillListWithValue_Marke() {
        MARKE.add("Ford");
        MARKE.add("Opel");
        MARKE.add("Porsche");
        MARKE.add("BMW");
        MARKE.add("Audi");
    }
}
