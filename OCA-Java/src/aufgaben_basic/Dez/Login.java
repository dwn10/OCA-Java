package aufgaben_basic.Dez;

/* Aufgabe: Login durch User Eingabe
Schreibe ein Programm, das den Benutzer nach seiner persönliche Pin Fragt.
Diese soll dann eingegeben werden. Daraufhin muss eine Prüfung erfolgen ob diese korrekt ist.
Sollte dies nicht der Fall sein sind noch 2 weiter Versuch möglich um die Pin einzugeben.
Bei zu oft falsch versuchtem Login bricht das Programm mit der
Meldung „Login in nicht erfolgreich“. Ansonsten soll eine Erfolgsmeldung ausgegeben werden.
  */

import java.util.Scanner;

public class Login {

    // Hauptmethode
    public static void main(String[] args) {

        // Scanner erstellen
        Scanner scanner = new Scanner(System.in);

        // Anzahl der zulässigen Versuche
        int anzahlVersuche = 3;

        // Benutzer nach seiner Pin fragen
        System.out.println("\n**********************");
        System.out.println("Geben Sie Ihre Pin ein: ");
        String pin = scanner.nextLine();

        // Pin prüfen
        boolean pinOk = false;
        for (int i = 0; i < anzahlVersuche; i++) {
            if (pin.equals("1234")) {
                pinOk = true;
                break;
            }
            System.out.println("\nFalsche Pin. Noch " + (anzahlVersuche - i - 1) + " Versuche übrig.");
            pin = scanner.nextLine();
        }

        // Login erfolgreich?
        if (pinOk) {
            System.out.println("Login erfolgreich.");
            System.out.println("**********************");
        } else {
            System.out.println("Login nicht erfolgreich.");
            System.out.println("**********************");
        }
    }
}