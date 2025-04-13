package org.osoriw.oop.demo.set.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// Crear un LinkedHashSet de tipo String
		LinkedHashSet<String> frutas = new LinkedHashSet<>();

		// Agregar elementos
		frutas.add("Manzana");
		frutas.add("Banana");
		frutas.add("Naranja");
		frutas.add("Mango");
		frutas.add("Banana"); // Este duplicado será ignorado

		// Mostrar el contenido del LinkedHashSet
		System.out.println("Frutas en el LinkedHashSet:");
		for (String fruta : frutas) {
			System.out.println(fruta);
		}

		// Verificar si contiene un elemento
		if (frutas.contains("Mango")) {
			System.out.println("Sí contiene Mango.");
		}

		// Eliminar un elemento
		frutas.remove("Naranja");
		System.out.println("Después de eliminar Naranja: " + frutas);
	}
	
}
