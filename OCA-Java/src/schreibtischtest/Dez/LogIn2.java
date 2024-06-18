package schreibtischtest.Dez;

import java.util.Scanner;

public class LogIn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userPin = 1234; // format => Ganzzahl & Länge == 4 Zahlen
		int userInputCounter = 1;
		// Erste die Interakion => dann die Prüfung => bsaierend auf dem Ergebniss
		// fertig oder nicht
		Scanner sc = new Scanner(System.in);
		boolean stateLogin = true;
		boolean stateSumOfTrys = false;

		do {
			System.out.println("\nBitte geben Sie ihren Pin ein:");
			String userInput = sc.nextLine();

			String regex = "(\\d\\d\\d\\d)";
			if (userInput.matches(regex)) {
				if (Integer.parseInt(userInput) == userPin) {
					System.out.println("Danke für die korrekte Eingabe");
					stateLogin = false;
				} else {
					System.out.println("Pin nicht korrekt");
					userInputCounter++;
				}
			} else {
				System.out.println("Falsch Eingabe => Format Fehler (nur 4 Zahlen erlaubt)");
				userInputCounter++;

			}
			if (userInputCounter == 4) {
				System.out.println(
						"Sie haben ihr maximale Versuchsanzahl erreicht und können nicht mehr weiter machen");
				stateSumOfTrys = true;
			}
			// logische Verknüpfung => Und(&&) ; oder(||) ; Not(!)
			// stateLogin und stateSumOfTrys
			// oder(||) => Regel: sollte der erste True sein so wird der zweite nicht
			// bewertet
			// und (&&) => Regel: also beide Seiten werden bewertet, und nur wenn beide True
			// ergibt das True
		} while (stateLogin && !stateSumOfTrys);
	}

}
