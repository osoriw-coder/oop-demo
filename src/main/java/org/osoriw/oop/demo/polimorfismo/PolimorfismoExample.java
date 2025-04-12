package org.osoriw.oop.demo.polimorfismo;

public class PolimorfismoExample {

	public static void main(String[] args) {
		// Polimorfismo: una referencia de tipo Animal puede apuntar a objetos de las
		// subclases Perro y Gato
		Animal miAnimal = new Animal(); // Instancia de Animal
		Animal miPerro = new Perro(); // Instancia de Perro
		Animal miGato = new Gato(); // Instancia de Gato

		// Llamadas a hacerSonido(), pero el comportamiento varía dependiendo del tipo
		// real del objeto
		miAnimal.hacerSonido(); // Llama al método de Animal
		miPerro.hacerSonido(); // Llama al método sobrescrito en Perro
		miGato.hacerSonido(); // Llama al método sobrescrito en Gato

		System.out.println("\nPolimorfismo de sobrecarga:");
		
		// Polimorfismo de sobrecarga
		Calculadora calc = new Calculadora();
		System.out.println(calc.sumar(3, 4)); // Llama al método con dos enteros
		System.out.println(calc.sumar(3.5, 4.5)); // Llama al método con dos dobles
		System.out.println(calc.sumar(1, 2, 3)); // Llama al método con tres enteros
	}

}
