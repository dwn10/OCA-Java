package summmaryInfos.model;

import java.util.*;

import summmaryInfos.controller.IMovable;

// Jede Java Datei kann nur eine public class haben welche den selben Namen wie die Datei haben muss
// Aus jeder class kann ein Typ gemacht werden => gleich wie beim Integer oder String(Wrapper Typen)
public class Person implements IMovable {
//	Struktur der Klasse
//	Attribute
//	Konstruktoren
//	Methoden

	// Datentypen
//	Numerische Typen
	byte b = 1;
	short s = 1;
	int i = 1;
	long l = 1L;
	float f = 0.0f;
	double d = 0.0;
//	Zeichen Datentypen
	char c = 'a';
	String st = "Hallo";
//	Wahrheitswert
	boolean bool = true;
//	Mengenspeicher
//  Array
	int[] arr = new int[10];
	int[] arr2 = { 1, 2, 3 };
//	Listen
	ArrayList<Integer> list = new ArrayList<>();

//	enum
	enum Dummy {
		DUMMY1, DUMMY2
	}

	enum DummyWithConstructor {
		DUMMY1(1), DUMMY2(2);

		private int zahl;

		private DummyWithConstructor(int zahl) {
			// TODO Auto-generated constructor stub
			this.zahl = zahl;
		}
	}

//	Modifier
//	public, private, protected, default
//	public 
	public int i2 = 1;
//	private
	private int i3 = 1;
//	protected
	protected int i4 = 1;
//	default
	int i5 = 1;

//	Sterotypen
//	final, static, abstract
//	final
	public final int ZAHL = 1;
//	static
	public static int zahl1 = 1;
//	abstract
//	public abstract int zahl3 = 1;//der kann nur in abstracten Strukturen verwendet werden(Abstracte Klasse, Interface)

//	Konstruktoren => auf Klassen Ebene | Objekt Ebene
//	default Konstruktoren sind immer vorhanden solange kein weiter Konstruktor definiert ist
//	default => ausdkommentiert für die Konmstruktorkette
//	public Person() {
//		
//	}
//	Konstruktoren => mit einem Parameter
	public Person(int zahl) {
		this.i2 = zahl;
	}

//	Konstruktor Überladung
	public Person(int zahl, int zahl2) {

	}

	public Person(String zahl, String zahl2) {

	}

//	Konstruktor Kette
	/**
	 * default Wert => Dummy
	 */
	public Person() {
		this("Dummy");
	}

	/**
	 * default wert -1
	 * 
	 * @param s
	 */
	public Person(String s) {
		this(s, -1);
	}

	/**
	 * default Werte => Dummy & -1
	 */
	public Person(String zahl, int zahl1) {
//		Initialisierung der Attribute für das Objekt 
		this.i = zahl1;
		this.st = zahl;
	}

//	Klassen Konstruktor
//	werden immer ausgeführt sobald das Programm gestartet wird
//	können nicht explizit aufgerufen werden
	static {
		zahl1 = 10;
	}

//	Methoden
//	Klassen Methoden | Objekt Methoden
//	Objekt Methoden arbeiten mit den Objekten dieser Klasse => mit den Eigenschaften(Attributen)
//	Modifier | sterotypen | Rückgabewert | Bezeichner | Parameterliste
//	Signatur => Modifier | sterotypen | Rückgabewert | Bezeichner | Parameterliste
//	Deklaration => Bezeichner | Parameterliste

	public void doStuff() {
//		Zugriff von überall => public
//		Rückgabewert => void => keiner => also wird das Schlüüselwort return hier nicht verwendet
//		Bezeichner => doStuff = Name der Methode
//		Parameterliste => in diesem Fall leer
	}

//	Überladung
	public void doStuff(int i) {
//		Überladung => bezieht sich nur auf die Deklaration => identischer Bezeichner => unterschiedliche Parameterlist
//		Jeder Parameter setzt sich aus Bezeichner und Datentypen zusammen
//		unterschiedliche Parameterlist bezioeht nicht auf den Bezeichner sondern auf den Datentypen
	}

//	public void doStuff(int x) {} // kein valide Überladung da der Typ identisch ist
	public void doStuff(String s) {
	}

//	public String doStuff(String s) {} // kein valide Überladung da der Typ identisch ist und der Retrun Typ nicht teil
	// der deklaration ist und somit auch nicht teil der Überladung

	public String doStuff(String s, int i) {
		return "";
	}

//	Klassen Methoden
	public static void doStuffForClass() {
//		kann über eine Objekt Referenz aufgerufen werden
//		zum Beispiel in der Main Methode 
//		Person p = new Person();
//		aufruf mit Objekt Referenz
//		p.doStuffForClass(); // p => ist die Referenz zum Objekt vom Typ Person
//		Aufruf ohne Objekt Referenz => mit dem Klassen namen => weil Methode gehört der Klasse
//		Person.doStuffForClass();
	}

//	Objekt Mehtoden => Getter Setter
//	Methoden welche entweder Eigenschaften von Objekt (manipulieren|setzten) oder bekommen
	public void setBool(boolean b) {
		this.bool = b;
	}

	public boolean getBool() {
		return this.bool;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move2() {
		// TODO Auto-generated method stub

	}

//	Überschreibende Methoden
//	Dies sind Methoden welche von der Basis Klasse überschrieben werden sollen. Wobei jeder Typ diese MEthode mit seiner eigenen Logik füllt
}
