package schreibtischtest.Dez;

public class LoopConstructs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int i = 1, j = 10;
		// do {
		// System.out.println(i++ + " | " + --j);
		// if (i > j)//
		// continue;
		// System.out.println(i + " | " + j);
		// } while (i < 5);// 5 ist hälfte von j
		// // i = 4 + ein Inkrement welches noch ausgeführt wird
		//// j = 6
		// System.out.println(i + " | " + j);

		String[] arr = { "a", "b", "c" };
		for (String s : arr) { // nehme aus dem Mengenspeicher das nächste Element solange noch element in dem
								// MEngenspeicher stehen
			if ("b".equals(s))
				continue;
			System.out.println(s);
			if ("b".equals(s))
				break;
			System.out.println(s + " again");
		}

		System.out.println("----------------------------------------------------------------");
		for (int j = 1; j < 3; j++) {
			for (int h = 1; h <= j; h++) {
				System.out.print(h + " ");
			}
			System.out.println();
		}
	}

}
