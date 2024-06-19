package projekte;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataConverterAlpha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n***************************************");
            System.out.println("Choose a data type to convert to alpha:");
            System.out.println("1. Alpha");
            System.out.println("2. Integer");
            System.out.println("3. BigInt");
            System.out.println("4. Float");
            System.out.println("5. Decimal");
            System.out.println("6. Time");
            System.out.println("7. Date");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    convertAlphaToAlpha(scanner);
                    break;
                case 2:
                    convertIntegerToAlpha(scanner);
                    break;
                case 3:
                    convertBigIntToAlpha(scanner);
                    break;
                case 4:
                    convertFloatToAlpha(scanner);
                    break;
                case 5:
                    convertDecimalToAlpha(scanner);
                    break;
                case 6:
                    convertTimeToAlpha(scanner);
                    break;
                case 7:
                    convertDateToAlpha(scanner);
                    break;
                case 0:
                    System.out.println("Exiting converter...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void convertAlphaToAlpha(Scanner scanner) {
        System.out.print("Enter alpha value: ");
        String alphaValue = scanner.nextLine();
        System.out.println("Converted alpha value: " + alphaValue);
    }

    private static void convertIntegerToAlpha(Scanner scanner) {
        System.out.print("Enter integer value: ");
        int intValue = scanner.nextInt();
        String alphaValue = String.valueOf(intValue);
        System.out.println("Converted alpha value: " + alphaValue);
    }

    private static void convertBigIntToAlpha(Scanner scanner) {
        System.out.print("Enter BigInt value: ");
        java.math.BigInteger bigIntValue = scanner.nextBigInteger();
        String alphaValue = bigIntValue.toString();
        System.out.println("Converted alpha value: " + alphaValue);
    }

    private static void convertFloatToAlpha(Scanner scanner) {
        System.out.print("Enter float value: ");
        float floatValue = scanner.nextFloat();
        String alphaValue = String.valueOf(floatValue);
        System.out.println("Converted alpha value: " + alphaValue);
    }

    private static void convertDecimalToAlpha(Scanner scanner) {
        System.out.print("Enter decimal value: ");
        double decimalValue = scanner.nextDouble();
        String alphaValue = String.valueOf(decimalValue);
        System.out.println("Converted alpha value: " + alphaValue);
    }

    private static void convertTimeToAlpha(Scanner scanner) {
        System.out.print("Enter time (HH:mm:ss) in format HH:mm:ss: ");
        String timeString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try {
            java.time.LocalTime time = java.time.LocalTime.parse(timeString, formatter);
            String alphaValue = time.toString();
            System.out.println("Converted alpha value: " + alphaValue);
        } catch (Exception e) {
            System.out.println("Invalid time format. Please enter time in HH:mm:ss format.");
        }
    }

    private static void convertDateToAlpha(Scanner scanner) {
        System.out.print("Enter date (yyyy-MM-dd) in format yyyy-MM-dd: ");
        String dateString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            java.time.LocalDate date = java.time.LocalDate.parse(dateString, formatter);
            String alphaValue = date.toString();
            System.out.println("Converted alpha value: " + alphaValue);
        } catch (Exception e) {
            System.out.println("Invalid time format. Please enter time in yyyy-MM-dd.");
        }
    }
}
