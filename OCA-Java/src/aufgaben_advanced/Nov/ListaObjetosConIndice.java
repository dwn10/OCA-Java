package aufgaben_advanced.Nov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListaObjetosConIndice {

    public static void main(String[] args) {

        // Crea una lista de objetos
        List<Objeto> lista = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            lista.add(new Objeto(i, "Nombre " + i, i));
        }

        // Crea un índice de usuarios
        HashMap<Integer, Objeto> usuarioIndexado = new HashMap<>();
        for (Objeto objeto : lista) {
            usuarioIndexado.put(objeto.idCreador, objeto);
        }

        // Crea una nueva lista con el nombre del usuario que creó cada objeto
        long tiempoSinIndice = System.currentTimeMillis();
        List<Objeto> listaConNombre = lista.stream()
                .map(objeto -> {
                    return new Objeto(objeto.id, objeto.nombre, usuarioIndexado.get(objeto.idCreador).nombre);
                })
                .collect(Collectors.toList());
        long tiempoConIndice = System.currentTimeMillis();

        // Imprime el tiempo de ejecución de cada operación
        System.out.println("Tiempo sin índice: " + (tiempoConIndice - tiempoSinIndice) + " ms");
        System.out.println("Tiempo con índice: " + (tiempoSinIndice - tiempoConIndice) + " ms");
    }

    static class Objeto {

        private int id;
        private String nombre;
        private int idCreador;

        public Objeto(int id, String nombre, int idCreador) {
            this.id = id;
            this.nombre = nombre;
            this.idCreador = idCreador;
        }

        @Override
        public String toString() {
            return "Objeto{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", idCreador=" + idCreador +
                    '}';
        }
    }
}