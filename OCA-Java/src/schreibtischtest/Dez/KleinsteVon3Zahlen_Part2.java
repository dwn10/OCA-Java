package schreibtischtest.Dez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KleinsteVon3Zahlen_Part2 {

	public static void main(String[] args) {
		smalllestNumber();
	}

	public static boolean isNumber(String number) {
		String numberPattern = "\\d+";
		if (number.matches(numberPattern))
			return true;
		return false;
	}

	public static void doStuff() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gib eine Zahl ein");
		try {
			int zahl = sc.nextInt();
		} catch (InputMismatchException ex) {
			// wenn der Fehler auftritt muss dafür gesorgt werden das mein Programm weiter
			// läuft
			doStuff();
		}
	}

	public static void doStuff2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gib eine Zahl ein");
		while (sc.hasNextInt()) {
			int zahl = sc.nextInt();
		}
	}

	public static void smalllestNumber() {
		// TODO Auto-generated method stub
		// Unsere Zahlen für den Vergleich
		int zahl1 = 0;
		int zahl2 = 0;
		int zahl3 = 0;
		// Counter für die Abbruchbedingung im Do-While
		int counter = 0;

		Scanner sc = new Scanner(System.in);

		do {
			// String format erlaubt es in eine Zeichenkette Variablen zu integrieren(welche
			// ausgewertet werden)
			System.out.println(String.format("Gib mal bitte die %s Zahl ein", counter + 1));
			String number = sc.nextLine();
			if (!isNumber(number)) {
				System.out.println(String.format("Die Eingabe von der Zahl %s war nicht korrekt!", counter + 1));
				continue;
			}
			if (counter >= 1 && zahl1 == Integer.parseInt(number)) {
				System.out.println(String.format("Lieber User die Zahlen %s und %s sind gleich!", zahl1,
						Integer.parseInt(number)));
				System.out.println(String.format("Lieber User die Zahlen %s und %s sind gleich!", zahl1, number));
				continue;
			}
			if (counter >= 2 && zahl2 == Integer.parseInt(number) || zahl1 == Integer.parseInt(number)) {
				System.out.println(String.format("Lieber User bei den Zahlen %s und %s und %s sind gleich dabei!",
						zahl1, zahl2, number));
				System.out.println(String.format("Lieber User die Zahlen %s und %s sind gleich!", zahl1, number));

				continue;
			}
			switch (counter) {
				case 0:
					zahl1 = Integer.parseInt(number);
					counter++;
					break;
				case 1:
					zahl2 = Integer.parseInt(number);
					counter++;
					break;
				case 2:
					zahl3 = Integer.parseInt(number);
					counter++;
					break;
			}
		} while (counter < 3);
		// Part 1
		// int kleinsteZahl = Math.min(zahl1, zahl2); // parameter der Funktion
		// dynamisch austauschen
		// oder
		// // int kleinsteZahl = Math.min(zahl1, Math.min(zahl2, zahl3)); // begerenzt
		// an aufrufen
		if (zahl1 < zahl2 && zahl1 < zahl3) {
			System.out.println(String.format("Die zahl %d ist die kleinste", zahl1));
		} else if (zahl2 < zahl3) {
			System.out.println("Die Zahl " + zahl2 + " ist die kleinste");
		} else {
			System.out.println("Die zahl " + zahl3 + " ist die kleinste");
		}
	}

}
