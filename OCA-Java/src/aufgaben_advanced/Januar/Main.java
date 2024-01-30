package aufgaben_advanced.Januar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Erstelle eine Integer-Wrapper-Klasse mit dem Wert 42.
        Integer integer = new Integer(42);

        // 2. Konvertiere einen Integer-Wert in einen String.
        String integerString = integer.toString();

        // 3. Überprüfe, ob ein Double-Wert NaN (Not a Number) ist.
        Double doubleValue = Double.NaN;
        boolean isDoubleNaN = doubleValue.isNaN();

        // 4. Erzeuge einen Long-Wert durch das Parsen eines Strings.
        System.out.print("Enter a long value: ");
        String longString = scanner.nextLine();
        Long longValue = Long.parseLong(longString);

        // 5. Multipliziere zwei Float-Werte mithilfe der Wrapper-Klassen.
        Float float1 = new Float(3.14);
        Float float2 = new Float(2.71);
        Float floatProduct = float1 * float2;

        // 6. Überprüfe, ob ein Boolean-Wert "true" ist.
        Boolean booleanValue = new Boolean(true);
        boolean isBooleanTrue = booleanValue.booleanValue();

        // 7. Addiere zwei Integer-Werte mithilfe der Wrapper-Klassen.
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(20);
        Integer integerSum = integer1 + integer2;

        // 8. Erstelle eine Character-Wrapper-Klasse mit dem Buchstaben 'A'.
        Character character = new Character('A');

        // 9. Konvertiere einen String in einen Double-Wert.
        System.out.print("Enter a double value: ");
        String doubleString = scanner.nextLine();
        Double doubleValueFromString = Double.parseDouble(doubleString);

        // 10. Überprüfe, ob ein Boolean-Wert "false" ist.
        Boolean booleanValue2 = new Boolean(false);
        boolean isBooleanFalse = booleanValue2.booleanValue();

        // 11. Addiere zwei Double-Werte mithilfe der Wrapper-Klassen.
        Double double1 = new Double(3.14);
        Double double2 = new Double(2.71);
        Double doubleSum = double1 + double2;

        // 12. Erstelle eine Boolean-Wrapper-Klasse mit dem Wert "false".
        Boolean booleanValue3 = new Boolean(false);

        // 13. Konvertiere einen Integer-Wert in einen Binary-String.
        System.out.print("Enter an integer value: ");
        int intValue = scanner.nextInt();
        String binaryString = Integer.toBinaryString(intValue);

        // 14. Überprüfe, ob ein Character-Wert ein Buchstabe ist.
        Character character2 = new Character('A');
        boolean isCharacterLetter = Character.isLetter(character2);

        // 15. Subtrahiere zwei Long-Werte mithilfe der Wrapper-Klassen.
        Long long1 = new Long(100);
        Long long2 = new Long(50);
        Long longDifference = long1 - long2;

        // 16. Erstelle eine Float-Wrapper-Klasse mit dem Wert 3.14.
        Float floatValue = new Float(3.14);

        // 17. Konvertiere einen String in einen Integer-Wert.
        System.out.print("Enter an integer value: ");
        String integerString2 = scanner.nextLine();
        Integer integerValueFromString = Integer.parseInt(integerString2);

        // 18. Überprüfe, ob ein Float-Wert eine ganze Zahl ist.
        Float float3 = new Float(3.0);
        boolean isFloatWholeNumber = float3.isNaN() || float3 == Math.floor(float3);

        // 19. Multipliziere zwei Long-Werte mithilfe der Wrapper-Klassen.
        Long long3 = new Long(100);
        Long long4 = new Long(50);
        Long longProduct = long3 * long4;

        // 20. Erstelle eine Short-Wrapper-Klasse mit dem Wert 1000.
        Short shortValue = new Short((short) 1000);

        scanner.close();
    }
}
