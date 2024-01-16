package schreibtischtest.Dez;

import java.util.Random;

public class PasswordGenerator {
	private int length;

	// Konstruktor
	public PasswordGenerator(int length) {
		this.length = length;
	}

	// Methode zum Generieren des Passworts
	public String generatePassword() {
		StringBuilder password = new StringBuilder();
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		for (int i = 0; i < length; i++) {
			int randomIndex = (int) (Math.random() * characters.length());
			password.append(characters.charAt(randomIndex));
		}

		return password.toString();
	}

	public String genPassword() {

		Random rnd = new Random();
		String password = "";

		for (int i = 0; i < this.length; i++) {
			int slot = rnd.nextInt(3) + 1;
			char c = ' ';
			switch (slot) {
				case 1:
					int groBuchstabe = rnd.nextInt(26) + 65;
					c = (char) groBuchstabe;
					password += String.valueOf(c);
					break;
				case 2:
					int zahl = rnd.nextInt(10) + 47;
					c = (char) zahl;
					password += String.valueOf(c);
					break;
				case 3:
					int kleinBuchstabe = rnd.nextInt(26) + 97;
					c = (char) kleinBuchstabe;
					password += String.valueOf(c);
					break;
				default:
					break;
			}
		}

		return password;
	}

	public static void main(String[] args) {
		PasswordGenerator generator = new PasswordGenerator(10);
		// String generatedPassword = generator.generatePassword();
		// System.out.println("Generated Password: " + generatedPassword);
		System.out.println(generator.genPassword());
	}
}
