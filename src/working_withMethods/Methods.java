package working_withMethods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	Deklaration => Modifier | Sterotypen (static,final,abstract) | Rückgabewert | Signatur
//	Signatur => Bezeichner (Name der Methode) & Parameterliste (Datentypen) => as Kombi ist das eimalig!!!!!
	public static void doStuff_Example(String name) {
		System.out.println(name);
	}

	public static void doStuff_Example(String name, int ort) {
		System.out.println(name);
	}

	public static void doStuff_Example(int ort, String name) {
		System.out.println(name);
	}
	/*
	 * beim überladen von Methoden werden als Referenz die Bezeichner sowie dei
	 * Datentypne der Parameterliste abgeglichen public static void
	 * doStuff_Example(String ort) { System.out.println(ort); }
	 */
}
