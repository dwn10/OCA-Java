package projekte.autoErstellung.fertigung_Controller.hersteller_Model;

import java.util.ArrayList;

public class Ford {
    // Alle Objekte der Klasse Audi teilen sich eine Farbpalette
    // static erlaubt uns Eigenschaften innerhalb von Objekten zu teilen
    public static ArrayList<Farben> farben = new ArrayList<>();

    // Bezeichner bei Bools sollten immer eine Fragestellung beinhalten
    // => Fragestellung sollte mit ja oder nein beantwortet werden können
    boolean hasKupplung;
    boolean hasGetriebe;
    Farben farbe;

    /**
     * Default Farbe immer index 0
     */
    static {
        farben.add(Farben.SCHWARZ);
        farben.add(Farben.WEIß);
    }

    /**
     * Default Farbe immer index 0
     */
    public Ford() {
        this(false, false, farben.get(0));
    }

    public Ford(Farben farbe) {
        this(false, false, farbe);
    }

    public Ford(boolean hasKupplung, Farben farbe) {
        this(hasKupplung, false, farbe);
    }

    public Ford(boolean hasKupplung, boolean hasGetriebe, Farben farbe) {
        this.hasKupplung = hasKupplung;
        this.hasGetriebe = hasGetriebe;
        this.farbe = farbe;
    }

    public boolean isHasKupplung() {
        return hasKupplung;
    }

    public void setHasKupplung(boolean hasKupplung) {
        this.hasKupplung = hasKupplung;
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
        String attributValue1 = this.hasKupplung ? "Diese Auto ist mit Kupplung" : "Diese Auto ist ohne Kupplung";
        String attributValue2 = this.hasGetriebe ? "Diese Auto hat ist eine Automatic"
                : "Diese Auto hat ist ein Manueles Getriebe";
        return String.format("Sie kaufen ein Auto vom Typ %s\n" + "Dieses hat die Farbe %s\n%s\n%s",
                this.getClass().getSimpleName(), this.farbe, attributValue1, attributValue2);
    }
}
