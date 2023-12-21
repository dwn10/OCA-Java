package ticketsystem.Vehicle;

public class Motorcycle extends Vehicle {

    private Antriebsart antriebsart;

    public Motorcycle(String marke, int baujahr, Antriebsart antriebsart) {
        super(marke, baujahr);
        this.antriebsart = antriebsart;
    }

    public Antriebsart getAntriebsart() {
        return antriebsart;
    }

    public void setAntriebsart(Antriebsart antriebsart) {
        this.antriebsart = antriebsart;
    }

    @Override
    public String toString() {
        return super.toString() + ", Antriebsart: " + antriebsart;
    }
}
