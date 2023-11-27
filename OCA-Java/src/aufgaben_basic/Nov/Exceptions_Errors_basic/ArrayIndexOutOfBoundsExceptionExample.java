package aufgaben_basic.Nov.Exceptions_Errors_basic;

// Aufgabe: ArrayIndexOutOfBoundsException
// Erstelle ein Array und versuche, auf ein Element zuzugreifen, das außerhalb des gültigen Index liegt.

// Klassendeklaration
public class ArrayIndexOutOfBoundsExceptionExample {

    // Hauptmethode
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        // Zugriff auf ein Element außerhalb des gültigen Index
        System.out.println("Element at index 3: " + arr[3]);
    }
}
