package summmaryInfos.aufgaben.loesungen;

//Interface für Fahrzeuge
interface Fahrzeug {
	void fahren();

	void tanken();
}

//Abstrakte Klasse für Fahrzeuge
abstract class FahrzeugBase implements Fahrzeug {
	private String kennzeichen;
	private String marke;

	public FahrzeugBase(String kennzeichen, String marke) {
		this.kennzeichen = kennzeichen;
		this.marke = marke;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public String getMarke() {
		return marke;
	}
}

//Klasse für Autos
class Auto extends FahrzeugBase {
	private int anzahlSitze;

	public Auto(String kennzeichen, String marke, int anzahlSitze) {
		super(kennzeichen, marke);
		this.anzahlSitze = anzahlSitze;
	}

	@Override
	public void fahren() {
		System.out.println("Auto fährt.");
	}

	@Override
	public void tanken() {
		System.out.println("Auto wird getankt.");
	}

	public int getAnzahlSitze() {
		return anzahlSitze;
	}
}

//Klasse für Fahrräder
class Fahrrad extends FahrzeugBase {
	private int anzahlGänge;

	public Fahrrad(String kennzeichen, String marke, int anzahlGänge) {
		super(kennzeichen, marke);
		this.anzahlGänge = anzahlGänge;
	}

	@Override
	public void fahren() {
		System.out.println("Fahrrad fährt.");
	}

	@Override
	public void tanken() {
		System.out.println("Fahrrad benötigt keinen Treibstoff.");
	}

	public int getAnzahlGänge() {
		return anzahlGänge;
	}
}

class Motorrad extends FahrzeugBase {
	private String motorTyp;

	public Motorrad(String kennzeichen, String marke, String motorTyp) {
		super(kennzeichen, marke);
		this.motorTyp = motorTyp;
	}

	@Override
	public void fahren() {
		System.out.println("Motorrad fährt.");
	}

	@Override
	public void tanken() {
		System.out.println("Motorrad wird getankt.");
	}

	public String getMotorTyp() {
		return motorTyp;
	}
}

//Beispielanwendung für die Fahrzeugverwaltung
public class Task10_v1 {
	public static void main(String[] args) {
		Auto auto = new Auto("ABC123", "BMW", 5);
		Fahrrad fahrrad = new Fahrrad("XYZ789", "Giant", 7);
		Motorrad motorrad = new Motorrad("DEF456", "Harley", "Verbrenner");

		// Verwendung der Fahrzeuge
		System.out.println("Auto: " + auto.getMarke() + " mit " + auto.getAnzahlSitze() + " Sitzen.");
		auto.fahren();
		auto.tanken();

		System.out.println("Fahrrad: " + fahrrad.getMarke() + " mit " + fahrrad.getAnzahlGänge() + " Gängen.");
		fahrrad.fahren();
		fahrrad.tanken();

		System.out.println("Motorrad: " + motorrad.getMarke() + " mit Motor Typ " + motorrad.getMotorTyp());
		motorrad.fahren();
		motorrad.tanken();
	}
}
