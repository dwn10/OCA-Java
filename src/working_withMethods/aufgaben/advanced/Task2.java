package working_withMethods.aufgaben.advanced;

public class Task2 {
	public static void main(String[] args) {
		double kapital = 100; // Startkapital
		int jahr = 1; // Startjahr
		double prozent = 3; // Prozentsatz

		System.out.println("Startkapital beträgt " + kapital + " Euro");

		while (jahr <= 5) {
			kapital = kapital * (1 + prozent / 100); // Kapital erhöhen

			System.out.println("Kapital nach " + jahr + " Jahr(en): " + kapital);
			jahr++; // Jahr erhöhen
		}
	}
}
