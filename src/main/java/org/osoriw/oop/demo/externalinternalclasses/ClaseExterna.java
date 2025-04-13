package org.osoriw.oop.demo.externalinternalclasses;

public class ClaseExterna {

	private String mensaje = "Hola desde la clase externa";

	public class ClaseInterna {
		public void mostrarMensaje() {
			System.out.println(mensaje); // Puede acceder a miembros privados
		}
	}

}
