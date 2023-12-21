package summmaryInfos.aufgaben.loesungen;

import java.util.*;

//Interface für Produkte
interface Product {
	double getPrice();

	String getName();
}

//Klasse für Benutzer
class User {
	// Hier könntest du weitere Benutzerdetails und -funktionen hinzufügen
}

class SimpleProduct implements Product {
	private String name;
	private double price;

	public SimpleProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}
}

//Klasse für den Warenkorb
class Cart {
	List<Product> products;

	public Cart() {
		products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
		System.out.println(product.getName() + " added to cart.");
	}

	public void removeProduct(Product product) {
		products.remove(product);
		System.out.println(product.getName() + " removed from cart.");
	}

	public void viewCart() {
		System.out.println("Products in cart:");
		for (Product p : products) {
			System.out.println("- " + p.getName() + ": $" + p.getPrice());
		}
	}
}

//Beispiel zur Verwendung des Online-Shopping-Systems
public class Task8 {
	public static void main(String[] args) {
		// Erstelle ein paar Produkte
		Product product1 = new SimpleProduct("Laptop", 999.99);
		Product product2 = new SimpleProduct("Headphones", 49.99);

		// Erstelle einen Warenkorb und füge Produkte hinzu
		Cart cart = new Cart();
		cart.addProduct(product1);
		cart.addProduct(product2);

		// Zeige den Warenkorb an
		cart.viewCart();

		// Entferne ein Produkt und zeige den aktualisierten Warenkorb an
		cart.removeProduct(product1);
		cart.viewCart();
	}
}
