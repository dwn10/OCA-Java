package workingWiithInheritance.model.exampleAbstract;

public abstract class Machine {

	public int ps;
	public int umdrehungen;

	/**
	 * Regel 1. Alle Klassen (auch abstracte) benötigen ihren eigenen
	 * Bauplan(Konstruktor) Regel 2. In Abstracten Klassen diesnt dieser jedoch
	 * nicht der Instanziierung sondern lediglich der Konstruktokette aus der
	 * Verbung
	 * 
	 * @param ps
	 * @param umdrehungen
	 */
	public Machine(int ps, int umdrehungen) {
		this.ps = ps;
		this.umdrehungen = umdrehungen;
	}

	public abstract void fortbewegen();
}
