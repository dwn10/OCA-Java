package summmaryInfos.aufgaben.loesungen;

//Interface für spielbare Instrumente
interface Playable {
	void play();
}

//Abstrakte Klasse Instrument, die das Interface implementiert
abstract class Instrument implements Playable {
	// Abstrakte Methode für jedes Instrument
	public abstract void play();
}

//Klasse Guitar, die von Instrument abgeleitet ist
class Guitar extends Instrument {
	@Override
	public void play() {
		System.out.println("Playing the guitar");
		// Hier implementierst du die spezifische Logik für das Gitarrenspiel
	}
}

//Klasse Piano, die von Instrument abgeleitet ist
class Piano extends Instrument {
	@Override
	public void play() {
		System.out.println("Playing the piano");
		// Hier implementierst du die spezifische Logik für das Klavierspiel
	}
}

//Beispiel zur Verwendung der Instrumente
public class Task7 {
	public static void main(String[] args) {
		Instrument guitar = new Guitar();
		Instrument piano = new Piano();

		guitar.play(); // Ausgabe: Playing the guitar
		piano.play(); // Ausgabe: Playing the piano
	}
}
