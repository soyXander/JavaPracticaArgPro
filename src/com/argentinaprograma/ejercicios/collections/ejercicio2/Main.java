/**
 * Crear una clase persona que tenga los siguientes atributos: dni, nombre, apellido, dirección, celular, edad
 * (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
 * A partir de ello:
 *      a. Crear una LinkedList de tipo Persona y agregar 20 personas distintas.
 *      b. Crear dos LinkedLists de tipo Persona diferentes a la primera, una para almacenar a los menores de edad y
 *         otra para los mayores.
 *      c. Recorrer la lista principal buscando a las personas que sean mayores de 18 años. En caso que una persona
 *         tenga o sea mayor a 18 años, agregarla a la lista de mayores, caso contrario agregarla a una lista de menores.
 *      d. Una vez realizada la separación, recorrer ambas nuevas listas y mostrar por pantalla el nombre, apellido
 *         y edad de cada una de las personas contenidas en cada lista.
 */
package com.argentinaprograma.ejercicios.collections.ejercicio2;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static LinkedList<Persona> listaPersonas = new LinkedList<>();
    public static LinkedList<Persona> listaPersonasMayores = new LinkedList<>();
    public static LinkedList<Persona> listaPersonasMenores = new LinkedList<>();

    public static void main(String[] args) {
        generarPersonas(20);

        for (Persona persona : listaPersonas) {
            if (persona.getEdad() >= 18) {
                listaPersonasMayores.add(persona);
            }
            else {
                listaPersonasMenores.add(persona);
            }
        }

        System.out.println("Personas de 18 años y mayores:");
        for (Persona persona : listaPersonasMayores) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad());
        }
        System.out.println("\nPersonas menores de 18 años:");
        for (Persona persona : listaPersonasMenores) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad());
        }
    }

    public static void generarPersonas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Persona persona = new Persona(dniRandom(), nombreRandom(), apellidoRandom(), direccionRandom(), celularRandom(), edadRandom());
            listaPersonas.add(persona);
        }
    }

    public static Random r = new Random();
    public static String nombreRandom() {
        String[] nombres = new String[]
                {"Juan", "Pedro", "Maria", "Ana", "Juana", "Jose", "Luis", "Jorge", "Carlos", "Daniel", "Sofia"};
        String nombreRandom = nombres[r.nextInt(nombres.length)];
        return nombreRandom;
    }

    public static String apellidoRandom() {
        String[] apellidos = new String[]
                {"Gonzalez", "Perez", "Rodriguez", "Lopez", "Gomez", "Sanchez", "Martinez", "Romero", "Suarez", "Humerez"};
        String apellidoRandom = apellidos[r.nextInt(apellidos.length)];
        return apellidoRandom;
    }

    public static String direccionRandom() {
        String[] direcciones = new String[]
                {"Calle 1", "Calle 2", "Calle 3", "Calle 4", "Calle 5", "Calle 6", "Calle 7", "Calle 8", "Calle 9", "Calle 10"};
        String direccionRandom = direcciones[r.nextInt(direcciones.length)];
        return direccionRandom;
    }

    public static int edadRandom() {
        int edadRandom = (int) (Math.random() * (75 - 1) + 1);
        return edadRandom;
    }

    public static int dniRandom() {
        int dniRandom = (int) (Math.random() * (9999999 - 1000000) + 1000000);
        return dniRandom;
    }

    public static String celularRandom() {
        int celularRandom = (int) (Math.random() * (154000000 - 154999999) + 15400000);
        return String.valueOf(celularRandom);
    }
}
