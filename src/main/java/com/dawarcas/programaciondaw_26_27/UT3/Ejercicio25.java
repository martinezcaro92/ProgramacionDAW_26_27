package es.iesramonarcas.ut3;

/**
 * Ejercicio 2.5 · Compra con IVA: del pseudocódigo a Java
 * UT3 · Bloque 2. Tipos de datos primitivos
 *
 * Salida: Total con IVA: 36,30 € (o 36.30 € con el sistema en inglés).
 *
 * @author José Manuel Martínez
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        final double IVA = 0.21;        // constante: IVA general
        double precio = 10.00;          // precio unitario
        int unidades = 3;               // número de unidades
        double total = precio * unidades * (1 + IVA);
        System.out.printf("Total con IVA: %.2f €%n", total);
    }
}
