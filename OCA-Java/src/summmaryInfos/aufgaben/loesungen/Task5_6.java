package summmaryInfos.aufgaben.loesungen;

//Klasse Person mit privaten Attributen und Methoden für den Zugriff
class Person {
	private String name;
	private int age;
	private String address;

	// Konstruktor
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// Öffentliche Methoden zum Zugriff auf die Attribute
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

//Klasse BankAccount mit einem balance-Attribut (protected)
class BankAccount {
	protected double balance;

	// Konstruktor
	public BankAccount(double balance) {
		this.balance = balance;
	}

	// Öffentliche Methode zum Zugriff auf das balance-Attribut
	public double getBalance() {
		return balance;
	}

	// Öffentliche Methode zum Aktualisieren des balance-Attributs
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

//Beispiel für die Verwendung der Klassen
public class Task5_6 {
	public static void main(String[] args) {
		// Person-Objekt erstellen
		Person person = new Person("Max", 30, "123 Street");

		// Auf die Attribute der Person zugreifen und aktualisieren
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Address: " + person.getAddress());

		person.setName("John");
		person.setAge(35);
		person.setAddress("456 Avenue");

		System.out.println("Updated Info:");
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Address: " + person.getAddress());

		// BankAccount-Objekt erstellen
		BankAccount account = new BankAccount(1000.0);

		// Auf das balance-Attribut zugreifen und aktualisieren
		System.out.println("Balance: " + account.getBalance());

		account.setBalance(1500.0);

		System.out.println("Updated Balance: " + account.getBalance());
	}
}
