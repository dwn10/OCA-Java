package aufgaben_advanced.Nov.Tag2.com;

public class Roboter {
    private int batterieLaufzeit = 5;

    public boolean istBatterieLaufzeitNiedrig() {
        return batterieLaufzeit < 2;
    }

    private String aufgabe = "\nIch reiche Butter.";

    public void fuehreAufgabeAus() {
        if (!istBatterieLaufzeitNiedrig()) {
            System.out.println(aufgabe);
            batterieLaufzeit--;
        } else {
            System.out.println("\nIch muss aufgeladen werden.");
        }
    }

    public static void main(String[] args) {
        Roboter roboter = new Roboter();

        for (int i = 0; i < 5; i++) {
            roboter.fuehreAufgabeAus();
        }
    }
}
