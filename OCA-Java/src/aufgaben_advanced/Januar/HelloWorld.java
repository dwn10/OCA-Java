package aufgaben_advanced.Januar;

public class HelloWorld {

    public static void main(String[] args) {
        // Erstelle einen String mit dem Inhalt "Hello, World!"
        String string = "Hello, World!";

        // Zähle die Anzahl der Zeichen im oben genannten String.
        int anzahlZeichen = string.length();
        System.out.println("\n***********************************");
        System.out.println("Anzahl der Zeichen: " + anzahlZeichen);

        // Konvertiere den String in Kleinbuchstaben.
        string = string.toLowerCase();
        System.out.println("Kleinbuchstaben: " + string);

        // Überprüfe, ob der String "Hello" im oben genannten String vorhanden ist.
        boolean vorhanden = string.contains("Hello");
        System.out.println("String vorhanden: " + vorhanden);

        // Extrahiere die Zeichen von Index 7 bis 12 aus dem String.
        String substring = string.substring(7, 12);
        System.out.println("Substring: " + substring);

        // Ersetze das Wort "World" durch "Java" im oben genannten String.
        string = string.replace("World", "Java");
        System.out.println("Ersetzter String: " + string);

        // Entferne alle Leerzeichen am Anfang und Ende des Strings " Java
        // Programming ".
        string = " Java Programming ".trim();
        System.out.println("String ohne Leerzeichen: " + string);

        // Überprüfe, ob der String mit "Hello" beginnt.
        vorhanden = string.startsWith("Hello");
        System.out.println("String beginnt mit Hello: " + vorhanden);

        // Überprüfe, ob der String "Java" gleich dem String "java" ist (ohne
        // Berücksichtigung der Groß- und Kleinschreibung).
        vorhanden = string.equalsIgnoreCase("java");
        System.out.println("Strings gleich (ohne Berücksichtigung der Groß- und Kleinschreibung): " + vorhanden);

        // Ersetze alle Vokale im String "Programming" durch den Buchstaben 'X'.
        string = string.replaceAll("[aeiou]", "X");
        System.out.println("String mit ersetzten Vokalen: " + string);

        // Konvertiere den String "123" in eine Integer-Zahl.
        int zahl = Integer.parseInt("123");
        System.out.println("Konvertierte Zahl: " + zahl);

        // Finde den Index des ersten Auftretens des Buchstabens 'a' im String "Java
        // Programming".
        int index = string.indexOf('a');
        System.out.println("Index des ersten Auftretens von 'a': " + index);

        // Überprüfe, ob der String nur aus Zahlen besteht.
        vorhanden = string.matches("[0-9]+");
        System.out.println("String besteht nur aus Zahlen: " + vorhanden);

        // Konkateniere die Strings "Java" und "Programming".
        string = "Java" + "Programming";
        System.out.println("Konkatenierter String: " + string);

        // Überprüfe, ob der String leer ist.
        vorhanden = string.isEmpty();
        System.out.println("String ist leer: " + vorhanden);

        // Entferne alle Vorkommen des Buchstabens 'o' im String "Hello, World!".
        string = string.replaceAll("o", "");
        System.out.println("String mit entfernten 'o's: " + string);
    }
}