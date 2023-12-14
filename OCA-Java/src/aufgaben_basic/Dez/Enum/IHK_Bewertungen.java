package aufgaben_basic.Dez.Enum;

/* Aufgabe: in dem
	- das Enum Ihk eingeführt wird
  (für die Noten SehrGut = 92,
  Gut = 81,
  Befriedigend = 67,
  Ausreichend = 50,
  Mangelhaft = 30,
  Ungenügend = 0)
	- vom User in einer Schleife eine Punktzahl abgefragt wird
  (die Schleife wird - ohne Fehlermeldung - wiederholt,
  falls Eingabe nicht zwischen 0 und 100, oder ein anderer Fehler geschah)

- nach der Schleife wird der Name des entsprechenden Enum-Wertes ausgegeben

  (also SehrGut bei Eingaben zwischen 100 und 92
  Gut bei Eingaben von 81 bis 91  */

import java.util.Scanner;

public class IHK_Bewertungen {
  enum Ihk {
    SehrGut(92),
    Gut(81),
    Befriedigend(67),
    Ausreichend(50),
    Mangelhaft(30),
    Ungenügend(0);

    private final int punkte;

    Ihk(int punkte) {
      this.punkte = punkte;
    }

    public int getPunkte() {
      return punkte;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int punkte = -1;
    Ihk note = null;

    while (punkte < 0 || punkte > 100) {
      System.out.println("\n***************************************************");
      System.out.print("Bitte geben Sie eine Punktzahl zwischen 0 und 100 ein: ");
      punkte = scanner.nextInt();
      if (punkte < 0 || punkte > 100) {
        System.out.println("*************************************************");
        System.out.println("Ungültige Eingabe. Bitte geben Sie eine Punktzahl zwischen 0 und 100 ein.");
      }
    }

    for (Ihk i : Ihk.values()) {
      if (punkte >= i.getPunkte()) {
        note = i;
        break;
      }
    }
    System.out.println("**************************************");
    System.out.println("Die Note für " + punkte + " Punkte ist " + note + ".");
  }
}