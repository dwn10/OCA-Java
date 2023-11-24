package working_withMethods.aufgaben.com;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Geben Sie den Monat ein: ");
		String monat = scanner.nextLine().toLowerCase(); // Eingabe in Kleinbuchstaben umwandeln

		int tage = 0;

		switch (monat) {
		case "januar":
		case "märz":
		case "mai":
		case "juli":
		case "august":
		case "oktober":
		case "dezember":
			tage = 31;
			break;
		case "februar":
			tage = 28;
			break;
		case "april":
		case "juni":
		case "september":
		case "november":
			tage = 30;
			break;
		default:
			System.out.println("Ungültige Eingabe für den Monat.");
			System.exit(0);
		}

		System.out.println("Der " + monat + " hat " + tage + " Tage.");
	}

}
