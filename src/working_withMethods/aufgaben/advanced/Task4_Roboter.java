package working_withMethods.aufgaben.advanced;

public class Task4_Roboter {
	private int batterieLaufzeit;

	public Task4_Roboter() {
		this.batterieLaufzeit = 5;
	}

	public boolean istBatterieLaufzeitNiedrig() {
		return this.batterieLaufzeit < 2;
	}

	public void führeAufgabeAus() {
		if (!istBatterieLaufzeitNiedrig()) {
			System.out.println("Aufgabe: Ich reiche Butter.");
			this.batterieLaufzeit--;
		} else {
			System.out.println("Ich muss aufgeladen werden.");
		}
	}

	public static void main(String[] args) {
		Task4_Roboter roboter = new Task4_Roboter();

		for (int i = 0; i < 5; i++) {
			roboter.führeAufgabeAus();
		}
	}
}
