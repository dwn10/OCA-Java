package schreibtischtest.Dez.DB_Connection;

/*  IP: 127.0.0.1
    PortNr.: 65535
    Username = root
    Passwort = admin
    DB Name : databaseName  */

import java.util.Scanner;

public class DatabaseConnection {
    private String ipAddress;
    private int portNumber;
    private String username;
    private String password;
    private String databaseName;
    private boolean isOpen;

    public DatabaseConnection(String ipAddress, int portNumber, String username, String password, String databaseName) {
        this.ipAddress = ipAddress;
        this.portNumber = portNumber;
        this.username = username;
        this.password = password;
        this.databaseName = databaseName;
        this.isOpen = false;
    }

    private void openConnection() {
        if (this.isOpen) {
            System.out.println("Verbindung ist bereits offen.");
            return;
        }

        if (!this.ipAddress.matches("\\d+\\.\\d+\\.\\d+\\.\\d+")) {
            System.out.println("IP-Adresse ist ungültig.");
            return;
        }

        if (this.portNumber < 0 || this.portNumber > 65535) {
            System.out.println("Port-Nummer ist ungültig.");
            return;
        }

        if (this.databaseName.contains("@")) {
            System.out.println("Datenbankname ist ungültig.");
            return;
        }

        if (!this.username.equals("root") || !this.password.equals("admin")) {
            System.out.println("Benutzername oder Passwort ist ungültig.");
            return;
        }

        this.isOpen = true;
        System.out.println("Verbindung ist offen.");
    }

    public void closeConnection() {
        if (!this.isOpen) {
            System.out.println("Verbindung ist bereits geschlossen.");
            return;
        }

        this.isOpen = false;
        System.out.println("Verbindung ist geschlossen.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n************************************");
        System.out.println("Bitte geben Sie die IP-Adresse des Servers ein:");
        String ipAddress = scanner.nextLine();

        System.out.println("************************************");
        System.out.println("Bitte geben Sie die Port-Nummer ein:");
        int portNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("************************************");
        System.out.println("Bitte geben Sie den Benutzernamen ein:");
        String username = scanner.nextLine();

        System.out.println("************************************");
        System.out.println("Bitte geben Sie das Passwort ein:");
        String password = scanner.nextLine();

        System.out.println("************************************");
        System.out.println("Bitte geben Sie den Datenbanknamen ein:");
        String databaseName = scanner.nextLine();

        DatabaseConnection connection = new DatabaseConnection(ipAddress, portNumber, username, password, databaseName);
        connection.openConnection();
        connection.closeConnection();
    }
}