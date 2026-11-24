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
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> diasAux = List.of("lunes", "martes", "miércoles");
        List<String> dias = new ArrayList<>(diasAux);   // esta linea corrige el error del ejercicio
        dias.add("jueves");
        System.out.println(dias);
    }
    
}
