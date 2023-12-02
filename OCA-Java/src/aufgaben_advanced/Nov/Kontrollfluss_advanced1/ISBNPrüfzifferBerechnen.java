package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* Aufgabe: ISBN-Prüfziffer berechnen
Schreibe ein Programm, das den Benutzer nach einer ISBN (International Standard
Book Number) fragt und dann die Prüfziffer für diese ISBN berechnet.  */

import java.util.Scanner;

public class ISBNPrüfzifferBerechnen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************************************************************");
        System.out.println("\nGeben Sie die ISBN ein, für die Sie die Prüfziffer berechnen möchten:");
        String isbn = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit * (i % 2 == 0 ? 1 : 3);
            }
        }
        int checkDigit = (10 - (sum % 10)) % 10;
        System.out.println("************************************************");
        System.out.println("Die Prüfziffer für die ISBN " + isbn + " lautet: " + checkDigit);
        System.out.println("************************************************");
    }
}
