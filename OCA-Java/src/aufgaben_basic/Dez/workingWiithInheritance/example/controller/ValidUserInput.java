package workingWiithInheritance.example.controller;



public class ValidUserInput {

	/**
	 * 
	 * @param email
	 * @return 3 => INVALIDEMAIL 4 => INVALIDEMAIL_IS_IN_USE -1 => Everything is
	 *         Valid
	 */
	public static int validEmail(String email) {
		// TODO Auto-generated method stub
		return 3;
	}

	/**
	 * 
	 * @param password
	 * @return 0 => INVALIDPASSWORT_NO_UPPER_CASE_LETTER 1 =>
	 *         INVALIDPASSWORD_NO_NUMBER 2 => INVALIDPASSWORD_LENGTH -1 => valid
	 *         Password
	 */
	public static int validPassword(String password) {
		// TODO Auto-generated method stub
		return -1;
	}

}
