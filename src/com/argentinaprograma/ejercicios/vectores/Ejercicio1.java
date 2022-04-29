/**
 * Ejercicio de Vectores 1:
 * Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
 * Realizar un programa que permita la carga por teclado de los 10 números solicitados
 */
package com.argentinaprograma.ejercicios.vectores;

import java.util.Scanner;

/**
 * @author Xander.-
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner teclado = new Scanner(System.in);
        // Pedimos los 10 números al usuario
        for (int i = 0; i < 10;) {
            System.out.print("Introduce un número: ");
            int inputNum = teclado.nextInt();
            // Comprobamos que el número esté entre 1 y 100
            if (inputNum > 0 && inputNum <= 100) {
                vector[i] = inputNum;
                i++;
            } // Si no está entre 1 y 100, se le pide que vuelva a introducir un número
            else {
                System.out.println("El número introducido no es válido");
            }
        }

        System.out.println("Los números introducidos son: ");
        // Recorremos el vector para imprimir los números introducidos
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(vector[i] + ", ");
            } else {
                System.out.print(vector[i]);
            }
        }
    }
}