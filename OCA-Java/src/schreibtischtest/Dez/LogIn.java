package schreibtischtest.Dez;

import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userPin = 1234;
		int userEingabenCounter = 1;

		boolean userInputState = true;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Bitte geben sie ihren 4 Stelligen Pin ein");
			String pinAsString = sc.nextLine();
			pinAsString = pinAsString.trim();
			String regex = "[0-9]{4}";

			if (pinAsString.matches(regex)) {
				if (Integer.parseInt(pinAsString) == userPin) {
					userEingabenCounter++;
					userInputState = false;
					System.out.println("Danke für die korrekte Eingabe");
				} else {
					userEingabenCounter++;
					System.out.println("Leider war ihre Eingabe nicht korrekt");
				}

			} else {
				System.out.println("Bitte geben sie nur 4 Zahlen ein");
				userEingabenCounter++;
			}
			if (userEingabenCounter == 4) {
				System.out.println(
						"Sie haben ihr maximale Versuchsanzahl erreicht und können nicht mehr weiter machen");
				userInputState = false;
			}

		} while (userInputState);
	}

}
