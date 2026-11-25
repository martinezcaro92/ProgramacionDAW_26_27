package es.iesramonarcas.ut3;

/**
 * Ejercicio 1.2 · ¿Qué se muestra?
 * UT3 · Bloque 1. Mi primer programa en Java
 *
 * Código del enunciado para comprobar la salida en NetBeans.
 * Salida: «Java 25», «Curso<TAB>2026/27», «Línea 1», «Línea 2» y «Fin» (sin salto final).
 *
 * @author José Manuel Martínez
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        System.out.print("Java ");
        System.out.print("25");
        System.out.println();                     // solo salta de línea
        System.out.println("Curso\t2026/27");     // \t: tabulador
        System.out.println("Línea 1\nLínea 2");   // \n: salto de línea
        System.out.print("Fin");                  // print: sin salto final
    }
}
