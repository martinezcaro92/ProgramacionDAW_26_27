package es.iesramonarcas.ut3;

/**
 * Ejercicio 3.1 · Dibuja el array
 * UT3 · Bloque 3. Arrays
 *
 * Comprueba las respuestas del ejercicio de papel.
 * v[6] lanzaría ArrayIndexOutOfBoundsException: la línea está comentada.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio31 {

    public static void main(String[] args) {
        int[] v = {4, 8, 15, 16, 23, 42};
        System.out.println("v[0] = " + v[0]);                       // 4
        System.out.println("v[3] = " + v[3]);                       // 16
        System.out.println("v.length = " + v.length);               // 6
        System.out.println("v[v.length - 1] = " + v[v.length - 1]); // 42
        // System.out.println(v[6]);  // ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
        v[2] = v[0] + v[1];
        System.out.println("v[2] = " + v[2]);                       // 12
    }
}
