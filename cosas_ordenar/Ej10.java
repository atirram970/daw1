package ejerciciosClase.unidad7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

public class Ej10 {

	public static void main(String[] args) {
		// Vamos a utilizar de fuente el fichero ClaseComentada.java de la
		// carpeta ficheros ruta --> ficheros/ClaseComentada.java
		// salida ruta --> ficheros/ClaseSinComentarios.java
		try {
			String rutaOrigen = "ficheros/ClaseComentada.java";
			String rutaDestino = "ficheros/ClaseSinComentarios.java";
			// System.out.println("archivo de entrada: " + args[0]);
			// System.out.println("archivo de salida: " + args[1]);
			// File programaComentado = new File(args[0]);
			// File programaSinComentarios = new File(args[1]);
			File programaComentado = new File(rutaOrigen);
			File programaSinComentarios = new File(rutaDestino);
			FileReader reader = new FileReader(programaComentado);
			BufferedReader buffReader = new BufferedReader(reader);
			String line = buffReader.readLine();
			while (null != line) {
				
				// Controlo caso 2: Comentario de bloque (también javadoc)
				if (StringUtils.contains(line, "/*")) {
					// Si contiene "/*" tengo que omitir todo el texto hasta
					// que encuentre "*/"
					// Compruebo si tiene texto antes del comentario
					String previoComentario = obtenerPrevioComentarioBloque(line);
					if (StringUtils.isNotBlank(previoComentario)) {
						System.out.println(previoComentario);
					}
					while (!StringUtils.contains(line, "*/")) {
						line = buffReader.readLine();
					}
					// Compruebo si se cierra el comentario en la misma línea
					if (StringUtils.contains(line, "*/")) {
						String posteriorComentario = obtenerPosteriorComentarioBloque(line);
						if (StringUtils.isNotBlank(posteriorComentario)) {
							System.out.println(posteriorComentario);
						}
					}
				} else {
					// Controlo caso 1: Comentario de línea
					if (StringUtils.contains(line, "//")) {
						// Si contiene "//" tengo que comprobar si hay algo que
						// imprimir antes del comentario
						String previoComentario = obtenerPrevioComentarioLinea(line);
						if (StringUtils.isNotBlank(previoComentario)) {
							System.out.println(previoComentario);
						}
					} else {
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

	private static String obtenerPrevioComentarioBloque(String line) {
		int posicionComentario = StringUtils.indexOf(line, "/*");
		String previoComentario = StringUtils.substring(line, 0, posicionComentario);
		return previoComentario;
	}

	private static String obtenerPosteriorComentarioBloque(String line) {
		int posicionComentario = StringUtils.indexOf(line, "*/");
		String posteriorComentario = StringUtils.substring(line, posicionComentario + 2);
		return posteriorComentario;
	}

	/**
	 * @param line
	 * @return
	 */
	private static String obtenerPrevioComentarioLinea(String line) {
		int posicionComentario = StringUtils.indexOf(line, "//");
		String previoComentario = StringUtils.substring(line, 0, posicionComentario);
		return previoComentario;
	}

}
