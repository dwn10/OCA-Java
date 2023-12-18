package workingWiithInheritance.example.exceptionHandling;

public class ErrorHandling {

	/**
	 * The Message Index 0 => INVALIDPASSWORT_NO_UPPER_CASE_LETTER 1 =>
	 * INVALIDPASSWORD_NO_NUMBER 2 => INVALIDPASSWORD_LENGTH 3 => INVALIDEMAIL 4 =>
	 * INVALIDEMAIL_IS_IN_USE
	 * 
	 * @param index
	 */
	public static void throwException(int index) throws UserInputException {
		switch (index) {
		case 0:
			throw new InvalidUsetrInput_NoUpperCaseLetter(Messages.values()[index].getMessage());
		case 1:
			throw new InvalidUserInput_LengthToSmall(Messages.values()[index].getMessage());
		case 2:
			throw new InvalidUserInput_NoNumberInPassword(Messages.values()[index].getMessage());
		case 3:
			throw new InvalidUserInput_InvalidMail(Messages.values()[index].getMessage());
		case 4:
			throw new InvalidUserInput_IsInUse(Messages.values()[index].getMessage());

		}
	}

}

enum Messages {
	INVALIDPASSWORT_NO_UPPER_CASE_LETTER("Das Passwort entspricht nicht dem Format, kein Groß Buchstabe drin"),
	INVALIDPASSWORD_NO_NUMBER("Das Passwort entspricht nicht dem Format, keine Zahl enthalten"),
	INVALIDPASSWORD_LENGTH("Das Passwort entspricht nicht dem Format, weniger als 8 Zeichen lang"),
	INVALIDEMAIL("Die Email entspricht nicht dem Format"), INVALIDEMAIL_IS_IN_USE("Diese Email ist schon vergeben");

	private final String MESSAGE;

	private Messages(String message) {
		// TODO Auto-generated constructor stub
		this.MESSAGE = message;
	}

	public String getMessage() {
		return this.MESSAGE;
	}
}

enum DBErros {

}
