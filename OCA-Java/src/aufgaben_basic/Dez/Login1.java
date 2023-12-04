package aufgaben_basic.Dez;

/* Aufgabe: Login durch User Eingabe

Schreibe ein Programm, das den Benutzer nach seiner persönliche Pin Fragt.
Diese soll dann eingegeben werden. Daraufhin muss eine Prüfung erfolgen ob diese korrekt ist.
Sollte dies nicht der Fall sein sind noch 2 weiter Versuch möglich um die Pin einzugeben.
Bei zu oft falsch versuchtem Login bricht das Programm mit der
Meldung „Login in nicht erfolgreich“. Ansonsten soll eine Erfolgsmeldung ausgegeben werden.

Versuche ohne break und continue auszukommen. */

import java.util.Scanner;

public class Login1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        int pin = 1234;
        int input;
        boolean success = false;

        while (attempts > 0 && !success) {
            System.out.println("\n**************************");
            System.out.print("\nBitte geben Sie Ihre PIN ein: ");
            input = scanner.nextInt();
            if (input == pin) {
                success = true;
                System.out.println("Login erfolgreich!");
                System.out.println("**************************");
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("**************************");
                    System.out.println("PIN ungültig. Sie haben noch " + attempts + " Versuch(e).");
                } else {
                    System.out.println("Login nicht erfolgreich.");
                    System.out.println("**************************");
                }
            }
        }
    }
}
