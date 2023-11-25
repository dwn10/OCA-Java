package datentypen.primitiveDatentypen;

/**
 * @author flori Diese Klasse dient als Sammlung aller Datentypen in Java
 */
public class Datentypen {

	public static void main(String... args) {
		System.out.println("***************************Wahrheitstypen***************************\n");
		// Wahrheits Typ
		boolean bool_true = true;
		boolean bool_true2 = Boolean.TRUE; // Constanten der Wrapper Klassen
		boolean bool_false = false;
		boolean bool_false2 = Boolean.FALSE; // Constanten der Wrapper Klassen

		System.out.println("boolean Wahr" + bool_true); // bei Zeichenketten kann mittles + Operator die
		// Zeichenkette mit einer weitern oder einer Variable verbunden werden
		System.out.println("bollean Wahr" + bool_true2);
		System.out.println(bool_false);
		System.out.println(bool_false2);
		System.out.println("***************************Literale***************************\n");
		// Literale
		/**
		 * Literal mit einer Stelle => Char => kann eine Zeichenkette entstehen =>
		 * String => intern nicht anders als eibn Char Array
		 */
		char charAsUnicode = '\u0061'; // = a
		char charAschar = 'A';
		char charAsNumber = 65; // Numerische Wertigkeit bis zur Grenze der Ascii Tabelle

		System.out.println("Char => a " + charAsUnicode);
		System.out.println(charAschar);
		System.out.println(charAsNumber);

		System.out.println("***************************Numerische Typen***************************\n");
		// Numerische Datentypen
		/**
		 * byte => 8 bits => (-128 bis 127) short => 16 bits => (-32763 bis 32767) int
		 * => 32 bits => -2.147.483.648 ... 2.147.483.647 long => 64 bits => -263 bis
		 * 263-1, ab Java 8 auch 0 bis 264 -1
		 */
		byte byteAsNumber = 123;
		short shortAsNumber = 12321;
		int intAsNumber = 1234567890;
		long longAsNumber = 1234567891234556789L; // Kennung für den Long => L | l

		System.out.println("Byte als 123 " + byteAsNumber);
		System.out.println(shortAsNumber);
		System.out.println(intAsNumber);
		System.out.println(longAsNumber);

		System.out.println("***************************Gleitkomma Zahlen***************************\n");
		// Gleitkommazahlen
		/**
		 * Float => 32 bit => +/-1,4E-45 ... +/-3,4E+38 Double => 64 bit => +/-4,9E-324
		 * ... +/-1,7E+308 Das gibt die genauigkeit der Nachkommastellen an
		 */
		float floatAsGleiti = 3.0F; // Kennung für den float => F | f
		double doubleAsGleiti = 3.0;

		System.out.println("float as 3.0 " + floatAsGleiti);
		System.out.println(doubleAsGleiti);

	}
}
