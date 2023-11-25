package datentypen.aufgaben.com;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int z1 = rnd.nextInt();
		int z2 = rnd.nextInt();
		int z3 = rnd.nextInt();
		int z4 = rnd.nextInt();
		int z5 = rnd.nextInt();
		int z6 = rnd.nextInt();

		int[] numbers = { z1, z2, z3, z4, z5, z6 };

		// Bubble Sort
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

		System.out.println("Zahlen in aufsteigender Reihenfolge:");
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
