package es.iesramonarcas.ut3;

/**
 * Ejercicio 3.4 · Temperaturas de la semana
 * UT3 · Bloque 3. Arrays
 *
 * Salida: Media: 22,1 ºC · Máxima: 25.1 ºC · Mínima: 18.5 ºC.
 * max y min empiezan con el primer elemento, no con 0.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio34 {

    public static void main(String[] args) {
        double[] temps = {18.5, 21.0, 24.3, 22.8, 19.6, 25.1, 23.4};
        double suma = 0;
        double max = temps[0];
        double min = temps[0];
        for (double t : temps) {
            suma += t;
            max = Math.max(max, t);
            min = Math.min(min, t);
        }
        System.out.printf("Media: %.1f ºC%n", suma / temps.length);
        System.out.println("Máxima: " + max + " ºC");
        System.out.println("Mínima: " + min + " ºC");
    }
}
