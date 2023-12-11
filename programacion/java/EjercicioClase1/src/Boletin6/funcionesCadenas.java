package Boletin6;

import org.apache.commons.lang3.StringUtils;

public class funcionesCadenas {

	/**
	 * a) esPalindromo: Este método debería verificar si una cadena es un
	 * palíndromo, lo que significa que la cadena se lee igual de izquierda a
	 * derecha que de derecha a izquierda.
	 */
	public static boolean esPalindromo(String cadena) {
		// Elimina los espacios, pasa todo a minúsculas y le da la vuelta para
		// compararla con la original
		String cadSinEspaciosReverse = invertirCadena(eliminarEspacios(aplanaCadena(cadena)));

		// Comprueba si la cadena es un palíndromo comparándola con su versión invertida
		return cadena.equals(cadSinEspaciosReverse);
	}

	/**
	 * Pasa a minúsculas toda la cadena
	 * 
	 * @param cadena
	 * @return
	 */
	public static String aplanaCadena(String cadena) {
		return cadena.toLowerCase();
	}

	/**
	 * b) esHeterograma: Un heterograma es una palabra o frase en la que no se
	 * repiten las letras. Este método debería comprobar si una cadena es un
	 * heterograma.
	 */
	public static boolean esHeterograma(String cadena) {
		String cadSinEspacios = aplanaCadena(cadena);
		String caracteresCadena = StringUtils.EMPTY;
		boolean esHeterograma = true;
		int i = 0;
		while (esHeterograma && i < cadSinEspacios.length()) {
			char caracter = cadSinEspacios.charAt(i);
			if (StringUtils.contains(caracteresCadena, caracter)) {
				esHeterograma = false;
			}
			caracteresCadena += caracter;
			i++;
		}
		return esHeterograma;
	}

	/**
	 * c) conteoVocales: Debería contar el número de vocales en una cadena,
	 * proporcionando así la cantidad total de letras 'a', 'e', 'i', 'o' y 'u'.
	 * Extra: Incluye las vocales acentuadas en español.
	 */
	public static int conteoVocales(String cadena) {
		String cadSinEspacios = aplanaCadena(cadena);
		String vocales = "aáeéiíoóuúü";
		int contVocales = 0;
		for (int i = 0; i < cadSinEspacios.length(); i++) {
			char caracterActual = cadSinEspacios.charAt(i);

			// Si el carácter es una vocal aumenta el contador
			if (StringUtils.contains(vocales, caracterActual)) {
				contVocales++;
			}
		}

		// Devuelve el resultado
		return contVocales;
	}

	/**
	 * d) invertirCadena: Este método debería invertir el orden de los caracteres en
	 * una cadena, de modo que el primer carácter se convierta en el último y
	 * viceversa.
	 */
	public static String invertirCadena(String cadena) {
		return StringUtils.reverse(cadena);
	}

	/**
	 * e) eliminarEspacios: Eliminaría todos los espacios en blanco de una cadena,
	 * devolviendo una versión de la cadena sin espacios.
	 */
	public static String eliminarEspacios (String cadena) {
		return StringUtils.replace(cadena, " ", "");
	}
	
	public static int buscarCaracter(String cadena, char caracter) {
		return StringUtils.indexOf(cadena, caracter);
	}
}