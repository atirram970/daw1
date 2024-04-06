package unidad6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Introducir por consola una frase (palabras con espacios)
 * almacenar toda las palabras de la frase en nodos y mostrar las palabras que esten repetidas
 * A continuación las que no
 */

import java.util.List;
import java.util.Scanner;

public class EjercicioPropuestoColecciones8 {
	static Scanner scan = new Scanner(System.in);
	static List<String> palabras = new ArrayList<String>();
	
	public static void main(String[] args) {
		//INTRODUCE UNA FRASE
		String frase = scan.nextLine();
		String[] arrayPalabras = frase.split(" ");
		palabras = Arrays.asList(arrayPalabras);
	}
	
	public static void PalabrasRepetidas(HashSet<String> usuarios) {
		
		System.out.println("Palabras Repetidas: ");
	}
	
	public static void PalabrasNoRepetidas(HashSet<String> usuarios) {
		
		System.out.println("Palabras Sin Repetir: ");
	}
}