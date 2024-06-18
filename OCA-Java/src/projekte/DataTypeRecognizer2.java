package projekte;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class DataTypeRecognizer2 {

    public static void main(String[] args) {
        String input = "1234"; // Replace with user input
        recognizeDataType(input);
    }

    public static void recognizeDataType(String input) {
        try {
            // Check for Integer
            int intValue = Integer.parseInt(input);
            System.out.println("\n********************************");
            System.out.println("Input is an Integer: " + intValue);
            return;
        } catch (NumberFormatException e) {
            // Not an Integer
        }

        try {
            // Check for Long (BigInteger)
            long longValue = Long.parseLong(input);
            System.out.println("\n********************************");
            System.out.println("Input is a Long (BigInteger): " + longValue);
            return;
        } catch (NumberFormatException e) {
            // Not a Long
        }

        try {
            // Check for Decimal (BigDecimal)
            BigDecimal decimalValue = new BigDecimal(input);
            System.out.println("\n********************************");
            System.out.println("Input is a Decimal (BigDecimal): " + decimalValue);
            return;
        } catch (NumberFormatException e) {
            // Not a Decimal
        }

        try {
            // Check for Float
            float floatValue = Float.parseFloat(input);
            System.out.println("\n********************************");
            System.out.println("Input is a Float: " + floatValue);
            return;
        } catch (NumberFormatException e) {
            // Not a Float
        }

        try {
            // Check for Date (LocalDate)
            LocalDate dateValue = LocalDate.parse(input);
            System.out.println("\n********************************");
            System.out.println("Input is a Date (LocalDate): " + dateValue);
            return;
        } catch (Exception e) {
            // Not a Date
        }

        try {
            // Check for Time (LocalTime)
            LocalTime timeValue = LocalTime.parse(input);
            System.out.println("\n********************************");
            System.out.println("Input is a Time (LocalTime): " + timeValue);
            return;
        } catch (Exception e) {
            // Not a Time
        }

        // If none of the above conversions succeed, it's likely an Alpha (String)
        System.out.println("Input is an Alpha (String): " + input);
    }
}
