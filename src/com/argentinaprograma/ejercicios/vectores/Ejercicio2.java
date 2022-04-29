/**
 * En un vector de 15 posiciones se almacenan las edades de 15 alumnos.
 * Se desea un programa que sea capaz de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra
 * entre los estudiantes.
 */
package com.argentinaprograma.ejercicios.vectores;

import java.util.Scanner;

/**
 * @author Xander.-
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] vector = new int[15];
        Scanner teclado = new Scanner(System.in);
        // Pedimos las 15 edades de los alumnos al usuario
        for (int i = 0; i < 15; i++) {
            System.out.print("Introduce la edad del "+ (i + 1) +"º alumno: " );
            vector[i] = teclado.nextInt();
        }

        // Mostramos las edad mas grande y mas pequeña
        int edadMayor = vector[0];
        int edadMenor = vector[0];
        for (int i = 0; i < 15; i++) {
            if (vector[i] > edadMayor) {
                edadMayor = vector[i];
            }
            if (vector[i] < edadMenor) {
                edadMenor = vector[i];
            }
        }
        System.out.println("La edad mayor es: " + edadMayor);
        System.out.println("La edad menor es: " + edadMenor);
    }
}
