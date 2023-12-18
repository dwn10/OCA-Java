package workingWiithInheritance.model.exampleAbstract;

import java.util.ArrayList;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wasserfahrzeug w = new Wasserfahrzeug(100);
		w.fortbewegen();
		System.out.println(w.ps);
		JetSki j = new JetSki(100);
		j.fortbewegen();
		System.out.println(j.ps);
		Auto a = new Auto(100, 120);
		a.fortbewegen();
		System.out.println(a.ps);

		ArrayList<Machine> machinen = new ArrayList<>();
		machinen.add(w);
		machinen.add(a);
		machinen.add(j);
		// abtsracte Klassen dienen als Schablone für gemeinsamkeiten welche Thematisch
		// zusammen hängen
//		Machine m = new Machine();
	}

}
