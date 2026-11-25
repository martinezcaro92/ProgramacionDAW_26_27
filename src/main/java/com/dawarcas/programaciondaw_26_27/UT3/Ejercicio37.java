package es.iesramonarcas.ut3;

/**
 * Ejercicio 3.7 · El edificio del instituto
 * UT3 · Bloque 3. Arrays
 *
 * 24 aulas; [1][0][2] vale 25 y [2][1][3] vale 0 (valor por defecto).
 * Ampliación: con todas las aulas a 20 alumnos, el total es 480.
 *
 * @author José Manuel Martínez
 */
public class Ejercicio37 {

    public static void main(String[] args) {
        int[][][] alumnos = new int[3][2][4];   // plantas, pasillos, aulas
        alumnos[1][0][2] = 25;

        System.out.println("Plantas: " + alumnos.length);
        System.out.println("Pasillos por planta: " + alumnos[0].length);
        System.out.println("Aulas por pasillo: " + alumnos[0][0].length);
        System.out.println("Total aulas: "
                + alumnos.length * alumnos[0].length * alumnos[0][0].length);
        System.out.println("Aula [1][0][2]: " + alumnos[1][0][2]);
        System.out.println("Aula [2][1][3]: " + alumnos[2][1][3]);

        // Ampliación
        int total = 0;
        for (int p = 0; p < alumnos.length; p++) {
            for (int s = 0; s < alumnos[p].length; s++) {
                for (int a = 0; a < alumnos[p][s].length; a++) {
                    alumnos[p][s][a] = 20;
                    total += alumnos[p][s][a];
                }
            }
        }
        System.out.println("Total de alumnos: " + total);
    }
}
