package org.osoriw.oop.demo.list;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Crear un Vector
		Vector<String> frutas = new Vector<>();

		// Agregar elementos al Vector
		frutas.add("Manzana");
		frutas.add("Banano");
		frutas.add("Cereza");
		frutas.add("Naranja");

		// Mostrar el contenido del Vector
		System.out.println("Contenido del Vector: " + frutas);

		// Acceder a un elemento específico
		System.out.println("Elemento en el índice 2: " + frutas.get(2)); // Cereza

		// Eliminar un elemento
		frutas.remove("Banano");
		System.out.println("Contenido del Vector después de eliminar 'Banano': " + frutas);

		// Verificar si el Vector contiene un elemento
		if (frutas.contains("Manzana")) {
			System.out.println("El Vector contiene 'Manzana'.");
		}

		// Obtener el tamaño del Vector
		System.out.println("Tamaño del Vector: " + frutas.size());
	}
	
}
