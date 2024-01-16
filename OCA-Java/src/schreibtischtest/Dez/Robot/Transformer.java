package schreibtischtest.Dez.Robot;

// Subklasse Transformer
public class Transformer extends Robot {

    // Attribute
    private String faction;

    // Konstruktor
    public Transformer(String name, boolean isHostile, String faction) {
        super(name, isHostile);
        this.faction = faction;
    }

    // Methoden
    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }
}