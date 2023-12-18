package workingWiithInheritance.model.complexInheritance;

public class Mama extends Mensch {

	public String haarfarbe;

	public String getHaarfarbe() {
		return haarfarbe;
	}

	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}

	public Mama(int alter, String haarfarbe) {
		super(alter);
		this.haarfarbe = haarfarbe;
	}

}
