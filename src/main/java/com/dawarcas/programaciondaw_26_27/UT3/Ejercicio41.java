/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dawarcas.programaciondaw_26_27.UT3;

/**
 *
 * @author josemanuel
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        enum Evaluacion {PRIMERA, SEGUNDA, TERCERA}
        enum Modulo {PROGRAMACION, ENTORNOS_DE_DESARROLLO, SISTEMAS_INFORMATICOS,
                        BASE_DE_DATOS, LENGUAJE_DE_MARCAS}
        
        for(Evaluacion e : Evaluacion.values()){
            System.out.println((e.ordinal() + 1) + " evaluacion: " + e);
        }
        
        System.out.println ("Numero de modulos: " + Modulo.values().length);
        Modulo programacion = Modulo.valueOf("PROGRAMACION");
        System.out.println("El modulo de " +programacion + " se encuentra en la "
                + "posicion " + programacion.ordinal());
    }
    
}
