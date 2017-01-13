package com.ipartec.formacion.hola.ejercicios;

import com.ipartek.formacion.Hola.pojo.Libro;

public class TopVentasLibroArray2 {

	public static void main(String[] args) {
		Libro libro = null;
		System.out.println("Top 5 libros mas vendidos:");

		Libro[] aLibros = new Libro[3];
		aLibros[0] = new Libro("El laberinto de los espiritus", "Carlos Ruiz Zafon", 480);
		aLibros[1] = new Libro("Todo esto te daré", "Dolores Redondo", 350);
		aLibros[2] = new Libro("El silencio de la ciudad blanca", "Eva García Saénz de Urturi", 400);

		for (int i = 0; i < aLibros.length; i++) {
			libro = aLibros[i];
			System.out.println(libro.getTitulo());
		}

	}

}
