package projekte.autoErstellung.fertigung_Controller.hersteller_Model;

import java.util.ArrayList;

public class BMW {
    // Alle Objekte der Klasse Audi teilen sich eine Farbpalette
    // static erlaubt uns Eigenschaften innerhalb von Objekten zu teilen
    public static ArrayList<Farben> farben = new ArrayList<>();

    // Bezeichner bei Bools sollten immer eine Fragestellung beinhalten
    // => Fragestellung sollte mit ja oder nein beantwortet werden können
    boolean hasHeizbarInnenausstatung;
    boolean hasGetriebe;
    Farben farbe;

    /**
     * Default Farbe immer index 0
     */
    static {
        farben.add(Farben.BLAU);
        farben.add(Farben.WEIß);
    }

    /**
     * Default Farbe immer index 0
     */
    public BMW() {
        this(false, false, farben.get(0));
    }

    public BMW(Farben farbe) {
        this(false, false, Farben.BLAU);
    }

    public BMW(boolean hasHeizbarInnenausstatung, Farben farbe) {
        this(hasHeizbarInnenausstatung, false, farbe);
    }

    public BMW(boolean hasInnenausstatung, boolean hasGetriebe, Farben farbe) {
        this.hasHeizbarInnenausstatung = hasInnenausstatung;
        this.hasGetriebe = hasGetriebe;
        this.farbe = farbe;
    }

    public boolean isHasInnenausstatung() {
        return hasHeizbarInnenausstatung;
    }

    public void setHasInnenausstatung(boolean hasInnenausstatung) {
        this.hasHeizbarInnenausstatung = hasInnenausstatung;
    }

    public boolean isHasGetriebe() {
        return hasGetriebe;
    }

    public void setHasGetriebe(boolean hasGetriebe) {
        this.hasGetriebe = hasGetriebe;
    }

    public Farben getFarbe() {
        return farbe;
    }

    public void setFarbe(Farben farbe) {
        this.farbe = farbe;
    }

    public String print() {

        String attributValue1 = this.hasGetriebe ? "Diese Auto hat ist eine Automatic"
                : "Diese Auto hat ist ein Manueles Getriebe";
        String attributValue2 = this.hasHeizbarInnenausstatung ? "Diese Auto hat beheizbare Innenausstatung"
                : "Diese Auto hat keine beheizbare Innenausstatung";

        return String.format("Sie kaufen ein Auto vom Typ %s\n" + "Dieses hat die Farbe %s\n%s\n%s",
                this.getClass().getSimpleName(), this.farbe, attributValue1, attributValue2);
    }
}
