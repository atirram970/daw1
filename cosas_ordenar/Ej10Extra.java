package ejerciciosClase.unidad7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * IMPLEMENTAMOS UN PROGRAMA QUE SEA CAPAZ DE DETECTAR LAS CADENAS(String)
 * DENTRO DE UNA CLASE
 */
public class Ej10Extra {
	// ** NOTA: En java, todas las cadenas se abren y cierran en la misma
	// línea

	public static void main(String[] args) {
		try {
			String rutaOrigen = "ficheros/textoConComillas.txt";
			File archivoConComillas = new File(rutaOrigen);
			FileReader reader = new FileReader(archivoConComillas);
			BufferedReader buffReader = new BufferedReader(reader);
			String line = buffReader.readLine();
			boolean comentarioAbierto = false;
			while (null != line) {
				int esComentario = esComentario(line);
				if (!comentarioAbierto && esComentario == 2) {
					System.out.println("inicia comentario en esta línea:");
					System.out.println(line);
					comentarioAbierto = true;
				} else if (comentarioAbierto) {
					if (finalizaComentario(line)) {
						System.out.println("finaliza comentario en esta línea:");
						System.out.println(line);
						comentarioAbierto = false;
					} else {
						System.out.println("sigue abierto el comentario en esta línea:");
						System.out.println(line);
					}
				}
				line = buffReader.readLine();
			}
			buffReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
	 * Devuelve 0 si en la línea no existe ningún comentario
	 * Devuelve 1 si en la línea existe un comentario de línea
	 * Devuelve 2 si en la línea comienza un comentario de bloque
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
			} else if (!abierto && c == BARRA) {
				posibleComentario = true;
			} else if (!abierto && posibleComentario) {
				if (c == BARRA) {
					// es comentario de línea
					esComentario = 1;
				} else if (c == ASTERISCO) {
					// es inicio de comentario de bloque
					esComentario = 2;
				}
			}
		}
		return esComentario;
	}
}
