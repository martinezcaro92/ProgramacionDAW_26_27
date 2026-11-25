package es.iesramonarcas.ut3;

/**
 * Ejercicio 3.3 · Del Para al for: la tabla del 7
 * UT3 · Bloque 3. Arrays
 *
 * En PSeInt el recorrido iba de 1 a 10; en Java el índice va de 0 a 9,
 * por eso el multiplicador es i + 1.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio33 {

    public static void main(String[] args) {
        int[] tabla = new int[10];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = 7 * (i + 1);
            System.out.println("7 x " + (i + 1) + " = " + tabla[i]);
        }
    }
}
