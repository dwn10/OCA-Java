package summmaryInfos.model;

// Vererbung
// Vererbung einer Basisklasse => diese ist abstract
// Vererbung wir dmit dem Schlüsselwort extends gekennzeichnet
public class Person_VererbungSubKlasse extends Lebewesen {

//	Eigenschaft des Subtypen
	public int zahl;

	public Person_VererbungSubKlasse() {
//		sollte der Basistyp keinen Konstruktor selber defineren wird impliziet der default
//		Konstruktor des Basistypen aufgerufen => super() => aufruf des Konstruktors des Basistypen
//		sollte in der BasisKlasse ein default Konstruktor defniert sein muss nicht explizit der super() aufruf erfolgen
//		Aufruf des Konstruktors aus der Basisklasse
//		Wie auch bei den normalen Konstruktoren ist die Überladung jederzeit möglich
		super(3);
	}

	public Person_VererbungSubKlasse(int zahl, int zahlBasis) {
//		Aufruf von Super muss das erste Statement im Konstruktor sein
		super(zahlBasis);
//		this => ist das Schlüssewort für die aktuelle Objekt referenz => in der Main Methode 
//		=> Person_VererbungSubKlasse pe = new Person_VererbungSubKlasse(1,2);
//		=> this == pe => hier wird der Referenz aus der Main Methode => pe mittles this(pe ist im Konstruktor des Typen nicht vorhanden)
//		folglich wird hier die Referenz des AKTUELLEN OBJEKTES (pe) an this weitergegeben
		this.zahl = zahl;
	}

//	Annotation von @Override => ist nicht verpflichtend
//	=> gedacht als Information für den Entwickler => diese Methode kommt vom Basistypen
//	hier definieren wir eigene Logik für diesen Subtypen
	@Override
	public void doStuff2() {
		// TODO Auto-generated method stub

	}

}
