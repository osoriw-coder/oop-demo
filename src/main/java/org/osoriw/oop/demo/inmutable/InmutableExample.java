package org.osoriw.oop.demo.inmutable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InmutableExample {

	private static Logger LOGGER = LoggerFactory.getLogger(InmutableExample.class);

	public static void main(String[] args) {

		Persona persona = new Persona("Andres", 48);

		LOGGER.info(persona.getNombre());
		LOGGER.info(String.valueOf(persona.getEdad()));
	}

}
