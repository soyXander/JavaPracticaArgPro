/**
 * Se necesita un vector que permita cargar por teclado el nombre de 10 animales. A partir de esta carga,
 * se desea otro vector que copie los mismos nombres pero en el orden inverso, es decir,
 * si los nombres son: perro, gato, lagartija, el nuevo vector debe contener: lagartija, gato, perro.
 * Una vez realizado el cambio, mostrar por pantalla ambos vectores para compararlos.
 */
package com.argentinaprograma.ejercicios.vectores;

/**
 * @author Xander.-
 */

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		String[] animales = new String[10];
		String[] animalesInvertidos = new String[10];
		Scanner sc = new Scanner(System.in);

		// Cargamos por teclado a los 10 animales
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el nombre del " + (i + 1) + " animal: ");
			animales[i] = sc.next();
		}

		// Agregamos los animales en orden inverso al vector
		int j = 9;
		for (int i = 0; i < 10; i++) {
			animalesInvertidos[j] = animales[i];
			j--;
		}

		// Imprimimos los vectores
		for (int i = 0; i < 10; i++) {
			if (i < 9) {
				System.out.print(animales[i] + ", ");
			} else {
				System.out.println(animales[i]);
			}
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (i < 9) {
				System.out.print(animalesInvertidos[i] + ", ");
			} else {
				System.out.println(animalesInvertidos[i]);
			}
		}
	}
}
