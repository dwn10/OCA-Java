package projekte.autoErstellung.fertigung_Controller.hersteller_Model;

import java.util.ArrayList;

//jede Klasse unterliegt einer klaren Struktur
/**
 * Klassenname => Classe + Bezeichner Eigenschaften => alle Attribute + ihre
 * static Initiliazer Methoden => 1. Konstruktoren 2. Getter und Setter 3. Logik
 * der Klasse in Methoden
 * 
 * @author xxx
 *
 */
public class Audi {

    // Alle Objekte der Klasse Audi teilen sich eine Farbpalette
    // static erlaubt uns Eigenschaften innerhalb von Objekten zu teilen
    public static ArrayList<Farben> farben = new ArrayList<>();

    // Bezeichner bei Bools sollten immer eine Fragestellung beinhalten
    // => Fragestellung sollte mit ja oder nein beantwortet werden können
    boolean hasKupplung;
    private boolean hasHeizbarInnenausstatung;
    protected Farben farbe;
    /**
     * Default Farbe immer index 0
     */
    static {
        farben.add(Farben.BLAU);
        farben.add(Farben.GRÜN);
        farben.add(Farben.ROT);
        farben.add(Farben.LILLA);
    }

    /**
     * Standart Konfig
     */
    public Audi() {
        /**
         * Default Farbe immer index 0
         */
        this(false, false, farben.get(0));
    }

    public Audi(Farben farbe) {
        this(false, false, farbe);
    }

    public Audi(boolean hasKupplung, Farben farbe) {
        this(hasKupplung, false, farbe);
    }

    public Audi(boolean hasKupplung, boolean hasHeizbareInnenaustattung, Farben farbe) {
        this.hasHeizbarInnenausstatung = hasHeizbareInnenaustattung;
        this.hasKupplung = hasKupplung;
        this.farbe = farbe;
    }

    // Dienen der manipulation von Eigenschaften
    public boolean isHasKupplung() {
        return hasKupplung;
    }

    public void setHasKupplung(boolean hasKupplung) {
        this.hasKupplung = hasKupplung;
    }

    public boolean isHasHeizbarInnenausstatung() {
        return hasHeizbarInnenausstatung;
    }

    public void setHasHeizbarInnenausstatung(boolean hasHeizbarInnenausstatung) {
        this.hasHeizbarInnenausstatung = hasHeizbarInnenausstatung;
    }

    public Farben getFarbe() {
        return farbe;
    }

    public void setFarbe(Farben farbe) {
        this.farbe = farbe;
    }

    public String print() {

        String attributValue1 = this.hasKupplung ? "Diese Auto ist mit Kupplung" : "Diese Auto ist ohne Kupplung";
        String attributValue2 = this.hasHeizbarInnenausstatung ? "Diese Auto hat beheizbare Innenausstatung"
                : "Diese Auto hat keine beheizbare Innenausstatung";

        return String.format("Sie kaufen ein Auto vom Typ %s\n" + "Dieses hat die Farbe %s\n%s\n%s",
                this.getClass().getSimpleName(), this.farbe, attributValue1, attributValue2);
    }

}
