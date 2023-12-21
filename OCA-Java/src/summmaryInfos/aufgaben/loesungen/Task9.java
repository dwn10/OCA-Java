package summmaryInfos.aufgaben.loesungen;

public class Task9 {
	public static void main(String[] args) {
		Warrior warrior = new Warrior("Krieger", 100, 20, 50);
		Mage mage = new Mage("Magier", 80, 15, 30);
		Archer archer = new Archer("Bogenschütze", 90, 18, 40);
		Rogue rogue = new Rogue("Schurke", 85, 22);

		// Angriffe zwischen den Charakteren
		warrior.displayInfo();
		mage.displayInfo();
		archer.displayInfo();
		rogue.displayInfo();

		warrior.attack(mage); // Krieger greift Magier an
		mage.attack(archer); // Magier greift Bogenschützen an
		archer.attack(rogue); // Bogenschütze greift Schurken an
		rogue.attack(warrior); // Schurke greift Krieger an

		// Anzeige aktualisierter Informationen nach den Angriffen
		warrior.displayInfo();
		mage.displayInfo();
		archer.displayInfo();
		rogue.displayInfo();
	}
}

class Warrior extends Character {
	private int stamina;

	public Warrior(String name, int health, int attackPower, int stamina) {
		super(name, health, attackPower);
		this.stamina = stamina;
	}

	@Override
	public void attack(Character enemy) {
		if (stamina >= 5) {
			enemy.takeDamage(attackPower);
			stamina -= 5;
			System.out.println(name + " führt einen Angriff aus!");
		} else {
			System.out.println("Nicht genug Ausdauer für einen Angriff!");
		}
	}

	// Zusätzliche Methoden oder Eigenschaften spezifisch für Krieger
}

class Mage extends Character {
	private int mana;

	public Mage(String name, int health, int attackPower, int mana) {
		super(name, health, attackPower);
		this.mana = mana;
	}

	@Override
	public void attack(Character enemy) {
		if (mana >= 10) {
			enemy.takeDamage(attackPower * 2);
			mana -= 10;
			System.out.println(name + " wirkt einen Zauberspruch!");
		} else {
			System.out.println("Nicht genug Mana für einen Zauberspruch!");
		}
	}
	 // Zusätzliche Methoden oder Eigenschaften spezifisch für Magier
}

class Archer extends Character {
	private int arrows;

	public Archer(String name, int health, int attackPower, int arrows) {
		super(name, health, attackPower);
		this.arrows = arrows;
	}

	@Override
	public void attack(Character enemy) {
		if (arrows > 0) {
			enemy.takeDamage(attackPower);
			arrows--;
			System.out.println(name + " schießt einen Pfeil!");
		} else {
			System.out.println("Keine Pfeile mehr übrig!");
		}
	}

	// Zusätzliche Methoden oder Eigenschaften spezifisch für den Bogenschützen
}

class Rogue extends Character {
	private boolean isHidden;

	public Rogue(String name, int health, int attackPower) {
		super(name, health, attackPower);
		this.isHidden = false;
	}

	@Override
	public void attack(Character enemy) {
		if (!isHidden) {
			enemy.takeDamage(attackPower * 3);
			isHidden = true;
			System.out.println(name + " führt einen hinterhältigen Angriff aus!");
		} else {
			enemy.takeDamage(attackPower);
			System.out.println(name + " greift erneut an!");
		}
	}

	public void setHidden(boolean hidden) {
		isHidden = hidden;
	}

	// Zusätzliche Methoden oder Eigenschaften spezifisch für den Schurken
}

abstract class Character {
	protected String name;
	protected int health;
	protected int attackPower;

	public Character(String name, int health, int attackPower) {
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
	}

	public abstract void attack(Character enemy);

	public void takeDamage(int damage) {
		health -= damage;
		if (health <= 0) {
			System.out.println(name + " wurde besiegt!");
		}
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Health: " + health);
		System.out.println("Attack Power: " + attackPower);
	}
}
