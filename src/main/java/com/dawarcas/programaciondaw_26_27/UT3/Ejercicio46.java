/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dawarcas.programaciondaw_26_27.UT3;

import java.util.ArrayList;
import java.util.List;

enum Genero { POP, ROCK, INDIE, ELECTRONICA}
/**
 *
 * @author josemanuel
 */
public class Ejercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Apartado 1
        List<String> canciones = new ArrayList<>();
        List<Genero> generos = new ArrayList<>();
        
        // Apartado 2
        canciones.add("Luces de neon");
        generos.add(Genero.POP);
        
        canciones.add("Carretera sin fin");
        generos.add(Genero.ROCK);
        
        canciones.add("Tardes de lluvia");
        generos.add(Genero.INDIE);
        
        canciones.add("Pulso digital");
        generos.add(Genero.ELECTRONICA);
        
        canciones.add("Verano eteno");
        generos.add(Genero.POP);
        
        System.out.println("Playlist: " );
        
        // Apartado 3
        for (int i = 0; i< canciones.size(); i++){
            System.out.println((i+1) + ". " + canciones.get(i) + "(" + generos.get(i) + ")");
        }
        
        // Apartado 4
        System.out.println("Primera: " + canciones.getFirst() + " (" + generos.getFirst() + ")");
        System.out.println("Última: " + canciones.getLast() + " (" + generos.getLast() + ")");
        
        //Apartado 5
        System.out.println("Playlist al revés: ");
        System.out.println(canciones.reversed());
        System.out.println(generos.reversed());
        
        //Apartado 6
        canciones.removeLast();
        generos.removeLast();

        for (int i = 0; i< canciones.size(); i++){
            System.out.println((i+1) + ". " + canciones.get(i) + "(" + generos.get(i) + ")");
        }

    }
    
}
