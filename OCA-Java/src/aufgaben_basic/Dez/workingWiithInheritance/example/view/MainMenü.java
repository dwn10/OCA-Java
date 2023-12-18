package workingWiithInheritance.example.view;

/**
 * In every View there is no Logic => never we send same Informations to the
 * View or Through the View The Model don't know some information about the View
 * => and also The View never know from the Model Only the Controller know the
 * View and Model
 * 
 * @author flori
 *
 */
public class MainMenü {

	enum MenueOptions {
		OPEN("Öffne Ordner oder Datei", "O"), SAVE("Speichere Datei", "S"), COPY("Kopiere Datei", "C"),
		DELETE("Lösche Datei", "D"), LOGOUT("Logout", "L");

		private final String MENUEKONTEXT;
		private final String SELECTITEM;

		private MenueOptions(String kontext, String selectItem) {
			// TODO Auto-generated constructor stub
			this.MENUEKONTEXT = kontext;
			this.SELECTITEM = selectItem;
		}

		public String getKontext() {
			return this.MENUEKONTEXT;
		}

		public String getSelectedItem() {
			return this.SELECTITEM;
		}
	}

	public void showMainMenü() {
		System.out.println("Menü\n********************\nMenüpunkte | Symbol");
		for (MenueOptions elem : MenueOptions.values()) {
			System.out.println(elem.MENUEKONTEXT + " | " + elem.SELECTITEM);
		}
	}
}
