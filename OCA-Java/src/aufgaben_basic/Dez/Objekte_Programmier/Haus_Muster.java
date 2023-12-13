package aufgaben_basic.Dez.Objekte_Programmier;

/* Erstellen Sie den Haustyp, er muss 3 Eigenschaften haben. 2 davon gehören nicht zu den Objekten.
Auch diese sollten mit Standardwerten ohne Objekte gefüllt werden.
Dazu dürfen diese Typen nicht inline initialisiert werden.
Erstellen Sie eine Möglichkeit, mithilfe von Gettern und Settern auf Objekteigenschaften zuzugreifen.
Darüber hinaus werden Konstanten für alle Haustypen benötigt. Dies sind „Flachdach“, „Schrägdach“ und Satteldach.
Diese Eigenschaften gehören nicht zum Typ oder Objekt.
Darüber hinaus muss diese Eigenschaft beim Erstellen dieses Typs verwendet werden. */

public class Haus_Muster {

    // Eigenschaften des Hauses
    private int hausnummer;
    private String strasse;
    private String ort;

    // Konstanten für alle Haustypen
    public static final String DACH_FLACH = "Flachdach";
    public static final String DACH_SCHRAG = "Schrägdach";
    public static final String DACH_SATTEL = "Satteldach";

    // Konstruktor des Hauses
    public Haus_Muster(int hausnummer, String strasse, String ort) {
        this.hausnummer = hausnummer;
        this.strasse = strasse;
        this.ort = ort;
    }

    // Getter und Setter für die Eigenschaften des Hauses

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    // Methode zum Ausgeben der Eigenschaften des Hauses

    public void ausgabe() {
        System.out.println("Hausnummer: " + hausnummer);
        System.out.println("Straße: " + strasse);
        System.out.println("Ort: " + ort);
    }
}
