/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawarcas.programaciondaw_26_27.UT1;

/**
 *
 * @author josemanuel
 */
public class AccesoSistema {
    public static void main(String[] args) {
        String contrasena = "jose.martinez"; // nombre.apellido1 (ejemplo - change)
        String password = "password";
        if (contrasena.equals(password)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}