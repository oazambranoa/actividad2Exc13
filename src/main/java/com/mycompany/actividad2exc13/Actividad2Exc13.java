/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc13;

/**
 *
 * @author omarz
 */
/*Enunciado
    24. Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
la esfera de mayor peso. 
*/

import java.util.Scanner;

public class Actividad2Exc13 {
    public static void main(String[] args) {
        
        double pesoA, pesoB, pesoC;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = scanner.nextDouble();

        // Determinar cuál es la esfera de mayor peso
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es la de mayor peso.");
        } else {
            System.out.println("Todas las esferas tienen el mismo peso.");
        }

        scanner.close();
    }
}