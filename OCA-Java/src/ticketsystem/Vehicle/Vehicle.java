package ticketsystem.Vehicle;

public abstract class Vehicle {

    private String marke;
    private int baujahr;

    public Vehicle(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        return "Marke: " + marke + ", Baujahr: " + baujahr;
    }
}
