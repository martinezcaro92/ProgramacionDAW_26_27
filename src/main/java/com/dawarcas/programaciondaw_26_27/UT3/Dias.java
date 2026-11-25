/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawarcas.programaciondaw_26_27.UT3;

/**
 *
 * @author josemanuel
 */
public class Dias {
    public static void main(String[] args) {
        // Punto 1, define la clase y el array estático siguiente
        String [] dias = {"lunes", "martes", "miercoles", "jueves", "viernes"};
        
        // Punto 2, for-each
        for (String d : dias) {
            System.out.print(d + " ");
        }
        
        // Esto nos permite imprimir el punto 2 y el punto 3 en dos líneas diferentes
        System.out.println();
        
        // Punto 3, for clásico invertido
        for (int i = dias.length - 1; i>=0; i--){
            System.out.print(dias[i] + " ");
        }
        System.out.println();
        // Recordatorio: No se puede imprimir todo el array al tuntún
        // por ejemplo:
        
        System.out.println(dias);
    }
}
