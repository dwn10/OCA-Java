package workingWiithInheritance.example.model;

import java.util.ArrayList;
import java.util.HashMap;

public class DataStore {

	private static HashMap<String, User> userMap;
	private static ArrayList<User> userList;

	static {
		userMap = new HashMap<>();
		userList = new ArrayList<>();

		// Index Zero is per default the Admi
//		Admi => Email => admin@admin.de
//		password => admin

		User admin = new User("admin@admin.de", "admin");
		userList.add(admin);

		userMap.put(admin.getEMAIL(), admin);
	}

	public static HashMap<String, User> getUserMap() {
		return userMap;
	}


	public static ArrayList<User> getUserList() {
		return userList;
	}
}
