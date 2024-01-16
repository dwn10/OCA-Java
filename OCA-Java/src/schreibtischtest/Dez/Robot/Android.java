package schreibtischtest.Dez.Robot;

// Subklasse Android
public class Android extends Robot {

    // Attribute
    private boolean isHuman;

    // Konstruktor
    public Android(String name, boolean isHostile, boolean isHuman) {
        super(name, isHostile);
        this.isHuman = isHuman;
    }

    // Methoden
    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }
}