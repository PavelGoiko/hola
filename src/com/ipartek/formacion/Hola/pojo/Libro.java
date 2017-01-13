package com.ipartek.formacion.Hola.pojo;

public class Libro {

	// atributos

	private String titulo;
	private String autor;
	private int numeroPaginas;

	/*
	 * Constructores Sirven para instanciar objetos de la misma clase <br>
	 * tienen el mismo nombre de la clase y <br> no hace falta especificar
	 * <trong>return</strong>
	 * 
	 * Sobrecarga es un metodo con el mismo nombre y un mismo return, <br> pero
	 * diferentes parametros
	 * 
	 */

	// constructores:
	// constructor por defecto

	public Libro() {
		super();
		this.numeroPaginas = 0;
		this.titulo = "desconocido";
		this.autor = "anonimo";
	}

	// constructor con parametros
	public Libro(String titulo, String autor, int numeroPaginas) {
		super(); // recomendable ponerlo siempre
		this.setNumeroPaginas(numeroPaginas);
		this.titulo = titulo;
		this.autor = autor;

	}

	// Getters Setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = (numeroPaginas < 0) ? 0 : numeroPaginas;

	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
	}

	// metodos

}
