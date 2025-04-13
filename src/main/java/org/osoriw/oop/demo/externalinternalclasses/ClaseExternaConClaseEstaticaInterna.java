package org.osoriw.oop.demo.externalinternalclasses;

public class ClaseExternaConClaseEstaticaInterna {
	private static String mensaje = "Hola desde la clase externa";

	// Clase interna estática
	public static class ClaseInterna {
		public void mostrarMensaje() {
			// Puede acceder a miembros estáticos de la clase externa
			System.out.println(mensaje);
		}
	}

}
