package schreibtischtest.Dez.Robot;

public class Robot {

    // Attribute
    private String name;
    private boolean isHostile;

    // Konstruktor
    public Robot(String name, boolean isHostile) {
        this.name = name;
        this.isHostile = isHostile;
    }

    // Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHostile() {
        return isHostile;
    }

    public void setHostile(boolean isHostile) {
        this.isHostile = isHostile;
    }
}
