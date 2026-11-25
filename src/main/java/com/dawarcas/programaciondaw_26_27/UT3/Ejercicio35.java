package es.iesramonarcas.ut3;

import java.util.Arrays;

/**
 * Ejercicio 3.5 · La sala de cine
 * UT3 · Bloque 3. Arrays
 *
 * 3 filas, 4 butacas por fila y 12 butacas en total.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio35 {

    public static void main(String[] args) {
        boolean[][] sala = new boolean[3][4];   // 3 filas, 4 butacas
        sala[0][1] = true;
        sala[1][0] = true;
        sala[2][3] = true;

        System.out.println(Arrays.deepToString(sala));
        System.out.println("Filas: " + sala.length);
        System.out.println("Butacas por fila: " + sala[0].length);
        System.out.println("Total butacas: " + sala.length * sala[0].length);

        for (int i = 0; i < sala.length; i++) {
            System.out.println("Fila " + (i + 1) + ": " + Arrays.toString(sala[i]));
        }
    }
}
