package com.ipartek.formacion.Hola.pojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibroTest {

	@Test
	public void test() {

		Libro libroJava = new Libro();

		// libroJava.titulo = "Java 7";
		libroJava.setTitulo("Java 7");

		assertEquals("Java 7", libroJava.getTitulo());

	}

	@Test
	public void testNumeroPaginas() {

		Libro l = new Libro();

		// Numero paginas positivo
		l.setNumeroPaginas(300);
		assertEquals(300, l.getNumeroPaginas());
		System.out.println(l.getNumeroPaginas());
		// Numero de paginas negativo o ==0
		l.setNumeroPaginas(-300);
		assertEquals(-300, l.getNumeroPaginas());
		System.out.println(l.getNumeroPaginas());

	}

	@Test
	public void testConstructorPorDefecto() {
		Libro l = new Libro();
		assertEquals("desconocido", l.getTitulo());
		System.out.println(l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		System.out.println(l.getAutor());
		assertEquals(0, l.getNumeroPaginas());
		System.out.println(l.getNumeroPaginas());

	}

	@Test
	public void testConstructorConParametros() {
		Libro l = new Libro("Java7", "desconocido", 324);
		assertEquals("java7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(0, l.getNumeroPaginas());

		// paginas negativas
		l = new Libro("Java7", "desconocido", -1);
		assertEquals("java7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(0, l.getNumeroPaginas());

	}

}
