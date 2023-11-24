package working_withMethods.aufgaben.com;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte geben Sie das Jahr ein:");
		int jahr = scanner.nextInt();

		boolean schaltjahr = false;

		if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
			schaltjahr = true;
		}

		System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr: " + schaltjahr);

		scanner.close();
	}

}
