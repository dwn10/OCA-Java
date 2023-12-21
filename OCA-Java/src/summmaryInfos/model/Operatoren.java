package summmaryInfos.model;

import java.io.IOException;

import summmaryInfos.controller.IMovable;

public class Operatoren {

//	Arithmetic Operator | Logic Operator | Vergleichs Operator | Zuweisungsoperator |  Instanz Operatoren
//	Arithmetic Operator + - * / %
//	Inkrement i++ => i = i + 1
//	Dekrement i-- => i = i - 1
//	post | pre
//	post => i++ => erfolgt erst zu beginn der nächsten Zeile
//	pre  => ++i => inline Anweisung => das update der Variable i erfolgt in dieser Zeile

//	Logic Operator && || ! => & | 
	public void doStuff() {
		boolean state1 = true;
		boolean state2 = false;
		boolean state3 = true;
//		Logische Operatoren diene dazu boolsche Ausdrücke logisch zu verknüpfen
		if (state1 && state2) { // wenn true und true => dann machen wir was => beide seiden des logischen
								// Operators müssen wahr sein um den gesamten Ausdruck auf wahr zu evaluieren
//			dann mach was
		}

		if (state2 || state3) {// wenn false oder true => dann machen wir was => eine der beiden Seiten muss
								// der Wahrheit entsprechen(true) damit der gesamte Ausdruck auf wahr evaulieren
								// kann => es werden nicht beide seiten betrachtet sobald der erste schon der
								// Wahrheit entspricht
//			dann mach was
		}

		if (!state2) {// not (!) dient zum umkehren des Wahrheitswert

		}
	}
//	Vergleichs Operatoren < > <= >= == !=
//	Zuweisungsoperator =

//	Instanz Operatoren
	public void instanceOf() {
//		instanceOf | new | .
//		Instanztyp(Person) Bezeichner(p) Zuweisungsoperator(=) Instanzoperator(new) Typ der Instanz(Person) 
		Person p = new Person();
		IMovable m = new Person();
		IMovable m2 = new Person_ImplemtiertBasisTypenInterface();

//		new 
		Person p2 = new Person(); // der new Operator allein geht nicht nur in Verbindung mit einem Konstruktor
									// aufruf
//		=> daraus bildet sich ein Objekt von dem Typen ,welcher aufgerufen wurde

//		instanceOf
//		Vergleichs Operator => jedoch mit einer Fest definierten Struktur=> diese wird immer als Typ(ist immer eine Klasse) verwendet

		int i = 0;
//		if(i instanceof int) {} // wenn der Vergleich nicht auf einem Typen(komplexe Datentypen (keine Primitiven)) basiert funktioniert instanceOf nicht
		Integer i2 = new Integer(i);
		if (i2 instanceof Integer) {

		}
//		if(i instanceof Integer) {} // auf beiden Seiten des Operators instanceOf müssen komplexe Typen stehen

//		prüfen ob Objekt Instanzen welche nicht immer die Basistyp(Super klassen(Interface, Abstracte Klasse, oder jede Klasse von der wir erben mittels extends)) ist
		if (m instanceof Person) {
//			Objekt Referenz (m) wird geprüft ob diese Referenz vom Typ (instanceOf) Person(zu vergleichende Struktur) ist
		}

		if (m instanceof IMovable) {
			System.out.println("IMovable geht");
		}

//		Punkt operator
//		Objekt Referenz => Person p = new Person();
//		Referenz == p
//		mittels des Punkt Operators könne Eigenschaften und Methoden dieses Typs angsprochen werden sollten diese Sichtbar sein
		p.c = 'a'; // Zuweisung des Wertes a in die Eigenschaft c von der Objekt Referenz p
	}

}
