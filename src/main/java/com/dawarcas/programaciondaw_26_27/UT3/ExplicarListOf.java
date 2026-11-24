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
public class ExplicarListOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Se define una variable auxiliar "dias" para generar el ArrayList tareas
        //List<String> dias = List.of("lun", "mar", "mie");  // inmutable
        //List<String> tareas = new ArrayList<>(dias);       // copia modificable
        
        // Todo definido en una sóla línea de código
        List<String> tareas = new ArrayList<>(List.of("lun", "mar", "mie"));       // copia modificable
        
        // Añade variables al principio y al final
        tareas.addFirst("dom");                            // [dom, lun, mar, mié]
        tareas.addLast("jue");                             // [dom, lun, mar, mié, jue]
        
        // Imprime el primer y último elemento del ArrayList y el ArrayList invertido
        System.out.println(tareas.getFirst());             // dom
        System.out.println(tareas.getLast());              // jue
        System.out.println(tareas.reversed());             // [jue, mié, mar, lun, dom]

        
        
    }
    
}
