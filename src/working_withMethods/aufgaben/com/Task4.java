package working_withMethods.aufgaben.com;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Geben Sie den Monat ein: ");
		String monat = scanner.nextLine().toLowerCase(); // Eingabe in Kleinbuchstaben umwandeln

		System.out.print("Geben Sie das Jahr ein: ");
		int jahr = scanner.nextInt();

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
			if (istSchaltjahr(jahr)) {
				tage = 29;
			} else {
				tage = 28;
			}
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

		System.out.println("Der " + monat + " hat im Jahr " + jahr + ": " + tage + " Tage.");
	}

	public static boolean istSchaltjahr(int jahr) {
		return (jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0);
	}

}
