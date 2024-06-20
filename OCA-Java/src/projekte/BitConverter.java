/* Das Java-Programm dient zur Erkennung von Datentypen und zur Anzeige der Anzahl der Bits,
die sie belegen. Es verwendet reguläre Ausdrücke (Regex),
um den eingegebenen Wert mit Mustern für verschiedene Typen wie Alpha (String),
Integer, Dezimalzahl (Double), Float, Datum (JJJJ-MM-TT) und Zeit (HH:mm:ss) abzugleichen.

Wenn eine Übereinstimmung gefunden wird, gibt das Programm den erkannten Datentyp aus,
sowie die Anzahl der Bits, die er belegt. Bei Datums- und Zeitwerten werden die entsprechenden
Formate LocalDate und LocalTime verwendet, und das Programm gibt den analysierten Wert aus.
Für diese Typen ist die Anzahl der Bits variabel und abhängig von der Implementierung, daher wird "N/A" ausgegeben.

Das Programm fragt den Benutzer nach jeder Eingabe, ob er fortfahren möchte,
und beendet sich, wenn die Antwort nicht "y" (Ja) ist.

Der Code beinhaltet auch eine Fehlerbehandlung für ungültige Datums- und Zeitformate,
und eine allgemeine Meldung für nicht erkannte Datentypen.
 */

package projekte;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class BitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\n*****************");
            System.out.print("Enter a value: ");
            String input = scanner.nextLine();

            // Check for Alpha (characters)
            if (input.matches("[a-zA-Z]+")) {
                System.out.println("Input is an: Alpha (String)");
                System.out.println("Bits: " + (input.length() * Character.SIZE)); // String bits
            }
            // Check for Integer
            else if (input.matches("-?\\d+")) {
                System.out.println("Input is an: Integer");
                System.out.println("Bits: " + Integer.SIZE); // Integer bits
            }
            // Check for Decimal (double)
            else if (input.matches("-?\\d+\\.\\d+")) {
                System.out.println("Input is a: Decimal (double)");
                System.out.println("Bits: " + Double.SIZE); // Double bits
            }
            // Check for Float
            else if (input.matches("-?\\d+(\\.\\d+)?(e[+-]?\\d+)?[fFdD]?")) {
                System.out.println("Input is a: Float");
                System.out.println("Bits: " + Float.SIZE); // Float bits
            }
            // Check for Date (YYYY-MM-DD)
            else if (input.matches("\\d{4}-\\d{2}-\\d{2}")) {
                try {
                    LocalDate date = LocalDate.parse(input);
                    System.out.println("Input is a: Date");
                    System.out.println("Bits: N/A (variable, implementation dependent)"); // LocalDate bits
                    System.out.println("Date: " + date);
                } catch (Exception e) {
                    System.out.println("Non-valid date format.");
                }
            }
            // Check for Time (HH:mm:ss)
            else if (input.matches("\\d{2}:\\d{2}:\\d{2}")) {
                try {
                    LocalTime time = LocalTime.parse(input);
                    System.out.println("Input is a: Time");
                    System.out.println("Bits: N/A (variable, implementation dependent)"); // LocalTime bits
                    System.out.println("Time: " + time);
                } catch (Exception e) {
                    System.out.println("Non-valid time format.");
                }
            }
            // If none of the above conditions match, it's an invalid input
            else {
                System.out.println("Type of data not recognized.");
            }

            // Ask the user if they want to continue
            System.out.print("Continue? (y/n): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                continueProgram = false;
            }
        }

        System.out.println("Exit bye...");
        scanner.close();
    }
}
