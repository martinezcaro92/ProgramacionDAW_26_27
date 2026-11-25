package es.iesramonarcas.ut3;

/**
 * Ejercicio 1.5 · Caza de errores
 * UT3 · Bloque 1. Mi primer programa en Java
 *
 * Versión corregida. Errores del original:
 *   línea 3: system en minúscula (cannot find symbol);
 *   línea 4: comilla sin cerrar (unclosed string literal);
 *   línea 5: falta el punto y coma (';' expected);
 *   final: falta la llave que cierra la clase (reached end of file while parsing).
 *
 * @author José Manuel Martínez
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Adiós");
        System.out.println("Fin");
    }
}
