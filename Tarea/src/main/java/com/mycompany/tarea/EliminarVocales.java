/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea;

/**
 *
 * @author Sebastian
 */
public class EliminarVocales {
    public String eliminaVocales(String cadena) {
    if (cadena.length() == 0) {
        return cadena;
    }
    if (cadena.charAt(0) == 'a' || cadena.charAt(0) == 'e' || cadena.charAt(0) == 'i' || cadena.charAt(0) == 'o' || cadena.charAt(0) == 'u' || 
        cadena.charAt(0) == 'A' || cadena.charAt(0) == 'E' || cadena.charAt(0) == 'I' || cadena.charAt(0) == 'O' || cadena.charAt(0) == 'U') {
        return eliminaVocales(cadena.substring(1));
    } else {
        return cadena.charAt(0) + eliminaVocales(cadena.substring(1));
    }
}
}
