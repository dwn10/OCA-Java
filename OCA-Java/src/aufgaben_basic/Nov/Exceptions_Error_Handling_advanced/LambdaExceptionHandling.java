package aufgaben_basic.Nov.Exceptions_Error_Handling_advanced;

/* Aufgabe: Behandlung von Checked Exceptions in Lambdas  Verwende
Lambdas und behandle Checked Exceptions mithilfe von try-catch innerhalb des Lambda-Ausdrucks.  */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LambdaExceptionHandling {
    public static void main(String[] args) {
        String fileName = "file.txt";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(line -> {
                try {
                    // Do something that may throw an IOException
                } catch (IOException e) {
                    System.err.println("IOException caught: " + e.getMessage());
                }
            });
        } catch (IOException e) {
            System.err.println("IOException caught: " + e.getMessage());
        }
    }
}
