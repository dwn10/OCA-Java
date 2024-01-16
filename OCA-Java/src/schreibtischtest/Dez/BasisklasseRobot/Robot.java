package schreibtischtest.Dez.BasisklasseRobot;

public abstract class Robot {
	private String name;
	private boolean isHostile;

	public Robot(String name, boolean isHostile) {
		this.name = name;
		this.isHostile = isHostile;
	}

	public String getName() {
		return name;
	}

	public boolean isHostile() {
		return isHostile;
	}

}
