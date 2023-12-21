package summmaryInfos;

import java.io.FileNotFoundException;

import summmaryInfos.model.ExceptionDemo;
import summmaryInfos.model.Operatoren;
import summmaryInfos.model.Person_modifier;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// instanceOf
		Operatoren p = new Operatoren();
		p.instanceOf();
//		Modifier
		Person_modifier pm = new Person_modifier(0, "Florian", "Berlin", "Schaffer", "Deutschland");
//		public  => überall Sichtbar
		System.out.println(pm.name);
//		protected => package private + Vererbung
//		System.out.println(pm.nachname); // geht hier nicht
//		private => ist nur in dieser Klasse Sichtbar
//		System.out.println(pm.stadt); // Siehe nested Class in Person_modifier
//		default => package priavte
//		System.out.println(pm.land);
	}

	public void callExceptionWithThrow() {
//		Die Aufrufende Methode muss den Fehler behandeln
		ExceptionDemo ex = new ExceptionDemo();
		try {
			ex.throwException("Dummy.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
