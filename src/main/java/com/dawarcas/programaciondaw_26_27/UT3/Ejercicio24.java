package es.iesramonarcas.ut3;

/**
 * Ejercicio 2.4 · Ficha del alumno con printf
 * UT3 · Bloque 2. Tipos de datos primitivos
 *
 * Con el sistema en español, printf muestra la nota con coma decimal: 7,46.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        final int CURSO = 1;
        String nombre = "Lucía";
        int edad = 19;
        double notaMedia = 7.456;
        char grupo = 'A';
        boolean repetidor = false;

        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Edad: %d años%n", edad);
        System.out.printf("Curso: %dº DAW, grupo %c%n", CURSO, grupo);
        System.out.printf("Nota media: %.2f%n", notaMedia);
        System.out.printf("Repetidor: %b%n", repetidor);
    }
}
