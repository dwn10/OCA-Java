package workingWiithInheritance.model.exampleAbstract;

public class Wasserfahrzeug extends Machine {

	public int knotenProStunde;
	
	public Wasserfahrzeug(int knotenProStunde) {
		super(knotenProStunde, knotenProStunde);
		this.knotenProStunde = knotenProStunde;
	}

	@Override
	public void fortbewegen() {
		// TODO Auto-generated method stub
		System.out.println("ich bewege mich auf dem Wasser");
	}

	

}
