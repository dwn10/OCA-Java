package src.datentypen.aufgaben.com;

public class Task8 {

	// a) Eine Integer-Variable g, die für alle Funktionen in der Klasse gültig ist
	private static int g;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// b) Eine Integer-Variable l, die nur im Main gültig ist
		int l = 5;

		// Aufruf der Funktion, die g-mal "Hallo" auf der Konsole ausgibt
		g = 3;
		printHallo(g);

		// l-mal "Welt" auf der Konsole ausgeben
		for (int i = 0; i < l; i++) {
			System.out.println("Welt");
		}

		// e) Werte von g und l auf der Konsole ausgeben
		System.out.println("Wert von g: " + g);
		System.out.println("Wert von l: " + l);
	}

	// c) Funktion, die im Main aufgerufen werden kann und g-mal "Hallo" auf der
	// Konsole ausgibt
	private static void printHallo(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Hallo");
		}
	}

}
