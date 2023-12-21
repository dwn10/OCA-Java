package summmaryInfos.aufgaben.loesungen;

//Abstrakte Klasse Shape
abstract class Shape {
	// Abstrakte Methode zur Berechnung der Fläche
	public abstract double calculateArea();
}

//Klasse Circle, die von Shape abgeleitet ist
class Circle extends Shape {
	private double radius;

	// Konstruktor für den Kreis
	public Circle(double radius) {
		this.radius = radius;
	}

	// Implementierung der calculateArea()-Methode für den Kreis
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

//Klasse Rectangle, die von Shape abgeleitet ist
class Rectangle extends Shape {
	private double width;
	private double height;

	// Konstruktor für das Rechteck
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Implementierung der calculateArea()-Methode für das Rechteck
	@Override
	public double calculateArea() {
		return width * height;
	}
}

//Beispiel der Verwendung
public class Task1_2 {
	public static void main(String[] args) {
		Circle2 circle = new Circle2(5.0);
		Rectangle rectangle = new Rectangle(4.0, 6.0);

		// Berechnung und Ausgabe der Fläche
		System.out.println("Fläche des Kreises: " + circle.calculateArea());
		System.out.println("Fläche des Rechtecks: " + rectangle.calculateArea());
	}
}
