/**
 * Se desea un programa que sea capaz de rellenar completamente con números 1 una matriz de 4 x 4
 * a excepción de su diagonal principal, la cual debe ser rellenada con números 0.
 * Una vez realizada la carga, se desea mostrar la matriz de forma ordenada por pantalla.
 */
package com.argentinaprograma.ejercicios.matrices;

/**
 * @author Xander.-
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		int[][] matriz = new int[10][10];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					matriz[i][j] = 0;
				} else {
					matriz[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
