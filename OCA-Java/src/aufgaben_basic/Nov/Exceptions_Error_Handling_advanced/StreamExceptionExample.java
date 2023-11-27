package aufgaben_basic.Nov.Exceptions_Error_Handling_advanced;

/* Aufgabe: Exceptions und Streams  Verwende Streams und führe Operationen aus, die Exceptions werfen könnten. */

import java.util.Arrays;
import java.util.List;

public class StreamExceptionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "a", "b", "c");

        try {
            strings.stream()
                    .map(Integer::parseInt)
                    .forEach(System.out::println);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
