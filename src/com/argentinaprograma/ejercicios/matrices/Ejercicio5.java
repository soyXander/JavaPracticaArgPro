/**
 * Una empresa constructora desea llevar a cabo un premio para sus obreros que hayan realizado horas extras
 * en los últimos 6 meses. Para ello, lleva una matriz de control de 15 filas x 6 columnas, donde cada fila
 * corresponde a un empleado distinto y donde cada columna representa el total de horas trabajadas por mes.
 * El monto de horas normal trabajado x mes es de 8 horas diarias, 5 días a la semana, 4 semanas por mes,
 * es decir: 160 horas. Todo monto superior a este es considerado como horas extras.
 * Se desea un programa que permita la carga de horas trabajadas por cada obrero y que sea capaz de determinar
 * aquellos que hayan realizado horas extras. Para registrar las horas extras realizadas se utilizará un vector
 * de 15 posiciones en donde se deberá calcular y almacenar la cantidad de horas extras de cada obrero.
 * En caso de que no haya realizado horas extras, deberá incluirse un número 0.
 */
package com.argentinaprograma.ejercicios.matrices;

import java.util.Scanner;

/**
 * @author Xander.-
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] horas = new int[15][6];
		int[] horasExtras = new int[15];
		int horasNormales = 160;

		// Carga de horas trabajas por cada obrero
		System.out.println("Ingrese las horas trabajadas por cada obrero");
		for (int i = 0; i < horas.length; i++) {
			for (int j = 0; j < horas[i].length; j++) {
				System.out.print("Ingrese las horas trabajadas por el obrero " + (i + 1) + " en el mes " + (j + 1) + ": ");
				horas[i][j] = sc.nextInt();
				// Verificar si el empleado realizo horas extras
				int horasExtrasMes = horas[i][j] - horasNormales;
				if (horasExtrasMes > 0) {
					horasExtras[i] += horasExtrasMes;
				}
			}
		}
		System.out.println();
		// Imprimir las horas extras de cada obrero
		System.out.println("Horas extras realizadas por cada obrero");
		for (int i = 0; i < horasExtras.length; i++) {
			System.out.println("Horas extras realizadas por el obrero " + (i + 1) + ": " + horasExtras[i]);
		}
	}
}
