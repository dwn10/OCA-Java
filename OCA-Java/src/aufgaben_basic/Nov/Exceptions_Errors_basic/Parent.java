package aufgaben_basic.Nov.Exceptions_Errors_basic;

import java.io.IOException;
import java.sql.SQLException;

// Aufgabe: Vererbung und throws
// Erstelle eine Elternklasse Parent mit einer Methode, die eine IOException wirft. Erbe
// von dieser Klasse und überschreibe die Methode so, dass sie zusätzlich eine SQLException wirft.

// Klassendeklaration
class Parent {
    void methode() throws IOException {
        // ...
    }
}

// Abgeleitete Klasse
class Child extends Parent {
    @Override
    void methode() throws IOException, SQLException {
        // ...
        try {
            throw new SQLException("Eine SQLException ist aufgetreten.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Code, der unabhängig von der Ausnahme ausgeführt wird
        }
    }

}

    // Hauptmethode
public static void main(String[] args) {
    // Objekt der abgeleiteten Klasse
    Child kind = new Child();
    try {
        kind.methode();
    } catch (IOException e) {
        System.out.println(e.getMessage());
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}