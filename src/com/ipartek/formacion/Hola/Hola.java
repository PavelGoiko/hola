package com.ipartek.formacion.Hola;

import com.ipartek.formacion.Hola.pojo.LibroMalHecho;

/**
 * Clase para realizar un 'Hello World'
 * 
 * @author Curso
 *
 */
public class Hola {
	/**
	 * metodo 'main' para ejecutar la clase
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		// esto es un comentario de linea
		/*
		 * comentario de bloque, permite más de una linea
		 * 
		 * 
		 */

		// Vamos a estanciar un objeto de la clase Libro

		LibroMalHecho libroJava = new LibroMalHecho();
		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		libroJava.autor = "Thomas Jeferson";
		libroJava.describete();
		// for (int i = 0; i < 10; i++) {
		libroJava.escribir(10);
		// }

		LibroMalHecho libroPHP = new LibroMalHecho();
		libroPHP.numeroPaginas = 420;
		libroPHP.nombre = "PHP";
		libroPHP.autor = "Jessica Orton";
		libroPHP.describete();
		// for (int i = 0; i < 10; i++) {
		libroJava.escribir(10);
		// }

		LibroMalHecho libroHTML = new LibroMalHecho();
		libroHTML.numeroPaginas = 510;
		libroHTML.nombre = "HTML";
		libroHTML.autor = "John Morrison";
		libroHTML.describete();
		// for (int i = 0; i < 10; i++) {
		libroJava.escribir(10);
		// }

	}

}
