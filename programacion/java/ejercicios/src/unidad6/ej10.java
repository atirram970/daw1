package unidad6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

public class ej10 {

	public static void main(String[] args) {
		// Escribe un programa capaz de quitar los comentarios de un programa de Java.
		// Se utilizaría por consola de la siguiente manera:
		// no_comments PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
		// Debes controlar los comentarios de los 3 tipos.
		// - Comentarios de una línea //
		// - Comentarios de bloque /* … */
		// - Comentarios javadoc /** … */

		try {
			String rutaOrigen = "ficheros/ClaseComentada.java";
			String rutaDestino = "ficheros/ClaseSinComentarios.java";
			File programaComentado = new File(rutaOrigen);
			File programaSinComentarios = new File(rutaDestino);
			FileReader fr = new FileReader(programaComentado);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				if (StringUtils.contains(line, "//")) {
					System.out.println("Comentario de una linea encontrado");
				}
				int posicionComentario = StringUtils.indexOf(line, "//");
				String previoComentario = StringUtils.substring(line, 0, posicionComentario);
				if (StringUtils.isNotBlank(previoComentario)) {
					System.out.println(line);
				} else {
					System.out.println(line);
				}

				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Métodos transladados de la clase ej10Extra.java

	/**
	 * @param line
	 * @return
	 */
	private static boolean finalizaComentario(String line) {
		boolean finComentario = false;
		boolean posibleCierre = false;
		final char BARRA = '/';
		final char ASTERISCO = '*';
		final char COMILLAS = '"';
		boolean abierto = false;
		char[] charArray = line.toCharArray();
		for (char c : charArray) {
			if (c == COMILLAS && !abierto) {
				abierto = true;
			} else if (c == COMILLAS && abierto) {
				abierto = false;
			} else if (!abierto && c == ASTERISCO) {
				posibleCierre = true;
			} else if (!abierto && posibleCierre && c == BARRA) {
				finComentario = true;
			}
		}
		return finComentario;
	}

	/**
	 * Devuelve 0 si en la línea no existe ningún comentario Devuelve 1 si en la
	 * línea existe un comentario de línea Devuelve 2 si en la línea comienza un
	 * comentario de bloque
	 * 
	 * @param line
	 * @return esComentario
	 */
	private static int esComentario(String line) {
		int esComentario = 0;
		boolean posibleComentario = false;
		final char BARRA = '/';
		final char ASTERISCO = '*';
		final char COMILLAS = '"';
		boolean abierto = false;
		char[] charArray = line.toCharArray();
		for (char c : charArray) {
			if (c == COMILLAS && !abierto) {
				abierto = true;
			} else if (c == COMILLAS && abierto) {
				abierto = false;
			} else if (!abierto && posibleComentario) {
				if (c == BARRA) {
					// es comentario de línea
					esComentario = 1;
				} else if (c == ASTERISCO) {
					// es inicio de comentario de bloque
					esComentario = 2;
				}
			} else if (!abierto && c == BARRA) {
				posibleComentario = true;
			}
		}
		return esComentario;
	}

}
