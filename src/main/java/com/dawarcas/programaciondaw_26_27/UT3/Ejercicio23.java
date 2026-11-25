package es.iesramonarcas.ut3;

/**
 * Ejercicio 2.3 · Traza de conversiones
 * UT3 · Bloque 2. Tipos de datos primitivos
 *
 * Salida: 3, 1, 3.5, 9, 66, B y -128.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        int a = 7, b = 2;
        System.out.println(a / b);              // 3: división entera
        System.out.println(a % b);              // 1: resto
        System.out.println((double) a / b);     // 3.5: el casting se aplica antes de dividir
        System.out.println((int) 9.99);         // 9: el casting trunca
        char c = 'A';
        System.out.println(c + 1);              // 66: char + int da int
        System.out.println((char) (c + 1));     // B
        System.out.println((byte) 128);         // -128: desbordamiento
    }
}
