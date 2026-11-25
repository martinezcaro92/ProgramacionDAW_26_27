package es.iesramonarcas.ut3;

/**
 * Ejercicio 3.2 · Notas del trimestre
 * UT3 · Bloque 3. Arrays
 *
 * Salida: Nota 1: 6.5 … Nota 5: 7.0 y Media: 7,10.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio32 {

    public static void main(String[] args) {
        double[] notas = {6.5, 8.0, 4.75, 9.25, 7.0};
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            suma = suma + notas[i];
        }
        double media = suma / notas.length;
        System.out.printf("Media: %.2f%n", media);
    }
}
