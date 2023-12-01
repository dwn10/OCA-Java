package aufgaben_advanced.Nov.Sterne;

public class Name {

    // Método principal
    public static void main(String[] args) {

        // Solicitar el nombre al usuario
        System.out.println("Ingrese su nombre: ");
        String nombre = System.console().readLine();

        // Reemplazar las vocales del nombre por el signo *
        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                nombre = nombre.replace(letra, '*');
            }
        }

        // Mostrar el nombre con el signo *
        System.out.println("Su nombre con el signo * es: " + nombre);
    }
}
