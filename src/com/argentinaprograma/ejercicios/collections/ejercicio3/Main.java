/**
 * Crear una stack que permita objetos de tipo Autos, donde cada objeto auto debe tener: num_patente, marca, modelo, color, chasis.
 * Cargar la pila con 7 autos diferentes luego hacer lo siguiente:
 *      a. Buscar un auto de color rojo.
 *      b. Mostrar el auto que se encuentra en la cima de la pila.
 *      c. Borrar el auto que se encuentra en la cima de la pila.
 *      d. Agregar dos nuevos autos a la pila.
 * Recorrer la pila mostrando el nuevo contenido luego de las operaciones realizadas.
 */

package com.argentinaprograma.ejercicios.collections.ejercicio3;

import java.util.Stack;

/**
 * @author Xander.-
 */
public class Main {

    public static Stack<Auto> autos = new Stack<>();

    public static void main(String[] args) {
        addCar(7);
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }

    public static void addCar(int cantidad) {
        Stack<Auto> autos = new Stack<>();
        for (int i = 0; i < cantidad; i++) {
            autos.push(new Auto(randomPatente(), randomMarca(), randomModelo(), "Rojo", "ABC123"));
        }
    }

    public static String randomPatente() {
        String[] l = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] n = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String numPatente = "";
        for (int i = 0; i < 3; i++) {
            numPatente += l[(int) (Math.random() * l.length)];
        }
        for (int i = 0; i < 3; i++) {
            numPatente += n[(int) (Math.random() * n.length)];
        }
        return numPatente;
    }

    public static String randomMarca() {
        String[] marcas = {"Chevrolet", "Fiat", "Ford", "Toyota", "Volkswagen"};

        return marcas[(int) (Math.random() * marcas.length)];
    }

    public static String randomModelo() {
        String[] modChevrolet = {"Cruze", "Spark", "Camaro", "Cruiser"};
        String[] modFiat = {"Punto", "Panda", "500", "Palio"};
        String[] modFord = {"Fiesta", "Focus", "Fusion", "Eco Sport"};
        String[] modToyota = {"Corolla", "Auris", "Yaris", "Avensis"};
        String[] modVolkswagen = {"Golf", "Gol", "Bora", "T-Cross"};

        switch (randomMarca()) {
            case "Chevrolet":
                return modChevrolet[(int) (Math.random() * modChevrolet.length)];
            case "Fiat":
                return modFiat[(int) (Math.random() * modFiat.length)];
            case "Ford":
                return modFord[(int) (Math.random() * modFord.length)];
            case "Toyota":
                return modToyota[(int) (Math.random() * modToyota.length)];
            case "Volkswagen":
                return modVolkswagen[(int) (Math.random() * modVolkswagen.length)];
        }
        return "";
    }
}
