package schreibtischtest.Dez.DB_Connection;

public class DB_Connection {

	private String ipAdresse;
	private short port;
	private String username;
	private String passwort;
	private String dbName;

	private final String ROOT = "root";
	private final String ADMIN = "admin";

	public DB_Connection(String ipAdresse, short port, String username, String passwort, String dbName) {
		this.ipAdresse = ipAdresse;
		this.port = port;
		this.username = username;
		this.passwort = passwort;
		this.dbName = dbName;
		openConnection(this.ipAdresse, this.port, this.username, this.passwort, this.dbName);
	}

	private void openConnection(String ipAdresse, short port, String username, String passwort, String dbName) {
		// TODO Auto-generated method stub
		String tmpPort = String.valueOf(port);
		if (ipAdresse.matches("[0-9:]+") && tmpPort.matches("\\d+")
				&& !dbName.contains("@") && username.equals(ROOT)
				&& passwort.equals(ADMIN)) {
			System.out.println("Verbindung offen");
		}

	}

	public void closeConnection() {
		System.out.println("Verbindung geschlossen");
	}

	public String getIpAdresse() {
		return ipAdresse;
	}

	public short getPort() {
		return port;
	}

	public String getUsername() {
		return username;
	}

	public String getPasswort() {
		return passwort;
	}

}
