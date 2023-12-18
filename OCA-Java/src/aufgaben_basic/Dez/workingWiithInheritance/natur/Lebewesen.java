package workingWiithInheritance.natur;

public abstract class Lebewesen {

	public int alter;
	public long zellenAnzahl;

	public Lebewesen(int alter, long zallenAnzahl) {
		this.alter = alter;
		this.zellenAnzahl = zallenAnzahl;
	}

	@Override
	public String toString() {
		String sumInfo = "";
		for (int i = 0; i < this.getClass().getFields().length; i++) {
			sumInfo += this.getClass().getFields()[i].getName() + "\n";
		}
		return sumInfo;
	}
}
