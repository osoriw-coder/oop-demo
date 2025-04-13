package org.osoriw.oop.demo.list;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample {

	public static void main(String[] args) {
		Collection<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D"); // permite duplicados
		System.out.println(lista);
	}
	
}
