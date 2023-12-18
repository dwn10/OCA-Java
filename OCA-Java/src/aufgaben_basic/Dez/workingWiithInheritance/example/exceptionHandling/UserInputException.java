package workingWiithInheritance.example.exceptionHandling;

public class UserInputException extends Exception {

	public String message;

	public UserInputException(String message) {
		this.message = message;
	}
}
