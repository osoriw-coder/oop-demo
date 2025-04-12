package org.osoriw.oop.demo.list;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample {

	public static void main(String[] args) {
		Collection<String> lista = new ArrayList<>();
		lista.add("Java");
		lista.add("Python");
		lista.add("Java"); // permite duplicados
		System.out.println(lista);
	}
	
}
