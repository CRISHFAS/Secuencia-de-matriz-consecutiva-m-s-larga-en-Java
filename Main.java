import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Ejemplo hipotético: Días consecutivos en los que las acciones aumentaron
        int[] diasAumento = {3, 4, 5, 7, 8, 10, 11, 12};
        
        // Llamada al método longestConsecutive para encontrar la secuencia más larga
        int secuenciaMasLarga = longestConsecutive(diasAumento);
        
        // Imprimir el resultado
        System.out.println("El período más largo de días consecutivos en los que el precio aumentó es de " + secuenciaMasLarga + " días.");
    }

    // Método para encontrar la secuencia más larga de números consecutivos
    public static int longestConsecutive(int[] num) {
        // Si el array está vacío, retorna 0
        if (num.length == 0) {
            return 0;
        }

        // Usamos un Set para agregar los elementos del array
        Set<Integer> set = new HashSet<>();
        int max = 1;

        // Añadimos todos los elementos al set
        for (int e : num) {
            set.add(e);
        }

        // Buscamos la secuencia consecutiva más larga
        for (int e : num) {
            int left = e - 1;
            int right = e + 1;
            int count = 1;

            // Comprobamos hacia la izquierda de e
            while (set.contains(left)) {
                count++;
                set.remove(left);  // Eliminamos para evitar volver a procesar
                left--;
            }

            // Comprobamos hacia la derecha de e
            while (set.contains(right)) {
                count++;
                set.remove(right);  // Eliminamos para evitar volver a procesar
                right++;
            }

            // Actualizamos el valor máximo
            max = Math.max(count, max);
        }

        // Retorna la secuencia más larga
        return max;
    }
}
