package operatoren;
/**
 * Die Wurzeln dieser Begriffe liegen im Griechischen und Lateinischen:
Arithmetic: Dieses Wort stammt vom griechischen Wort "arithmos", was "Zahl" bedeutet. Die Arithmetik ist der Zweig der Mathematik, der sich mit Zahlen und den grundlegenden Operationen wie Addition, Subtraktion, Multiplikation und Division befasst.
Operators: Dieser Begriff kommt vom lateinischen Wort "operator", was "Arbeiter" oder "Erzeuger" bedeutet. In der Mathematik und Informatik bezieht sich ein Operator auf ein Symbol oder eine Funktion, die eine bestimmte Operation auf einen oder mehrere Operanden (Werte, auf die die Operation angewendet wird) ausführt.
 */
public class AritmetischeOperatoren {


	public static void main (String... args) {
		/**
		 * Operatoren => + - * / %(Restwert Division)
		 * Inkrement +
		 * Dekrement -
		 */
		System.out.println("******************************** Addition ********************************");
		// + Addition
		short s = 3;
		int i = 5;
		System.out.println(s + i);
		
		System.out.println("******************************** Subtraktion ********************************");
		// - Subtraktion
		System.out.println(i - s);
		
		System.out.println("******************************** Multi ********************************");
		// * Multiplikation
		System.out.println(s * i);
		
		System.out.println("******************************** Division ********************************");
		// / Division
		System.out.println(s / i);
		
		System.out.println("******************************** Inkrement ********************************");
		int x = 1;
		// Schreibweisen => ++
		x++;
		x = x + 1;
		x += 1; // funktioniert nur bei Numerischen Datentypen
		// Pos und Pre
		int i1 = 1;
		i1++;
		System.out.println(i1); // 1 | 
		int i2 = 1;
		++i2;
		System.out.println(i2); // 2
		
		int i3 = 1;
		System.out.println(i3++);
		System.out.println(i3);
		int i4 = 1;
		System.out.println(++i4);
		
		System.out.println("******************************** Dekrement ********************************");
		int x2 = 1;
		// Schreibweisen => ++
		x2--;
		x2 = x2 - 1;
		x2 -= 1; // funktioniert nur bei Numerischen Datentypen
		// Pos und Pre
		int i1_de = 1;
		i1_de--;
		System.out.println(i1); // 1 | 
		int i2_de = 1;
		--i2_de;
		System.out.println(i2); // 2
		
		int i3_de = 1;
		System.out.println(i3_de--);
		System.out.println(i3_de);
		int i4_de = 1;
		System.out.println(--i4);
		
		int dekrement = 1;
		dekrement--;
		dekrement--;
		dekrement--;
		dekrement--;
		System.out.println(dekrement);
		byte s1 = -128; // -128 bis 127 => 256 => 3 bits => 256 - 0 als Stelle => 255
		
		System.out.println("******************************** Modulo ********************************");
		// %  Modulo
		int m1 = 10;
		int m2 = 3;
		System.out.println(m1 % m2);
	
		
	}
}
