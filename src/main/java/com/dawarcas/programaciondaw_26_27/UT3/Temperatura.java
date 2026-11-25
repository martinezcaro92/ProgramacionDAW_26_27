/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawarcas.programaciondaw_26_27.UT3;

/**
 *
 * @author josemanuel
 */
public class Temperatura {
    public static void main(String[] args) {
        double celsius = 36.6;
        double farenheit = celsius * 9 / 5 + 32;
        
        // 1º punto
        System.out.printf("Celsius: %.2f ºC | Farenheit: %.2f ºF %n", celsius, farenheit);
        //2º punto
        System.out.println((int)farenheit);
        //3º punto
        System.out.println(9/5);
        System.out.println(9.0/5);
        // Cuando los dos operadores (numerador y denomindador) son enteros, el resultado
        // de la operación es entera. Mientras que si uno de los operadores es double, 
        // el resputado de la operación se muestra tipo double (más resolución).
    }
}
