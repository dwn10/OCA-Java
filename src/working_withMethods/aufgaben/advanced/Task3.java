package working_withMethods.aufgaben.advanced;

public class Task3 {
	public static void main(String[] args) {
		int count = 0;
		int numberToCheck = 2;

		while (count < 100) {
			if (isPrime(numberToCheck)) {
				count++;
				if (count == 100) {
					System.out.println("Die 100. Primzahl ist: " + numberToCheck);
				}
			}
			numberToCheck++;
		}
	}

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
