/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea;

/**
 *
 * @author Sebastian
 */
public class SumaNatural {
    public static int sumar(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumar(n - 1);
    }
}
