package org.osoriw.oop.demo.externalinternalclasses;

public class InstanciacionClaseInterna {

	public static void main(String[] args) {
		ClaseExterna externa = new ClaseExterna();
		ClaseExterna.ClaseInterna interna = externa.new ClaseInterna(); // ← así se instancia
		interna.mostrarMensaje();
	}

}
