package aufgaben_basic.Dez.Objekte_Programmier;

public class Haus {
    private String eigenschaft1;
    private String eigenschaft2;
    private String eigenschaft3;
    private static final String FLACHDACH = "Flachdach";
    private static final String SCHRÄGDACH = "Schrägdach";
    private static final String GIEBELDACH = "Giebeldach";

    public Haus() {
        this.eigenschaft1 = "default1";
        this.eigenschaft2 = "default2";
        this.eigenschaft3 = "default3";
    }

    public Haus(String eigenschaft1, String eigenschaft2, String eigenschaft3) {
        this.eigenschaft1 = eigenschaft1;
        this.eigenschaft2 = eigenschaft2;
        this.eigenschaft3 = eigenschaft3;
    }

    public String getEigenschaft1() {
        return eigenschaft1;
    }

    public void setEigenschaft1(String eigenschaft1) {
        this.eigenschaft1 = eigenschaft1;
    }

    public String getEigenschaft2() {
        return eigenschaft2;
    }

    public void setEigenschaft2(String eigenschaft2) {
        this.eigenschaft2 = eigenschaft2;
    }

    public String getEigenschaft3() {
        return eigenschaft3;
    }

    public void setEigenschaft3(String eigenschaft3) {
        this.eigenschaft3 = eigenschaft3;
    }

    public static String getFlachdach() {
        return FLACHDACH;
    }

    public static String getSchrägdach() {
        return SCHRÄGDACH;
    }

    public static String getGiebeldach() {
        return GIEBELDACH;
    }
}