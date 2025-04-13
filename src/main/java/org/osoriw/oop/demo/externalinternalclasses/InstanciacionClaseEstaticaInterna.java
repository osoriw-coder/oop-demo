package org.osoriw.oop.demo.externalinternalclasses;

public class InstanciacionClaseEstaticaInterna {

	public static void main(String[] args) {
		// No se necesita instancia de Externa
		ClaseExternaConClaseEstaticaInterna.ClaseInterna obj = new ClaseExternaConClaseEstaticaInterna.ClaseInterna();
		obj.mostrarMensaje();
	}

}
