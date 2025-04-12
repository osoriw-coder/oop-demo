package org.osoriw.oop.demo.volatilevariable;

public class VolatileExample {

	/*
	 * ¿Qué hace este código? 
	 * 1. Hay una variable bandera marcada como volatile.
	 * 2. Un hilo (lector) entra en un bucle esperando que bandera sea true.
	 * 3. Otro hilo (escritor) espera un segundo y luego pone bandera en true.
	 */
	
	/*
	 * ¿Por qué volatile? 
	 * Sin volatile, es posible que el hilo lector nunca vea el cambio de valor 
	 * hecho por el hilo escritor debido a que el valor puede estar en la caché 
	 * del hilo. Al marcar bandera como volatile, garantizas que:
	 * 
	 * 1. Siempre se lee su valor directamente desde la memoria principal. 
	 * 2. Los cambios hechos por un hilo son visibles para otros hilos inmediatamente.
	 **/

	private static volatile boolean bandera = false;

	public static void main(String[] args) {

		// Hilo que espera hasta que la bandera se vuelva verdadera
		Thread lector = new Thread(() -> {
			System.out.println("Hilo lector esperando que bandera sea true...");
			while (!bandera) {
				// Esperando que bandera cambie a true
			}
			System.out.println("Bandera es true, hilo lector termina.");
		});

		// Hilo que cambia la bandera a true después de un segundo
		Thread escritor = new Thread(() -> {
			try {
				Thread.sleep(5000); // Espera 1 segundo
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			bandera = true;
			System.out.println("Bandera cambiada a true por el hilo escritor.");
		});

		lector.start();
		escritor.start();
	}

}
