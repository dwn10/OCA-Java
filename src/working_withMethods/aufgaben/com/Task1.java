package working_withMethods.aufgaben.com;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int value = 0;

		while (value < 10) {
			System.out.print("Bitte geben Sie eine Zahl größer oder gleich 10 ein: ");
			while (!scanner.hasNextInt()) {
				System.out.println("Fehler: Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
				scanner.next(); 
				System.out.print("Bitte geben Sie erneut eine Zahl ein: ");
			}
			value = scanner.nextInt();

			if (value < 10) {
				System.out.println("Fehler: Die eingegebene Zahl ist zu klein.");
			}
		}

		System.out.println("Erfolg! Die eingegebene Zahl ist mindestens 10.");
		scanner.close();
	}

}
