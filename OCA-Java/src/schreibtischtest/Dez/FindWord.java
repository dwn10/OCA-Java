package schreibtischtest.Dez;

public class FindWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String text = "ABCDLorem.Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy "
				+ "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. "
				+ "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, "
				+ "no sea takimata sanctus est !Lorem ipsum dolor sit amet. -Lorem ipsum dolor sit amet, "
				+ "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore "
				+ "magna aliquyam lorem erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et "
				+ "ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est 1.Lorem ipsum dolor sit amet.";

		String findWord = "Lorem";

		countWordInText(text, findWord);
	}

	public static void countWordInText(String text, String refWord) {
		if (!text.contains(refWord)) {
			return;
		}

		int counter = 0;
		String[] wordArr = text.split(" ");
		// for(int i , counter = 0; i<wordArr.length; i++) {
		//
		// }
		// s = ABCDLorem.Lorem

		for (String s : wordArr) {
			// abcdlorem.lorem beinhaltet lorem
			if (s.toLowerCase().contains(refWord.toLowerCase())) {
				System.out.println(s);
				// ABCDLorem.Lorem.length => laufen durch die Schleife basierend auf dem
				// ausgangswert
				for (int i = 0; i < s.length(); i++) {
					// System.out.println(refWord.charAt(0));
					// System.out.println(s.toCharArray()[i]);
					// 1.d refWord.charAt(0) = l s.toCharArray()[i] = a
					// 2.d refWord.charAt(0) = l s.toCharArray()[i] = b
					// 3.d refWord.charAt(0) = l s.toCharArray()[i] = c
					// 4.d refWord.charAt(0) = l s.toCharArray()[i] = d
					// 5.d refWord.charAt(0) = l s.toCharArray()[i] = l i = 4
					// 6.d refWord.charAt(1) = o s.toCharArray()[i] = o i = 5

					if (Character.isAlphabetic(s.toCharArray()[i]) && s.toCharArray()[i] == refWord.charAt(0)
							&& s.toCharArray()[i + 1] == refWord.charAt(1)
							&& s.toCharArray()[i + 2] == refWord.charAt(2)
							&& s.toCharArray()[i + 3] == refWord.charAt(3)
							&& s.toCharArray()[i + 4] == refWord.charAt(4)) {
						i += 4;
						counter++;
					}
				}
				// counter++;
				// System.out.println(s);
			}
		}
		System.out.println(counter);
	}

}
