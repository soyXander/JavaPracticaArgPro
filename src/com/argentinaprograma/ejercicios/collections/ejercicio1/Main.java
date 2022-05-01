/**
 * Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza (tener en
 * cuenta todos sus atributos, constructores y métodos getters y setters).
 * A partir de ello:
 * a. Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.
 * b. Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas almacenadas.
 * c. Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar los nuevos datos
 * d. Agregar dos nuevas mascotas a la lista.
 * e. Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro”.
 */
package com.argentinaprograma.ejercicios.collections.ejercicio1;

import java.util.ArrayList;

/**
 * @author Xander.-
 */
public class Main {
	public static void main(String[] args) {
		ArrayList<Mascota> lista = new ArrayList<Mascota>();
		// Añade los elementos a la lista
		lista.add(new Mascota("Toby", "Perro", "Pitbull", "Macho", "Blanco", "Corto"));
		lista.add(new Mascota("Morgan", "Gato", "Siamés", "Macho", "Gris", "Corto"));
		lista.add(new Mascota("Orejas", "Conejo", "Mini Lop", "Hembra", "Marron claro", "Corto"));
		lista.add(new Mascota("Bruno", "Perro", "Golden retriever", "Macho", "Dorado", "Ondulado"));
		lista.add(new Mascota("Persival", "Perico", "Rostral", "Macho", "Azul claro", "Plumas"));

		// Recorrer la lista y muestra el nombre, especie y pelaje de cada mascota
		System.out.println("Lista de mascotas:");
		for (Mascota mascota : lista) {
			System.out.println("Nombre: " + mascota.getNombre() + " - Especie: " + mascota.getEspecie() + " - Pelaje: " + mascota.getPelaje());
		}

		// Cambiar el nombre de 2 mascotas
		String nombreViejo = lista.get(0).getNombre();
		lista.get(0).setNombre("Toby2");
		nombreViejo = lista.get(3).getNombre();
		lista.get(3).setNombre("Bruno2");
		System.out.println("\nSe cambio el nombre de 2 mascotas");

		// Recorrer la lista nuevamente con los nuevos datos
		System.out.println("\nLista de mascotas:");
		for (Mascota mascota : lista) {
			System.out.println("Nombre: " + mascota.getNombre() + " - Especie: " + mascota.getEspecie() + " - Pelaje: " + mascota.getPelaje());
		}

		// Agrega dos nuevas mascotas a la lista
		lista.add(new Mascota("Quien", "Perro", "Callejero", "Macho", "Blanco", "Ondulado"));
		lista.add(new Mascota("Perla", "Loro", "Eclecto", "Hembra", "Gris", "Corto"));
		System.out.println("\nSe agregaron 2 nuevas mascotas a la lista");

		// Recorrer la lista pero solo mostrando las mascotas que sean de la especie "Perro"
		System.out.println("\nLista de perros:");
		for (Mascota mascota : lista) {
			if (mascota.getEspecie().equals("Perro")) {
				System.out.println("Nombre: " + mascota.getNombre() + " - Especie: " + mascota.getEspecie() + " - Pelaje: " + mascota.getPelaje());
			}
		}
	}
}
