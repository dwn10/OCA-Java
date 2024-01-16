package schreibtischtest.Dez.Robot;

// Subklasse Terminator
public class Terminator extends Robot {

    // Attribute
    private String targetName;

    // Konstruktor
    public Terminator(String name, boolean isHostile, String targetName) {
        super(name, isHostile);
        this.targetName = targetName;
    }

    // Methoden
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
}
