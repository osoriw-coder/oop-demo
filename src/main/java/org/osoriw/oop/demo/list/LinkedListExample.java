package org.osoriw.oop.demo.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// Crear una LinkedList de tipo String
		LinkedList<String> lista = new LinkedList<>();

		// Agregar elementos
		lista.add("Manzana");
		lista.add("Banana");
		lista.add("Cereza");

		// Agregar elemento al principio y al final
		lista.addFirst("Durazno");
		lista.addLast("Uva");

		// Mostrar todos los elementos
		System.out.println("Contenido de la lista:");
		for (String fruta : lista) {
			System.out.println(fruta);
		}

		// Obtener un elemento
		String primera = lista.getFirst();
		String ultima = lista.getLast();
		System.out.println("\nPrimera fruta: " + primera);
		System.out.println("Última fruta: " + ultima);

		// Eliminar un elemento
		lista.remove("Banana");
		System.out.println("\nLista después de eliminar 'Banana':");
		System.out.println(lista);
	}

}
