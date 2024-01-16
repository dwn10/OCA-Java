package schreibtischtest.Dez.BasisklasseRobot;

public class EntryPoint {

	public static void main(String[] args) {
		Terminator T800 = new Terminator("T-800", true, "Sarah Connor");

		Transformer OptimusPrime = new Transformer("Orion Pax", false, "Autobot");

		Android BicentennialMan = new Android("Andrew", false, true);

		System.out.printf("%s, isHostile: %s, Target: %s%n", T800.getName(), T800.isHostile(), T800.getTargetName());
		System.out.printf("%s, isHostile: %s, Faction: %s%n", OptimusPrime.getName(), OptimusPrime.isHostile(),
				OptimusPrime.getFaction());
		System.out.printf("%s, isHostile: %s, isHuman: %s%n", BicentennialMan.getName(), BicentennialMan.isHostile(),
				BicentennialMan.isHuman());

	}

}
