package summmaryInfos.controller;

// Sruktur Interface
//stellt Funktionalitäten bereit ohne diese mit Logik zu füllen
//stellt somit hüllen bereit => Methoden Signaturen
public interface IMovable {
// Signatur => modifier | sterotypen | Rückgabewert | Bezeichner | Parameterliste
//	per default sind im Interface alle Methoden abstract
	public void move();

	public abstract void move2();

//	statische Methoden werden in Interfaces mit Body definiert
	public static void move3() {
	}
}
