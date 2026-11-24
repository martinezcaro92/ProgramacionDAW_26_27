/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dawarcas.programaciondaw_26_27.UT3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josemanuel
 */
public class Ejercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Apartado 1
        List<String> compra = new ArrayList<>();
        compra.add("pan");
        compra.add("leche");
        compra.add("huevos");
        compra.add("tomate");
        compra.add("arroz");
        
        //Apartado 2
        System.out.println(compra);
        
        //Apartado 3
        compra.remove("huevos");
        compra.set(compra.indexOf("pan"), "pan integral");
        System.out.println(compra);
        
        //Apartado 4
        compra.add(1, "cafe");
        System.out.println(compra);
        
        //Apartado 5
        System.out.println("Tamaño de la compra: " + compra.size());
        System.out.println("¿Contine leche?" + compra.contains("leche"));
        System.out.println("La posición de arroz es: " + compra.indexOf("arroz"));
    }
    
}
