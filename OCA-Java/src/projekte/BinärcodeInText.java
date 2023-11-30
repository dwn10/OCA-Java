package projekte;

public class BinärcodeInText {

  // Hauptmethode
  public static void main(String[] args) {

    // Binärcode eingeben
    System.out.println("\nGeben Sie einen Buchstaben im Binärformat ein: ");
    String binärcode = System.console().readLine();

    // Binärcode in Text umwandeln
    String text = "";
    for (int i = 0; i < binärcode.length(); i += 8) {
      int zahl = Integer.parseInt(binärcode.substring(i, i + 8), 2);
      text += (char) zahl;
    }

    // Text ausgeben
    System.out.println("\nDer Buchstabe lautet: " + text);
  }
}
