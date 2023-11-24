package working_withMethods.aufgaben.advanced;

public class Task5 {
	public static void main(String[] args) {
		int limit = 200000;
		long sum = 0;

		for (int i = 2; i < limit; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}

		System.out.println("Die Summe aller Primzahlen unter 200.000 beträgt: " + sum);
	}

	// Methode zur Überprüfung, ob eine Zahl eine Primzahl ist
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
