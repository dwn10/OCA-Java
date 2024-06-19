package projekte;

import java.util.Scanner;

public class DataConverterInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*******************************");
            System.out.println("Choose a data type to convert to Int:");
            System.out.println("1. Alpha a Int");
            System.out.println("2. BigInt a Int");
            System.out.println("3. Float a Int");
            System.out.println("4. Decimal a Int");
            System.out.println("5. Time a Int");
            System.out.println("6. Date a Int");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    convertAlphaToInt(scanner);
                    break;
                case 2:
                    convertBigIntToInt(scanner);
                    break;
                case 3:
                    convertFloatToInt(scanner);
                    break;
                case 4:
                    convertDecimalToInt(scanner);
                    break;
                case 5:
                    convertTimeToInt(scanner);
                    break;
                case 6:
                    convertDateToInt(scanner);
                    break;
                case 7:
                    System.out.println("Exiting converter...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void convertAlphaToInt(Scanner scanner) {
        System.out.print("Enter alpha value: ");
        String alphaValue = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(alphaValue);
            System.out.println("Converted Int value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error converting to Int: " + e.getMessage());
        }
    }

    private static void convertBigIntToInt(Scanner scanner) {
        System.out.print("Enter BigInt value: ");
        String bigIntValue = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(bigIntValue);
            System.out.println("Converted Int value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error converting to Int: " + e.getMessage());
        }
    }

    private static void convertFloatToInt(Scanner scanner) {
        System.out.print("Enter Float value: ");
        String floatValue = scanner.nextLine();

        try {
            int intValue = (int) Float.parseFloat(floatValue);
            System.out.println("Converted Int value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error converting to Int: " + e.getMessage());
        }
    }

    private static void convertDecimalToInt(Scanner scanner) {
        System.out.print("Enter Decimal value: ");
        String decimalValue = scanner.nextLine();

        try {
            int intValue = decimalValue.isEmpty() ? 0 : Integer.parseInt(decimalValue);
            System.out.println("Converted Int value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error converting to Int: " + e.getMessage());
        }
    }

    private static void convertTimeToInt(Scanner scanner) {
        System.out.print("Enter Time value (format HH:mm:ss): ");
        String timeValue = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(timeValue.replace(":", ""));
            System.out.println("Converted Int value (seconds): " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error converting to Int: " + e.getMessage());
        }
    }

    private static void convertDateToInt(Scanner scanner) {
        System.out.print("Enter Date value(format YYYY-MM-DD): ");
        String dateValue = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(dateValue.replace("-", ""));
            System.out.println("Converted Int value (format YYYYMMDD): " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error converting to Int: " + e.getMessage());
        }
    }
}
