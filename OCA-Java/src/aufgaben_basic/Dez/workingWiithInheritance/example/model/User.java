package workingWiithInheritance.example.model;

public class User {

	private final String PASSWORD;
	private final String EMAIL;
	
	public User(String email, String password) {
		this.EMAIL = email;
		this.PASSWORD = password;
		DataStore.getUserList().add(this);
		DataStore.getUserMap().put(this.EMAIL, this);
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public String getEMAIL() {
		return EMAIL;
	}
}
