package com.ipartek.formacion.Hola;

public class Dado {

	static String[] alumnos = {

			"Aar�n", "Eneko", "Itsaso", "Ivan", "Guillermo", "Lozoya", "Josu", "Nerea", "Garbi�e", "Egoitz", "Pavel",
			"Alberto" };

	// listar alumnos mediante un FOR
	public static void listar() {
		String alumno = "";
		for (int i = 0; i < alumnos.length; i++) {
			alumno = alumnos[i];
			System.out.println(i++ + " - " + alumno);
		}
	}

	// listar alumnos mediante un FOREACH
	public static void listarForEach() {
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}
	}

	public static void main(String[] args) {
		int numAleatorio = (int) (Math.random() * alumnos.length);
		// String afortunado = alumnos[numAleatorio];
		// int numAleatorio = Utilidades.getNumeroAleatorio(alumnos.length - 1);
		System.out.println("El afortunado es: " + numAleatorio);

		System.out.println("--------Listado----------");
		listar();
	}

}
