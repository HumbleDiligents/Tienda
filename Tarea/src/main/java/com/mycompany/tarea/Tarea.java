/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea;

/**
 *
 * @author Sebastian
 */
public class Tarea {

    public static void main(String[] args) {
        //SumaNatural suma = new SumaNatural();
        int resultado = SumaNatural.sumar(5);
        System.out.println("La suma de los números naturales hasta 5 es: " + resultado);
        
         String oracion = "Eliminare las vocales de esta oración";
         EliminarVocales eliminar = new EliminarVocales();
         String oracionResultante = eliminar.eliminaVocales(oracion);
         System.out.println("Oración sin vocales: " + oracionResultante);
    }
    }

