package summmaryInfos.model;

import summmaryInfos.controller.IMovable;

// Erweitern des Subtypen um funktionalitäten des Basistypen
// SChlüsselwort ist implements + Interface(IMovable)
public class Person_ImplemtiertBasisTypenInterface implements IMovable {

//	Überschreiben der Methoden aus dem Basistypen
	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move2() {
		// TODO Auto-generated method stub
	}

// Kontrllstrukturen
//  Verzweigung => if = EinseitigVerzweigung | if else = ZweiseitigeVerzweigung | 
//	if else if else sowie switch Case = MewhrseitigeVerzweigungen
//	Schleifen
//	2 Arten von Schleifen
//	Kopfgesteuert
//	foreach (element gesteuerte Schleife) | while (Wahrheitsgetseuerte Schleife) | for (Zählergesteuert(Iterator))
//	Fußgesteuerte Schleifen
//	do while (Wahrheitsgetseuerte Schleife)
//	try Catch => behandlung Exceptions und errors
	public void verzweigungen() {
//		if = EinseitigVerzweigung
//		Schlüsselwort if + (Bedingung)
		if (true) { // wenn in der Bedingung auf true Evaluiert dann wird der Scope(Body) des if
					// betreten und ausgeführt

		}
//		if else = ZweiseitigeVerzweigung
		if (false) { // sollte die Bedingung nicht auf true evaluieren und es existiert ein else
						// Fall wird diese ausgeführt

		} else {

		}
//		if else if else sowie switch Case = MewhrseitigeVerzweigungen
//		soltte der erste Fall im if nicht auf true evaluieren =< wird der zwerite Fall geprüft(if else)
		boolean state1 = true;
		boolean state2 = false;
		if (state2) {

		} else if (state1) {

		} else {

		}
//		kann nur auf Gleichheit prüfen
//		=> in jedem Case wird das Switch Statement(Parameter) mit dem Cas Paramter auf gleichheit geprüft
		int i = 29;
		switch (i) {
		case 30:// ist i == 30 => ist 29 == 30 = false => dieser Block wird übersprungen zum
				// nächtsen case
			break;
		case 29: // ist i == 29 => 29 == 29 = true => dieser Block wird ausgeführt, sollte dasd
					// Schlüsselwort break;
//			den Case nicht beenden so wird der nächste ohne Prüfung auf gleichheit ausgeführt bis ein break; definiert ist
			break;
		default:
//			dieser Block ist das eqivalent zum else in der Verzweigung
//			(nur mit dem Unterschied das dieser immer ausgeführt wird und im else die Logik umgekehrt ist)
		}
	}

	public void schleifen() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
//		Zählergetseuerte Schleife
//		Zählerdefinition und initalisierung ; Abbruchbedingung ; Update(Iterator) => standart ist Inkrement oder Dekrement 
		for (int i = 0; i < arr.length; i++) {

		}
		int j = 0;
		for (; j < arr.length; j++) {

		}
		for (int i = 0; i < arr.length;) {

		}
		for (int i = 0; i < arr.length; i += 10) {

		}
		int l = 0;
		for (;;) {
			l++;
			if (l == 10)
				break; // schlüsselwort für Schleifen
//			break => dient zum erzwingen das die Schleife sofort verlassen wird
//			continue => springt in die nächste Iterration
		}
// definition der Abbruchbedingung => diese Schleife kann auch nicht betreten werden
		while (arr.length < 10) {

		}
//		Wird immer mindesten 1x ausgeführt
		do {
		} while (arr.length < 10);
	}
	
	public void tryCatch() {
		// finden sie in der Klasse ExceptionDemo
	}
}
