package projekte;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTypeRecognizer {

    private static final Pattern ALPHA_PATTERN = Pattern.compile("[a-zA-Z]+");
    private static final Pattern INT_PATTERN = Pattern.compile("[-+]?[0-9]+");
    private static final Pattern BIG_INT_PATTERN = Pattern.compile("[-+]?[0-9]+\\b");
    private static final Pattern DECIMAL_PATTERN = Pattern.compile("[-+]?[0-9]+\\.[0-9]+");
    private static final Pattern FLOAT_PATTERN = Pattern.compile("[-+]?[0-9]+\\.[0-9]+?([Ee][+-]?[0-9]+)?");
    private static final Pattern DATE_PATTERN = Pattern.compile("(\\d{4})-([0-1][0-9])-([0-3][0-9])");
    private static final Pattern TIME_PATTERN = Pattern.compile("([0-1][0-9]):([0-5][0-9]):([0-5][0-9])(?:\\.[0-9]+)?");

    public static String recognizeDataType(String input) {
        if (input == null || input.isEmpty()) {
            return "Empty";
        }

        Matcher matcher;

        matcher = ALPHA_PATTERN.matcher(input);
        if (matcher.matches()) {
            return "Alpha";
        }

        matcher = INT_PATTERN.matcher(input);
        if (matcher.matches()) {
            return "Int";
        }

        matcher = BIG_INT_PATTERN.matcher(input);
        if (matcher.matches()) {
            return "BigInt";
        }

        matcher = DECIMAL_PATTERN.matcher(input);
        if (matcher.matches()) {
            return "Decimal";
        }

        matcher = FLOAT_PATTERN.matcher(input);
        if (matcher.matches()) {
            return "Float";
        }

        matcher = DATE_PATTERN.matcher(input);
        if (matcher.matches()) {
            return "Date";
        }

        matcher = TIME_PATTERN.matcher(input);
        if (matcher.matches()) {
            return "Time";
        }

        return "Unknown";
    }

    public static void main(String[] args) {
        System.out.println("\n********************************");
        String[] testValues = { "Hello", "123", "-9999999999999999999", "123.45", "123.45e-10", "2024-06-18",
                "12:34:56.789" };

        for (String testValue : testValues) {
            String dataType = recognizeDataType(testValue);
            System.out.println(testValue + " is of type: " + dataType);
        }
    }
}
