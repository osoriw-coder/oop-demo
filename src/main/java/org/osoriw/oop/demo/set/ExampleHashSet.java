package org.osoriw.oop.demo.set;

import java.util.HashSet;

public class ExampleHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Java");
		set.add("Python");
		set.add("Java"); // ignorado
		System.out.println(set);
	}

}
