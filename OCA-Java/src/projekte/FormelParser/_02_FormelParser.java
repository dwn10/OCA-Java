package projekte.FormelParser;

import java.util.Stack;

public class _02_FormelParser {

    public static void main(String[] args) {

        // Formel von User abfragen
        System.out.println("Bitte geben Sie eine Formel ein:");
        String formel = System.console().readLine();

        // Formel auf Vollständigkeit prüfen
        if (!istVollstaendig(formel)) {
            System.out.println("Die Formel ist unvollständig.");
            return;
        }

        // Formel auf Lösbarkeit prüfen
        if (!istLoesbar(formel)) {
            System.out.println("Die Formel ist nicht lösbar.");
            return;
        }

        // Formel auflösen
        int result = loeseFormel(formel);

        // Ergebnis ausgeben
        System.out.println("Ergebnis: " + result);
    }

    private static boolean istVollstaendig(String formel) {
        // Anzahl Klammern links und rechts vergleichen
        int anzahlKlammernLinks = 0;
        int anzahlKlammernRechts = 0;
        for (char c : formel.toCharArray()) {
            if (c == '(') {
                anzahlKlammernLinks++;
            } else if (c == ')') {
                anzahlKlammernRechts++;
            }
        }
        return anzahlKlammernLinks == anzahlKlammernRechts;
    }

    private static boolean istLoesbar(String formel) {
        // Formel in einen Stack umwandeln
        Stack<String> stack = new Stack<>();
        for (char c : formel.toCharArray()) {
            if (c == '(') {
                stack.push("(");
            } else if (c == ')') {
                stack.pop();
            } else {
                stack.push(String.valueOf(c));
            }
        }

        // Prüfen, ob Stack leer ist
        return stack.isEmpty();
    }

    private static int loeseFormel(String formel) {
        // Formel in einen Stack umwandeln
        Stack<String> stack = new Stack<>();
        for (char c : formel.toCharArray()) {
            if (c == '(') {
                stack.push("(");
            } else if (c == ')') {
                stack.pop();
            } else {
                stack.push(String.valueOf(c));
            }
        }

        // Formel aus dem Stack auswerten
        int result = 0;
        while (!stack.isEmpty()) {
            String operand = stack.pop();
            if (operand.matches("[0-9]+")) {
                result = Integer.parseInt(operand);
            } else if (operand.matches("[*/]")) {
                int operand1 = Integer.parseInt(stack.pop());
                int operand2 = Integer.parseInt(stack.pop());
                switch (operand) {
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;
                        break;
                }
            } else if (operand.matches("[+-]")) {
                int operand1 = Integer.parseInt(stack.pop());
                int operand2 = Integer.parseInt(stack.pop());
                switch (operand) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                }
            }
        }
        return result;
    }
}