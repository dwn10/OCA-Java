package workingWiithInheritance.model.exampleAbstract;

public class Auto extends Machine {

	public Auto(int ps, int umdrehungen) {
		super(ps, umdrehungen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fortbewegen() {
		// TODO Auto-generated method stub
		System.out.println("Ich fahre auf der Straße");
	}

}
