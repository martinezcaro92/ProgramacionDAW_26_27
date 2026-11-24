package com.dawarcas.programaciondaw_26_27.UT3;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josemanuel
 */
public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Apartado 1
        List<Double> notasAux = List.of(6.5, 8.0, 4.75, 9.25, 7.0);
        List<Double> notas = new ArrayList<>(notasAux);
        
        // Apartado 2
        notas.add(5.5);  // También nos valdría un método .addLast(5.5)
        notas.add(8.5);
        
        // Apartado 3
        double suma = 0;
        for(double n : notas){
            suma = suma + n;
        }
        
        // Apratado 4
        double media = suma / notas.size();
        System.out.println("La lista es: " + notas);
        System.out.println("El numero de elementos de la lista: " + notas.size());
        System.out.printf("La media obtenida es: %.3f %n", media);
        System.out.printf("La media obtenida es: %f %n", media);

    }
    
}
