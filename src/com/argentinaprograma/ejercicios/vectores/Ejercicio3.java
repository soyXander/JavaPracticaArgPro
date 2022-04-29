/**
 * Se tienen tres vectores. En el primero de ellos se guarda un número de dni, en el segundo un nombre y
 * en el tercero un apellido. Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO y
 * mostrar cada uno de estos datos por pantalla.
 * Pista: tener en cuenta que el índice de cada vector es correspondiente al índice de los demás, es decir,
 * los datos contenidos en el índice cero del vector de dni,se corresponde con el índice cero del vector de nombres y
 * el de apellidos.
 */
package com.argentinaprograma.ejercicios.vectores;

public class Ejercicio3 {
	public static void main(String[] args) {
		int[] dni = {37123456, 21456789, 22741852};
		String[] nombres = {"Gabriel", "Leonardo", "Lina"};
		String[] apellidos = {"Smith", "Humerez", "Romero"};

		for (int i = 0; i < dni.length; i++) {
			System.out.println("DNI: " + dni[i] + ", Nombre: " + nombres[i] + ", Apellido: " + apellidos[i]);
		}
	}
}
