package summmaryInfos.model;

// abstracte Klassen => dienen als Schablone für reale Typen
// sammlung an Eigenschaften welche meherer andere Klassen(Typen) als Basis nutzen
public abstract class Lebewesen {

//	Eigenschaften
	public int zahl = 1;
//	public abstract int zahl2 = 2; // abstarcte Eigenschaften gibt nicht

//	Konstruktor =>default Konstruktor => sollte dieser nicht defniert sein muss in der Subklasse
//	der Aufruf mittels super(Parameterliste des jeweiligen Konstruktors aus der Basisklasse) expliziet 
//	aufgerufen werden
//	public Lebewesen() {
//
//	}

	public Lebewesen(int zahl) {
		this.zahl = zahl;
	}

//	Sind Methoden welche Funktionalitäten inerhalb der Abtsracten Struktu bereitstellen
	public void doStuff(int i) {

	}

// Logik der Methode wird an die Subklassen weitergeleitet => muss dort überschrieben und mit Logik der Klasse gefüllt werden
	public abstract void doStuff2();
}
