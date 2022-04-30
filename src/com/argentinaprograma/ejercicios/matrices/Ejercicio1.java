/**
 * Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 3 partidos
 * que jugaron, donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo.
 * Se necesita un programa que sea capaz de permitir la carga de los goles, calcular el promedio de goles realizado
 * por cada jugador y almacenar el resultado en un vector de 5 posiciones, donde cada posición representará a un jugador.
 * Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:
 * <p>
 * Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.
 */
package com.argentinaprograma.ejercicios.matrices;

import java.util.Scanner;

/**
 * @author Xander.-
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		int[][] matriz = new int[5][3];
		matriz[0][0] = 0;
		int[] promedio = new int[5];
		int sum = 0;
		int prom = 0;
		Scanner sc = new Scanner(System.in);

		// Carga de goles de los jugadores
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Ingrese la cantidad de goles del jugador " + (i + 1) + " en el partido " + (j + 1) + ": ");
				matriz[i][j] = sc.nextInt();
				sum += matriz[i][j];
			}
			promedio[i] = sum / 3;
			sum = 0;
		}

		// Imprimir promedios
		for (int i = 0; i < promedio.length; i++) {
			prom += promedio[i];
			System.out.println("Promedio de goles del jugador " + (i + 1) + " es de: " + promedio[i]);
		}
	}
}
