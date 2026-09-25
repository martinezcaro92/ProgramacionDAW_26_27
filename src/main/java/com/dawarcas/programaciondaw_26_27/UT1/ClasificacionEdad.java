/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawarcas.programaciondaw_26_27.UT1;

/**
 *
 * @author josemanuel
 */
public class ClasificacionEdad {
    public static void main(String[] args) {
        int edad = 34; // Tu edad (valor de ejemplo - modificar)
        if (edad < 13) {
            System.out.println("Niño");
        } else if (edad < 18) {
            System.out.println("Adolescente");
        } else if (edad < 65) {
            System.out.println("Adulto");
        } else {
            System.out.println("Mayor");
        }
    }
}

