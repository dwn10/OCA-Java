package summmaryInfos.model;

import summmaryInfos.controller.IMovable;

public class Person_modifier extends Lebewesen implements IMovable {

	public String name;
	private String stadt;
	protected String nachname;
	String land;

	/**
	 * default => name = Berlin default => stadt = Berlin default => nachname =
	 * Berlin
	 * 
	 * @param zahl
	 */
	public Person_modifier(int zahl) {
		super(zahl);
//		this(zahl, "Berlin", "Berlin", "Berlin"); Konsttruktor call super this in Konstruktor Kette
		// TODO Auto-generated constructor stub
	}

	public Person_modifier(int zahl, String name, String stadt, String nachname, String land) {
		super(zahl);
		this.nachname = nachname;
		this.name = name;
		this.stadt = stadt;
		this.land = land;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doStuff2() {
		// TODO Auto-generated method stub

	}

}

class DummyForPrivateModifier {
	public void doStuff() {
//		Ohne Objekt Ref geht das nicht
//		stadt = "München";
		Person_modifier p = new Person_modifier(100, "Florian", "Berlin", "Schaffer", "Deutschland");
//		p.stadt = "München"; // ist auch nicht Sichtbar
	}
}

class DummyFroProtectedModifier {
	public void doStuff() {
//	nachname = "Heinz"; // nicht möglich ohne Objekt ref
		Person_modifier p = new Person_modifier(100, "Florian", "Berlin", "Schaffer", "Deutschland");
		p.nachname = "Heinz";
	}
}

class DummyForDefaultModifier {
	public void doStuff() {
		Person_modifier p = new Person_modifier(100, "Florian", "Berlin", "Schaffer", "Deutschland");
		p.land = "Hallo";
	}
}
