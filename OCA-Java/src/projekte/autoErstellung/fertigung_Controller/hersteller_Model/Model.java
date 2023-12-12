package projekte.autoErstellung.fertigung_Controller.hersteller_Model;

public enum Model {
    COUPE(), CABRIO(), KOMBI(), LIMOUSINE(), SUV();

    int ps;
    float hubraum;
    double radstand;

    Model() {

    }

    Model(int ps) {

    }

    Model(int ps, float hubraum, double radstand) {

    }

    public int getPs() {
        return this.ps;
    }

    public float getHubraum() {
        return this.hubraum;
    }

    public double getRadstand() {
        return this.radstand;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setHubraum(float hubraum) {
        this.hubraum = hubraum;
    }

    public void setRadstand(double radstand) {
        this.radstand = radstand;
    }
}
