/**
 * En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias argentinas
 * en el último mes. A partir de esta información, un noticiero desea determinar el top 5 de las temperaturas más altas
 * para poder mostrar en la pantalla de su programa, para ello se necesita un programa que sea capaz de recorrer el
 * vector de temperaturas, determinar las 5 más altas y copiarlas en un nuevo vector de 5 posiciones
 */
package com.argentinaprograma.ejercicios.vectores;

/**
 * @author Xander.-
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		int[] maxTemps = new int[23];
		int[] top5Temps = new int[5];

		// Inicializar vector de temperaturas maximas con valores aleatorios entre 0 y 60
		System.out.print("Lista de temperaturas: ");
		for (int i = 0; i < maxTemps.length; i++) {
			maxTemps[i] = (int) (Math.random() * (60 - 0) + 0);
			if (i < maxTemps.length - 1) {
				System.out.print(maxTemps[i] + ", ");
			} else {
				System.out.println(maxTemps[i]);
			}
		}

		// Ordenar vector de temperaturas maximas
		for (int i = 0; i < maxTemps.length; i++) {
			for (int j = i + 1; j < maxTemps.length; j++) {
				if (maxTemps[i] < maxTemps[j]) {
					int temp = maxTemps[i];
					maxTemps[i] = maxTemps[j];
					maxTemps[j] = temp;
				}
			}
		}

		// Copiar vector de temperaturas maximas en vector de temperaturas top5
		for (int i = 0; i < top5Temps.length; i++) {
			top5Temps[i] = maxTemps[i];
		}

		// Mostrar top 5 de temperaturas maximas
		System.out.println("\nLas temperaturas más altas son: ");
		for (int i = 0; i < top5Temps.length; i++) {
			System.out.println("Top " + (i + 1) + ": " + top5Temps[i] + "ºC");
		}
	}
}
