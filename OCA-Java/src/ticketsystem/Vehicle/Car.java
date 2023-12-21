package ticketsystem.Vehicle;

public class Car extends Vehicle {

    private int anzahlTueren;

    public Car(String marke, int baujahr, int anzahlTueren) {
        super(marke, baujahr);
        this.anzahlTueren = anzahlTueren;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    @Override
    public String toString() {
        return super.toString() + ", Anzahl Türen: " + anzahlTueren;
    }
}
