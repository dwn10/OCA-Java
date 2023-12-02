package aufgaben_advanced.Nov.Kontrollfluss_advanced1;

/* In diesem Beispiel wird die ISBN-API verwendet,
um den Titel des Buches aus der ISBN abzurufen. */

// API fehlt!!!

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.json.JSONObject;

public class ISBNScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die ISBN ein, nach der Sie suchen möchten:");
        String isbn = scanner.nextLine();
        try {
            URL url = new URL("https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn);
            URLConnection connection = url.openConnection();
            connection.connect();
            Scanner jsonScanner = new Scanner(connection.getInputStream());
            String jsonText = jsonScanner.useDelimiter("\\A").next();
            jsonScanner.close();
            JSONObject json = new JSONObject(jsonText);
            String title = json.getJSONArray("items").getJSONObject(0).getJSONObject("volumeInfo").getString("title");
            System.out.println("Der Titel des Buches mit der ISBN " + isbn + " lautet: " + title);
        } catch (Exception e) {
            System.out.println("Es gab einen Fehler bei der Suche nach der ISBN " + isbn + ".");
        }
    }
}
