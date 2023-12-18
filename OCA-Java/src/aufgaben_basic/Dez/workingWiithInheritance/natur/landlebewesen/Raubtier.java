package workingWiithInheritance.natur.landlebewesen;

import workingWiithInheritance.natur.Lebewesen;

public abstract class Raubtier extends Lebewesen{
	
	public int kannKgFressen;

	public Raubtier(int alter, long zallenAnzahl, int kannfressen) {
		super(alter, zallenAnzahl);
		// TODO Auto-generated constructor stub
		this.kannKgFressen = kannfressen;
	}

}
