package schreibtischtest.Dez;

import java.util.Scanner;

public class Schreibtischtest_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] woerter = new String[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("Geben Sie ein Wort mit einem Großbuchstaben ein: ");
			String eingabe = scanner.nextLine();

			while (!Character.isUpperCase(eingabe.charAt(0))) {
				System.out.println("Das Wort muss mit einem Großbuchstaben beginnen. Versuchen Sie es erneut.");
				System.out.print("Geben Sie ein Wort mit einem Großbuchstaben ein: ");
				eingabe = scanner.nextLine();
			}

			woerter[i] = eingabe;
		}

		System.out.println("Die eingegebenen Wörter sind:");
		for (String wort : woerter) {
			System.out.println(wort);
		}

		scanner.close();

	}
}
