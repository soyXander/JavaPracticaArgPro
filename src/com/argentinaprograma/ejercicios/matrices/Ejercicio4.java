/**
 * Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar cada plato del menú y
 * sus correspondientes ingredientes que contiene.
 * Para ello, cada fila representa un plato principal en donde en la primera columna se especifica su nombre
 * (por ejemplo: Milanesa), y en las demás los posibles acompañamientos que puede tener el plato
 * (por ejemplo, puré, ensalada rusa, papas fritas, ensalada de lechuga y tomate, ensalada de zanahoria, etc).
 * En caso de que tenga el plato menos de 4 tipos de acompañamiento, en la matriz se cargará la palabra "Ninguno"
 * en las posiciones que queden vacías.
 * Se desea un programa que sea capaz de permitir la carga de la matriz, de buscar un plato en particular que
 * un cliente ingrese por teclado y mostrarle de forma automática los posibles acompañamientos del mismo.
 */
package com.argentinaprograma.ejercicios.matrices;

import java.util.Scanner;

/**
 * @author Xander.-
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		String[][] menu = new String[2][5];

		Scanner sc = new Scanner(System.in);

		//
		for (int i = 0; i < menu.length; i++) {
			System.out.print("Ingrese el plato principal: ");
			menu[i][0] = sc.nextLine();
			for (int j = 1; j < 5; j++) {
				System.out.print("Ingrese el acompañamiento del plato: ");
				menu[i][j] = sc.nextLine();
			}
		}

		System.out.print("Ingrese su pedido: ");
		String pedido = sc.nextLine();
		for (int i = 0; i < menu.length; i++) {
			if (pedido.equalsIgnoreCase(menu[i][0])) {
				System.out.println("Pedido: " + menu[i][0]);
				System.out.println("Acompañamientos:");
				for (int j = 1; j < 5; j++) {
					if (menu[i][j] != null) {
						System.out.println("- " + menu[i][j]);
					}
				}
				break;
			} else {
				System.out.println("No contamos con " + pedido + " en el menú");
				break;
			}
		}
	}
}
