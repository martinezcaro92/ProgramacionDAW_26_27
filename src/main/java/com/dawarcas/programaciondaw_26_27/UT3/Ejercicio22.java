package es.iesramonarcas.ut3;

/**
 * Ejercicio 2.2 · ¿Compila o no compila?
 * UT3 · Bloque 2. Tipos de datos primitivos
 *
 * Las líneas 1 a 5 del enunciado no compilan; aquí aparecen corregidas.
 * Las líneas 6 a 8 compilan tal cual.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        int a = (int) 3.5;          // 1) int a = 3.5;        pérdida de precisión
        long b = 3000000000L;       // 2) long b = 3000000000; literal int fuera de rango
        float c = 1.5f;             // 3) float c = 1.5;      1.5 es un literal double
        char d = 'A';               // 4) char d = "A";       comillas dobles = String
        boolean e = false;          // 5) boolean e = 0;      no hay 0/1 lógicos
        byte f = 100;               // 6) compila: 100 cabe en un byte
        double g = 10;              // 7) compila: vale 10.0
        int h = 'A';                // 8) compila: vale 65

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
    }
}
