/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dawarcas.programaciondaw_26_27.UT3;

/**
 *
 * @author josemanuel
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] notas = {
            {7, 5, 8, 6},
            {9, 8, 7, 10},
            {4, 6, 5, 7}};
                
        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "\t");
                suma += notas[i][j];
            }
            double media = (double) suma / notas[i].length;
            System.out.println("Media: " + media);
            
        }
    }
    
}
