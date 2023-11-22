// Kommentar einzeilig
/*
 * mehrzeiliger Kommentar
 * */
// Packages sind immer teil der Pfad Struktur
package com;


// import stellt die Möglichkeit bereit, Thematische Inhalte in meine Projekt zu intigireieren
import java.sql.DriverManager;
//entfernen nicht benötigter imports strg + shift + o
import java.sql.*;

import com.de.la.*;
import com.de.*;

/**
 * @author flori
 * Dies ist eine Klasse für die Main Methode und dient als Einstiegspunkt
 * siehe Methode doStuff()
 */
/*
 * Jede Datei endet mit dem Dateikürzel .java
 * Jede Datei enthält eine public class welche den gleichen Namen wie die Datei hat
 * Jede Datei kann beliebig viel Klassen halten jedoch nur ein public!!!!
 * */
public class EntryPoint{
	/**
	 * Doku Kommentare sind in der IDE auch als Erläuterung Verfügbar
	 * @param args => Dies sind die Übergabe werte für Methoden oder Funkltionen
	 * welche in derjenigen zur Verfügung gestellt werden müssen
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hallo Welt");
		DriverManager m;
		/*
		 * Bei Namens Gleichheit => Bitte immer Vermeiden(wenn es geht)
		 * kann aber trotzdem über den Voll Pfad diese Klasse angesprochen werden 
		 * jedoch nicht im Import*/
		com.de.Dummy d = new com.de.Dummy();
		com.de.la.Dummy x = new com.de.la.Dummy();
		
	}

	/**
	 * Diese Methode dient dem Print von doStuff
	 * @author flori
	 * @param int x
	 * 
	 */
	public static void doStuff(int x) {
		System.out.println("Print from DoStuff");
	}
}
/*
 * Solange keine weiter Klasse mit dem Schlüüslewort public beginnt könne wir so vile 
 * Klassen erstellen wie wir wollen
 * */
//class Dummy{}
class Dummy2{}