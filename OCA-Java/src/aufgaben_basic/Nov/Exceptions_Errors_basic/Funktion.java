package aufgaben_basic.Nov.Exceptions_Errors_basic;

public class Funktion {

    /**
     * Prüft, ob `zahl` eine numerischer Wert ist.
     *
     * @param zahl Die zu prüfende Zeichenfolge.
     * @return `true`, wenn `zahl` eine numerischer Wert ist, `false` sonst.
     */

    public static boolean isNumber(String zahl) {

        // Prüfen, ob `zahl` leer ist.
        if (zahl.isEmpty()) {
            return false;
        }

        // Prüfen, ob `zahl` nur aus Ziffern besteht.
        for (int i = 0; i < zahl.length(); i++) {
            if (!Character.isDigit(zahl.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}

/*
 * Erläuterung der Lösung
 * 
 * Die Methode isNumber() überprüft, ob zahl eine numerischer Wert ist. Dazu
 * wird zunächst geprüft, ob zahl leer ist.
 * Ist dies der Fall, ist zahl keine numerischer Wert und die Methode gibt false
 * zurück.
 * 
 * Anschließend wird geprüft, ob zahl nur aus Ziffern besteht. Dazu wird für
 * jede Ziffer in zahl überprüft,
 * ob es sich um eine Ziffer handelt. Ist dies nicht der Fall, ist zahl keine
 * numerischer Wert und die Methode gibt false zurück.
 * 
 * Wenn zahl weder leer ist noch nicht nur aus Ziffern besteht, ist zahl eine
 * numerischer Wert und die Methode gibt true zurück.
 */