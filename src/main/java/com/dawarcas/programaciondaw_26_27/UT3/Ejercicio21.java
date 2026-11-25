package es.iesramonarcas.ut3;

/**
 * Ejercicio 2.1 · Elige el tipo más adecuado
 * UT3 · Bloque 2. Tipos de datos primitivos
 *
 * Una declaración de ejemplo por cada dato del enunciado.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        int edad = 19;                              // a) byte también sería válido
        double precio = 19.99;                      // b) en aplicaciones reales: BigDecimal
        char letraDni = 'Z';                        // c) un solo carácter
        boolean aprobado = true;                    // d) solo true o false
        long poblacionMundial = 8_200_000_000L;     // e) no cabe en un int
        double temperatura = 21.5;                  // f) float con 21.5f también es válido
        int alumnos = 30;                           // g) byte o short también caben
        long milisegundos = System.currentTimeMillis(); // h) devuelve un long

        System.out.println(edad + " " + precio + " " + letraDni + " " + aprobado);
        System.out.println(poblacionMundial + " " + temperatura + " " + alumnos);
        System.out.println(milisegundos);
    }
}
