package schreibtischtest.Dez.BasisklasseRobot;

class Android extends Robot {
	private boolean isHuman;

	public boolean isHuman() {
		return isHuman;
	}

	public Android(String name, boolean isHostile, boolean isHuman) {
		super(name, isHostile);
		this.isHuman = isHuman;
	}
}
