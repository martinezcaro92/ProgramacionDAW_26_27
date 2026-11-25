package es.iesramonarcas.ut3;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 4.3 · Traza de una lista
 * UT3 · Bloque 4. Enum, List y ArrayList
 *
 * Comprueba la traza del ejercicio de papel. Salida: [5, 25, 30], 3 y 25.
 * remove(1) con un int borra la posición 1, no el valor 1.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio43 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);           // [10]
        nums.add(20);           // [10, 20]
        nums.add(0, 5);         // [5, 10, 20]
        nums.add(30);           // [5, 10, 20, 30]
        nums.set(2, 25);        // [5, 10, 25, 30]
        nums.remove(1);         // [5, 25, 30]
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.get(1));
    }
}
