package aufgaben_basic.Dez.Schleifen_Verzweigungen_Array;

/* Summe von Zahlenreihe:
Erstelle eine Schleife, um die Summe der Zahlen von 1 bis 100 zu berechnen.
Floyd's Triangle:
Implementiere einen Code, der Floyd's Triangle ausgibt:

1
2 3
4 5 6
7 8 9 10   */

public class FloydsTriangle {

    public static void main(String[] args) {
        int n = 100;
        int sum = sum(n);
        System.out.println("\n****************************************");
        System.out.println("Die Summe der Zahlen von 1 bis " + n + " ist " + sum);
        floydsTriangle(4);
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void floydsTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
