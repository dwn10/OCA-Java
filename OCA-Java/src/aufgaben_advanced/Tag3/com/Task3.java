package aufgaben_advanced.Tag3.com;

public class Task3 {
    public static void main(String[] args) {

        // Variablen initialisieren
        String monat = "Januar";
        int tage = 0;

        // Monat abfragen
        System.out.println("Bitte geben Sie einen Monat ein:");
        monat = System.console().readLine();

        // Tage des Monats ermitteln
        switch (monat) {
            case "Januar":
            case "März":
            case "Mai":
            case "Juli":
            case "August":
            case "Oktober":
            case "Dezember":
                tage = 31;
                break;
            case "April":
            case "Juni":
            case "September":
            case "November":
                tage = 30;
                break;
            case "Februar":
                tage = 28;
                break;
            default:
                System.out.println("Ungültiger Monat");
                return;
        }

        // Ergebnis ausgeben
        System.out.println("Der " + monat + " hat " + tage + " Tage.");
    }
}
