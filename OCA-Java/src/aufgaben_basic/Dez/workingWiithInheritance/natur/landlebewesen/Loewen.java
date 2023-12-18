package workingWiithInheritance.natur.landlebewesen;

public class Loewen extends Raubtier {

	public String lebensraum;

	public Loewen(int alter, long zallenAnzahl, int kannfressen, String lebensraum) {
		super(alter, zallenAnzahl, kannfressen);
		// TODO Auto-generated constructor stub
		this.lebensraum = lebensraum;
	}

}
