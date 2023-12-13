package aufgaben_basic.Dez.Objekte_Programmier;

public class Haus {

    // Konstanten für die Dacharten
    public static final String DACHART_FLACH = "Flachdach";
    public static final String DACHART_SCHRÄGDACH = "Schrägdach";
    public static final String DACHART_GIEBELDACH = "Giebeldach";

    // Standardwert für die Anzahl der Stockwerke
    private static final int STANDARD_STOCKWERKE = 1;

    // Standardwert für die Anzahl der Zimmer
    private static final int STANDARD_ZIMMER = 5;

    // Eigenschaft für die Dachart
    private String dachart;

    // Eigenschaft für die Anzahl der Stockwerke
    private int stockwerke;

    // Eigenschaft für die Anzahl der Zimmer
    private int zimmer;

    // Konstruktor
    public Haus(String dachart, int stockwerke, int zimmer) {
        this.dachart = dachart;
        this.stockwerke = stockwerke;
        this.zimmer = zimmer;
    }

    // Getter für die Dachart
    public String getDachart() {
        return dachart;
    }

    // Setter für die Dachart
    public void setDachart(String dachart) {
        this.dachart = dachart;
    }

    // Getter für die Anzahl der Stockwerke
    public int getStockwerke() {
        return stockwerke;
    }

    // Setter für die Anzahl der Stockwerke
    public void setStockwerke(int stockwerke) {
        this.stockwerke = stockwerke;
    }

    // Getter für die Anzahl der Zimmer
    public int getZimmer() {
        return zimmer;
    }

    // Setter für die Anzahl der Zimmer
    public void setZimmer(int zimmer) {
        this.zimmer = zimmer;
    }

    // Methode zum Ausgeben der Eigenschaften des Hauses
    public void ausgabe() {
        System.out.println("Dachart: " + dachart);
        System.out.println("Anzahl der Stockwerke: " + stockwerke);
        System.out.println("Anzahl der Zimmer: " + zimmer);
    }
}
