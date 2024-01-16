package schreibtischtest.Dez;

import java.util.Scanner;

public class KleinsteVon3Zahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aufgabeTeil1undTeil2();
	}

	public static void aufgabeTeil1undTeil2() {
		Scanner sc = new Scanner(System.in);
		int zahl1 = 0;
		int zahl2 = 0;
		int zahl3 = 0;
		int counter = 0;
		String number = "";
		do {
			System.out.println(String.format("Bitte geben sie die %s Zahl ein", counter + 1));
			number = sc.nextLine();
			if (!isNumber(number.trim()))
				continue;
			// Part 2
			if ((counter == 1 && zahl1 == Integer.parseInt(number)) || (counter == 2
					&& (zahl2 == Integer.parseInt(number) || zahl1 == Integer.parseInt(number) || zahl1 == zahl2))) {
				System.out.println(counter == 1
						? String.format("Die Zahlen %s und %s sind gleich und somit nicht erlaubt ", zahl1,
								Integer.parseInt(number))
						: String.format("Eine der Zahlen %s oder %s oder %s sind gleich und somit nicht erlaubt ",
								zahl1, zahl2, Integer.parseInt(number)));
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
		if (zahl1 > zahl2 && zahl1 > zahl3)
			System.out.println(String.format("Das ist die größte Zahl: ", zahl1));
		else if (zahl2 > zahl3)
			System.out.println(String.format("Das ist die größte Zahl: ", zahl2));
		else
			System.out.println(String.format("Das ist die größte Zahl: ", zahl3));
	}

	public static boolean isNumber(String number) {
		String numberPattern = "\\d+";
		if (number.matches(numberPattern))
			return true;
		return false;
	}

}
