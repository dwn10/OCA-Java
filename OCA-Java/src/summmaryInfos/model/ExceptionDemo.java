package summmaryInfos.model;

import java.io.*;

public class ExceptionDemo {

//	Exceptions => checked | unchecked
//	checked => müssen behandelt werden => try Catch | throws Klauseln
	public static int counter = 0;

	public void readFile(String filename) {
		File f = new File(filename);
		String[] arrForFileName = { "C:Desktop... .txt", "einAndererPfad.txt", "einweiter.txt" }; // Standart Pfade
																									// welche in jedem
																									// Fall eine Datei
																									// liefern
		try {
//			Potenziel gefährlicher Code und es muss gewährleistet weren das das Programm an dieser stelle nicht abbricht
			FileInputStream stream = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (counter >= 2) {
//				dann beende diesen durchlauf und geb die Information an den User zurück => Pfad zur datei kann nicht gefunden werdn
			} else {
				readFile(arrForFileName[counter]);
				counter++;
			}
		}
	}
// in der Methode readFile wird an ort undstelle der Fehler behandelt
//	hier wird der FEhler an die Aufrufende Methode weitergeleitet => siehe EntryPoint callExceptionWithThrow()
	public void throwException(String filename) throws FileNotFoundException {
		File f = new File(filename);
		String[] arrForFileName = { "C:Desktop... .txt", "einAndererPfad.txt", "einweiter.txt" };
		FileInputStream stream = new FileInputStream(f);
	}
}
