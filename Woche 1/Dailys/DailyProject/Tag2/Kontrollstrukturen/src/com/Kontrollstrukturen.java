package com;

public class Kontrollstrukturen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Verzweigung => einseitig
		// Schlüsselwort(if) | Bedingung (boolscher Wert) | Scope {}
		if (true) {

		}

		// zweiseitige Verzweigung
		if (true) {

		} else {

		}
		// Kurzschreibweise zweiseitige Verzweigung
		// Tenärer Operator
		// left Hand | Right Hand
		// Bedigung ? Ergebnis bei True : Ergebnis bei false
		String result = 1 >= 10 ? "größer" : "kleiner";

		// Kurzschreibweise zweiseitige Verzweigung
		// diese Variante kann nur eine Anweisung entgegen nehmen
		if (true)
			System.out.println("True");
		else
			System.out.println("False");

		// Mehrseitige Verzweigungen
		int i = 10;
		int i2 = 5;
		if (i > i2) {

		} else if (i < i2) {

		} else {
			System.out.println("sind gleich");
		}

		switch (i) {
		case 1:
			System.out.println("ist gleich 1");
			break;
		case 2:
			System.out.println("ist gelich 2");
			break;
		}
		
		// Switch Case
		// Linke Hand der Bollschen Validierung
		// linke und Recht Hand nur auf Gleichheit prüfen kann
		switch(1) {
		// Recht hand der boolschne Validierung
		case 1:
			// Anweisungen Ausführen
			System.out.println("ich bin 1");
			// zum beenden des Switch Case
			break;
		}
		// Beispiel für Break
		int switch_i = 10;
		switch(switch_i) {
		case 1:
			System.out.println("ich bin 1");
			break;
		case 2:
			System.out.println("ich bin 2");
			break;
		case 3:
			System.out.println("ich bin 3");
			break;
		default:
			System.out.println("wurde nicht gefunden");
			break;
		}
		 
		// Schleifen
		// for | while | do while | foreach
		// Range von zähler bis Abbruchbedingung mit der Schrittweite durchlaufen
		for(int j = 0; j < 10; j = j +100 ) {
			
		}

	}

}
