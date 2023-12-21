package summmaryInfos.aufgaben.loesungen;

//Vehicle Interface
interface Vehicle {
	void start();

	void stop();

	void accelerate();
}

//Car Class implementing Vehicle Interface
class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating");
	}

	// Other specific functionalities for Car can be added here
}

//Bike Class implementing Vehicle Interface
class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("Bike started");
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("Bike is accelerating");
	}

	// Other specific functionalities for Bike can be added here
}

//Truck Class implementing Vehicle Interface
class Truck implements Vehicle {
	@Override
	public void start() {
		System.out.println("Truck started");
	}

	@Override
	public void stop() {
		System.out.println("Truck stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("Truck is accelerating");
	}

	// Other specific functionalities for Truck can be added here
}

//GeometricObject Interface
interface GeometricObject {
	double calculateArea();

	double calculatePerimeter();
}

//Circle Class implementing GeometricObject Interface
class Circle2 implements GeometricObject {
	private double radius;

	public Circle2(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}

//Square Class implementing GeometricObject Interface
class Square implements GeometricObject {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}

	@Override
	public double calculatePerimeter() {
		return 4 * side;
	}
}

//Beispiel für die Verwendung der Klassen und Interfaces
public class Task3_4 {
	public static void main(String[] args) {
		// Verwendung der Vehicle Klassen
		Vehicle car = new Car();
		car.start();
		car.accelerate();
		car.stop();

		Vehicle bike = new Bike();
		bike.start();
		bike.accelerate();
		bike.stop();

		Vehicle truck = new Truck();
		truck.start();
		truck.accelerate();
		truck.stop();

		// Verwendung der GeometricObject Klassen
		GeometricObject circle = new Circle2(5.0);
		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

		GeometricObject square = new Square(4.0);
		System.out.println("Square Area: " + square.calculateArea());
		System.out.println("Square Perimeter: " + square.calculatePerimeter());
	}
}
