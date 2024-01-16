package schreibtischtest.Dez;

import java.util.Scanner;

public class StrukturflussUndArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Benutzernamen ein: ");
        int numUsernames = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after reading int

        String[] usernames = new String[numUsernames];

        for (int i = 0; i < numUsernames; i++) {
            System.out.print("Bitte geben Sie Benutzername " + (i + 1) + " ein: ");
            usernames[i] = scanner.nextLine();
        }

        System.out.println("\nGespeicherte Benutzernamen:");
        for (int i = 0; i < usernames.length; i++) {
            System.out.println((i + 1) + ". " + usernames[i]);
        }

        scanner.close();
    }

}
