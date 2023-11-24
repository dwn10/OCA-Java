package working_withMethods.aufgaben.advanced;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte wählen Sie eine Rechenart:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraktion");
		System.out.println("3. Multiplikation");
		System.out.println("4. Division");
		int auswahl = scanner.nextInt();

		System.out.println("Geben Sie zahl1 ein:");
		int zahl1 = scanner.nextInt();

		System.out.println("Geben Sie zahl2 ein:");
		int zahl2 = scanner.nextInt();

		switch (auswahl) {
			case 1:
				int summe = addition(zahl1, zahl2);
				System.out.println("Ergebnis der Addition: " + summe);
				break;
			case 2:
				int differenz = subtraktion(zahl1, zahl2);
				System.out.println("Ergebnis der Subtraktion: " + differenz);
				break;
			case 3:
				int produkt = multiplikation(zahl1, zahl2);
				System.out.println("Ergebnis der Multiplikation: " + produkt);
				break;
			case 4:
				try {
					double quotient = division(zahl1, zahl2);
					System.out.println("Ergebnis der Division: " + quotient);
				} catch (ArithmeticException e) {
					System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
				}
				break;
			default:
				System.out.println("Ungültige Auswahl.");
				break;
		}

		scanner.close();
	}

	public static int addition(int zahl1, int zahl2) {
		return zahl1 + zahl2;
	}

	public static int subtraktion(int zahl1, int zahl2) {
		return zahl1 - zahl2;
	}

	public static int multiplikation(int zahl1, int zahl2) {
		return zahl1 * zahl2;
	}

	public static double division(int zahl1, int zahl2) {
		if (zahl2 == 0) {
			throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
		}
		return (double) zahl1 / zahl2;
	}
}
