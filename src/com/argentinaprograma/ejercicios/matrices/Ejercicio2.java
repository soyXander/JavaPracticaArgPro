/**
 * Una escuela primaria utiliza una matriz para calcular los promedios de sus alumnos.
 * Para ello tienen una matriz de 10 filas, donde cada fila representa a un alumno y 4 columnas.
 * Las primeras 3 columnas representan las notas de cada uno de los alumnos,
 * mientras que la 4 es el promedio de las mismas.
 * Se desea un programa que sea capaz de permitir la carga por teclado de las 3 notas de cada alumno,
 * de realizar el cálculo automático del promedio, de guardar el mismo en la 4 columna y
 * luego mostrar por pantalla cada una de las notas y el promedio obtenido. Por ejemplo.
 * Nota: tener en cuenta que generalmente las calificaciones y los promedios no suelen ser números enteros,
 * sino que pueden tener decimales.
 */
package com.argentinaprograma.ejercicios.matrices;

import java.util.Scanner;

/**
 * @author Xander.-
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		Double[][] notas = new Double[10][4];
		Double sum = 0.0;
		Scanner sc = new Scanner(System.in);

		// Carga de notas de los alumnos
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Ingrese las notas del alumno Nº" + (i + 1));
			for (int j = 0; j < 3; j++) {
				System.out.print("Ingrese la nota nº" + (j + 1) + ": ");
				notas[i][j] = sc.nextDouble();
				sum += notas[i][j];
			}
			notas[i][3] = sum / 3;
			sum = 0.0;
		}

		// Imprimir las notas y promedio de cada alumno
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota del alumno Nº" + (i + 1) + ":");
			for (int j = 0; j < 3; j++) {
				System.out.println("Nota nº" + (j + 1) + ": " + notas[i][j]);
			}
			System.out.println("Promedio: " + notas[i][3]);
		}
	}
}
