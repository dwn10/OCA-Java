package workingWiithInheritance.example.view;

import java.util.Scanner;

import review.woche2.controller.ValidUserInput;
import workingWiithInheritance.example.exceptionHandling.ErrorHandling;
import workingWiithInheritance.example.exceptionHandling.UserInputException;

public class LoginView {

	public static void startLogin() throws UserInputException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie Ihr Email ein:");
		String email = sc.nextLine();
		System.out.println("Bitte geben sie Ihr Passwort ein:");
		String password = sc.nextLine();

		int isValidEmail = ValidUserInput.validEmail(email);
		int isValidPassword = ValidUserInput.validPassword(password);

		if (isValidEmail != -1) {
			ErrorHandling.throwException(isValidPassword);
		}
		/**
		 * 1. dirket Login => with Password and Email 2. if => controller.valid.email &&
		 * controller.valid.password => sende Message welcome in Member Area else => if
		 * !controller.valid.email = >than ErrorMeasseages => invalid Email => if
		 * !controller.vbalid.password => than Erro9rMesage => invalid Password
		 */
	}

}
