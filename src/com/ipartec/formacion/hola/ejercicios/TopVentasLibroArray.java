package com.ipartec.formacion.hola.ejercicios;

import com.ipartek.formacion.Hola.pojo.Libro;

public class TopVentasLibroArray {

	public static void main(String[] args) {
		Libro libro = null;
		System.out.println("Top 5 libros mas vendidos:");

		Libro[] aLibros = { new Libro("El laberinto de los espiritus", "Carlos Ruiz Zafon", 468),
				new Libro("Todo esto te daré", "Dolores Redondo", 350), new Libro("Patria", "Fernando Aramburu", 270),
				new Libro("El asesinato de Socrates", "Marcos Chicot", 380),
				new Libro("El silencio de la ciudad blanca", "Eva García Saénz de Urturi", 400) };

		for (int i = 0; i < aLibros.length; i++) {
			libro = aLibros[i];
			System.out.println(libro.getTitulo());
		}

	}

}
