package src.datentypen.aufgaben.com;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5; // Wert für i
		float f = 1.1f; // Wert für f
		char c = 'x'; // Wert für c

		String s = ""; // Initialisierung von s als leerem String

		// Schleife zum Erstellen von s
		for (int j = 0; j < i; j++) {
			s = s + c + f + ""; // Verlängern von s um c und f
			// s += c + f + ""; => Fehler! c wird hier als Zahl interpretiert
		}

		// Schleife zum Ausgeben von s mit Zeilenumbruch
		for (int j = 0; j < 3; j++) {
			System.out.println(s);
		}
	}

}
