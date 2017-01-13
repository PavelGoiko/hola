package com.ipartec.formacion.hola.ejercicios;

import com.ipartek.formacion.Hola.pojo.Libro;

public class TopVentasLibro {

	public static void main(String[] args) {
		System.out.println("Top 5 libros mas vendidos:");

		Libro libro1 = new Libro("El laberinto de los espiritus", "Carlos Ruiz Zafon", 468);
		System.out.println(libro1.toString());
		Libro libro2 = new Libro("Todo esto te daré", "Dolores Redondo", 350);
		System.out.println(libro2.toString());
		Libro libro3 = new Libro("Patria", "Fernando Aramburu", 270);
		System.out.println(libro3.toString());
		Libro libro4 = new Libro("El asesinato de Socrates", "Marcos Chicot", 380);
		System.out.println(libro4.toString());
		Libro libro5 = new Libro("El silencio de la ciudad blanca", "Eva García Saénz de Urturi", 400);
		System.out.println(libro5.toString());

	}

}
