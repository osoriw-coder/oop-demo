package org.osoriw.oop.demo.inmutable;

//Debido a que esta clase se declara cono final, no podr+a ser extendida desde otras clases.
public final class Persona {

	private final String nombre;
	private int edad;

	// Constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// Métodos getter
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

}
