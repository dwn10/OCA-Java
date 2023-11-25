package datentypen.aufgaben.com;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kantenlaengeKubus = 3.75;

		// Berechnung der Oberfläche und des Volumens
		double oberflaeche = 6 * kantenlaengeKubus * kantenlaengeKubus;
		double volumen = kantenlaengeKubus * kantenlaengeKubus * kantenlaengeKubus;

		// Ausgabe gemäß dem dargestellten Layout
		System.out.println("********************************************");
		System.out.println("*    Ergebnisse für Kantenlänge " + kantenlaengeKubus + "    *");
		System.out.println("********************************************");
		System.out.printf("Oberfläche: %.2f\n", oberflaeche);
		System.out.printf("Volumen: %.2f\n", volumen);
	}

}
