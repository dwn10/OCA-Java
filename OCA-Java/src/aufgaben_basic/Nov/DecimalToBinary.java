package aufgaben_basic.Nov;

// Aufgabe: Dezimal in Binär umwandeln 
// Schreibe eine Methode, die eine gegebene Dezimalzahl in eine Binärzahl umwandelt.
// Rufe diese Methode aus der main-Methode auf und gib das Ergebnis aus. 

public class DecimalToBinary {
    public static void main(String[] args) {
        // wandelt eine gegebene Dezimalzahl in eine Binärzahl um. In der main-Methode
        // wird die Methode
        int decimal = 10;
        System.out.println("\nDezimalzahl: " + decimal);
        System.out.println("Binärzahl: " + decimalToBinary(decimal));
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }
}
